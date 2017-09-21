package com.creat.secret.po;

import java.util.ArrayList;
import java.util.List;

public class TjxmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TjxmExample() {
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

        public Criteria andGgnAltIsNull() {
            addCriterion("ggn_alt is null");
            return (Criteria) this;
        }

        public Criteria andGgnAltIsNotNull() {
            addCriterion("ggn_alt is not null");
            return (Criteria) this;
        }

        public Criteria andGgnAltEqualTo(String value) {
            addCriterion("ggn_alt =", value, "ggnAlt");
            return (Criteria) this;
        }

        public Criteria andGgnAltNotEqualTo(String value) {
            addCriterion("ggn_alt <>", value, "ggnAlt");
            return (Criteria) this;
        }

        public Criteria andGgnAltGreaterThan(String value) {
            addCriterion("ggn_alt >", value, "ggnAlt");
            return (Criteria) this;
        }

        public Criteria andGgnAltGreaterThanOrEqualTo(String value) {
            addCriterion("ggn_alt >=", value, "ggnAlt");
            return (Criteria) this;
        }

        public Criteria andGgnAltLessThan(String value) {
            addCriterion("ggn_alt <", value, "ggnAlt");
            return (Criteria) this;
        }

        public Criteria andGgnAltLessThanOrEqualTo(String value) {
            addCriterion("ggn_alt <=", value, "ggnAlt");
            return (Criteria) this;
        }

        public Criteria andGgnAltLike(String value) {
            addCriterion("ggn_alt like", value, "ggnAlt");
            return (Criteria) this;
        }

        public Criteria andGgnAltNotLike(String value) {
            addCriterion("ggn_alt not like", value, "ggnAlt");
            return (Criteria) this;
        }

        public Criteria andGgnAltIn(List<String> values) {
            addCriterion("ggn_alt in", values, "ggnAlt");
            return (Criteria) this;
        }

        public Criteria andGgnAltNotIn(List<String> values) {
            addCriterion("ggn_alt not in", values, "ggnAlt");
            return (Criteria) this;
        }

        public Criteria andGgnAltBetween(String value1, String value2) {
            addCriterion("ggn_alt between", value1, value2, "ggnAlt");
            return (Criteria) this;
        }

        public Criteria andGgnAltNotBetween(String value1, String value2) {
            addCriterion("ggn_alt not between", value1, value2, "ggnAlt");
            return (Criteria) this;
        }

        public Criteria andGgnAstIsNull() {
            addCriterion("ggn_ast is null");
            return (Criteria) this;
        }

        public Criteria andGgnAstIsNotNull() {
            addCriterion("ggn_ast is not null");
            return (Criteria) this;
        }

        public Criteria andGgnAstEqualTo(String value) {
            addCriterion("ggn_ast =", value, "ggnAst");
            return (Criteria) this;
        }

        public Criteria andGgnAstNotEqualTo(String value) {
            addCriterion("ggn_ast <>", value, "ggnAst");
            return (Criteria) this;
        }

        public Criteria andGgnAstGreaterThan(String value) {
            addCriterion("ggn_ast >", value, "ggnAst");
            return (Criteria) this;
        }

        public Criteria andGgnAstGreaterThanOrEqualTo(String value) {
            addCriterion("ggn_ast >=", value, "ggnAst");
            return (Criteria) this;
        }

        public Criteria andGgnAstLessThan(String value) {
            addCriterion("ggn_ast <", value, "ggnAst");
            return (Criteria) this;
        }

        public Criteria andGgnAstLessThanOrEqualTo(String value) {
            addCriterion("ggn_ast <=", value, "ggnAst");
            return (Criteria) this;
        }

        public Criteria andGgnAstLike(String value) {
            addCriterion("ggn_ast like", value, "ggnAst");
            return (Criteria) this;
        }

        public Criteria andGgnAstNotLike(String value) {
            addCriterion("ggn_ast not like", value, "ggnAst");
            return (Criteria) this;
        }

        public Criteria andGgnAstIn(List<String> values) {
            addCriterion("ggn_ast in", values, "ggnAst");
            return (Criteria) this;
        }

        public Criteria andGgnAstNotIn(List<String> values) {
            addCriterion("ggn_ast not in", values, "ggnAst");
            return (Criteria) this;
        }

        public Criteria andGgnAstBetween(String value1, String value2) {
            addCriterion("ggn_ast between", value1, value2, "ggnAst");
            return (Criteria) this;
        }

        public Criteria andGgnAstNotBetween(String value1, String value2) {
            addCriterion("ggn_ast not between", value1, value2, "ggnAst");
            return (Criteria) this;
        }

        public Criteria andSgnJgIsNull() {
            addCriterion("sgn_jg is null");
            return (Criteria) this;
        }

        public Criteria andSgnJgIsNotNull() {
            addCriterion("sgn_jg is not null");
            return (Criteria) this;
        }

        public Criteria andSgnJgEqualTo(String value) {
            addCriterion("sgn_jg =", value, "sgnJg");
            return (Criteria) this;
        }

        public Criteria andSgnJgNotEqualTo(String value) {
            addCriterion("sgn_jg <>", value, "sgnJg");
            return (Criteria) this;
        }

        public Criteria andSgnJgGreaterThan(String value) {
            addCriterion("sgn_jg >", value, "sgnJg");
            return (Criteria) this;
        }

        public Criteria andSgnJgGreaterThanOrEqualTo(String value) {
            addCriterion("sgn_jg >=", value, "sgnJg");
            return (Criteria) this;
        }

        public Criteria andSgnJgLessThan(String value) {
            addCriterion("sgn_jg <", value, "sgnJg");
            return (Criteria) this;
        }

        public Criteria andSgnJgLessThanOrEqualTo(String value) {
            addCriterion("sgn_jg <=", value, "sgnJg");
            return (Criteria) this;
        }

        public Criteria andSgnJgLike(String value) {
            addCriterion("sgn_jg like", value, "sgnJg");
            return (Criteria) this;
        }

        public Criteria andSgnJgNotLike(String value) {
            addCriterion("sgn_jg not like", value, "sgnJg");
            return (Criteria) this;
        }

        public Criteria andSgnJgIn(List<String> values) {
            addCriterion("sgn_jg in", values, "sgnJg");
            return (Criteria) this;
        }

        public Criteria andSgnJgNotIn(List<String> values) {
            addCriterion("sgn_jg not in", values, "sgnJg");
            return (Criteria) this;
        }

        public Criteria andSgnJgBetween(String value1, String value2) {
            addCriterion("sgn_jg between", value1, value2, "sgnJg");
            return (Criteria) this;
        }

        public Criteria andSgnJgNotBetween(String value1, String value2) {
            addCriterion("sgn_jg not between", value1, value2, "sgnJg");
            return (Criteria) this;
        }

        public Criteria andSgnNsdIsNull() {
            addCriterion("sgn_nsd is null");
            return (Criteria) this;
        }

        public Criteria andSgnNsdIsNotNull() {
            addCriterion("sgn_nsd is not null");
            return (Criteria) this;
        }

        public Criteria andSgnNsdEqualTo(String value) {
            addCriterion("sgn_nsd =", value, "sgnNsd");
            return (Criteria) this;
        }

        public Criteria andSgnNsdNotEqualTo(String value) {
            addCriterion("sgn_nsd <>", value, "sgnNsd");
            return (Criteria) this;
        }

        public Criteria andSgnNsdGreaterThan(String value) {
            addCriterion("sgn_nsd >", value, "sgnNsd");
            return (Criteria) this;
        }

        public Criteria andSgnNsdGreaterThanOrEqualTo(String value) {
            addCriterion("sgn_nsd >=", value, "sgnNsd");
            return (Criteria) this;
        }

        public Criteria andSgnNsdLessThan(String value) {
            addCriterion("sgn_nsd <", value, "sgnNsd");
            return (Criteria) this;
        }

        public Criteria andSgnNsdLessThanOrEqualTo(String value) {
            addCriterion("sgn_nsd <=", value, "sgnNsd");
            return (Criteria) this;
        }

        public Criteria andSgnNsdLike(String value) {
            addCriterion("sgn_nsd like", value, "sgnNsd");
            return (Criteria) this;
        }

        public Criteria andSgnNsdNotLike(String value) {
            addCriterion("sgn_nsd not like", value, "sgnNsd");
            return (Criteria) this;
        }

        public Criteria andSgnNsdIn(List<String> values) {
            addCriterion("sgn_nsd in", values, "sgnNsd");
            return (Criteria) this;
        }

        public Criteria andSgnNsdNotIn(List<String> values) {
            addCriterion("sgn_nsd not in", values, "sgnNsd");
            return (Criteria) this;
        }

        public Criteria andSgnNsdBetween(String value1, String value2) {
            addCriterion("sgn_nsd between", value1, value2, "sgnNsd");
            return (Criteria) this;
        }

        public Criteria andSgnNsdNotBetween(String value1, String value2) {
            addCriterion("sgn_nsd not between", value1, value2, "sgnNsd");
            return (Criteria) this;
        }

        public Criteria andHcgzIsNull() {
            addCriterion("hcgz is null");
            return (Criteria) this;
        }

        public Criteria andHcgzIsNotNull() {
            addCriterion("hcgz is not null");
            return (Criteria) this;
        }

        public Criteria andHcgzEqualTo(String value) {
            addCriterion("hcgz =", value, "hcgz");
            return (Criteria) this;
        }

        public Criteria andHcgzNotEqualTo(String value) {
            addCriterion("hcgz <>", value, "hcgz");
            return (Criteria) this;
        }

        public Criteria andHcgzGreaterThan(String value) {
            addCriterion("hcgz >", value, "hcgz");
            return (Criteria) this;
        }

        public Criteria andHcgzGreaterThanOrEqualTo(String value) {
            addCriterion("hcgz >=", value, "hcgz");
            return (Criteria) this;
        }

        public Criteria andHcgzLessThan(String value) {
            addCriterion("hcgz <", value, "hcgz");
            return (Criteria) this;
        }

        public Criteria andHcgzLessThanOrEqualTo(String value) {
            addCriterion("hcgz <=", value, "hcgz");
            return (Criteria) this;
        }

        public Criteria andHcgzLike(String value) {
            addCriterion("hcgz like", value, "hcgz");
            return (Criteria) this;
        }

        public Criteria andHcgzNotLike(String value) {
            addCriterion("hcgz not like", value, "hcgz");
            return (Criteria) this;
        }

        public Criteria andHcgzIn(List<String> values) {
            addCriterion("hcgz in", values, "hcgz");
            return (Criteria) this;
        }

        public Criteria andHcgzNotIn(List<String> values) {
            addCriterion("hcgz not in", values, "hcgz");
            return (Criteria) this;
        }

        public Criteria andHcgzBetween(String value1, String value2) {
            addCriterion("hcgz between", value1, value2, "hcgz");
            return (Criteria) this;
        }

        public Criteria andHcgzNotBetween(String value1, String value2) {
            addCriterion("hcgz not between", value1, value2, "hcgz");
            return (Criteria) this;
        }

        public Criteria andXqnIsNull() {
            addCriterion("xqn is null");
            return (Criteria) this;
        }

        public Criteria andXqnIsNotNull() {
            addCriterion("xqn is not null");
            return (Criteria) this;
        }

        public Criteria andXqnEqualTo(String value) {
            addCriterion("xqn =", value, "xqn");
            return (Criteria) this;
        }

        public Criteria andXqnNotEqualTo(String value) {
            addCriterion("xqn <>", value, "xqn");
            return (Criteria) this;
        }

        public Criteria andXqnGreaterThan(String value) {
            addCriterion("xqn >", value, "xqn");
            return (Criteria) this;
        }

        public Criteria andXqnGreaterThanOrEqualTo(String value) {
            addCriterion("xqn >=", value, "xqn");
            return (Criteria) this;
        }

        public Criteria andXqnLessThan(String value) {
            addCriterion("xqn <", value, "xqn");
            return (Criteria) this;
        }

        public Criteria andXqnLessThanOrEqualTo(String value) {
            addCriterion("xqn <=", value, "xqn");
            return (Criteria) this;
        }

        public Criteria andXqnLike(String value) {
            addCriterion("xqn like", value, "xqn");
            return (Criteria) this;
        }

        public Criteria andXqnNotLike(String value) {
            addCriterion("xqn not like", value, "xqn");
            return (Criteria) this;
        }

        public Criteria andXqnIn(List<String> values) {
            addCriterion("xqn in", values, "xqn");
            return (Criteria) this;
        }

        public Criteria andXqnNotIn(List<String> values) {
            addCriterion("xqn not in", values, "xqn");
            return (Criteria) this;
        }

        public Criteria andXqnBetween(String value1, String value2) {
            addCriterion("xqn between", value1, value2, "xqn");
            return (Criteria) this;
        }

        public Criteria andXqnNotBetween(String value1, String value2) {
            addCriterion("xqn not between", value1, value2, "xqn");
            return (Criteria) this;
        }

        public Criteria andHasYwgmIsNull() {
            addCriterion("has_ywgm is null");
            return (Criteria) this;
        }

        public Criteria andHasYwgmIsNotNull() {
            addCriterion("has_ywgm is not null");
            return (Criteria) this;
        }

        public Criteria andHasYwgmEqualTo(String value) {
            addCriterion("has_ywgm =", value, "hasYwgm");
            return (Criteria) this;
        }

        public Criteria andHasYwgmNotEqualTo(String value) {
            addCriterion("has_ywgm <>", value, "hasYwgm");
            return (Criteria) this;
        }

        public Criteria andHasYwgmGreaterThan(String value) {
            addCriterion("has_ywgm >", value, "hasYwgm");
            return (Criteria) this;
        }

        public Criteria andHasYwgmGreaterThanOrEqualTo(String value) {
            addCriterion("has_ywgm >=", value, "hasYwgm");
            return (Criteria) this;
        }

        public Criteria andHasYwgmLessThan(String value) {
            addCriterion("has_ywgm <", value, "hasYwgm");
            return (Criteria) this;
        }

        public Criteria andHasYwgmLessThanOrEqualTo(String value) {
            addCriterion("has_ywgm <=", value, "hasYwgm");
            return (Criteria) this;
        }

        public Criteria andHasYwgmLike(String value) {
            addCriterion("has_ywgm like", value, "hasYwgm");
            return (Criteria) this;
        }

        public Criteria andHasYwgmNotLike(String value) {
            addCriterion("has_ywgm not like", value, "hasYwgm");
            return (Criteria) this;
        }

        public Criteria andHasYwgmIn(List<String> values) {
            addCriterion("has_ywgm in", values, "hasYwgm");
            return (Criteria) this;
        }

        public Criteria andHasYwgmNotIn(List<String> values) {
            addCriterion("has_ywgm not in", values, "hasYwgm");
            return (Criteria) this;
        }

        public Criteria andHasYwgmBetween(String value1, String value2) {
            addCriterion("has_ywgm between", value1, value2, "hasYwgm");
            return (Criteria) this;
        }

        public Criteria andHasYwgmNotBetween(String value1, String value2) {
            addCriterion("has_ywgm not between", value1, value2, "hasYwgm");
            return (Criteria) this;
        }

        public Criteria andYwgmIsNull() {
            addCriterion("ywgm is null");
            return (Criteria) this;
        }

        public Criteria andYwgmIsNotNull() {
            addCriterion("ywgm is not null");
            return (Criteria) this;
        }

        public Criteria andYwgmEqualTo(String value) {
            addCriterion("ywgm =", value, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmNotEqualTo(String value) {
            addCriterion("ywgm <>", value, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmGreaterThan(String value) {
            addCriterion("ywgm >", value, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmGreaterThanOrEqualTo(String value) {
            addCriterion("ywgm >=", value, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmLessThan(String value) {
            addCriterion("ywgm <", value, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmLessThanOrEqualTo(String value) {
            addCriterion("ywgm <=", value, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmLike(String value) {
            addCriterion("ywgm like", value, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmNotLike(String value) {
            addCriterion("ywgm not like", value, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmIn(List<String> values) {
            addCriterion("ywgm in", values, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmNotIn(List<String> values) {
            addCriterion("ywgm not in", values, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmBetween(String value1, String value2) {
            addCriterion("ywgm between", value1, value2, "ywgm");
            return (Criteria) this;
        }

        public Criteria andYwgmNotBetween(String value1, String value2) {
            addCriterion("ywgm not between", value1, value2, "ywgm");
            return (Criteria) this;
        }

        public Criteria andStevenIsNull() {
            addCriterion("steven is null");
            return (Criteria) this;
        }

        public Criteria andStevenIsNotNull() {
            addCriterion("steven is not null");
            return (Criteria) this;
        }

        public Criteria andStevenEqualTo(String value) {
            addCriterion("steven =", value, "steven");
            return (Criteria) this;
        }

        public Criteria andStevenNotEqualTo(String value) {
            addCriterion("steven <>", value, "steven");
            return (Criteria) this;
        }

        public Criteria andStevenGreaterThan(String value) {
            addCriterion("steven >", value, "steven");
            return (Criteria) this;
        }

        public Criteria andStevenGreaterThanOrEqualTo(String value) {
            addCriterion("steven >=", value, "steven");
            return (Criteria) this;
        }

        public Criteria andStevenLessThan(String value) {
            addCriterion("steven <", value, "steven");
            return (Criteria) this;
        }

        public Criteria andStevenLessThanOrEqualTo(String value) {
            addCriterion("steven <=", value, "steven");
            return (Criteria) this;
        }

        public Criteria andStevenLike(String value) {
            addCriterion("steven like", value, "steven");
            return (Criteria) this;
        }

        public Criteria andStevenNotLike(String value) {
            addCriterion("steven not like", value, "steven");
            return (Criteria) this;
        }

        public Criteria andStevenIn(List<String> values) {
            addCriterion("steven in", values, "steven");
            return (Criteria) this;
        }

        public Criteria andStevenNotIn(List<String> values) {
            addCriterion("steven not in", values, "steven");
            return (Criteria) this;
        }

        public Criteria andStevenBetween(String value1, String value2) {
            addCriterion("steven between", value1, value2, "steven");
            return (Criteria) this;
        }

        public Criteria andStevenNotBetween(String value1, String value2) {
            addCriterion("steven not between", value1, value2, "steven");
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