package com.liuerchong.log.pojo;

import java.util.ArrayList;
import java.util.List;

public class BaseErrorlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseErrorlogExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(String value) {
            addCriterion("LOG_ID =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(String value) {
            addCriterion("LOG_ID <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(String value) {
            addCriterion("LOG_ID >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_ID >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(String value) {
            addCriterion("LOG_ID <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(String value) {
            addCriterion("LOG_ID <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLike(String value) {
            addCriterion("LOG_ID like", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotLike(String value) {
            addCriterion("LOG_ID not like", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<String> values) {
            addCriterion("LOG_ID in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<String> values) {
            addCriterion("LOG_ID not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(String value1, String value2) {
            addCriterion("LOG_ID between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(String value1, String value2) {
            addCriterion("LOG_ID not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("ACCOUNT =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("ACCOUNT <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("ACCOUNT >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("ACCOUNT <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("ACCOUNT like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("ACCOUNT not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("ACCOUNT in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("ACCOUNT not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("ACCOUNT between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andOptDateIsNull() {
            addCriterion("OPT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOptDateIsNotNull() {
            addCriterion("OPT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOptDateEqualTo(String value) {
            addCriterion("OPT_DATE =", value, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateNotEqualTo(String value) {
            addCriterion("OPT_DATE <>", value, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateGreaterThan(String value) {
            addCriterion("OPT_DATE >", value, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateGreaterThanOrEqualTo(String value) {
            addCriterion("OPT_DATE >=", value, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateLessThan(String value) {
            addCriterion("OPT_DATE <", value, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateLessThanOrEqualTo(String value) {
            addCriterion("OPT_DATE <=", value, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateLike(String value) {
            addCriterion("OPT_DATE like", value, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateNotLike(String value) {
            addCriterion("OPT_DATE not like", value, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateIn(List<String> values) {
            addCriterion("OPT_DATE in", values, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateNotIn(List<String> values) {
            addCriterion("OPT_DATE not in", values, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateBetween(String value1, String value2) {
            addCriterion("OPT_DATE between", value1, value2, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptDateNotBetween(String value1, String value2) {
            addCriterion("OPT_DATE not between", value1, value2, "optDate");
            return (Criteria) this;
        }

        public Criteria andOptStatusIsNull() {
            addCriterion("OPT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOptStatusIsNotNull() {
            addCriterion("OPT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOptStatusEqualTo(String value) {
            addCriterion("OPT_STATUS =", value, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusNotEqualTo(String value) {
            addCriterion("OPT_STATUS <>", value, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusGreaterThan(String value) {
            addCriterion("OPT_STATUS >", value, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusGreaterThanOrEqualTo(String value) {
            addCriterion("OPT_STATUS >=", value, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusLessThan(String value) {
            addCriterion("OPT_STATUS <", value, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusLessThanOrEqualTo(String value) {
            addCriterion("OPT_STATUS <=", value, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusLike(String value) {
            addCriterion("OPT_STATUS like", value, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusNotLike(String value) {
            addCriterion("OPT_STATUS not like", value, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusIn(List<String> values) {
            addCriterion("OPT_STATUS in", values, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusNotIn(List<String> values) {
            addCriterion("OPT_STATUS not in", values, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusBetween(String value1, String value2) {
            addCriterion("OPT_STATUS between", value1, value2, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusNotBetween(String value1, String value2) {
            addCriterion("OPT_STATUS not between", value1, value2, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptMethodIsNull() {
            addCriterion("OPT_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andOptMethodIsNotNull() {
            addCriterion("OPT_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andOptMethodEqualTo(String value) {
            addCriterion("OPT_METHOD =", value, "optMethod");
            return (Criteria) this;
        }

        public Criteria andOptMethodNotEqualTo(String value) {
            addCriterion("OPT_METHOD <>", value, "optMethod");
            return (Criteria) this;
        }

        public Criteria andOptMethodGreaterThan(String value) {
            addCriterion("OPT_METHOD >", value, "optMethod");
            return (Criteria) this;
        }

        public Criteria andOptMethodGreaterThanOrEqualTo(String value) {
            addCriterion("OPT_METHOD >=", value, "optMethod");
            return (Criteria) this;
        }

        public Criteria andOptMethodLessThan(String value) {
            addCriterion("OPT_METHOD <", value, "optMethod");
            return (Criteria) this;
        }

        public Criteria andOptMethodLessThanOrEqualTo(String value) {
            addCriterion("OPT_METHOD <=", value, "optMethod");
            return (Criteria) this;
        }

        public Criteria andOptMethodLike(String value) {
            addCriterion("OPT_METHOD like", value, "optMethod");
            return (Criteria) this;
        }

        public Criteria andOptMethodNotLike(String value) {
            addCriterion("OPT_METHOD not like", value, "optMethod");
            return (Criteria) this;
        }

        public Criteria andOptMethodIn(List<String> values) {
            addCriterion("OPT_METHOD in", values, "optMethod");
            return (Criteria) this;
        }

        public Criteria andOptMethodNotIn(List<String> values) {
            addCriterion("OPT_METHOD not in", values, "optMethod");
            return (Criteria) this;
        }

        public Criteria andOptMethodBetween(String value1, String value2) {
            addCriterion("OPT_METHOD between", value1, value2, "optMethod");
            return (Criteria) this;
        }

        public Criteria andOptMethodNotBetween(String value1, String value2) {
            addCriterion("OPT_METHOD not between", value1, value2, "optMethod");
            return (Criteria) this;
        }

        public Criteria andOptParemsIsNull() {
            addCriterion("OPT_PAREMS is null");
            return (Criteria) this;
        }

        public Criteria andOptParemsIsNotNull() {
            addCriterion("OPT_PAREMS is not null");
            return (Criteria) this;
        }

        public Criteria andOptParemsEqualTo(String value) {
            addCriterion("OPT_PAREMS =", value, "optParems");
            return (Criteria) this;
        }

        public Criteria andOptParemsNotEqualTo(String value) {
            addCriterion("OPT_PAREMS <>", value, "optParems");
            return (Criteria) this;
        }

        public Criteria andOptParemsGreaterThan(String value) {
            addCriterion("OPT_PAREMS >", value, "optParems");
            return (Criteria) this;
        }

        public Criteria andOptParemsGreaterThanOrEqualTo(String value) {
            addCriterion("OPT_PAREMS >=", value, "optParems");
            return (Criteria) this;
        }

        public Criteria andOptParemsLessThan(String value) {
            addCriterion("OPT_PAREMS <", value, "optParems");
            return (Criteria) this;
        }

        public Criteria andOptParemsLessThanOrEqualTo(String value) {
            addCriterion("OPT_PAREMS <=", value, "optParems");
            return (Criteria) this;
        }

        public Criteria andOptParemsLike(String value) {
            addCriterion("OPT_PAREMS like", value, "optParems");
            return (Criteria) this;
        }

        public Criteria andOptParemsNotLike(String value) {
            addCriterion("OPT_PAREMS not like", value, "optParems");
            return (Criteria) this;
        }

        public Criteria andOptParemsIn(List<String> values) {
            addCriterion("OPT_PAREMS in", values, "optParems");
            return (Criteria) this;
        }

        public Criteria andOptParemsNotIn(List<String> values) {
            addCriterion("OPT_PAREMS not in", values, "optParems");
            return (Criteria) this;
        }

        public Criteria andOptParemsBetween(String value1, String value2) {
            addCriterion("OPT_PAREMS between", value1, value2, "optParems");
            return (Criteria) this;
        }

        public Criteria andOptParemsNotBetween(String value1, String value2) {
            addCriterion("OPT_PAREMS not between", value1, value2, "optParems");
            return (Criteria) this;
        }

        public Criteria andOptDescIsNull() {
            addCriterion("OPT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andOptDescIsNotNull() {
            addCriterion("OPT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andOptDescEqualTo(String value) {
            addCriterion("OPT_DESC =", value, "optDesc");
            return (Criteria) this;
        }

        public Criteria andOptDescNotEqualTo(String value) {
            addCriterion("OPT_DESC <>", value, "optDesc");
            return (Criteria) this;
        }

        public Criteria andOptDescGreaterThan(String value) {
            addCriterion("OPT_DESC >", value, "optDesc");
            return (Criteria) this;
        }

        public Criteria andOptDescGreaterThanOrEqualTo(String value) {
            addCriterion("OPT_DESC >=", value, "optDesc");
            return (Criteria) this;
        }

        public Criteria andOptDescLessThan(String value) {
            addCriterion("OPT_DESC <", value, "optDesc");
            return (Criteria) this;
        }

        public Criteria andOptDescLessThanOrEqualTo(String value) {
            addCriterion("OPT_DESC <=", value, "optDesc");
            return (Criteria) this;
        }

        public Criteria andOptDescLike(String value) {
            addCriterion("OPT_DESC like", value, "optDesc");
            return (Criteria) this;
        }

        public Criteria andOptDescNotLike(String value) {
            addCriterion("OPT_DESC not like", value, "optDesc");
            return (Criteria) this;
        }

        public Criteria andOptDescIn(List<String> values) {
            addCriterion("OPT_DESC in", values, "optDesc");
            return (Criteria) this;
        }

        public Criteria andOptDescNotIn(List<String> values) {
            addCriterion("OPT_DESC not in", values, "optDesc");
            return (Criteria) this;
        }

        public Criteria andOptDescBetween(String value1, String value2) {
            addCriterion("OPT_DESC between", value1, value2, "optDesc");
            return (Criteria) this;
        }

        public Criteria andOptDescNotBetween(String value1, String value2) {
            addCriterion("OPT_DESC not between", value1, value2, "optDesc");
            return (Criteria) this;
        }

        public Criteria andReqIpIsNull() {
            addCriterion("REQ_IP is null");
            return (Criteria) this;
        }

        public Criteria andReqIpIsNotNull() {
            addCriterion("REQ_IP is not null");
            return (Criteria) this;
        }

        public Criteria andReqIpEqualTo(String value) {
            addCriterion("REQ_IP =", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpNotEqualTo(String value) {
            addCriterion("REQ_IP <>", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpGreaterThan(String value) {
            addCriterion("REQ_IP >", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_IP >=", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpLessThan(String value) {
            addCriterion("REQ_IP <", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpLessThanOrEqualTo(String value) {
            addCriterion("REQ_IP <=", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpLike(String value) {
            addCriterion("REQ_IP like", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpNotLike(String value) {
            addCriterion("REQ_IP not like", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpIn(List<String> values) {
            addCriterion("REQ_IP in", values, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpNotIn(List<String> values) {
            addCriterion("REQ_IP not in", values, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpBetween(String value1, String value2) {
            addCriterion("REQ_IP between", value1, value2, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpNotBetween(String value1, String value2) {
            addCriterion("REQ_IP not between", value1, value2, "reqIp");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsNull() {
            addCriterion("USER_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsNotNull() {
            addCriterion("USER_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleEqualTo(String value) {
            addCriterion("USER_ROLE =", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotEqualTo(String value) {
            addCriterion("USER_ROLE <>", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleGreaterThan(String value) {
            addCriterion("USER_ROLE >", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ROLE >=", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLessThan(String value) {
            addCriterion("USER_ROLE <", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLessThanOrEqualTo(String value) {
            addCriterion("USER_ROLE <=", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLike(String value) {
            addCriterion("USER_ROLE like", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotLike(String value) {
            addCriterion("USER_ROLE not like", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleIn(List<String> values) {
            addCriterion("USER_ROLE in", values, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotIn(List<String> values) {
            addCriterion("USER_ROLE not in", values, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleBetween(String value1, String value2) {
            addCriterion("USER_ROLE between", value1, value2, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotBetween(String value1, String value2) {
            addCriterion("USER_ROLE not between", value1, value2, "userRole");
            return (Criteria) this;
        }

        public Criteria andOptTimeIsNull() {
            addCriterion("OPT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOptTimeIsNotNull() {
            addCriterion("OPT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOptTimeEqualTo(String value) {
            addCriterion("OPT_TIME =", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeNotEqualTo(String value) {
            addCriterion("OPT_TIME <>", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeGreaterThan(String value) {
            addCriterion("OPT_TIME >", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeGreaterThanOrEqualTo(String value) {
            addCriterion("OPT_TIME >=", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeLessThan(String value) {
            addCriterion("OPT_TIME <", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeLessThanOrEqualTo(String value) {
            addCriterion("OPT_TIME <=", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeLike(String value) {
            addCriterion("OPT_TIME like", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeNotLike(String value) {
            addCriterion("OPT_TIME not like", value, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeIn(List<String> values) {
            addCriterion("OPT_TIME in", values, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeNotIn(List<String> values) {
            addCriterion("OPT_TIME not in", values, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeBetween(String value1, String value2) {
            addCriterion("OPT_TIME between", value1, value2, "optTime");
            return (Criteria) this;
        }

        public Criteria andOptTimeNotBetween(String value1, String value2) {
            addCriterion("OPT_TIME not between", value1, value2, "optTime");
            return (Criteria) this;
        }

        public Criteria andErrorDescIsNull() {
            addCriterion("ERROR_DESC is null");
            return (Criteria) this;
        }

        public Criteria andErrorDescIsNotNull() {
            addCriterion("ERROR_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andErrorDescEqualTo(String value) {
            addCriterion("ERROR_DESC =", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescNotEqualTo(String value) {
            addCriterion("ERROR_DESC <>", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescGreaterThan(String value) {
            addCriterion("ERROR_DESC >", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_DESC >=", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescLessThan(String value) {
            addCriterion("ERROR_DESC <", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescLessThanOrEqualTo(String value) {
            addCriterion("ERROR_DESC <=", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescLike(String value) {
            addCriterion("ERROR_DESC like", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescNotLike(String value) {
            addCriterion("ERROR_DESC not like", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescIn(List<String> values) {
            addCriterion("ERROR_DESC in", values, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescNotIn(List<String> values) {
            addCriterion("ERROR_DESC not in", values, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescBetween(String value1, String value2) {
            addCriterion("ERROR_DESC between", value1, value2, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescNotBetween(String value1, String value2) {
            addCriterion("ERROR_DESC not between", value1, value2, "errorDesc");
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