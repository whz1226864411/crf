package com.creat.secret.po;

import java.util.ArrayList;
import java.util.List;

public class NdtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NdtExample() {
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

        public Criteria andNdtIdIsNull() {
            addCriterion("ndt_id is null");
            return (Criteria) this;
        }

        public Criteria andNdtIdIsNotNull() {
            addCriterion("ndt_id is not null");
            return (Criteria) this;
        }

        public Criteria andNdtIdEqualTo(Integer value) {
            addCriterion("ndt_id =", value, "ndtId");
            return (Criteria) this;
        }

        public Criteria andNdtIdNotEqualTo(Integer value) {
            addCriterion("ndt_id <>", value, "ndtId");
            return (Criteria) this;
        }

        public Criteria andNdtIdGreaterThan(Integer value) {
            addCriterion("ndt_id >", value, "ndtId");
            return (Criteria) this;
        }

        public Criteria andNdtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ndt_id >=", value, "ndtId");
            return (Criteria) this;
        }

        public Criteria andNdtIdLessThan(Integer value) {
            addCriterion("ndt_id <", value, "ndtId");
            return (Criteria) this;
        }

        public Criteria andNdtIdLessThanOrEqualTo(Integer value) {
            addCriterion("ndt_id <=", value, "ndtId");
            return (Criteria) this;
        }

        public Criteria andNdtIdIn(List<Integer> values) {
            addCriterion("ndt_id in", values, "ndtId");
            return (Criteria) this;
        }

        public Criteria andNdtIdNotIn(List<Integer> values) {
            addCriterion("ndt_id not in", values, "ndtId");
            return (Criteria) this;
        }

        public Criteria andNdtIdBetween(Integer value1, Integer value2) {
            addCriterion("ndt_id between", value1, value2, "ndtId");
            return (Criteria) this;
        }

        public Criteria andNdtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ndt_id not between", value1, value2, "ndtId");
            return (Criteria) this;
        }

        public Criteria andYcTypeIsNull() {
            addCriterion("yc_type is null");
            return (Criteria) this;
        }

        public Criteria andYcTypeIsNotNull() {
            addCriterion("yc_type is not null");
            return (Criteria) this;
        }

        public Criteria andYcTypeEqualTo(String value) {
            addCriterion("yc_type =", value, "ycType");
            return (Criteria) this;
        }

        public Criteria andYcTypeNotEqualTo(String value) {
            addCriterion("yc_type <>", value, "ycType");
            return (Criteria) this;
        }

        public Criteria andYcTypeGreaterThan(String value) {
            addCriterion("yc_type >", value, "ycType");
            return (Criteria) this;
        }

        public Criteria andYcTypeGreaterThanOrEqualTo(String value) {
            addCriterion("yc_type >=", value, "ycType");
            return (Criteria) this;
        }

        public Criteria andYcTypeLessThan(String value) {
            addCriterion("yc_type <", value, "ycType");
            return (Criteria) this;
        }

        public Criteria andYcTypeLessThanOrEqualTo(String value) {
            addCriterion("yc_type <=", value, "ycType");
            return (Criteria) this;
        }

        public Criteria andYcTypeLike(String value) {
            addCriterion("yc_type like", value, "ycType");
            return (Criteria) this;
        }

        public Criteria andYcTypeNotLike(String value) {
            addCriterion("yc_type not like", value, "ycType");
            return (Criteria) this;
        }

        public Criteria andYcTypeIn(List<String> values) {
            addCriterion("yc_type in", values, "ycType");
            return (Criteria) this;
        }

        public Criteria andYcTypeNotIn(List<String> values) {
            addCriterion("yc_type not in", values, "ycType");
            return (Criteria) this;
        }

        public Criteria andYcTypeBetween(String value1, String value2) {
            addCriterion("yc_type between", value1, value2, "ycType");
            return (Criteria) this;
        }

        public Criteria andYcTypeNotBetween(String value1, String value2) {
            addCriterion("yc_type not between", value1, value2, "ycType");
            return (Criteria) this;
        }

        public Criteria andJcTypeIsNull() {
            addCriterion("jc_type is null");
            return (Criteria) this;
        }

        public Criteria andJcTypeIsNotNull() {
            addCriterion("jc_type is not null");
            return (Criteria) this;
        }

        public Criteria andJcTypeEqualTo(String value) {
            addCriterion("jc_type =", value, "jcType");
            return (Criteria) this;
        }

        public Criteria andJcTypeNotEqualTo(String value) {
            addCriterion("jc_type <>", value, "jcType");
            return (Criteria) this;
        }

        public Criteria andJcTypeGreaterThan(String value) {
            addCriterion("jc_type >", value, "jcType");
            return (Criteria) this;
        }

        public Criteria andJcTypeGreaterThanOrEqualTo(String value) {
            addCriterion("jc_type >=", value, "jcType");
            return (Criteria) this;
        }

        public Criteria andJcTypeLessThan(String value) {
            addCriterion("jc_type <", value, "jcType");
            return (Criteria) this;
        }

        public Criteria andJcTypeLessThanOrEqualTo(String value) {
            addCriterion("jc_type <=", value, "jcType");
            return (Criteria) this;
        }

        public Criteria andJcTypeLike(String value) {
            addCriterion("jc_type like", value, "jcType");
            return (Criteria) this;
        }

        public Criteria andJcTypeNotLike(String value) {
            addCriterion("jc_type not like", value, "jcType");
            return (Criteria) this;
        }

        public Criteria andJcTypeIn(List<String> values) {
            addCriterion("jc_type in", values, "jcType");
            return (Criteria) this;
        }

        public Criteria andJcTypeNotIn(List<String> values) {
            addCriterion("jc_type not in", values, "jcType");
            return (Criteria) this;
        }

        public Criteria andJcTypeBetween(String value1, String value2) {
            addCriterion("jc_type between", value1, value2, "jcType");
            return (Criteria) this;
        }

        public Criteria andJcTypeNotBetween(String value1, String value2) {
            addCriterion("jc_type not between", value1, value2, "jcType");
            return (Criteria) this;
        }

        public Criteria andJcTimeIsNull() {
            addCriterion("jc_time is null");
            return (Criteria) this;
        }

        public Criteria andJcTimeIsNotNull() {
            addCriterion("jc_time is not null");
            return (Criteria) this;
        }

        public Criteria andJcTimeEqualTo(String value) {
            addCriterion("jc_time =", value, "jcTime");
            return (Criteria) this;
        }

        public Criteria andJcTimeNotEqualTo(String value) {
            addCriterion("jc_time <>", value, "jcTime");
            return (Criteria) this;
        }

        public Criteria andJcTimeGreaterThan(String value) {
            addCriterion("jc_time >", value, "jcTime");
            return (Criteria) this;
        }

        public Criteria andJcTimeGreaterThanOrEqualTo(String value) {
            addCriterion("jc_time >=", value, "jcTime");
            return (Criteria) this;
        }

        public Criteria andJcTimeLessThan(String value) {
            addCriterion("jc_time <", value, "jcTime");
            return (Criteria) this;
        }

        public Criteria andJcTimeLessThanOrEqualTo(String value) {
            addCriterion("jc_time <=", value, "jcTime");
            return (Criteria) this;
        }

        public Criteria andJcTimeLike(String value) {
            addCriterion("jc_time like", value, "jcTime");
            return (Criteria) this;
        }

        public Criteria andJcTimeNotLike(String value) {
            addCriterion("jc_time not like", value, "jcTime");
            return (Criteria) this;
        }

        public Criteria andJcTimeIn(List<String> values) {
            addCriterion("jc_time in", values, "jcTime");
            return (Criteria) this;
        }

        public Criteria andJcTimeNotIn(List<String> values) {
            addCriterion("jc_time not in", values, "jcTime");
            return (Criteria) this;
        }

        public Criteria andJcTimeBetween(String value1, String value2) {
            addCriterion("jc_time between", value1, value2, "jcTime");
            return (Criteria) this;
        }

        public Criteria andJcTimeNotBetween(String value1, String value2) {
            addCriterion("jc_time not between", value1, value2, "jcTime");
            return (Criteria) this;
        }

        public Criteria andTjxmIdIsNull() {
            addCriterion("tjxm_id is null");
            return (Criteria) this;
        }

        public Criteria andTjxmIdIsNotNull() {
            addCriterion("tjxm_id is not null");
            return (Criteria) this;
        }

        public Criteria andTjxmIdEqualTo(Integer value) {
            addCriterion("tjxm_id =", value, "tjxmId");
            return (Criteria) this;
        }

        public Criteria andTjxmIdNotEqualTo(Integer value) {
            addCriterion("tjxm_id <>", value, "tjxmId");
            return (Criteria) this;
        }

        public Criteria andTjxmIdGreaterThan(Integer value) {
            addCriterion("tjxm_id >", value, "tjxmId");
            return (Criteria) this;
        }

        public Criteria andTjxmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tjxm_id >=", value, "tjxmId");
            return (Criteria) this;
        }

        public Criteria andTjxmIdLessThan(Integer value) {
            addCriterion("tjxm_id <", value, "tjxmId");
            return (Criteria) this;
        }

        public Criteria andTjxmIdLessThanOrEqualTo(Integer value) {
            addCriterion("tjxm_id <=", value, "tjxmId");
            return (Criteria) this;
        }

        public Criteria andTjxmIdIn(List<Integer> values) {
            addCriterion("tjxm_id in", values, "tjxmId");
            return (Criteria) this;
        }

        public Criteria andTjxmIdNotIn(List<Integer> values) {
            addCriterion("tjxm_id not in", values, "tjxmId");
            return (Criteria) this;
        }

        public Criteria andTjxmIdBetween(Integer value1, Integer value2) {
            addCriterion("tjxm_id between", value1, value2, "tjxmId");
            return (Criteria) this;
        }

        public Criteria andTjxmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tjxm_id not between", value1, value2, "tjxmId");
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