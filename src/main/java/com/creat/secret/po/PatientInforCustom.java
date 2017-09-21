package com.creat.secret.po;

/**
 * Created by Administrator on 2017/9/3.
 */
public class PatientInforCustom extends PatientInfor{
    private City city;
    private Province province;
    private District district;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}
