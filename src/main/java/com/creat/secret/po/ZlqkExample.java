package com.creat.secret.po;

import java.util.ArrayList;
import java.util.List;

public class ZlqkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZlqkExample() {
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

        public Criteria andZlqkIdIsNull() {
            addCriterion("zlqk_id is null");
            return (Criteria) this;
        }

        public Criteria andZlqkIdIsNotNull() {
            addCriterion("zlqk_id is not null");
            return (Criteria) this;
        }

        public Criteria andZlqkIdEqualTo(Integer value) {
            addCriterion("zlqk_id =", value, "zlqkId");
            return (Criteria) this;
        }

        public Criteria andZlqkIdNotEqualTo(Integer value) {
            addCriterion("zlqk_id <>", value, "zlqkId");
            return (Criteria) this;
        }

        public Criteria andZlqkIdGreaterThan(Integer value) {
            addCriterion("zlqk_id >", value, "zlqkId");
            return (Criteria) this;
        }

        public Criteria andZlqkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zlqk_id >=", value, "zlqkId");
            return (Criteria) this;
        }

        public Criteria andZlqkIdLessThan(Integer value) {
            addCriterion("zlqk_id <", value, "zlqkId");
            return (Criteria) this;
        }

        public Criteria andZlqkIdLessThanOrEqualTo(Integer value) {
            addCriterion("zlqk_id <=", value, "zlqkId");
            return (Criteria) this;
        }

        public Criteria andZlqkIdIn(List<Integer> values) {
            addCriterion("zlqk_id in", values, "zlqkId");
            return (Criteria) this;
        }

        public Criteria andZlqkIdNotIn(List<Integer> values) {
            addCriterion("zlqk_id not in", values, "zlqkId");
            return (Criteria) this;
        }

        public Criteria andZlqkIdBetween(Integer value1, Integer value2) {
            addCriterion("zlqk_id between", value1, value2, "zlqkId");
            return (Criteria) this;
        }

        public Criteria andZlqkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zlqk_id not between", value1, value2, "zlqkId");
            return (Criteria) this;
        }

        public Criteria andYyqkIsNull() {
            addCriterion("yyqk is null");
            return (Criteria) this;
        }

        public Criteria andYyqkIsNotNull() {
            addCriterion("yyqk is not null");
            return (Criteria) this;
        }

        public Criteria andYyqkEqualTo(String value) {
            addCriterion("yyqk =", value, "yyqk");
            return (Criteria) this;
        }

        public Criteria andYyqkNotEqualTo(String value) {
            addCriterion("yyqk <>", value, "yyqk");
            return (Criteria) this;
        }

        public Criteria andYyqkGreaterThan(String value) {
            addCriterion("yyqk >", value, "yyqk");
            return (Criteria) this;
        }

        public Criteria andYyqkGreaterThanOrEqualTo(String value) {
            addCriterion("yyqk >=", value, "yyqk");
            return (Criteria) this;
        }

        public Criteria andYyqkLessThan(String value) {
            addCriterion("yyqk <", value, "yyqk");
            return (Criteria) this;
        }

        public Criteria andYyqkLessThanOrEqualTo(String value) {
            addCriterion("yyqk <=", value, "yyqk");
            return (Criteria) this;
        }

        public Criteria andYyqkLike(String value) {
            addCriterion("yyqk like", value, "yyqk");
            return (Criteria) this;
        }

        public Criteria andYyqkNotLike(String value) {
            addCriterion("yyqk not like", value, "yyqk");
            return (Criteria) this;
        }

        public Criteria andYyqkIn(List<String> values) {
            addCriterion("yyqk in", values, "yyqk");
            return (Criteria) this;
        }

        public Criteria andYyqkNotIn(List<String> values) {
            addCriterion("yyqk not in", values, "yyqk");
            return (Criteria) this;
        }

        public Criteria andYyqkBetween(String value1, String value2) {
            addCriterion("yyqk between", value1, value2, "yyqk");
            return (Criteria) this;
        }

        public Criteria andYyqkNotBetween(String value1, String value2) {
            addCriterion("yyqk not between", value1, value2, "yyqk");
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

        public Criteria andLxIsNull() {
            addCriterion("lx is null");
            return (Criteria) this;
        }

        public Criteria andLxIsNotNull() {
            addCriterion("lx is not null");
            return (Criteria) this;
        }

        public Criteria andLxEqualTo(String value) {
            addCriterion("lx =", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotEqualTo(String value) {
            addCriterion("lx <>", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxGreaterThan(String value) {
            addCriterion("lx >", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxGreaterThanOrEqualTo(String value) {
            addCriterion("lx >=", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxLessThan(String value) {
            addCriterion("lx <", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxLessThanOrEqualTo(String value) {
            addCriterion("lx <=", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxLike(String value) {
            addCriterion("lx like", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotLike(String value) {
            addCriterion("lx not like", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxIn(List<String> values) {
            addCriterion("lx in", values, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotIn(List<String> values) {
            addCriterion("lx not in", values, "lx");
            return (Criteria) this;
        }

        public Criteria andLxBetween(String value1, String value2) {
            addCriterion("lx between", value1, value2, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotBetween(String value1, String value2) {
            addCriterion("lx not between", value1, value2, "lx");
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