package com.creat.secret.service.impl;

import com.creat.secret.mapper.PatientAccountMapper;
import com.creat.secret.po.Message;
import com.creat.secret.po.PatientAccount;
import com.creat.secret.po.PatientAccountExample;
import com.creat.secret.service.LoginException;
import com.creat.secret.service.PatientService;
import com.creat.secret.utils.Encryption;
import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Administrator on 2017/8/25.
 */
public class PatientServiceImpl implements PatientService{

    private static CloseableHttpClient closeableHttpClient;
    private static String url;
    private static String authorization;
    private static String templateCode;
    private static String signName;
    private static String firstParameterName;

    @Autowired
    private PatientAccountMapper patientAccountMapper;
    static {
        closeableHttpClient = HttpClients.createDefault();
        InputStream inStream = PatientServiceImpl.class.getClassLoader().getResourceAsStream("message.properties");
        Properties properties = new Properties();
        try {
            properties.load(inStream);
            PatientServiceImpl.url = properties.getProperty("url");
            PatientServiceImpl.authorization = properties.getProperty("authorization");
            PatientServiceImpl.templateCode = properties.getProperty("templateCode");
            PatientServiceImpl.signName = properties.getProperty("signName");
            PatientServiceImpl.firstParameterName = properties.getProperty("firstParameterName");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(inStream != null){
                try {
                    inStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public Message sendMessage(String telNum, String valicode) {
        Message message = new Message();
        if(hasPatientAccount(telNum)){
            message.setSuccess(false);
            message.setMessage("此手机号已经被注册！");
        }else {
            Map<String, String> paramString = new HashMap<String, String>();
            paramString.put(PatientServiceImpl.firstParameterName,valicode.toString());
            StringBuilder url = new StringBuilder();
            url.append(PatientServiceImpl.url);
            try {
                url.append("?ParamString="+ URLEncoder.encode(JSONObject.fromObject(paramString).toString(),"utf-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            url.append("&RecNum="+telNum);
            url.append("&TemplateCode="+PatientServiceImpl.templateCode);
            url.append("&SignName="+PatientServiceImpl.signName);
            HttpGet httpGet = new HttpGet(url.toString());
            httpGet.setHeader("Authorization",PatientServiceImpl.authorization);
            CloseableHttpResponse response = null;
            try {
                response =closeableHttpClient.execute(httpGet);
                HttpEntity entity = response.getEntity();
                String result = EntityUtils.toString(entity,"utf-8");
                if(result != null){
                    JSONObject rel = JSONObject.fromObject(result);
                    if(rel.getBoolean("success")){
                        message.setSuccess(true);
                    }else {
                        message.setSuccess(false);
                        message.setMessage("发送失败!");
                    }
                }else {
                    message.setSuccess(false);
                    message.setMessage("发送失败!");
                }

            } catch (IOException e) {
                e.printStackTrace();
                message.setSuccess(false);
                message.setMessage("未知错误");
            }finally {
                if(response != null){
                    try {
                        response.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return message;
    }

    public boolean hasPatientAccount(String telNum){
       if(selectPatientAccountByTel(telNum) != null){
           return true;
       }else {
           return false;
       }
    }

    public PatientAccount selectPatientAccountByTel(String telNum){
        PatientAccountExample patientAccountExample = new PatientAccountExample();
        PatientAccountExample.Criteria criteria = patientAccountExample.createCriteria();
        criteria.andPatientTelEqualTo(telNum);
        List<PatientAccount> patientAccountList = patientAccountMapper.selectByExample(patientAccountExample);
        if(patientAccountList.size() > 0){
            return patientAccountList.get(0);
        }else {
            return  null;
        }
    }

    public void register(PatientAccount patientAccount) throws NoSuchAlgorithmException {
        patientAccount.setPatientPassword(Encryption.stringMD5(patientAccount.getPatientPassword()));
        patientAccount.setRoleId(1);
        patientAccountMapper.insert(patientAccount);
    }

    public PatientAccount login(PatientAccount patientAccount) throws LoginException {
        PatientAccount patientAccountInMy = selectPatientAccountByTel(patientAccount.getPatientTel());
        if(patientAccountInMy == null){
            throw new LoginException("该用户不存在!");
        }else {
            try {
                if(Encryption.equalMD5(patientAccount.getPatientPassword(),patientAccountInMy.getPatientPassword())){
                    return  patientAccountInMy;
                }else {
                    throw new LoginException("该用户不存在!");
                }
            } catch (NoSuchAlgorithmException e) {
                throw new LoginException("该用户不存在!");
            }
        }
    }
}
