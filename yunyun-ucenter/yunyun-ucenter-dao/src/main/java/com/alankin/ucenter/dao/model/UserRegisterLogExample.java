package com.alankin.ucenter.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserRegisterLogExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public UserRegisterLogExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andRegisterMethodIsNull() {
            addCriterion("register_method is null");
            return (Criteria) this;
        }

        public Criteria andRegisterMethodIsNotNull() {
            addCriterion("register_method is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterMethodEqualTo(Byte value) {
            addCriterion("register_method =", value, "registerMethod");
            return (Criteria) this;
        }

        public Criteria andRegisterMethodNotEqualTo(Byte value) {
            addCriterion("register_method <>", value, "registerMethod");
            return (Criteria) this;
        }

        public Criteria andRegisterMethodGreaterThan(Byte value) {
            addCriterion("register_method >", value, "registerMethod");
            return (Criteria) this;
        }

        public Criteria andRegisterMethodGreaterThanOrEqualTo(Byte value) {
            addCriterion("register_method >=", value, "registerMethod");
            return (Criteria) this;
        }

        public Criteria andRegisterMethodLessThan(Byte value) {
            addCriterion("register_method <", value, "registerMethod");
            return (Criteria) this;
        }

        public Criteria andRegisterMethodLessThanOrEqualTo(Byte value) {
            addCriterion("register_method <=", value, "registerMethod");
            return (Criteria) this;
        }

        public Criteria andRegisterMethodIn(List<Byte> values) {
            addCriterion("register_method in", values, "registerMethod");
            return (Criteria) this;
        }

        public Criteria andRegisterMethodNotIn(List<Byte> values) {
            addCriterion("register_method not in", values, "registerMethod");
            return (Criteria) this;
        }

        public Criteria andRegisterMethodBetween(Byte value1, Byte value2) {
            addCriterion("register_method between", value1, value2, "registerMethod");
            return (Criteria) this;
        }

        public Criteria andRegisterMethodNotBetween(Byte value1, Byte value2) {
            addCriterion("register_method not between", value1, value2, "registerMethod");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Integer value) {
            addCriterion("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Integer value) {
            addCriterion("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Integer value) {
            addCriterion("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Integer value) {
            addCriterion("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Integer value) {
            addCriterion("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Integer> values) {
            addCriterion("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Integer> values) {
            addCriterion("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Integer value1, Integer value2) {
            addCriterion("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("register_time not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterIpIsNull() {
            addCriterion("register_ip is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIpIsNotNull() {
            addCriterion("register_ip is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterIpEqualTo(String value) {
            addCriterion("register_ip =", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpNotEqualTo(String value) {
            addCriterion("register_ip <>", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpGreaterThan(String value) {
            addCriterion("register_ip >", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpGreaterThanOrEqualTo(String value) {
            addCriterion("register_ip >=", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpLessThan(String value) {
            addCriterion("register_ip <", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpLessThanOrEqualTo(String value) {
            addCriterion("register_ip <=", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpLike(String value) {
            addCriterion("register_ip like", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpNotLike(String value) {
            addCriterion("register_ip not like", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpIn(List<String> values) {
            addCriterion("register_ip in", values, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpNotIn(List<String> values) {
            addCriterion("register_ip not in", values, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpBetween(String value1, String value2) {
            addCriterion("register_ip between", value1, value2, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpNotBetween(String value1, String value2) {
            addCriterion("register_ip not between", value1, value2, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterClientIsNull() {
            addCriterion("register_client is null");
            return (Criteria) this;
        }

        public Criteria andRegisterClientIsNotNull() {
            addCriterion("register_client is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterClientEqualTo(String value) {
            addCriterion("register_client =", value, "registerClient");
            return (Criteria) this;
        }

        public Criteria andRegisterClientNotEqualTo(String value) {
            addCriterion("register_client <>", value, "registerClient");
            return (Criteria) this;
        }

        public Criteria andRegisterClientGreaterThan(String value) {
            addCriterion("register_client >", value, "registerClient");
            return (Criteria) this;
        }

        public Criteria andRegisterClientGreaterThanOrEqualTo(String value) {
            addCriterion("register_client >=", value, "registerClient");
            return (Criteria) this;
        }

        public Criteria andRegisterClientLessThan(String value) {
            addCriterion("register_client <", value, "registerClient");
            return (Criteria) this;
        }

        public Criteria andRegisterClientLessThanOrEqualTo(String value) {
            addCriterion("register_client <=", value, "registerClient");
            return (Criteria) this;
        }

        public Criteria andRegisterClientLike(String value) {
            addCriterion("register_client like", value, "registerClient");
            return (Criteria) this;
        }

        public Criteria andRegisterClientNotLike(String value) {
            addCriterion("register_client not like", value, "registerClient");
            return (Criteria) this;
        }

        public Criteria andRegisterClientIn(List<String> values) {
            addCriterion("register_client in", values, "registerClient");
            return (Criteria) this;
        }

        public Criteria andRegisterClientNotIn(List<String> values) {
            addCriterion("register_client not in", values, "registerClient");
            return (Criteria) this;
        }

        public Criteria andRegisterClientBetween(String value1, String value2) {
            addCriterion("register_client between", value1, value2, "registerClient");
            return (Criteria) this;
        }

        public Criteria andRegisterClientNotBetween(String value1, String value2) {
            addCriterion("register_client not between", value1, value2, "registerClient");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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