package com.creat.secret.po;

import java.util.ArrayList;
import java.util.List;

public class BlfyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlfyExample() {
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

        public Criteria andBlfyIdIsNull() {
            addCriterion("blfy_id is null");
            return (Criteria) this;
        }

        public Criteria andBlfyIdIsNotNull() {
            addCriterion("blfy_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlfyIdEqualTo(Integer value) {
            addCriterion("blfy_id =", value, "blfyId");
            return (Criteria) this;
        }

        public Criteria andBlfyIdNotEqualTo(Integer value) {
            addCriterion("blfy_id <>", value, "blfyId");
            return (Criteria) this;
        }

        public Criteria andBlfyIdGreaterThan(Integer value) {
            addCriterion("blfy_id >", value, "blfyId");
            return (Criteria) this;
        }

        public Criteria andBlfyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blfy_id >=", value, "blfyId");
            return (Criteria) this;
        }

        public Criteria andBlfyIdLessThan(Integer value) {
            addCriterion("blfy_id <", value, "blfyId");
            return (Criteria) this;
        }

        public Criteria andBlfyIdLessThanOrEqualTo(Integer value) {
            addCriterion("blfy_id <=", value, "blfyId");
            return (Criteria) this;
        }

        public Criteria andBlfyIdIn(List<Integer> values) {
            addCriterion("blfy_id in", values, "blfyId");
            return (Criteria) this;
        }

        public Criteria andBlfyIdNotIn(List<Integer> values) {
            addCriterion("blfy_id not in", values, "blfyId");
            return (Criteria) this;
        }

        public Criteria andBlfyIdBetween(Integer value1, Integer value2) {
            addCriterion("blfy_id between", value1, value2, "blfyId");
            return (Criteria) this;
        }

        public Criteria andBlfyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blfy_id not between", value1, value2, "blfyId");
            return (Criteria) this;
        }

        public Criteria andBodyIsNull() {
            addCriterion("body is null");
            return (Criteria) this;
        }

        public Criteria andBodyIsNotNull() {
            addCriterion("body is not null");
            return (Criteria) this;
        }

        public Criteria andBodyEqualTo(String value) {
            addCriterion("body =", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotEqualTo(String value) {
            addCriterion("body <>", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyGreaterThan(String value) {
            addCriterion("body >", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyGreaterThanOrEqualTo(String value) {
            addCriterion("body >=", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLessThan(String value) {
            addCriterion("body <", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLessThanOrEqualTo(String value) {
            addCriterion("body <=", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLike(String value) {
            addCriterion("body like", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotLike(String value) {
            addCriterion("body not like", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyIn(List<String> values) {
            addCriterion("body in", values, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotIn(List<String> values) {
            addCriterion("body not in", values, "body");
            return (Criteria) this;
        }

        public Criteria andBodyBetween(String value1, String value2) {
            addCriterion("body between", value1, value2, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotBetween(String value1, String value2) {
            addCriterion("body not between", value1, value2, "body");
            return (Criteria) this;
        }

        public Criteria andZssjxtIsNull() {
            addCriterion("zssjxt is null");
            return (Criteria) this;
        }

        public Criteria andZssjxtIsNotNull() {
            addCriterion("zssjxt is not null");
            return (Criteria) this;
        }

        public Criteria andZssjxtEqualTo(String value) {
            addCriterion("zssjxt =", value, "zssjxt");
            return (Criteria) this;
        }

        public Criteria andZssjxtNotEqualTo(String value) {
            addCriterion("zssjxt <>", value, "zssjxt");
            return (Criteria) this;
        }

        public Criteria andZssjxtGreaterThan(String value) {
            addCriterion("zssjxt >", value, "zssjxt");
            return (Criteria) this;
        }

        public Criteria andZssjxtGreaterThanOrEqualTo(String value) {
            addCriterion("zssjxt >=", value, "zssjxt");
            return (Criteria) this;
        }

        public Criteria andZssjxtLessThan(String value) {
            addCriterion("zssjxt <", value, "zssjxt");
            return (Criteria) this;
        }

        public Criteria andZssjxtLessThanOrEqualTo(String value) {
            addCriterion("zssjxt <=", value, "zssjxt");
            return (Criteria) this;
        }

        public Criteria andZssjxtLike(String value) {
            addCriterion("zssjxt like", value, "zssjxt");
            return (Criteria) this;
        }

        public Criteria andZssjxtNotLike(String value) {
            addCriterion("zssjxt not like", value, "zssjxt");
            return (Criteria) this;
        }

        public Criteria andZssjxtIn(List<String> values) {
            addCriterion("zssjxt in", values, "zssjxt");
            return (Criteria) this;
        }

        public Criteria andZssjxtNotIn(List<String> values) {
            addCriterion("zssjxt not in", values, "zssjxt");
            return (Criteria) this;
        }

        public Criteria andZssjxtBetween(String value1, String value2) {
            addCriterion("zssjxt between", value1, value2, "zssjxt");
            return (Criteria) this;
        }

        public Criteria andZssjxtNotBetween(String value1, String value2) {
            addCriterion("zssjxt not between", value1, value2, "zssjxt");
            return (Criteria) this;
        }

        public Criteria andPfIsNull() {
            addCriterion("pf is null");
            return (Criteria) this;
        }

        public Criteria andPfIsNotNull() {
            addCriterion("pf is not null");
            return (Criteria) this;
        }

        public Criteria andPfEqualTo(String value) {
            addCriterion("pf =", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfNotEqualTo(String value) {
            addCriterion("pf <>", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfGreaterThan(String value) {
            addCriterion("pf >", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfGreaterThanOrEqualTo(String value) {
            addCriterion("pf >=", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfLessThan(String value) {
            addCriterion("pf <", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfLessThanOrEqualTo(String value) {
            addCriterion("pf <=", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfLike(String value) {
            addCriterion("pf like", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfNotLike(String value) {
            addCriterion("pf not like", value, "pf");
            return (Criteria) this;
        }

        public Criteria andPfIn(List<String> values) {
            addCriterion("pf in", values, "pf");
            return (Criteria) this;
        }

        public Criteria andPfNotIn(List<String> values) {
            addCriterion("pf not in", values, "pf");
            return (Criteria) this;
        }

        public Criteria andPfBetween(String value1, String value2) {
            addCriterion("pf between", value1, value2, "pf");
            return (Criteria) this;
        }

        public Criteria andPfNotBetween(String value1, String value2) {
            addCriterion("pf not between", value1, value2, "pf");
            return (Criteria) this;
        }

        public Criteria andGsqgIsNull() {
            addCriterion("gsqg is null");
            return (Criteria) this;
        }

        public Criteria andGsqgIsNotNull() {
            addCriterion("gsqg is not null");
            return (Criteria) this;
        }

        public Criteria andGsqgEqualTo(String value) {
            addCriterion("gsqg =", value, "gsqg");
            return (Criteria) this;
        }

        public Criteria andGsqgNotEqualTo(String value) {
            addCriterion("gsqg <>", value, "gsqg");
            return (Criteria) this;
        }

        public Criteria andGsqgGreaterThan(String value) {
            addCriterion("gsqg >", value, "gsqg");
            return (Criteria) this;
        }

        public Criteria andGsqgGreaterThanOrEqualTo(String value) {
            addCriterion("gsqg >=", value, "gsqg");
            return (Criteria) this;
        }

        public Criteria andGsqgLessThan(String value) {
            addCriterion("gsqg <", value, "gsqg");
            return (Criteria) this;
        }

        public Criteria andGsqgLessThanOrEqualTo(String value) {
            addCriterion("gsqg <=", value, "gsqg");
            return (Criteria) this;
        }

        public Criteria andGsqgLike(String value) {
            addCriterion("gsqg like", value, "gsqg");
            return (Criteria) this;
        }

        public Criteria andGsqgNotLike(String value) {
            addCriterion("gsqg not like", value, "gsqg");
            return (Criteria) this;
        }

        public Criteria andGsqgIn(List<String> values) {
            addCriterion("gsqg in", values, "gsqg");
            return (Criteria) this;
        }

        public Criteria andGsqgNotIn(List<String> values) {
            addCriterion("gsqg not in", values, "gsqg");
            return (Criteria) this;
        }

        public Criteria andGsqgBetween(String value1, String value2) {
            addCriterion("gsqg between", value1, value2, "gsqg");
            return (Criteria) this;
        }

        public Criteria andGsqgNotBetween(String value1, String value2) {
            addCriterion("gsqg not between", value1, value2, "gsqg");
            return (Criteria) this;
        }

        public Criteria andXnxgxtIsNull() {
            addCriterion("xnxgxt is null");
            return (Criteria) this;
        }

        public Criteria andXnxgxtIsNotNull() {
            addCriterion("xnxgxt is not null");
            return (Criteria) this;
        }

        public Criteria andXnxgxtEqualTo(String value) {
            addCriterion("xnxgxt =", value, "xnxgxt");
            return (Criteria) this;
        }

        public Criteria andXnxgxtNotEqualTo(String value) {
            addCriterion("xnxgxt <>", value, "xnxgxt");
            return (Criteria) this;
        }

        public Criteria andXnxgxtGreaterThan(String value) {
            addCriterion("xnxgxt >", value, "xnxgxt");
            return (Criteria) this;
        }

        public Criteria andXnxgxtGreaterThanOrEqualTo(String value) {
            addCriterion("xnxgxt >=", value, "xnxgxt");
            return (Criteria) this;
        }

        public Criteria andXnxgxtLessThan(String value) {
            addCriterion("xnxgxt <", value, "xnxgxt");
            return (Criteria) this;
        }

        public Criteria andXnxgxtLessThanOrEqualTo(String value) {
            addCriterion("xnxgxt <=", value, "xnxgxt");
            return (Criteria) this;
        }

        public Criteria andXnxgxtLike(String value) {
            addCriterion("xnxgxt like", value, "xnxgxt");
            return (Criteria) this;
        }

        public Criteria andXnxgxtNotLike(String value) {
            addCriterion("xnxgxt not like", value, "xnxgxt");
            return (Criteria) this;
        }

        public Criteria andXnxgxtIn(List<String> values) {
            addCriterion("xnxgxt in", values, "xnxgxt");
            return (Criteria) this;
        }

        public Criteria andXnxgxtNotIn(List<String> values) {
            addCriterion("xnxgxt not in", values, "xnxgxt");
            return (Criteria) this;
        }

        public Criteria andXnxgxtBetween(String value1, String value2) {
            addCriterion("xnxgxt between", value1, value2, "xnxgxt");
            return (Criteria) this;
        }

        public Criteria andXnxgxtNotBetween(String value1, String value2) {
            addCriterion("xnxgxt not between", value1, value2, "xnxgxt");
            return (Criteria) this;
        }

        public Criteria andWcdIsNull() {
            addCriterion("wcd is null");
            return (Criteria) this;
        }

        public Criteria andWcdIsNotNull() {
            addCriterion("wcd is not null");
            return (Criteria) this;
        }

        public Criteria andWcdEqualTo(String value) {
            addCriterion("wcd =", value, "wcd");
            return (Criteria) this;
        }

        public Criteria andWcdNotEqualTo(String value) {
            addCriterion("wcd <>", value, "wcd");
            return (Criteria) this;
        }

        public Criteria andWcdGreaterThan(String value) {
            addCriterion("wcd >", value, "wcd");
            return (Criteria) this;
        }

        public Criteria andWcdGreaterThanOrEqualTo(String value) {
            addCriterion("wcd >=", value, "wcd");
            return (Criteria) this;
        }

        public Criteria andWcdLessThan(String value) {
            addCriterion("wcd <", value, "wcd");
            return (Criteria) this;
        }

        public Criteria andWcdLessThanOrEqualTo(String value) {
            addCriterion("wcd <=", value, "wcd");
            return (Criteria) this;
        }

        public Criteria andWcdLike(String value) {
            addCriterion("wcd like", value, "wcd");
            return (Criteria) this;
        }

        public Criteria andWcdNotLike(String value) {
            addCriterion("wcd not like", value, "wcd");
            return (Criteria) this;
        }

        public Criteria andWcdIn(List<String> values) {
            addCriterion("wcd in", values, "wcd");
            return (Criteria) this;
        }

        public Criteria andWcdNotIn(List<String> values) {
            addCriterion("wcd not in", values, "wcd");
            return (Criteria) this;
        }

        public Criteria andWcdBetween(String value1, String value2) {
            addCriterion("wcd between", value1, value2, "wcd");
            return (Criteria) this;
        }

        public Criteria andWcdNotBetween(String value1, String value2) {
            addCriterion("wcd not between", value1, value2, "wcd");
            return (Criteria) this;
        }

        public Criteria andXyxtIsNull() {
            addCriterion("xyxt is null");
            return (Criteria) this;
        }

        public Criteria andXyxtIsNotNull() {
            addCriterion("xyxt is not null");
            return (Criteria) this;
        }

        public Criteria andXyxtEqualTo(String value) {
            addCriterion("xyxt =", value, "xyxt");
            return (Criteria) this;
        }

        public Criteria andXyxtNotEqualTo(String value) {
            addCriterion("xyxt <>", value, "xyxt");
            return (Criteria) this;
        }

        public Criteria andXyxtGreaterThan(String value) {
            addCriterion("xyxt >", value, "xyxt");
            return (Criteria) this;
        }

        public Criteria andXyxtGreaterThanOrEqualTo(String value) {
            addCriterion("xyxt >=", value, "xyxt");
            return (Criteria) this;
        }

        public Criteria andXyxtLessThan(String value) {
            addCriterion("xyxt <", value, "xyxt");
            return (Criteria) this;
        }

        public Criteria andXyxtLessThanOrEqualTo(String value) {
            addCriterion("xyxt <=", value, "xyxt");
            return (Criteria) this;
        }

        public Criteria andXyxtLike(String value) {
            addCriterion("xyxt like", value, "xyxt");
            return (Criteria) this;
        }

        public Criteria andXyxtNotLike(String value) {
            addCriterion("xyxt not like", value, "xyxt");
            return (Criteria) this;
        }

        public Criteria andXyxtIn(List<String> values) {
            addCriterion("xyxt in", values, "xyxt");
            return (Criteria) this;
        }

        public Criteria andXyxtNotIn(List<String> values) {
            addCriterion("xyxt not in", values, "xyxt");
            return (Criteria) this;
        }

        public Criteria andXyxtBetween(String value1, String value2) {
            addCriterion("xyxt between", value1, value2, "xyxt");
            return (Criteria) this;
        }

        public Criteria andXyxtNotBetween(String value1, String value2) {
            addCriterion("xyxt not between", value1, value2, "xyxt");
            return (Criteria) this;
        }

        public Criteria andGzIsNull() {
            addCriterion("gz is null");
            return (Criteria) this;
        }

        public Criteria andGzIsNotNull() {
            addCriterion("gz is not null");
            return (Criteria) this;
        }

        public Criteria andGzEqualTo(String value) {
            addCriterion("gz =", value, "gz");
            return (Criteria) this;
        }

        public Criteria andGzNotEqualTo(String value) {
            addCriterion("gz <>", value, "gz");
            return (Criteria) this;
        }

        public Criteria andGzGreaterThan(String value) {
            addCriterion("gz >", value, "gz");
            return (Criteria) this;
        }

        public Criteria andGzGreaterThanOrEqualTo(String value) {
            addCriterion("gz >=", value, "gz");
            return (Criteria) this;
        }

        public Criteria andGzLessThan(String value) {
            addCriterion("gz <", value, "gz");
            return (Criteria) this;
        }

        public Criteria andGzLessThanOrEqualTo(String value) {
            addCriterion("gz <=", value, "gz");
            return (Criteria) this;
        }

        public Criteria andGzLike(String value) {
            addCriterion("gz like", value, "gz");
            return (Criteria) this;
        }

        public Criteria andGzNotLike(String value) {
            addCriterion("gz not like", value, "gz");
            return (Criteria) this;
        }

        public Criteria andGzIn(List<String> values) {
            addCriterion("gz in", values, "gz");
            return (Criteria) this;
        }

        public Criteria andGzNotIn(List<String> values) {
            addCriterion("gz not in", values, "gz");
            return (Criteria) this;
        }

        public Criteria andGzBetween(String value1, String value2) {
            addCriterion("gz between", value1, value2, "gz");
            return (Criteria) this;
        }

        public Criteria andGzNotBetween(String value1, String value2) {
            addCriterion("gz not between", value1, value2, "gz");
            return (Criteria) this;
        }

        public Criteria andDxhyyzaIsNull() {
            addCriterion("dxhyyza is null");
            return (Criteria) this;
        }

        public Criteria andDxhyyzaIsNotNull() {
            addCriterion("dxhyyza is not null");
            return (Criteria) this;
        }

        public Criteria andDxhyyzaEqualTo(String value) {
            addCriterion("dxhyyza =", value, "dxhyyza");
            return (Criteria) this;
        }

        public Criteria andDxhyyzaNotEqualTo(String value) {
            addCriterion("dxhyyza <>", value, "dxhyyza");
            return (Criteria) this;
        }

        public Criteria andDxhyyzaGreaterThan(String value) {
            addCriterion("dxhyyza >", value, "dxhyyza");
            return (Criteria) this;
        }

        public Criteria andDxhyyzaGreaterThanOrEqualTo(String value) {
            addCriterion("dxhyyza >=", value, "dxhyyza");
            return (Criteria) this;
        }

        public Criteria andDxhyyzaLessThan(String value) {
            addCriterion("dxhyyza <", value, "dxhyyza");
            return (Criteria) this;
        }

        public Criteria andDxhyyzaLessThanOrEqualTo(String value) {
            addCriterion("dxhyyza <=", value, "dxhyyza");
            return (Criteria) this;
        }

        public Criteria andDxhyyzaLike(String value) {
            addCriterion("dxhyyza like", value, "dxhyyza");
            return (Criteria) this;
        }

        public Criteria andDxhyyzaNotLike(String value) {
            addCriterion("dxhyyza not like", value, "dxhyyza");
            return (Criteria) this;
        }

        public Criteria andDxhyyzaIn(List<String> values) {
            addCriterion("dxhyyza in", values, "dxhyyza");
            return (Criteria) this;
        }

        public Criteria andDxhyyzaNotIn(List<String> values) {
            addCriterion("dxhyyza not in", values, "dxhyyza");
            return (Criteria) this;
        }

        public Criteria andDxhyyzaBetween(String value1, String value2) {
            addCriterion("dxhyyza between", value1, value2, "dxhyyza");
            return (Criteria) this;
        }

        public Criteria andDxhyyzaNotBetween(String value1, String value2) {
            addCriterion("dxhyyza not between", value1, value2, "dxhyyza");
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