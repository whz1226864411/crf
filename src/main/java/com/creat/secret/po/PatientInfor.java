package com.creat.secret.po;

import com.creat.secret.validgroup.PatientInforSaveGroup;
import com.creat.secret.validgroup.PatientInforUpdateGroup;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class PatientInfor {
    @NotNull(message = "{patientInfor.patientInforId.notNull}",
            groups = {PatientInforUpdateGroup.class})
    private Integer patientInforId;
    @NotBlank(message = "{patientInfor.name.notBlank}",
            groups = {PatientInforUpdateGroup.class, PatientInforSaveGroup.class})
    private String name;
    @NotBlank(message = "{patientInfor.sex.notBlank}",
            groups = {PatientInforUpdateGroup.class, PatientInforSaveGroup.class})
    private String sex;
    @NotNull(message = "{patientInfor.age.notNull}",
            groups = {PatientInforUpdateGroup.class, PatientInforSaveGroup.class})
    private Integer age;
    @NotBlank(message = "{patientInfor.nation.notBlank}",
            groups = {PatientInforUpdateGroup.class, PatientInforSaveGroup.class})
    private String nation;
    @NotBlank(message = "{patientInfor.telOne.notBlank}",
            groups = {PatientInforUpdateGroup.class, PatientInforSaveGroup.class})
    private String telOne;

    private String telTwo;
    @NotBlank(message = "{patientInfor.height.notBlank}",
            groups = {PatientInforUpdateGroup.class, PatientInforSaveGroup.class})
    private String height;
    @NotBlank(message = "{patientInfor.weight.notBlank}",
            groups = {PatientInforUpdateGroup.class, PatientInforSaveGroup.class})
    private String weight;

    private String identityCard;

    private Integer patientAccountId;

    private Integer cityId;
    @NotNull(message = "{patientInfor.provinceId.notNull}",
            groups = {PatientInforUpdateGroup.class, PatientInforSaveGroup.class})
    private Integer provinceId;

    private Integer districtId;

    public Integer getPatientInforId() {
        return patientInforId;
    }

    public void setPatientInforId(Integer patientInforId) {
        this.patientInforId = patientInforId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getTelOne() {
        return telOne;
    }

    public void setTelOne(String telOne) {
        this.telOne = telOne == null ? null : telOne.trim();
    }

    public String getTelTwo() {
        return telTwo;
    }

    public void setTelTwo(String telTwo) {
        this.telTwo = telTwo == null ? null : telTwo.trim();
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard == null ? null : identityCard.trim();
    }

    public Integer getPatientAccountId() {
        return patientAccountId;
    }

    public void setPatientAccountId(Integer patientAccountId) {
        this.patientAccountId = patientAccountId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }
}