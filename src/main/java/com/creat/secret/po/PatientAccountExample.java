package com.creat.secret.po;

import java.util.ArrayList;
import java.util.List;

public class PatientAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientAccountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPatientAccountIdIsNull() {
            addCriterion("patient_account_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientAccountIdIsNotNull() {
            addCriterion("patient_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientAccountIdEqualTo(Integer value) {
            addCriterion("patient_account_id =", value, "patientAccountId");
            return (Criteria) this;
        }

        public Criteria andPatientAccountIdNotEqualTo(Integer value) {
            addCriterion("patient_account_id <>", value, "patientAccountId");
            return (Criteria) this;
        }

        public Criteria andPatientAccountIdGreaterThan(Integer value) {
            addCriterion("patient_account_id >", value, "patientAccountId");
            return (Criteria) this;
        }

        public Criteria andPatientAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_account_id >=", value, "patientAccountId");
            return (Criteria) this;
        }

        public Criteria andPatientAccountIdLessThan(Integer value) {
            addCriterion("patient_account_id <", value, "patientAccountId");
            return (Criteria) this;
        }

        public Criteria andPatientAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("patient_account_id <=", value, "patientAccountId");
            return (Criteria) this;
        }

        public Criteria andPatientAccountIdIn(List<Integer> values) {
            addCriterion("patient_account_id in", values, "patientAccountId");
            return (Criteria) this;
        }

        public Criteria andPatientAccountIdNotIn(List<Integer> values) {
            addCriterion("patient_account_id not in", values, "patientAccountId");
            return (Criteria) this;
        }

        public Criteria andPatientAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("patient_account_id between", value1, value2, "patientAccountId");
            return (Criteria) this;
        }

        public Criteria andPatientAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_account_id not between", value1, value2, "patientAccountId");
            return (Criteria) this;
        }

        public Criteria andPatientTelIsNull() {
            addCriterion("patient_tel is null");
            return (Criteria) this;
        }

        public Criteria andPatientTelIsNotNull() {
            addCriterion("patient_tel is not null");
            return (Criteria) this;
        }

        public Criteria andPatientTelEqualTo(String value) {
            addCriterion("patient_tel =", value, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientTelNotEqualTo(String value) {
            addCriterion("patient_tel <>", value, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientTelGreaterThan(String value) {
            addCriterion("patient_tel >", value, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientTelGreaterThanOrEqualTo(String value) {
            addCriterion("patient_tel >=", value, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientTelLessThan(String value) {
            addCriterion("patient_tel <", value, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientTelLessThanOrEqualTo(String value) {
            addCriterion("patient_tel <=", value, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientTelLike(String value) {
            addCriterion("patient_tel like", value, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientTelNotLike(String value) {
            addCriterion("patient_tel not like", value, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientTelIn(List<String> values) {
            addCriterion("patient_tel in", values, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientTelNotIn(List<String> values) {
            addCriterion("patient_tel not in", values, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientTelBetween(String value1, String value2) {
            addCriterion("patient_tel between", value1, value2, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientTelNotBetween(String value1, String value2) {
            addCriterion("patient_tel not between", value1, value2, "patientTel");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordIsNull() {
            addCriterion("patient_password is null");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordIsNotNull() {
            addCriterion("patient_password is not null");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordEqualTo(String value) {
            addCriterion("patient_password =", value, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordNotEqualTo(String value) {
            addCriterion("patient_password <>", value, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordGreaterThan(String value) {
            addCriterion("patient_password >", value, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("patient_password >=", value, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordLessThan(String value) {
            addCriterion("patient_password <", value, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordLessThanOrEqualTo(String value) {
            addCriterion("patient_password <=", value, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordLike(String value) {
            addCriterion("patient_password like", value, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordNotLike(String value) {
            addCriterion("patient_password not like", value, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordIn(List<String> values) {
            addCriterion("patient_password in", values, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordNotIn(List<String> values) {
            addCriterion("patient_password not in", values, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordBetween(String value1, String value2) {
            addCriterion("patient_password between", value1, value2, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andPatientPasswordNotBetween(String value1, String value2) {
            addCriterion("patient_password not between", value1, value2, "patientPassword");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}