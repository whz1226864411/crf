package com.creat.secret.po;

import java.util.ArrayList;
import java.util.List;

public class IllExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IllExample() {
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

        public Criteria andIllIdIsNull() {
            addCriterion("ill_id is null");
            return (Criteria) this;
        }

        public Criteria andIllIdIsNotNull() {
            addCriterion("ill_id is not null");
            return (Criteria) this;
        }

        public Criteria andIllIdEqualTo(Integer value) {
            addCriterion("ill_id =", value, "illId");
            return (Criteria) this;
        }

        public Criteria andIllIdNotEqualTo(Integer value) {
            addCriterion("ill_id <>", value, "illId");
            return (Criteria) this;
        }

        public Criteria andIllIdGreaterThan(Integer value) {
            addCriterion("ill_id >", value, "illId");
            return (Criteria) this;
        }

        public Criteria andIllIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ill_id >=", value, "illId");
            return (Criteria) this;
        }

        public Criteria andIllIdLessThan(Integer value) {
            addCriterion("ill_id <", value, "illId");
            return (Criteria) this;
        }

        public Criteria andIllIdLessThanOrEqualTo(Integer value) {
            addCriterion("ill_id <=", value, "illId");
            return (Criteria) this;
        }

        public Criteria andIllIdIn(List<Integer> values) {
            addCriterion("ill_id in", values, "illId");
            return (Criteria) this;
        }

        public Criteria andIllIdNotIn(List<Integer> values) {
            addCriterion("ill_id not in", values, "illId");
            return (Criteria) this;
        }

        public Criteria andIllIdBetween(Integer value1, Integer value2) {
            addCriterion("ill_id between", value1, value2, "illId");
            return (Criteria) this;
        }

        public Criteria andIllIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ill_id not between", value1, value2, "illId");
            return (Criteria) this;
        }

        public Criteria andDxTypeIsNull() {
            addCriterion("dx_type is null");
            return (Criteria) this;
        }

        public Criteria andDxTypeIsNotNull() {
            addCriterion("dx_type is not null");
            return (Criteria) this;
        }

        public Criteria andDxTypeEqualTo(String value) {
            addCriterion("dx_type =", value, "dxType");
            return (Criteria) this;
        }

        public Criteria andDxTypeNotEqualTo(String value) {
            addCriterion("dx_type <>", value, "dxType");
            return (Criteria) this;
        }

        public Criteria andDxTypeGreaterThan(String value) {
            addCriterion("dx_type >", value, "dxType");
            return (Criteria) this;
        }

        public Criteria andDxTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dx_type >=", value, "dxType");
            return (Criteria) this;
        }

        public Criteria andDxTypeLessThan(String value) {
            addCriterion("dx_type <", value, "dxType");
            return (Criteria) this;
        }

        public Criteria andDxTypeLessThanOrEqualTo(String value) {
            addCriterion("dx_type <=", value, "dxType");
            return (Criteria) this;
        }

        public Criteria andDxTypeLike(String value) {
            addCriterion("dx_type like", value, "dxType");
            return (Criteria) this;
        }

        public Criteria andDxTypeNotLike(String value) {
            addCriterion("dx_type not like", value, "dxType");
            return (Criteria) this;
        }

        public Criteria andDxTypeIn(List<String> values) {
            addCriterion("dx_type in", values, "dxType");
            return (Criteria) this;
        }

        public Criteria andDxTypeNotIn(List<String> values) {
            addCriterion("dx_type not in", values, "dxType");
            return (Criteria) this;
        }

        public Criteria andDxTypeBetween(String value1, String value2) {
            addCriterion("dx_type between", value1, value2, "dxType");
            return (Criteria) this;
        }

        public Criteria andDxTypeNotBetween(String value1, String value2) {
            addCriterion("dx_type not between", value1, value2, "dxType");
            return (Criteria) this;
        }

        public Criteria andOnePlIsNull() {
            addCriterion("one_pl is null");
            return (Criteria) this;
        }

        public Criteria andOnePlIsNotNull() {
            addCriterion("one_pl is not null");
            return (Criteria) this;
        }

        public Criteria andOnePlEqualTo(String value) {
            addCriterion("one_pl =", value, "onePl");
            return (Criteria) this;
        }

        public Criteria andOnePlNotEqualTo(String value) {
            addCriterion("one_pl <>", value, "onePl");
            return (Criteria) this;
        }

        public Criteria andOnePlGreaterThan(String value) {
            addCriterion("one_pl >", value, "onePl");
            return (Criteria) this;
        }

        public Criteria andOnePlGreaterThanOrEqualTo(String value) {
            addCriterion("one_pl >=", value, "onePl");
            return (Criteria) this;
        }

        public Criteria andOnePlLessThan(String value) {
            addCriterion("one_pl <", value, "onePl");
            return (Criteria) this;
        }

        public Criteria andOnePlLessThanOrEqualTo(String value) {
            addCriterion("one_pl <=", value, "onePl");
            return (Criteria) this;
        }

        public Criteria andOnePlLike(String value) {
            addCriterion("one_pl like", value, "onePl");
            return (Criteria) this;
        }

        public Criteria andOnePlNotLike(String value) {
            addCriterion("one_pl not like", value, "onePl");
            return (Criteria) this;
        }

        public Criteria andOnePlIn(List<String> values) {
            addCriterion("one_pl in", values, "onePl");
            return (Criteria) this;
        }

        public Criteria andOnePlNotIn(List<String> values) {
            addCriterion("one_pl not in", values, "onePl");
            return (Criteria) this;
        }

        public Criteria andOnePlBetween(String value1, String value2) {
            addCriterion("one_pl between", value1, value2, "onePl");
            return (Criteria) this;
        }

        public Criteria andOnePlNotBetween(String value1, String value2) {
            addCriterion("one_pl not between", value1, value2, "onePl");
            return (Criteria) this;
        }

        public Criteria andOneDwIsNull() {
            addCriterion("one_dw is null");
            return (Criteria) this;
        }

        public Criteria andOneDwIsNotNull() {
            addCriterion("one_dw is not null");
            return (Criteria) this;
        }

        public Criteria andOneDwEqualTo(String value) {
            addCriterion("one_dw =", value, "oneDw");
            return (Criteria) this;
        }

        public Criteria andOneDwNotEqualTo(String value) {
            addCriterion("one_dw <>", value, "oneDw");
            return (Criteria) this;
        }

        public Criteria andOneDwGreaterThan(String value) {
            addCriterion("one_dw >", value, "oneDw");
            return (Criteria) this;
        }

        public Criteria andOneDwGreaterThanOrEqualTo(String value) {
            addCriterion("one_dw >=", value, "oneDw");
            return (Criteria) this;
        }

        public Criteria andOneDwLessThan(String value) {
            addCriterion("one_dw <", value, "oneDw");
            return (Criteria) this;
        }

        public Criteria andOneDwLessThanOrEqualTo(String value) {
            addCriterion("one_dw <=", value, "oneDw");
            return (Criteria) this;
        }

        public Criteria andOneDwLike(String value) {
            addCriterion("one_dw like", value, "oneDw");
            return (Criteria) this;
        }

        public Criteria andOneDwNotLike(String value) {
            addCriterion("one_dw not like", value, "oneDw");
            return (Criteria) this;
        }

        public Criteria andOneDwIn(List<String> values) {
            addCriterion("one_dw in", values, "oneDw");
            return (Criteria) this;
        }

        public Criteria andOneDwNotIn(List<String> values) {
            addCriterion("one_dw not in", values, "oneDw");
            return (Criteria) this;
        }

        public Criteria andOneDwBetween(String value1, String value2) {
            addCriterion("one_dw between", value1, value2, "oneDw");
            return (Criteria) this;
        }

        public Criteria andOneDwNotBetween(String value1, String value2) {
            addCriterion("one_dw not between", value1, value2, "oneDw");
            return (Criteria) this;
        }

        public Criteria andTwoPlIsNull() {
            addCriterion("two_pl is null");
            return (Criteria) this;
        }

        public Criteria andTwoPlIsNotNull() {
            addCriterion("two_pl is not null");
            return (Criteria) this;
        }

        public Criteria andTwoPlEqualTo(String value) {
            addCriterion("two_pl =", value, "twoPl");
            return (Criteria) this;
        }

        public Criteria andTwoPlNotEqualTo(String value) {
            addCriterion("two_pl <>", value, "twoPl");
            return (Criteria) this;
        }

        public Criteria andTwoPlGreaterThan(String value) {
            addCriterion("two_pl >", value, "twoPl");
            return (Criteria) this;
        }

        public Criteria andTwoPlGreaterThanOrEqualTo(String value) {
            addCriterion("two_pl >=", value, "twoPl");
            return (Criteria) this;
        }

        public Criteria andTwoPlLessThan(String value) {
            addCriterion("two_pl <", value, "twoPl");
            return (Criteria) this;
        }

        public Criteria andTwoPlLessThanOrEqualTo(String value) {
            addCriterion("two_pl <=", value, "twoPl");
            return (Criteria) this;
        }

        public Criteria andTwoPlLike(String value) {
            addCriterion("two_pl like", value, "twoPl");
            return (Criteria) this;
        }

        public Criteria andTwoPlNotLike(String value) {
            addCriterion("two_pl not like", value, "twoPl");
            return (Criteria) this;
        }

        public Criteria andTwoPlIn(List<String> values) {
            addCriterion("two_pl in", values, "twoPl");
            return (Criteria) this;
        }

        public Criteria andTwoPlNotIn(List<String> values) {
            addCriterion("two_pl not in", values, "twoPl");
            return (Criteria) this;
        }

        public Criteria andTwoPlBetween(String value1, String value2) {
            addCriterion("two_pl between", value1, value2, "twoPl");
            return (Criteria) this;
        }

        public Criteria andTwoPlNotBetween(String value1, String value2) {
            addCriterion("two_pl not between", value1, value2, "twoPl");
            return (Criteria) this;
        }

        public Criteria andTwoDwIsNull() {
            addCriterion("two_dw is null");
            return (Criteria) this;
        }

        public Criteria andTwoDwIsNotNull() {
            addCriterion("two_dw is not null");
            return (Criteria) this;
        }

        public Criteria andTwoDwEqualTo(String value) {
            addCriterion("two_dw =", value, "twoDw");
            return (Criteria) this;
        }

        public Criteria andTwoDwNotEqualTo(String value) {
            addCriterion("two_dw <>", value, "twoDw");
            return (Criteria) this;
        }

        public Criteria andTwoDwGreaterThan(String value) {
            addCriterion("two_dw >", value, "twoDw");
            return (Criteria) this;
        }

        public Criteria andTwoDwGreaterThanOrEqualTo(String value) {
            addCriterion("two_dw >=", value, "twoDw");
            return (Criteria) this;
        }

        public Criteria andTwoDwLessThan(String value) {
            addCriterion("two_dw <", value, "twoDw");
            return (Criteria) this;
        }

        public Criteria andTwoDwLessThanOrEqualTo(String value) {
            addCriterion("two_dw <=", value, "twoDw");
            return (Criteria) this;
        }

        public Criteria andTwoDwLike(String value) {
            addCriterion("two_dw like", value, "twoDw");
            return (Criteria) this;
        }

        public Criteria andTwoDwNotLike(String value) {
            addCriterion("two_dw not like", value, "twoDw");
            return (Criteria) this;
        }

        public Criteria andTwoDwIn(List<String> values) {
            addCriterion("two_dw in", values, "twoDw");
            return (Criteria) this;
        }

        public Criteria andTwoDwNotIn(List<String> values) {
            addCriterion("two_dw not in", values, "twoDw");
            return (Criteria) this;
        }

        public Criteria andTwoDwBetween(String value1, String value2) {
            addCriterion("two_dw between", value1, value2, "twoDw");
            return (Criteria) this;
        }

        public Criteria andTwoDwNotBetween(String value1, String value2) {
            addCriterion("two_dw not between", value1, value2, "twoDw");
            return (Criteria) this;
        }

        public Criteria andThreePlIsNull() {
            addCriterion("three_pl is null");
            return (Criteria) this;
        }

        public Criteria andThreePlIsNotNull() {
            addCriterion("three_pl is not null");
            return (Criteria) this;
        }

        public Criteria andThreePlEqualTo(String value) {
            addCriterion("three_pl =", value, "threePl");
            return (Criteria) this;
        }

        public Criteria andThreePlNotEqualTo(String value) {
            addCriterion("three_pl <>", value, "threePl");
            return (Criteria) this;
        }

        public Criteria andThreePlGreaterThan(String value) {
            addCriterion("three_pl >", value, "threePl");
            return (Criteria) this;
        }

        public Criteria andThreePlGreaterThanOrEqualTo(String value) {
            addCriterion("three_pl >=", value, "threePl");
            return (Criteria) this;
        }

        public Criteria andThreePlLessThan(String value) {
            addCriterion("three_pl <", value, "threePl");
            return (Criteria) this;
        }

        public Criteria andThreePlLessThanOrEqualTo(String value) {
            addCriterion("three_pl <=", value, "threePl");
            return (Criteria) this;
        }

        public Criteria andThreePlLike(String value) {
            addCriterion("three_pl like", value, "threePl");
            return (Criteria) this;
        }

        public Criteria andThreePlNotLike(String value) {
            addCriterion("three_pl not like", value, "threePl");
            return (Criteria) this;
        }

        public Criteria andThreePlIn(List<String> values) {
            addCriterion("three_pl in", values, "threePl");
            return (Criteria) this;
        }

        public Criteria andThreePlNotIn(List<String> values) {
            addCriterion("three_pl not in", values, "threePl");
            return (Criteria) this;
        }

        public Criteria andThreePlBetween(String value1, String value2) {
            addCriterion("three_pl between", value1, value2, "threePl");
            return (Criteria) this;
        }

        public Criteria andThreePlNotBetween(String value1, String value2) {
            addCriterion("three_pl not between", value1, value2, "threePl");
            return (Criteria) this;
        }

        public Criteria andThreeDwIsNull() {
            addCriterion("three_dw is null");
            return (Criteria) this;
        }

        public Criteria andThreeDwIsNotNull() {
            addCriterion("three_dw is not null");
            return (Criteria) this;
        }

        public Criteria andThreeDwEqualTo(String value) {
            addCriterion("three_dw =", value, "threeDw");
            return (Criteria) this;
        }

        public Criteria andThreeDwNotEqualTo(String value) {
            addCriterion("three_dw <>", value, "threeDw");
            return (Criteria) this;
        }

        public Criteria andThreeDwGreaterThan(String value) {
            addCriterion("three_dw >", value, "threeDw");
            return (Criteria) this;
        }

        public Criteria andThreeDwGreaterThanOrEqualTo(String value) {
            addCriterion("three_dw >=", value, "threeDw");
            return (Criteria) this;
        }

        public Criteria andThreeDwLessThan(String value) {
            addCriterion("three_dw <", value, "threeDw");
            return (Criteria) this;
        }

        public Criteria andThreeDwLessThanOrEqualTo(String value) {
            addCriterion("three_dw <=", value, "threeDw");
            return (Criteria) this;
        }

        public Criteria andThreeDwLike(String value) {
            addCriterion("three_dw like", value, "threeDw");
            return (Criteria) this;
        }

        public Criteria andThreeDwNotLike(String value) {
            addCriterion("three_dw not like", value, "threeDw");
            return (Criteria) this;
        }

        public Criteria andThreeDwIn(List<String> values) {
            addCriterion("three_dw in", values, "threeDw");
            return (Criteria) this;
        }

        public Criteria andThreeDwNotIn(List<String> values) {
            addCriterion("three_dw not in", values, "threeDw");
            return (Criteria) this;
        }

        public Criteria andThreeDwBetween(String value1, String value2) {
            addCriterion("three_dw between", value1, value2, "threeDw");
            return (Criteria) this;
        }

        public Criteria andThreeDwNotBetween(String value1, String value2) {
            addCriterion("three_dw not between", value1, value2, "threeDw");
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