package com.creat.secret.po;

import java.util.ArrayList;
import java.util.List;

public class YyqkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YyqkExample() {
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

        public Criteria andYymcIsNull() {
            addCriterion("yymc is null");
            return (Criteria) this;
        }

        public Criteria andYymcIsNotNull() {
            addCriterion("yymc is not null");
            return (Criteria) this;
        }

        public Criteria andYymcEqualTo(String value) {
            addCriterion("yymc =", value, "yymc");
            return (Criteria) this;
        }

        public Criteria andYymcNotEqualTo(String value) {
            addCriterion("yymc <>", value, "yymc");
            return (Criteria) this;
        }

        public Criteria andYymcGreaterThan(String value) {
            addCriterion("yymc >", value, "yymc");
            return (Criteria) this;
        }

        public Criteria andYymcGreaterThanOrEqualTo(String value) {
            addCriterion("yymc >=", value, "yymc");
            return (Criteria) this;
        }

        public Criteria andYymcLessThan(String value) {
            addCriterion("yymc <", value, "yymc");
            return (Criteria) this;
        }

        public Criteria andYymcLessThanOrEqualTo(String value) {
            addCriterion("yymc <=", value, "yymc");
            return (Criteria) this;
        }

        public Criteria andYymcLike(String value) {
            addCriterion("yymc like", value, "yymc");
            return (Criteria) this;
        }

        public Criteria andYymcNotLike(String value) {
            addCriterion("yymc not like", value, "yymc");
            return (Criteria) this;
        }

        public Criteria andYymcIn(List<String> values) {
            addCriterion("yymc in", values, "yymc");
            return (Criteria) this;
        }

        public Criteria andYymcNotIn(List<String> values) {
            addCriterion("yymc not in", values, "yymc");
            return (Criteria) this;
        }

        public Criteria andYymcBetween(String value1, String value2) {
            addCriterion("yymc between", value1, value2, "yymc");
            return (Criteria) this;
        }

        public Criteria andYymcNotBetween(String value1, String value2) {
            addCriterion("yymc not between", value1, value2, "yymc");
            return (Criteria) this;
        }

        public Criteria andYyppIsNull() {
            addCriterion("yypp is null");
            return (Criteria) this;
        }

        public Criteria andYyppIsNotNull() {
            addCriterion("yypp is not null");
            return (Criteria) this;
        }

        public Criteria andYyppEqualTo(String value) {
            addCriterion("yypp =", value, "yypp");
            return (Criteria) this;
        }

        public Criteria andYyppNotEqualTo(String value) {
            addCriterion("yypp <>", value, "yypp");
            return (Criteria) this;
        }

        public Criteria andYyppGreaterThan(String value) {
            addCriterion("yypp >", value, "yypp");
            return (Criteria) this;
        }

        public Criteria andYyppGreaterThanOrEqualTo(String value) {
            addCriterion("yypp >=", value, "yypp");
            return (Criteria) this;
        }

        public Criteria andYyppLessThan(String value) {
            addCriterion("yypp <", value, "yypp");
            return (Criteria) this;
        }

        public Criteria andYyppLessThanOrEqualTo(String value) {
            addCriterion("yypp <=", value, "yypp");
            return (Criteria) this;
        }

        public Criteria andYyppLike(String value) {
            addCriterion("yypp like", value, "yypp");
            return (Criteria) this;
        }

        public Criteria andYyppNotLike(String value) {
            addCriterion("yypp not like", value, "yypp");
            return (Criteria) this;
        }

        public Criteria andYyppIn(List<String> values) {
            addCriterion("yypp in", values, "yypp");
            return (Criteria) this;
        }

        public Criteria andYyppNotIn(List<String> values) {
            addCriterion("yypp not in", values, "yypp");
            return (Criteria) this;
        }

        public Criteria andYyppBetween(String value1, String value2) {
            addCriterion("yypp between", value1, value2, "yypp");
            return (Criteria) this;
        }

        public Criteria andYyppNotBetween(String value1, String value2) {
            addCriterion("yypp not between", value1, value2, "yypp");
            return (Criteria) this;
        }

        public Criteria andYyjlCsIsNull() {
            addCriterion("yyjl_cs is null");
            return (Criteria) this;
        }

        public Criteria andYyjlCsIsNotNull() {
            addCriterion("yyjl_cs is not null");
            return (Criteria) this;
        }

        public Criteria andYyjlCsEqualTo(Integer value) {
            addCriterion("yyjl_cs =", value, "yyjlCs");
            return (Criteria) this;
        }

        public Criteria andYyjlCsNotEqualTo(Integer value) {
            addCriterion("yyjl_cs <>", value, "yyjlCs");
            return (Criteria) this;
        }

        public Criteria andYyjlCsGreaterThan(Integer value) {
            addCriterion("yyjl_cs >", value, "yyjlCs");
            return (Criteria) this;
        }

        public Criteria andYyjlCsGreaterThanOrEqualTo(Integer value) {
            addCriterion("yyjl_cs >=", value, "yyjlCs");
            return (Criteria) this;
        }

        public Criteria andYyjlCsLessThan(Integer value) {
            addCriterion("yyjl_cs <", value, "yyjlCs");
            return (Criteria) this;
        }

        public Criteria andYyjlCsLessThanOrEqualTo(Integer value) {
            addCriterion("yyjl_cs <=", value, "yyjlCs");
            return (Criteria) this;
        }

        public Criteria andYyjlCsIn(List<Integer> values) {
            addCriterion("yyjl_cs in", values, "yyjlCs");
            return (Criteria) this;
        }

        public Criteria andYyjlCsNotIn(List<Integer> values) {
            addCriterion("yyjl_cs not in", values, "yyjlCs");
            return (Criteria) this;
        }

        public Criteria andYyjlCsBetween(Integer value1, Integer value2) {
            addCriterion("yyjl_cs between", value1, value2, "yyjlCs");
            return (Criteria) this;
        }

        public Criteria andYyjlCsNotBetween(Integer value1, Integer value2) {
            addCriterion("yyjl_cs not between", value1, value2, "yyjlCs");
            return (Criteria) this;
        }

        public Criteria andYyjlYlIsNull() {
            addCriterion("yyjl_yl is null");
            return (Criteria) this;
        }

        public Criteria andYyjlYlIsNotNull() {
            addCriterion("yyjl_yl is not null");
            return (Criteria) this;
        }

        public Criteria andYyjlYlEqualTo(String value) {
            addCriterion("yyjl_yl =", value, "yyjlYl");
            return (Criteria) this;
        }

        public Criteria andYyjlYlNotEqualTo(String value) {
            addCriterion("yyjl_yl <>", value, "yyjlYl");
            return (Criteria) this;
        }

        public Criteria andYyjlYlGreaterThan(String value) {
            addCriterion("yyjl_yl >", value, "yyjlYl");
            return (Criteria) this;
        }

        public Criteria andYyjlYlGreaterThanOrEqualTo(String value) {
            addCriterion("yyjl_yl >=", value, "yyjlYl");
            return (Criteria) this;
        }

        public Criteria andYyjlYlLessThan(String value) {
            addCriterion("yyjl_yl <", value, "yyjlYl");
            return (Criteria) this;
        }

        public Criteria andYyjlYlLessThanOrEqualTo(String value) {
            addCriterion("yyjl_yl <=", value, "yyjlYl");
            return (Criteria) this;
        }

        public Criteria andYyjlYlLike(String value) {
            addCriterion("yyjl_yl like", value, "yyjlYl");
            return (Criteria) this;
        }

        public Criteria andYyjlYlNotLike(String value) {
            addCriterion("yyjl_yl not like", value, "yyjlYl");
            return (Criteria) this;
        }

        public Criteria andYyjlYlIn(List<String> values) {
            addCriterion("yyjl_yl in", values, "yyjlYl");
            return (Criteria) this;
        }

        public Criteria andYyjlYlNotIn(List<String> values) {
            addCriterion("yyjl_yl not in", values, "yyjlYl");
            return (Criteria) this;
        }

        public Criteria andYyjlYlBetween(String value1, String value2) {
            addCriterion("yyjl_yl between", value1, value2, "yyjlYl");
            return (Criteria) this;
        }

        public Criteria andYyjlYlNotBetween(String value1, String value2) {
            addCriterion("yyjl_yl not between", value1, value2, "yyjlYl");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
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