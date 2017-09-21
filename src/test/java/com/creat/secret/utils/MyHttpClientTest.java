package com.creat.secret.utils;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;
import java.net.URLEncoder;

/**
 * Created by Administrator on 2017/8/25.
 */
public class MyHttpClientTest {

    @Test
    public void sendMessage(){
        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();

        String s = URLEncoder.encode("{\"nickname\":\"18829489477用户\",\"valicode\":\"4875\"}");
        System.out.println("{\"nickname\":\"18829489477用户\",\"valicode\":\"4875\"}");
        String url = "http://sms.market.alicloudapi.com/singleSendSms?ParamString="+s+"&RecNum=18829489477&TemplateCode=SMS_70400041&SignName=%E5%80%9F%E9%98%85%E4%BC%B4%E4%BE%A3";
        System.out.println(url);
        /*HttpGet httpGet = new HttpGet(url);
        httpGet.setHeader("Authorization","APPCODE a88c95990ba44395b793eb629e8443ad");
        CloseableHttpResponse response = null;
        try {
            response =closeableHttpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();
            String result = EntityUtils.toString(entity,"utf-8");
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(response != null){
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                closeableHttpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

    }
}
