package com.creat.secret.service.impl;

import com.creat.secret.mapper.*;
import com.creat.secret.po.*;
import com.creat.secret.service.CrfService;
import com.creat.secret.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/8/25.
 */
public class CrfServiceImpl implements CrfService{

    @Autowired
    private PatientInforMapper patientInforMapper;
    @Autowired
    private HospitalInforMapper hospitalInforMapper;
    @Autowired
    private BlfyMapper blfyMapper;
    @Autowired
    private PastIllMapper pastIllMapper;
    @Autowired
    private IllMapper illMapper;
    @Autowired
    private TjxmMapper tjxmMapper;
    @Autowired
    private NdtMapper ndtMapper;
    @Autowired
    private PicMapper picMapper;
    @Autowired
    private ZlqkMapper zlqkMapper;
    @Autowired
    private YyqkMapper yyqkMapper;
    @Autowired
    private XyndMapper xyndMapper;
    @Autowired
    private CrfInforMapper crfInforMapper;
    @Autowired
    private CrfRecordMapper crfRecordMapper;
    @Autowired
    private CrfInforCustomMapper crfInforCustomMapper;
    @Autowired
    private TjxmCustomMapper tjxmCustomMapper;
    @Autowired
    private NdtCustomMapper ndtCustomMapper;
    @Autowired
    private ZlqkCustomMapper zlqkCustomMapper;
    @Autowired
    private YyqkCustomMapper yyqkCustomMapper;
    @Autowired
    private HospitalInforCustomMapper hospitalInforCustomMapper;
    @Autowired
    private PatientInforCustomMapper patientInforCustomMapper;

    public CrfInforCustom creatCrfInforCustom() {
        CrfInforCustom crfInforCustom = new CrfInforCustom();
        crfInforCustom.setCreateDate(DateUtil.date2String(new Date()));
        crfInforCustom.setFinished(0);
        crfInforCustom.setSubmited(false);
        crfInforCustom.setPatientInforId(null);
        crfInforCustom.setLocked(false);
        return crfInforCustom;
    }

    public Message saveCrfInforCustom(CrfInforCustom crfInforCustom) {
        Message message = new Message();
        HospitalInfor hospitalInfor = crfInforCustom.getHospitalInfor();
        PatientInfor patientInfor = crfInforCustom.getPatientInfor();
        Blfy blfy = crfInforCustom.getBlfy();
        Ill ill = crfInforCustom.getIll();
        PastIll pastIll = crfInforCustom.getPastIll();
        TjxmCustom tjxmCustom = crfInforCustom.getTjxmCustom();
        ZlqkCustom zlqkCustom = crfInforCustom.getZlqkCustom();
        if(hospitalInfor== null || patientInfor == null){
            message.setSuccess(false);
            message.setMessage("请先填写并保存医院信息和个人信息！");
        }else {
            crfInforCustom.setFinished(calculateFinished(crfInforCustom));
            patientInforMapper.insert(patientInfor);
            Integer patientInforId = patientInfor.getPatientInforId();
            hospitalInfor.setPatientInforId(patientInforId);
            hospitalInforMapper.insert(hospitalInfor);
            crfInforCustom.setPatientInforId(patientInforId);
            crfInforMapper.insert(crfInforCustom);
            if(blfy != null){
                blfy.setPatientInforId(patientInforId);
                blfyMapper.insert(blfy);
            }
            if(pastIll != null){
                pastIll.setPatientInforId(patientInforId);
                pastIllMapper.insert(pastIll);
            }
            if(ill != null){
                ill.setPatientInforId(patientInforId);
                illMapper.insert(ill);
            }
            if(tjxmCustom != null){
                tjxmCustom.setPatientInforId(patientInforId);
                List<NdtCustom> ndtList = tjxmCustom.getNdtCustomList();
                tjxmMapper.insert(tjxmCustom);
                if(ndtList != null){
                    for(NdtCustom ndtCustom : ndtList){
                        ndtCustom.setTjxmId(tjxmCustom.getTjxmId());
                        ndtMapper.insert(ndtCustom);
                        List<Pic> picList = ndtCustom.getPicList();
                        if(picList != null){
                            for(Pic pic : picList){
                                pic.setNdtId(ndtCustom.getNdtId());
                                picMapper.insert(pic);
                            }
                        }
                    }
                }
            }
            if(zlqkCustom != null){
                zlqkCustom.setPatientInforId(patientInforId);
                zlqkMapper.insert(zlqkCustom);
                List<YyqkCustom> yyqkCustomList = zlqkCustom.getYyqkCustomList();
                if(yyqkCustomList != null && yyqkCustomList.size() > 0){
                    for(YyqkCustom yyqkCustom : yyqkCustomList){
                        yyqkCustom.setZlqkId(zlqkCustom.getZlqkId());
                        yyqkMapper.insert(yyqkCustom);
                        List<Xynd> xyndList = yyqkCustom.getXxydList();
                        for(Xynd xynd : xyndList){
                            xynd.setYyqkId(yyqkCustom.getYyqkId());
                            xyndMapper.insert(xynd);
                        }
                    }
                }
            }
            message.setSuccess(true);
            message.setMessage("保存成功");
        }
        return message;
    }

    public CrfInforCustom getCrfInforCustom(int crfId) {
        CrfInforCustom crfInforCustom =crfInforCustomMapper.getCrfInforCustomByPk(crfId);
        if(crfInforCustom != null){
            Integer patientInforId = crfInforCustom.getPatientInforId();
            HospitalInforExample hospitalInforExample = new HospitalInforExample();
            HospitalInforExample.Criteria criteriaH = hospitalInforExample.createCriteria();
            criteriaH.andPatientInforIdEqualTo(patientInforId);
            List<HospitalInforCustom> hospitalInforList = hospitalInforCustomMapper.selectByExample(hospitalInforExample);
            HospitalInforCustom hospitalInfor = hospitalInforList.get(0);
            Doctor doctor = hospitalInfor.getDoctor();
            doctor.setDoctorPassword(null);
            doctor.setDoctorAccount(null);
            doctor.setDoctorTel(null);
            crfInforCustom.setHospitalInfor(hospitalInfor);
            PatientInforCustom patientInfor = patientInforCustomMapper.selectByPrimaryKey(patientInforId);
            crfInforCustom.setPatientInfor(patientInfor);
            PastIllExample pastIllExample = new PastIllExample();
            PastIllExample.Criteria criteriaP = pastIllExample.createCriteria();
            criteriaP.andPatientInforIdEqualTo(patientInforId);
            List<PastIll> pastIllList = pastIllMapper.selectByExample(pastIllExample);
            if(pastIllList.size() > 0){
                crfInforCustom.setPastIll(pastIllList.get(0));
            }
            IllExample illExample = new IllExample();
            IllExample.Criteria criteriaI = illExample.createCriteria();
            criteriaI.andPatientInforIdEqualTo(patientInforId);
            List<Ill> illList = illMapper.selectByExample(illExample);
            if(illList.size() > 0){
                crfInforCustom.setIll(illList.get(0));
            }
            BlfyExample blfyExample = new BlfyExample();
            BlfyExample.Criteria criteriaB = blfyExample.createCriteria();
            criteriaB.andPatientInforIdEqualTo(patientInforId);
            List<Blfy> blfyList = blfyMapper.selectByExample(blfyExample);
            if(blfyList.size() > 0 ){
                crfInforCustom.setBlfy(blfyList.get(0));
            }
            TjxmExample tjxmExample = new TjxmExample();
            TjxmExample.Criteria criteriaT = tjxmExample.createCriteria();
            criteriaT.andPatientInforIdEqualTo(patientInforId);
            List<TjxmCustom> tjxmCustomList = tjxmCustomMapper.selectCustomByExample(tjxmExample);
            if(tjxmCustomList.size() > 0){
                TjxmCustom tjxmCustom = tjxmCustomList.get(0);
                int tjxmId = tjxmCustom.getTjxmId();
                NdtExample ndtExample = new NdtExample();
                NdtExample.Criteria criteriaN = ndtExample.createCriteria();
                criteriaN.andTjxmIdEqualTo(tjxmId);
                List<NdtCustom> ndtCustomList = ndtCustomMapper.selectCustomByExample(ndtExample);
                for(int i = 0; i < ndtCustomList.size(); i++){
                    NdtCustom ndtCustom = ndtCustomList.get(i);
                    int ndtId = ndtCustom.getNdtId();
                    PicExample picExample = new PicExample();
                    PicExample.Criteria picCriteria = picExample.createCriteria();
                    picCriteria.andNdtIdEqualTo(ndtId);
                    List<Pic> picList = picMapper.selectByExample(picExample);
                    ndtCustom.setPicList(picList);
                }
                tjxmCustom.setNdtCustomList(ndtCustomList);
                crfInforCustom.setTjxmCustom(tjxmCustom);
            }
            ZlqkExample zlqkExample = new ZlqkExample();
            ZlqkExample.Criteria criteriaZ = zlqkExample.createCriteria();
            criteriaZ.andPatientInforIdEqualTo(patientInforId);
            List<ZlqkCustom> zlqkCustomList = zlqkCustomMapper.selectCustomByExample(zlqkExample);
            if(zlqkCustomList.size() > 0){
                ZlqkCustom zlqkCustom = zlqkCustomList.get(0);
                int zlqkId = zlqkCustom.getZlqkId();
                YyqkExample yyqkExample = new YyqkExample();
                YyqkExample.Criteria criteriaY = yyqkExample.createCriteria();
                criteriaY.andZlqkIdEqualTo(zlqkId);
                List<YyqkCustom> yyqkCustomList = yyqkCustomMapper.selectCustomByExample(yyqkExample);
                for(int i = 0; i < yyqkCustomList.size(); i++){
                    YyqkCustom yyqkCustom = yyqkCustomList.get(i);
                    int yyqkId = yyqkCustom.getYyqkId();
                    XyndExample xyndExample = new XyndExample();
                    XyndExample.Criteria criteriaX = xyndExample.createCriteria();
                    criteriaX.andYyqkIdEqualTo(yyqkId);
                    List<Xynd> xyndList = xyndMapper.selectByExample(xyndExample);
                    yyqkCustom.setXxydList(xyndList);
                }
                zlqkCustom.setYyqkCustomList(yyqkCustomList);
                crfInforCustom.setZlqkCustom(zlqkCustom);
            }
        }
        return crfInforCustom;
    }

    public int getCrfIdByPatientAccountId(int patientAccountId) {
        PatientInforExample patientInforExample = new PatientInforExample();
        PatientInforExample.Criteria criteriaP = patientInforExample.createCriteria();
        criteriaP.andPatientAccountIdEqualTo(patientAccountId);
        List<PatientInfor> patientInforList = patientInforMapper.selectByExample(patientInforExample);
        if(patientInforList.size() > 0){
            CrfInforExample crfInforExample = new CrfInforExample();
            CrfInforExample.Criteria criteria = crfInforExample.createCriteria();
            criteria.andPatientInforIdEqualTo(patientInforList.get(0).getPatientInforId());
            return crfInforMapper.selectByExample(crfInforExample).get(0).getCrfId();
        }
        return -1;
    }

    public List<CrfRecord> getCrfRecordByDoctorId(int doctorId) {
        return crfRecordMapper.selectAllByDoctorId(doctorId);
    }

    public void updateSubmitted(List<Integer> crfIds) {
        crfInforCustomMapper.updateSubmittedByCrfIds(crfIds);
    }

    public boolean hasCrfByPatientAccountId(Integer patientAccountId) {
        PatientInforExample patientInforExample = new PatientInforExample();
        PatientInforExample.Criteria criteria = patientInforExample.createCriteria();
        criteria.andPatientAccountIdEqualTo(patientAccountId);
        List<PatientInfor> patientInforList = patientInforMapper.selectByExample(patientInforExample);
        if(patientInforList.size() > 0 ){
            return true;
        }else {
            return false;
        }
    }

    public boolean contactCrfByPatientTel(PatientAccount patientAccount) {
        PatientInforExample patientInforExample = new PatientInforExample();
        PatientInforExample.Criteria criteria = patientInforExample.createCriteria();
        criteria.andTelOneEqualTo(patientAccount.getPatientTel());
        List<PatientInfor> patientInforList = patientInforMapper.selectByExample(patientInforExample);
        if(patientInforList.size() > 0){
            PatientInfor patientInfor = patientInforList.get(0);
            patientInfor.setPatientAccountId(patientAccount.getPatientAccountId());
            patientInforMapper.updateByPrimaryKey(patientInfor);
            return true;
        }else {
            return false;
        }
    }

    public void updateFinished(Integer patientInforId) {
        CrfInforExample crfInforExample = new CrfInforExample();
        CrfInforExample.Criteria criteria = crfInforExample.createCriteria();
        criteria.andPatientInforIdEqualTo(patientInforId);
        List<CrfInfor> crfInfors = crfInforMapper.selectByExample(crfInforExample);
        if(crfInfors.size() > 0){
            CrfInfor crfInfor = crfInfors.get(0);
            int finished = crfInfor.getFinished();
            crfInfor.setFinished(addFinished(finished));
            crfInforMapper.updateByPrimaryKey(crfInfor);
        }
    }

    public int addFinished(int finished){
        int result = (int) Math.round((finished /100.0*7.0+1.015)/7.0*100);
        if(result > 100){
            result = 100;
        }
        if(result > 98){
            result = 100;
        }
        return result;
    }

    private int calculateFinished(CrfInforCustom crfInforCustom){
        double count = 0;
        double allCount = 7;
        count += crfInforCustom.getHospitalInfor() != null ? 1 : 0;
        count += crfInforCustom.getPatientInfor() != null ? 1 : 0;
        count += crfInforCustom.getBlfy() != null ? 1 : 0;
        count += crfInforCustom.getIll() != null ? 1 : 0;
        count += crfInforCustom.getPastIll() != null ? 1 : 0;
        count += crfInforCustom.getTjxmCustom() != null ? 1 : 0;
        count += crfInforCustom.getZlqkCustom() != null ? 1 : 0;
        BigDecimal bigDecimalCount = new BigDecimal(count/allCount*100);
        System.out.println(bigDecimalCount.setScale(0, RoundingMode.HALF_EVEN));
        return (int) (count/allCount*100);
    }


}
