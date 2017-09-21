package com.creat.secret.po;

import java.util.ArrayList;
import java.util.List;

public class CrfInforExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrfInforExample() {
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

        public Criteria andCrfIdIsNull() {
            addCriterion("crf_id is null");
            return (Criteria) this;
        }

        public Criteria andCrfIdIsNotNull() {
            addCriterion("crf_id is not null");
            return (Criteria) this;
        }

        public Criteria andCrfIdEqualTo(Integer value) {
            addCriterion("crf_id =", value, "crfId");
            return (Criteria) this;
        }

        public Criteria andCrfIdNotEqualTo(Integer value) {
            addCriterion("crf_id <>", value, "crfId");
            return (Criteria) this;
        }

        public Criteria andCrfIdGreaterThan(Integer value) {
            addCriterion("crf_id >", value, "crfId");
            return (Criteria) this;
        }

        public Criteria andCrfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("crf_id >=", value, "crfId");
            return (Criteria) this;
        }

        public Criteria andCrfIdLessThan(Integer value) {
            addCriterion("crf_id <", value, "crfId");
            return (Criteria) this;
        }

        public Criteria andCrfIdLessThanOrEqualTo(Integer value) {
            addCriterion("crf_id <=", value, "crfId");
            return (Criteria) this;
        }

        public Criteria andCrfIdIn(List<Integer> values) {
            addCriterion("crf_id in", values, "crfId");
            return (Criteria) this;
        }

        public Criteria andCrfIdNotIn(List<Integer> values) {
            addCriterion("crf_id not in", values, "crfId");
            return (Criteria) this;
        }

        public Criteria andCrfIdBetween(Integer value1, Integer value2) {
            addCriterion("crf_id between", value1, value2, "crfId");
            return (Criteria) this;
        }

        public Criteria andCrfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("crf_id not between", value1, value2, "crfId");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(String value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(String value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(String value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLike(String value) {
            addCriterion("create_date like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(String value) {
            addCriterion("create_date not like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<String> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<String> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andSubmitedIsNull() {
            addCriterion("submited is null");
            return (Criteria) this;
        }

        public Criteria andSubmitedIsNotNull() {
            addCriterion("submited is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitedEqualTo(Boolean value) {
            addCriterion("submited =", value, "submited");
            return (Criteria) this;
        }

        public Criteria andSubmitedNotEqualTo(Boolean value) {
            addCriterion("submited <>", value, "submited");
            return (Criteria) this;
        }

        public Criteria andSubmitedGreaterThan(Boolean value) {
            addCriterion("submited >", value, "submited");
            return (Criteria) this;
        }

        public Criteria andSubmitedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("submited >=", value, "submited");
            return (Criteria) this;
        }

        public Criteria andSubmitedLessThan(Boolean value) {
            addCriterion("submited <", value, "submited");
            return (Criteria) this;
        }

        public Criteria andSubmitedLessThanOrEqualTo(Boolean value) {
            addCriterion("submited <=", value, "submited");
            return (Criteria) this;
        }

        public Criteria andSubmitedIn(List<Boolean> values) {
            addCriterion("submited in", values, "submited");
            return (Criteria) this;
        }

        public Criteria andSubmitedNotIn(List<Boolean> values) {
            addCriterion("submited not in", values, "submited");
            return (Criteria) this;
        }

        public Criteria andSubmitedBetween(Boolean value1, Boolean value2) {
            addCriterion("submited between", value1, value2, "submited");
            return (Criteria) this;
        }

        public Criteria andSubmitedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("submited not between", value1, value2, "submited");
            return (Criteria) this;
        }

        public Criteria andPatientInforIdIsNull() {
            addCriterion("patient_infor_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientInforIdIsNotNull() {
            addCriterion("patient_infor_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientInforIdEqualTo(Integer value) {
            addCriterion("patient_infor_id =", value, "patientInforId");
            return (Criteria) this;
        }

        public Criteria andPatientInforIdNotEqualTo(Integer value) {
            addCriterion("patient_infor_id <>", value, "patientInforId");
            return (Criteria) this;
        }

        public Criteria andPatientInforIdGreaterThan(Integer value) {
            addCriterion("patient_infor_id >", value, "patientInforId");
            return (Criteria) this;
        }

        public Criteria andPatientInforIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_infor_id >=", value, "patientInforId");
            return (Criteria) this;
        }

        public Criteria andPatientInforIdLessThan(Integer value) {
            addCriterion("patient_infor_id <", value, "patientInforId");
            return (Criteria) this;
        }

        public Criteria andPatientInforIdLessThanOrEqualTo(Integer value) {
            addCriterion("patient_infor_id <=", value, "patientInforId");
            return (Criteria) this;
        }

        public Criteria andPatientInforIdIn(List<Integer> values) {
            addCriterion("patient_infor_id in", values, "patientInforId");
            return (Criteria) this;
        }

        public Criteria andPatientInforIdNotIn(List<Integer> values) {
            addCriterion("patient_infor_id not in", values, "patientInforId");
            return (Criteria) this;
        }

        public Criteria andPatientInforIdBetween(Integer value1, Integer value2) {
            addCriterion("patient_infor_id between", value1, value2, "patientInforId");
            return (Criteria) this;
        }

        public Criteria andPatientInforIdNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_infor_id not between", value1, value2, "patientInforId");
            return (Criteria) this;
        }

        public Criteria andFinishedIsNull() {
            addCriterion("finished is null");
            return (Criteria) this;
        }

        public Criteria andFinishedIsNotNull() {
            addCriterion("finished is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedEqualTo(Integer value) {
            addCriterion("finished =", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotEqualTo(Integer value) {
            addCriterion("finished <>", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedGreaterThan(Integer value) {
            addCriterion("finished >", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedGreaterThanOrEqualTo(Integer value) {
            addCriterion("finished >=", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedLessThan(Integer value) {
            addCriterion("finished <", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedLessThanOrEqualTo(Integer value) {
            addCriterion("finished <=", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedIn(List<Integer> values) {
            addCriterion("finished in", values, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotIn(List<Integer> values) {
            addCriterion("finished not in", values, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedBetween(Integer value1, Integer value2) {
            addCriterion("finished between", value1, value2, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotBetween(Integer value1, Integer value2) {
            addCriterion("finished not between", value1, value2, "finished");
            return (Criteria) this;
        }

        public Criteria andLockedIsNull() {
            addCriterion("locked is null");
            return (Criteria) this;
        }

        public Criteria andLockedIsNotNull() {
            addCriterion("locked is not null");
            return (Criteria) this;
        }

        public Criteria andLockedEqualTo(Boolean value) {
            addCriterion("locked =", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotEqualTo(Boolean value) {
            addCriterion("locked <>", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThan(Boolean value) {
            addCriterion("locked >", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("locked >=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThan(Boolean value) {
            addCriterion("locked <", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThanOrEqualTo(Boolean value) {
            addCriterion("locked <=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedIn(List<Boolean> values) {
            addCriterion("locked in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotIn(List<Boolean> values) {
            addCriterion("locked not in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedBetween(Boolean value1, Boolean value2) {
            addCriterion("locked between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("locked not between", value1, value2, "locked");
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