package com.creat.secret.po;

import java.util.ArrayList;
import java.util.List;

public class XyndExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XyndExample() {
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

        public Criteria andXyndIdIsNull() {
            addCriterion("xynd_id is null");
            return (Criteria) this;
        }

        public Criteria andXyndIdIsNotNull() {
            addCriterion("xynd_id is not null");
            return (Criteria) this;
        }

        public Criteria andXyndIdEqualTo(Integer value) {
            addCriterion("xynd_id =", value, "xyndId");
            return (Criteria) this;
        }

        public Criteria andXyndIdNotEqualTo(Integer value) {
            addCriterion("xynd_id <>", value, "xyndId");
            return (Criteria) this;
        }

        public Criteria andXyndIdGreaterThan(Integer value) {
            addCriterion("xynd_id >", value, "xyndId");
            return (Criteria) this;
        }

        public Criteria andXyndIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("xynd_id >=", value, "xyndId");
            return (Criteria) this;
        }

        public Criteria andXyndIdLessThan(Integer value) {
            addCriterion("xynd_id <", value, "xyndId");
            return (Criteria) this;
        }

        public Criteria andXyndIdLessThanOrEqualTo(Integer value) {
            addCriterion("xynd_id <=", value, "xyndId");
            return (Criteria) this;
        }

        public Criteria andXyndIdIn(List<Integer> values) {
            addCriterion("xynd_id in", values, "xyndId");
            return (Criteria) this;
        }

        public Criteria andXyndIdNotIn(List<Integer> values) {
            addCriterion("xynd_id not in", values, "xyndId");
            return (Criteria) this;
        }

        public Criteria andXyndIdBetween(Integer value1, Integer value2) {
            addCriterion("xynd_id between", value1, value2, "xyndId");
            return (Criteria) this;
        }

        public Criteria andXyndIdNotBetween(Integer value1, Integer value2) {
            addCriterion("xynd_id not between", value1, value2, "xyndId");
            return (Criteria) this;
        }

        public Criteria andYyqkIdIsNull() {
            addCriterion("yyqk_id is null");
            return (Criteria) this;
        }

        public Criteria andYyqkIdIsNotNull() {
            addCriterion("yyqk_id is not null");
            return (Criteria) this;
        }

        public Criteria andYyqkIdEqualTo(Integer value) {
            addCriterion("yyqk_id =", value, "yyqkId");
            return (Criteria) this;
        }

        public Criteria andYyqkIdNotEqualTo(Integer value) {
            addCriterion("yyqk_id <>", value, "yyqkId");
            return (Criteria) this;
        }

        public Criteria andYyqkIdGreaterThan(Integer value) {
            addCriterion("yyqk_id >", value, "yyqkId");
            return (Criteria) this;
        }

        public Criteria andYyqkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("yyqk_id >=", value, "yyqkId");
            return (Criteria) this;
        }

        public Criteria andYyqkIdLessThan(Integer value) {
            addCriterion("yyqk_id <", value, "yyqkId");
            return (Criteria) this;
        }

        public Criteria andYyqkIdLessThanOrEqualTo(Integer value) {
            addCriterion("yyqk_id <=", value, "yyqkId");
            return (Criteria) this;
        }

        public Criteria andYyqkIdIn(List<Integer> values) {
            addCriterion("yyqk_id in", values, "yyqkId");
            return (Criteria) this;
        }

        public Criteria andYyqkIdNotIn(List<Integer> values) {
            addCriterion("yyqk_id not in", values, "yyqkId");
            return (Criteria) this;
        }

        public Criteria andYyqkIdBetween(Integer value1, Integer value2) {
            addCriterion("yyqk_id between", value1, value2, "yyqkId");
            return (Criteria) this;
        }

        public Criteria andYyqkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("yyqk_id not between", value1, value2, "yyqkId");
            return (Criteria) this;
        }

        public Criteria andFndIsNull() {
            addCriterion("fnd is null");
            return (Criteria) this;
        }

        public Criteria andFndIsNotNull() {
            addCriterion("fnd is not null");
            return (Criteria) this;
        }

        public Criteria andFndEqualTo(String value) {
            addCriterion("fnd =", value, "fnd");
            return (Criteria) this;
        }

        public Criteria andFndNotEqualTo(String value) {
            addCriterion("fnd <>", value, "fnd");
            return (Criteria) this;
        }

        public Criteria andFndGreaterThan(String value) {
            addCriterion("fnd >", value, "fnd");
            return (Criteria) this;
        }

        public Criteria andFndGreaterThanOrEqualTo(String value) {
            addCriterion("fnd >=", value, "fnd");
            return (Criteria) this;
        }

        public Criteria andFndLessThan(String value) {
            addCriterion("fnd <", value, "fnd");
            return (Criteria) this;
        }

        public Criteria andFndLessThanOrEqualTo(String value) {
            addCriterion("fnd <=", value, "fnd");
            return (Criteria) this;
        }

        public Criteria andFndLike(String value) {
            addCriterion("fnd like", value, "fnd");
            return (Criteria) this;
        }

        public Criteria andFndNotLike(String value) {
            addCriterion("fnd not like", value, "fnd");
            return (Criteria) this;
        }

        public Criteria andFndIn(List<String> values) {
            addCriterion("fnd in", values, "fnd");
            return (Criteria) this;
        }

        public Criteria andFndNotIn(List<String> values) {
            addCriterion("fnd not in", values, "fnd");
            return (Criteria) this;
        }

        public Criteria andFndBetween(String value1, String value2) {
            addCriterion("fnd between", value1, value2, "fnd");
            return (Criteria) this;
        }

        public Criteria andFndNotBetween(String value1, String value2) {
            addCriterion("fnd not between", value1, value2, "fnd");
            return (Criteria) this;
        }

        public Criteria andGndIsNull() {
            addCriterion("gnd is null");
            return (Criteria) this;
        }

        public Criteria andGndIsNotNull() {
            addCriterion("gnd is not null");
            return (Criteria) this;
        }

        public Criteria andGndEqualTo(String value) {
            addCriterion("gnd =", value, "gnd");
            return (Criteria) this;
        }

        public Criteria andGndNotEqualTo(String value) {
            addCriterion("gnd <>", value, "gnd");
            return (Criteria) this;
        }

        public Criteria andGndGreaterThan(String value) {
            addCriterion("gnd >", value, "gnd");
            return (Criteria) this;
        }

        public Criteria andGndGreaterThanOrEqualTo(String value) {
            addCriterion("gnd >=", value, "gnd");
            return (Criteria) this;
        }

        public Criteria andGndLessThan(String value) {
            addCriterion("gnd <", value, "gnd");
            return (Criteria) this;
        }

        public Criteria andGndLessThanOrEqualTo(String value) {
            addCriterion("gnd <=", value, "gnd");
            return (Criteria) this;
        }

        public Criteria andGndLike(String value) {
            addCriterion("gnd like", value, "gnd");
            return (Criteria) this;
        }

        public Criteria andGndNotLike(String value) {
            addCriterion("gnd not like", value, "gnd");
            return (Criteria) this;
        }

        public Criteria andGndIn(List<String> values) {
            addCriterion("gnd in", values, "gnd");
            return (Criteria) this;
        }

        public Criteria andGndNotIn(List<String> values) {
            addCriterion("gnd not in", values, "gnd");
            return (Criteria) this;
        }

        public Criteria andGndBetween(String value1, String value2) {
            addCriterion("gnd between", value1, value2, "gnd");
            return (Criteria) this;
        }

        public Criteria andGndNotBetween(String value1, String value2) {
            addCriterion("gnd not between", value1, value2, "gnd");
            return (Criteria) this;
        }

        public Criteria andYysjIsNull() {
            addCriterion("yysj is null");
            return (Criteria) this;
        }

        public Criteria andYysjIsNotNull() {
            addCriterion("yysj is not null");
            return (Criteria) this;
        }

        public Criteria andYysjEqualTo(String value) {
            addCriterion("yysj =", value, "yysj");
            return (Criteria) this;
        }

        public Criteria andYysjNotEqualTo(String value) {
            addCriterion("yysj <>", value, "yysj");
            return (Criteria) this;
        }

        public Criteria andYysjGreaterThan(String value) {
            addCriterion("yysj >", value, "yysj");
            return (Criteria) this;
        }

        public Criteria andYysjGreaterThanOrEqualTo(String value) {
            addCriterion("yysj >=", value, "yysj");
            return (Criteria) this;
        }

        public Criteria andYysjLessThan(String value) {
            addCriterion("yysj <", value, "yysj");
            return (Criteria) this;
        }

        public Criteria andYysjLessThanOrEqualTo(String value) {
            addCriterion("yysj <=", value, "yysj");
            return (Criteria) this;
        }

        public Criteria andYysjLike(String value) {
            addCriterion("yysj like", value, "yysj");
            return (Criteria) this;
        }

        public Criteria andYysjNotLike(String value) {
            addCriterion("yysj not like", value, "yysj");
            return (Criteria) this;
        }

        public Criteria andYysjIn(List<String> values) {
            addCriterion("yysj in", values, "yysj");
            return (Criteria) this;
        }

        public Criteria andYysjNotIn(List<String> values) {
            addCriterion("yysj not in", values, "yysj");
            return (Criteria) this;
        }

        public Criteria andYysjBetween(String value1, String value2) {
            addCriterion("yysj between", value1, value2, "yysj");
            return (Criteria) this;
        }

        public Criteria andYysjNotBetween(String value1, String value2) {
            addCriterion("yysj not between", value1, value2, "yysj");
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