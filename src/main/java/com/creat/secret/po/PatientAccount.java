package com.creat.secret.po;

import com.creat.secret.validgroup.PatientLoginAndRegister;
import com.creat.secret.validgroup.PatientValid;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PatientAccount {
    private Integer patientAccountId;
    @NotBlank(message = "{patientAccount.patientTel.notEmpty}",
            groups = {PatientLoginAndRegister.class, PatientValid.class})
    @Size(min = 11, max = 11,message="{patientAccount.patientTel.length}",
            groups = {PatientLoginAndRegister.class, PatientValid.class})
    private String patientTel;
    @NotBlank(message = "{patientAccount.patientPassword.notEmpty}",
            groups = {PatientLoginAndRegister.class})
    private String patientPassword;

    private Integer roleId;

    public Integer getPatientAccountId() {
        return patientAccountId;
    }

    public void setPatientAccountId(Integer patientAccountId) {
        this.patientAccountId = patientAccountId;
    }

    public String getPatientTel() {
        return patientTel;
    }

    public void setPatientTel(String patientTel) {
        this.patientTel = patientTel == null ? null : patientTel.trim();
    }

    public String getPatientPassword() {
        return patientPassword;
    }

    public void setPatientPassword(String patientPassword) {
        this.patientPassword = patientPassword == null ? null : patientPassword.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}