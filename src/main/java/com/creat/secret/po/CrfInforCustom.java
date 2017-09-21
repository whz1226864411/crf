package com.creat.secret.po;

/**
 * Created by Administrator on 2017/8/25.
 */
public class CrfInforCustom extends CrfInfor{
    private HospitalInfor hospitalInfor;
    private PatientInfor patientInfor;
    private PastIll pastIll;
    private Ill ill;
    private TjxmCustom tjxmCustom;
    private Blfy blfy;
    private ZlqkCustom zlqkCustom;

    public HospitalInfor getHospitalInfor() {
        return hospitalInfor;
    }

    public void setHospitalInfor(HospitalInfor hospitalInfor) {
        this.hospitalInfor = hospitalInfor;
    }

    public PastIll getPastIll() {
        return pastIll;
    }

    public void setPastIll(PastIll pastIll) {
        this.pastIll = pastIll;
    }


    public Blfy getBlfy() {
        return blfy;
    }

    public void setBlfy(Blfy blfy) {
        this.blfy = blfy;
    }

    public PatientInfor getPatientInfor() {
        return patientInfor;
    }

    public void setPatientInfor(PatientInfor patientInfor) {
        this.patientInfor = patientInfor;
    }

    public Ill getIll() {
        return ill;
    }

    public void setIll(Ill ill) {
        this.ill = ill;
    }

    public TjxmCustom getTjxmCustom() {
        return tjxmCustom;
    }

    public void setTjxmCustom(TjxmCustom tjxmCustom) {
        this.tjxmCustom = tjxmCustom;
    }

    public ZlqkCustom getZlqkCustom() {
        return zlqkCustom;
    }

    public void setZlqkCustom(ZlqkCustom zlqkCustom) {
        this.zlqkCustom = zlqkCustom;
    }
}
