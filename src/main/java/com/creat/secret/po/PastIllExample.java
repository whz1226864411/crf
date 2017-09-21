package com.creat.secret.po;

import java.util.ArrayList;
import java.util.List;

public class PastIllExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PastIllExample() {
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

        public Criteria andPastIdIsNull() {
            addCriterion("past_id is null");
            return (Criteria) this;
        }

        public Criteria andPastIdIsNotNull() {
            addCriterion("past_id is not null");
            return (Criteria) this;
        }

        public Criteria andPastIdEqualTo(Integer value) {
            addCriterion("past_id =", value, "pastId");
            return (Criteria) this;
        }

        public Criteria andPastIdNotEqualTo(Integer value) {
            addCriterion("past_id <>", value, "pastId");
            return (Criteria) this;
        }

        public Criteria andPastIdGreaterThan(Integer value) {
            addCriterion("past_id >", value, "pastId");
            return (Criteria) this;
        }

        public Criteria andPastIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("past_id >=", value, "pastId");
            return (Criteria) this;
        }

        public Criteria andPastIdLessThan(Integer value) {
            addCriterion("past_id <", value, "pastId");
            return (Criteria) this;
        }

        public Criteria andPastIdLessThanOrEqualTo(Integer value) {
            addCriterion("past_id <=", value, "pastId");
            return (Criteria) this;
        }

        public Criteria andPastIdIn(List<Integer> values) {
            addCriterion("past_id in", values, "pastId");
            return (Criteria) this;
        }

        public Criteria andPastIdNotIn(List<Integer> values) {
            addCriterion("past_id not in", values, "pastId");
            return (Criteria) this;
        }

        public Criteria andPastIdBetween(Integer value1, Integer value2) {
            addCriterion("past_id between", value1, value2, "pastId");
            return (Criteria) this;
        }

        public Criteria andPastIdNotBetween(Integer value1, Integer value2) {
            addCriterion("past_id not between", value1, value2, "pastId");
            return (Criteria) this;
        }

        public Criteria andHasDxIsNull() {
            addCriterion("has_dx is null");
            return (Criteria) this;
        }

        public Criteria andHasDxIsNotNull() {
            addCriterion("has_dx is not null");
            return (Criteria) this;
        }

        public Criteria andHasDxEqualTo(String value) {
            addCriterion("has_dx =", value, "hasDx");
            return (Criteria) this;
        }

        public Criteria andHasDxNotEqualTo(String value) {
            addCriterion("has_dx <>", value, "hasDx");
            return (Criteria) this;
        }

        public Criteria andHasDxGreaterThan(String value) {
            addCriterion("has_dx >", value, "hasDx");
            return (Criteria) this;
        }

        public Criteria andHasDxGreaterThanOrEqualTo(String value) {
            addCriterion("has_dx >=", value, "hasDx");
            return (Criteria) this;
        }

        public Criteria andHasDxLessThan(String value) {
            addCriterion("has_dx <", value, "hasDx");
            return (Criteria) this;
        }

        public Criteria andHasDxLessThanOrEqualTo(String value) {
            addCriterion("has_dx <=", value, "hasDx");
            return (Criteria) this;
        }

        public Criteria andHasDxLike(String value) {
            addCriterion("has_dx like", value, "hasDx");
            return (Criteria) this;
        }

        public Criteria andHasDxNotLike(String value) {
            addCriterion("has_dx not like", value, "hasDx");
            return (Criteria) this;
        }

        public Criteria andHasDxIn(List<String> values) {
            addCriterion("has_dx in", values, "hasDx");
            return (Criteria) this;
        }

        public Criteria andHasDxNotIn(List<String> values) {
            addCriterion("has_dx not in", values, "hasDx");
            return (Criteria) this;
        }

        public Criteria andHasDxBetween(String value1, String value2) {
            addCriterion("has_dx between", value1, value2, "hasDx");
            return (Criteria) this;
        }

        public Criteria andHasDxNotBetween(String value1, String value2) {
            addCriterion("has_dx not between", value1, value2, "hasDx");
            return (Criteria) this;
        }

        public Criteria andDxTpyeIsNull() {
            addCriterion("dx_tpye is null");
            return (Criteria) this;
        }

        public Criteria andDxTpyeIsNotNull() {
            addCriterion("dx_tpye is not null");
            return (Criteria) this;
        }

        public Criteria andDxTpyeEqualTo(String value) {
            addCriterion("dx_tpye =", value, "dxTpye");
            return (Criteria) this;
        }

        public Criteria andDxTpyeNotEqualTo(String value) {
            addCriterion("dx_tpye <>", value, "dxTpye");
            return (Criteria) this;
        }

        public Criteria andDxTpyeGreaterThan(String value) {
            addCriterion("dx_tpye >", value, "dxTpye");
            return (Criteria) this;
        }

        public Criteria andDxTpyeGreaterThanOrEqualTo(String value) {
            addCriterion("dx_tpye >=", value, "dxTpye");
            return (Criteria) this;
        }

        public Criteria andDxTpyeLessThan(String value) {
            addCriterion("dx_tpye <", value, "dxTpye");
            return (Criteria) this;
        }

        public Criteria andDxTpyeLessThanOrEqualTo(String value) {
            addCriterion("dx_tpye <=", value, "dxTpye");
            return (Criteria) this;
        }

        public Criteria andDxTpyeLike(String value) {
            addCriterion("dx_tpye like", value, "dxTpye");
            return (Criteria) this;
        }

        public Criteria andDxTpyeNotLike(String value) {
            addCriterion("dx_tpye not like", value, "dxTpye");
            return (Criteria) this;
        }

        public Criteria andDxTpyeIn(List<String> values) {
            addCriterion("dx_tpye in", values, "dxTpye");
            return (Criteria) this;
        }

        public Criteria andDxTpyeNotIn(List<String> values) {
            addCriterion("dx_tpye not in", values, "dxTpye");
            return (Criteria) this;
        }

        public Criteria andDxTpyeBetween(String value1, String value2) {
            addCriterion("dx_tpye between", value1, value2, "dxTpye");
            return (Criteria) this;
        }

        public Criteria andDxTpyeNotBetween(String value1, String value2) {
            addCriterion("dx_tpye not between", value1, value2, "dxTpye");
            return (Criteria) this;
        }

        public Criteria andGxyIsNull() {
            addCriterion("gxy is null");
            return (Criteria) this;
        }

        public Criteria andGxyIsNotNull() {
            addCriterion("gxy is not null");
            return (Criteria) this;
        }

        public Criteria andGxyEqualTo(String value) {
            addCriterion("gxy =", value, "gxy");
            return (Criteria) this;
        }

        public Criteria andGxyNotEqualTo(String value) {
            addCriterion("gxy <>", value, "gxy");
            return (Criteria) this;
        }

        public Criteria andGxyGreaterThan(String value) {
            addCriterion("gxy >", value, "gxy");
            return (Criteria) this;
        }

        public Criteria andGxyGreaterThanOrEqualTo(String value) {
            addCriterion("gxy >=", value, "gxy");
            return (Criteria) this;
        }

        public Criteria andGxyLessThan(String value) {
            addCriterion("gxy <", value, "gxy");
            return (Criteria) this;
        }

        public Criteria andGxyLessThanOrEqualTo(String value) {
            addCriterion("gxy <=", value, "gxy");
            return (Criteria) this;
        }

        public Criteria andGxyLike(String value) {
            addCriterion("gxy like", value, "gxy");
            return (Criteria) this;
        }

        public Criteria andGxyNotLike(String value) {
            addCriterion("gxy not like", value, "gxy");
            return (Criteria) this;
        }

        public Criteria andGxyIn(List<String> values) {
            addCriterion("gxy in", values, "gxy");
            return (Criteria) this;
        }

        public Criteria andGxyNotIn(List<String> values) {
            addCriterion("gxy not in", values, "gxy");
            return (Criteria) this;
        }

        public Criteria andGxyBetween(String value1, String value2) {
            addCriterion("gxy between", value1, value2, "gxy");
            return (Criteria) this;
        }

        public Criteria andGxyNotBetween(String value1, String value2) {
            addCriterion("gxy not between", value1, value2, "gxy");
            return (Criteria) this;
        }

        public Criteria andHasTnbIsNull() {
            addCriterion("has_tnb is null");
            return (Criteria) this;
        }

        public Criteria andHasTnbIsNotNull() {
            addCriterion("has_tnb is not null");
            return (Criteria) this;
        }

        public Criteria andHasTnbEqualTo(String value) {
            addCriterion("has_tnb =", value, "hasTnb");
            return (Criteria) this;
        }

        public Criteria andHasTnbNotEqualTo(String value) {
            addCriterion("has_tnb <>", value, "hasTnb");
            return (Criteria) this;
        }

        public Criteria andHasTnbGreaterThan(String value) {
            addCriterion("has_tnb >", value, "hasTnb");
            return (Criteria) this;
        }

        public Criteria andHasTnbGreaterThanOrEqualTo(String value) {
            addCriterion("has_tnb >=", value, "hasTnb");
            return (Criteria) this;
        }

        public Criteria andHasTnbLessThan(String value) {
            addCriterion("has_tnb <", value, "hasTnb");
            return (Criteria) this;
        }

        public Criteria andHasTnbLessThanOrEqualTo(String value) {
            addCriterion("has_tnb <=", value, "hasTnb");
            return (Criteria) this;
        }

        public Criteria andHasTnbLike(String value) {
            addCriterion("has_tnb like", value, "hasTnb");
            return (Criteria) this;
        }

        public Criteria andHasTnbNotLike(String value) {
            addCriterion("has_tnb not like", value, "hasTnb");
            return (Criteria) this;
        }

        public Criteria andHasTnbIn(List<String> values) {
            addCriterion("has_tnb in", values, "hasTnb");
            return (Criteria) this;
        }

        public Criteria andHasTnbNotIn(List<String> values) {
            addCriterion("has_tnb not in", values, "hasTnb");
            return (Criteria) this;
        }

        public Criteria andHasTnbBetween(String value1, String value2) {
            addCriterion("has_tnb between", value1, value2, "hasTnb");
            return (Criteria) this;
        }

        public Criteria andHasTnbNotBetween(String value1, String value2) {
            addCriterion("has_tnb not between", value1, value2, "hasTnb");
            return (Criteria) this;
        }

        public Criteria andOtherIllIsNull() {
            addCriterion("other_ill is null");
            return (Criteria) this;
        }

        public Criteria andOtherIllIsNotNull() {
            addCriterion("other_ill is not null");
            return (Criteria) this;
        }

        public Criteria andOtherIllEqualTo(String value) {
            addCriterion("other_ill =", value, "otherIll");
            return (Criteria) this;
        }

        public Criteria andOtherIllNotEqualTo(String value) {
            addCriterion("other_ill <>", value, "otherIll");
            return (Criteria) this;
        }

        public Criteria andOtherIllGreaterThan(String value) {
            addCriterion("other_ill >", value, "otherIll");
            return (Criteria) this;
        }

        public Criteria andOtherIllGreaterThanOrEqualTo(String value) {
            addCriterion("other_ill >=", value, "otherIll");
            return (Criteria) this;
        }

        public Criteria andOtherIllLessThan(String value) {
            addCriterion("other_ill <", value, "otherIll");
            return (Criteria) this;
        }

        public Criteria andOtherIllLessThanOrEqualTo(String value) {
            addCriterion("other_ill <=", value, "otherIll");
            return (Criteria) this;
        }

        public Criteria andOtherIllLike(String value) {
            addCriterion("other_ill like", value, "otherIll");
            return (Criteria) this;
        }

        public Criteria andOtherIllNotLike(String value) {
            addCriterion("other_ill not like", value, "otherIll");
            return (Criteria) this;
        }

        public Criteria andOtherIllIn(List<String> values) {
            addCriterion("other_ill in", values, "otherIll");
            return (Criteria) this;
        }

        public Criteria andOtherIllNotIn(List<String> values) {
            addCriterion("other_ill not in", values, "otherIll");
            return (Criteria) this;
        }

        public Criteria andOtherIllBetween(String value1, String value2) {
            addCriterion("other_ill between", value1, value2, "otherIll");
            return (Criteria) this;
        }

        public Criteria andOtherIllNotBetween(String value1, String value2) {
            addCriterion("other_ill not between", value1, value2, "otherIll");
            return (Criteria) this;
        }

        public Criteria andHasYcsfqIsNull() {
            addCriterion("has_ycsfq is null");
            return (Criteria) this;
        }

        public Criteria andHasYcsfqIsNotNull() {
            addCriterion("has_ycsfq is not null");
            return (Criteria) this;
        }

        public Criteria andHasYcsfqEqualTo(String value) {
            addCriterion("has_ycsfq =", value, "hasYcsfq");
            return (Criteria) this;
        }

        public Criteria andHasYcsfqNotEqualTo(String value) {
            addCriterion("has_ycsfq <>", value, "hasYcsfq");
            return (Criteria) this;
        }

        public Criteria andHasYcsfqGreaterThan(String value) {
            addCriterion("has_ycsfq >", value, "hasYcsfq");
            return (Criteria) this;
        }

        public Criteria andHasYcsfqGreaterThanOrEqualTo(String value) {
            addCriterion("has_ycsfq >=", value, "hasYcsfq");
            return (Criteria) this;
        }

        public Criteria andHasYcsfqLessThan(String value) {
            addCriterion("has_ycsfq <", value, "hasYcsfq");
            return (Criteria) this;
        }

        public Criteria andHasYcsfqLessThanOrEqualTo(String value) {
            addCriterion("has_ycsfq <=", value, "hasYcsfq");
            return (Criteria) this;
        }

        public Criteria andHasYcsfqLike(String value) {
            addCriterion("has_ycsfq like", value, "hasYcsfq");
            return (Criteria) this;
        }

        public Criteria andHasYcsfqNotLike(String value) {
            addCriterion("has_ycsfq not like", value, "hasYcsfq");
            return (Criteria) this;
        }

        public Criteria andHasYcsfqIn(List<String> values) {
            addCriterion("has_ycsfq in", values, "hasYcsfq");
            return (Criteria) this;
        }

        public Criteria andHasYcsfqNotIn(List<String> values) {
            addCriterion("has_ycsfq not in", values, "hasYcsfq");
            return (Criteria) this;
        }

        public Criteria andHasYcsfqBetween(String value1, String value2) {
            addCriterion("has_ycsfq between", value1, value2, "hasYcsfq");
            return (Criteria) this;
        }

        public Criteria andHasYcsfqNotBetween(String value1, String value2) {
            addCriterion("has_ycsfq not between", value1, value2, "hasYcsfq");
            return (Criteria) this;
        }

        public Criteria andYcsfqIsNull() {
            addCriterion("ycsfq is null");
            return (Criteria) this;
        }

        public Criteria andYcsfqIsNotNull() {
            addCriterion("ycsfq is not null");
            return (Criteria) this;
        }

        public Criteria andYcsfqEqualTo(String value) {
            addCriterion("ycsfq =", value, "ycsfq");
            return (Criteria) this;
        }

        public Criteria andYcsfqNotEqualTo(String value) {
            addCriterion("ycsfq <>", value, "ycsfq");
            return (Criteria) this;
        }

        public Criteria andYcsfqGreaterThan(String value) {
            addCriterion("ycsfq >", value, "ycsfq");
            return (Criteria) this;
        }

        public Criteria andYcsfqGreaterThanOrEqualTo(String value) {
            addCriterion("ycsfq >=", value, "ycsfq");
            return (Criteria) this;
        }

        public Criteria andYcsfqLessThan(String value) {
            addCriterion("ycsfq <", value, "ycsfq");
            return (Criteria) this;
        }

        public Criteria andYcsfqLessThanOrEqualTo(String value) {
            addCriterion("ycsfq <=", value, "ycsfq");
            return (Criteria) this;
        }

        public Criteria andYcsfqLike(String value) {
            addCriterion("ycsfq like", value, "ycsfq");
            return (Criteria) this;
        }

        public Criteria andYcsfqNotLike(String value) {
            addCriterion("ycsfq not like", value, "ycsfq");
            return (Criteria) this;
        }

        public Criteria andYcsfqIn(List<String> values) {
            addCriterion("ycsfq in", values, "ycsfq");
            return (Criteria) this;
        }

        public Criteria andYcsfqNotIn(List<String> values) {
            addCriterion("ycsfq not in", values, "ycsfq");
            return (Criteria) this;
        }

        public Criteria andYcsfqBetween(String value1, String value2) {
            addCriterion("ycsfq between", value1, value2, "ycsfq");
            return (Criteria) this;
        }

        public Criteria andYcsfqNotBetween(String value1, String value2) {
            addCriterion("ycsfq not between", value1, value2, "ycsfq");
            return (Criteria) this;
        }

        public Criteria andHasJzsfqIsNull() {
            addCriterion("has_jzsfq is null");
            return (Criteria) this;
        }

        public Criteria andHasJzsfqIsNotNull() {
            addCriterion("has_jzsfq is not null");
            return (Criteria) this;
        }

        public Criteria andHasJzsfqEqualTo(String value) {
            addCriterion("has_jzsfq =", value, "hasJzsfq");
            return (Criteria) this;
        }

        public Criteria andHasJzsfqNotEqualTo(String value) {
            addCriterion("has_jzsfq <>", value, "hasJzsfq");
            return (Criteria) this;
        }

        public Criteria andHasJzsfqGreaterThan(String value) {
            addCriterion("has_jzsfq >", value, "hasJzsfq");
            return (Criteria) this;
        }

        public Criteria andHasJzsfqGreaterThanOrEqualTo(String value) {
            addCriterion("has_jzsfq >=", value, "hasJzsfq");
            return (Criteria) this;
        }

        public Criteria andHasJzsfqLessThan(String value) {
            addCriterion("has_jzsfq <", value, "hasJzsfq");
            return (Criteria) this;
        }

        public Criteria andHasJzsfqLessThanOrEqualTo(String value) {
            addCriterion("has_jzsfq <=", value, "hasJzsfq");
            return (Criteria) this;
        }

        public Criteria andHasJzsfqLike(String value) {
            addCriterion("has_jzsfq like", value, "hasJzsfq");
            return (Criteria) this;
        }

        public Criteria andHasJzsfqNotLike(String value) {
            addCriterion("has_jzsfq not like", value, "hasJzsfq");
            return (Criteria) this;
        }

        public Criteria andHasJzsfqIn(List<String> values) {
            addCriterion("has_jzsfq in", values, "hasJzsfq");
            return (Criteria) this;
        }

        public Criteria andHasJzsfqNotIn(List<String> values) {
            addCriterion("has_jzsfq not in", values, "hasJzsfq");
            return (Criteria) this;
        }

        public Criteria andHasJzsfqBetween(String value1, String value2) {
            addCriterion("has_jzsfq between", value1, value2, "hasJzsfq");
            return (Criteria) this;
        }

        public Criteria andHasJzsfqNotBetween(String value1, String value2) {
            addCriterion("has_jzsfq not between", value1, value2, "hasJzsfq");
            return (Criteria) this;
        }

        public Criteria andJzsfqIsNull() {
            addCriterion("jzsfq is null");
            return (Criteria) this;
        }

        public Criteria andJzsfqIsNotNull() {
            addCriterion("jzsfq is not null");
            return (Criteria) this;
        }

        public Criteria andJzsfqEqualTo(String value) {
            addCriterion("jzsfq =", value, "jzsfq");
            return (Criteria) this;
        }

        public Criteria andJzsfqNotEqualTo(String value) {
            addCriterion("jzsfq <>", value, "jzsfq");
            return (Criteria) this;
        }

        public Criteria andJzsfqGreaterThan(String value) {
            addCriterion("jzsfq >", value, "jzsfq");
            return (Criteria) this;
        }

        public Criteria andJzsfqGreaterThanOrEqualTo(String value) {
            addCriterion("jzsfq >=", value, "jzsfq");
            return (Criteria) this;
        }

        public Criteria andJzsfqLessThan(String value) {
            addCriterion("jzsfq <", value, "jzsfq");
            return (Criteria) this;
        }

        public Criteria andJzsfqLessThanOrEqualTo(String value) {
            addCriterion("jzsfq <=", value, "jzsfq");
            return (Criteria) this;
        }

        public Criteria andJzsfqLike(String value) {
            addCriterion("jzsfq like", value, "jzsfq");
            return (Criteria) this;
        }

        public Criteria andJzsfqNotLike(String value) {
            addCriterion("jzsfq not like", value, "jzsfq");
            return (Criteria) this;
        }

        public Criteria andJzsfqIn(List<String> values) {
            addCriterion("jzsfq in", values, "jzsfq");
            return (Criteria) this;
        }

        public Criteria andJzsfqNotIn(List<String> values) {
            addCriterion("jzsfq not in", values, "jzsfq");
            return (Criteria) this;
        }

        public Criteria andJzsfqBetween(String value1, String value2) {
            addCriterion("jzsfq between", value1, value2, "jzsfq");
            return (Criteria) this;
        }

        public Criteria andJzsfqNotBetween(String value1, String value2) {
            addCriterion("jzsfq not between", value1, value2, "jzsfq");
            return (Criteria) this;
        }

        public Criteria andHasYcsmqIsNull() {
            addCriterion("has_ycsmq is null");
            return (Criteria) this;
        }

        public Criteria andHasYcsmqIsNotNull() {
            addCriterion("has_ycsmq is not null");
            return (Criteria) this;
        }

        public Criteria andHasYcsmqEqualTo(String value) {
            addCriterion("has_ycsmq =", value, "hasYcsmq");
            return (Criteria) this;
        }

        public Criteria andHasYcsmqNotEqualTo(String value) {
            addCriterion("has_ycsmq <>", value, "hasYcsmq");
            return (Criteria) this;
        }

        public Criteria andHasYcsmqGreaterThan(String value) {
            addCriterion("has_ycsmq >", value, "hasYcsmq");
            return (Criteria) this;
        }

        public Criteria andHasYcsmqGreaterThanOrEqualTo(String value) {
            addCriterion("has_ycsmq >=", value, "hasYcsmq");
            return (Criteria) this;
        }

        public Criteria andHasYcsmqLessThan(String value) {
            addCriterion("has_ycsmq <", value, "hasYcsmq");
            return (Criteria) this;
        }

        public Criteria andHasYcsmqLessThanOrEqualTo(String value) {
            addCriterion("has_ycsmq <=", value, "hasYcsmq");
            return (Criteria) this;
        }

        public Criteria andHasYcsmqLike(String value) {
            addCriterion("has_ycsmq like", value, "hasYcsmq");
            return (Criteria) this;
        }

        public Criteria andHasYcsmqNotLike(String value) {
            addCriterion("has_ycsmq not like", value, "hasYcsmq");
            return (Criteria) this;
        }

        public Criteria andHasYcsmqIn(List<String> values) {
            addCriterion("has_ycsmq in", values, "hasYcsmq");
            return (Criteria) this;
        }

        public Criteria andHasYcsmqNotIn(List<String> values) {
            addCriterion("has_ycsmq not in", values, "hasYcsmq");
            return (Criteria) this;
        }

        public Criteria andHasYcsmqBetween(String value1, String value2) {
            addCriterion("has_ycsmq between", value1, value2, "hasYcsmq");
            return (Criteria) this;
        }

        public Criteria andHasYcsmqNotBetween(String value1, String value2) {
            addCriterion("has_ycsmq not between", value1, value2, "hasYcsmq");
            return (Criteria) this;
        }

        public Criteria andYcsmqIsNull() {
            addCriterion("ycsmq is null");
            return (Criteria) this;
        }

        public Criteria andYcsmqIsNotNull() {
            addCriterion("ycsmq is not null");
            return (Criteria) this;
        }

        public Criteria andYcsmqEqualTo(String value) {
            addCriterion("ycsmq =", value, "ycsmq");
            return (Criteria) this;
        }

        public Criteria andYcsmqNotEqualTo(String value) {
            addCriterion("ycsmq <>", value, "ycsmq");
            return (Criteria) this;
        }

        public Criteria andYcsmqGreaterThan(String value) {
            addCriterion("ycsmq >", value, "ycsmq");
            return (Criteria) this;
        }

        public Criteria andYcsmqGreaterThanOrEqualTo(String value) {
            addCriterion("ycsmq >=", value, "ycsmq");
            return (Criteria) this;
        }

        public Criteria andYcsmqLessThan(String value) {
            addCriterion("ycsmq <", value, "ycsmq");
            return (Criteria) this;
        }

        public Criteria andYcsmqLessThanOrEqualTo(String value) {
            addCriterion("ycsmq <=", value, "ycsmq");
            return (Criteria) this;
        }

        public Criteria andYcsmqLike(String value) {
            addCriterion("ycsmq like", value, "ycsmq");
            return (Criteria) this;
        }

        public Criteria andYcsmqNotLike(String value) {
            addCriterion("ycsmq not like", value, "ycsmq");
            return (Criteria) this;
        }

        public Criteria andYcsmqIn(List<String> values) {
            addCriterion("ycsmq in", values, "ycsmq");
            return (Criteria) this;
        }

        public Criteria andYcsmqNotIn(List<String> values) {
            addCriterion("ycsmq not in", values, "ycsmq");
            return (Criteria) this;
        }

        public Criteria andYcsmqBetween(String value1, String value2) {
            addCriterion("ycsmq between", value1, value2, "ycsmq");
            return (Criteria) this;
        }

        public Criteria andYcsmqNotBetween(String value1, String value2) {
            addCriterion("ycsmq not between", value1, value2, "ycsmq");
            return (Criteria) this;
        }

        public Criteria andHasJzsmqIsNull() {
            addCriterion("has_jzsmq is null");
            return (Criteria) this;
        }

        public Criteria andHasJzsmqIsNotNull() {
            addCriterion("has_jzsmq is not null");
            return (Criteria) this;
        }

        public Criteria andHasJzsmqEqualTo(String value) {
            addCriterion("has_jzsmq =", value, "hasJzsmq");
            return (Criteria) this;
        }

        public Criteria andHasJzsmqNotEqualTo(String value) {
            addCriterion("has_jzsmq <>", value, "hasJzsmq");
            return (Criteria) this;
        }

        public Criteria andHasJzsmqGreaterThan(String value) {
            addCriterion("has_jzsmq >", value, "hasJzsmq");
            return (Criteria) this;
        }

        public Criteria andHasJzsmqGreaterThanOrEqualTo(String value) {
            addCriterion("has_jzsmq >=", value, "hasJzsmq");
            return (Criteria) this;
        }

        public Criteria andHasJzsmqLessThan(String value) {
            addCriterion("has_jzsmq <", value, "hasJzsmq");
            return (Criteria) this;
        }

        public Criteria andHasJzsmqLessThanOrEqualTo(String value) {
            addCriterion("has_jzsmq <=", value, "hasJzsmq");
            return (Criteria) this;
        }

        public Criteria andHasJzsmqLike(String value) {
            addCriterion("has_jzsmq like", value, "hasJzsmq");
            return (Criteria) this;
        }

        public Criteria andHasJzsmqNotLike(String value) {
            addCriterion("has_jzsmq not like", value, "hasJzsmq");
            return (Criteria) this;
        }

        public Criteria andHasJzsmqIn(List<String> values) {
            addCriterion("has_jzsmq in", values, "hasJzsmq");
            return (Criteria) this;
        }

        public Criteria andHasJzsmqNotIn(List<String> values) {
            addCriterion("has_jzsmq not in", values, "hasJzsmq");
            return (Criteria) this;
        }

        public Criteria andHasJzsmqBetween(String value1, String value2) {
            addCriterion("has_jzsmq between", value1, value2, "hasJzsmq");
            return (Criteria) this;
        }

        public Criteria andHasJzsmqNotBetween(String value1, String value2) {
            addCriterion("has_jzsmq not between", value1, value2, "hasJzsmq");
            return (Criteria) this;
        }

        public Criteria andJzsmqIsNull() {
            addCriterion("jzsmq is null");
            return (Criteria) this;
        }

        public Criteria andJzsmqIsNotNull() {
            addCriterion("jzsmq is not null");
            return (Criteria) this;
        }

        public Criteria andJzsmqEqualTo(String value) {
            addCriterion("jzsmq =", value, "jzsmq");
            return (Criteria) this;
        }

        public Criteria andJzsmqNotEqualTo(String value) {
            addCriterion("jzsmq <>", value, "jzsmq");
            return (Criteria) this;
        }

        public Criteria andJzsmqGreaterThan(String value) {
            addCriterion("jzsmq >", value, "jzsmq");
            return (Criteria) this;
        }

        public Criteria andJzsmqGreaterThanOrEqualTo(String value) {
            addCriterion("jzsmq >=", value, "jzsmq");
            return (Criteria) this;
        }

        public Criteria andJzsmqLessThan(String value) {
            addCriterion("jzsmq <", value, "jzsmq");
            return (Criteria) this;
        }

        public Criteria andJzsmqLessThanOrEqualTo(String value) {
            addCriterion("jzsmq <=", value, "jzsmq");
            return (Criteria) this;
        }

        public Criteria andJzsmqLike(String value) {
            addCriterion("jzsmq like", value, "jzsmq");
            return (Criteria) this;
        }

        public Criteria andJzsmqNotLike(String value) {
            addCriterion("jzsmq not like", value, "jzsmq");
            return (Criteria) this;
        }

        public Criteria andJzsmqIn(List<String> values) {
            addCriterion("jzsmq in", values, "jzsmq");
            return (Criteria) this;
        }

        public Criteria andJzsmqNotIn(List<String> values) {
            addCriterion("jzsmq not in", values, "jzsmq");
            return (Criteria) this;
        }

        public Criteria andJzsmqBetween(String value1, String value2) {
            addCriterion("jzsmq between", value1, value2, "jzsmq");
            return (Criteria) this;
        }

        public Criteria andJzsmqNotBetween(String value1, String value2) {
            addCriterion("jzsmq not between", value1, value2, "jzsmq");
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