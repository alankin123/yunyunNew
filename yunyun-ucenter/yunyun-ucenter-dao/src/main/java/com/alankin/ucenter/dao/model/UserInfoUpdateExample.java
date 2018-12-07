package com.alankin.ucenter.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserInfoUpdateExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public UserInfoUpdateExample() {
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

        public Criteria andAttributeNameIsNull() {
            addCriterion("attribute_name is null");
            return (Criteria) this;
        }

        public Criteria andAttributeNameIsNotNull() {
            addCriterion("attribute_name is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeNameEqualTo(String value) {
            addCriterion("attribute_name =", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameNotEqualTo(String value) {
            addCriterion("attribute_name <>", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameGreaterThan(String value) {
            addCriterion("attribute_name >", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameGreaterThanOrEqualTo(String value) {
            addCriterion("attribute_name >=", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameLessThan(String value) {
            addCriterion("attribute_name <", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameLessThanOrEqualTo(String value) {
            addCriterion("attribute_name <=", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameLike(String value) {
            addCriterion("attribute_name like", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameNotLike(String value) {
            addCriterion("attribute_name not like", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameIn(List<String> values) {
            addCriterion("attribute_name in", values, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameNotIn(List<String> values) {
            addCriterion("attribute_name not in", values, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameBetween(String value1, String value2) {
            addCriterion("attribute_name between", value1, value2, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameNotBetween(String value1, String value2) {
            addCriterion("attribute_name not between", value1, value2, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeOldValIsNull() {
            addCriterion("attribute_old_val is null");
            return (Criteria) this;
        }

        public Criteria andAttributeOldValIsNotNull() {
            addCriterion("attribute_old_val is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeOldValEqualTo(String value) {
            addCriterion("attribute_old_val =", value, "attributeOldVal");
            return (Criteria) this;
        }

        public Criteria andAttributeOldValNotEqualTo(String value) {
            addCriterion("attribute_old_val <>", value, "attributeOldVal");
            return (Criteria) this;
        }

        public Criteria andAttributeOldValGreaterThan(String value) {
            addCriterion("attribute_old_val >", value, "attributeOldVal");
            return (Criteria) this;
        }

        public Criteria andAttributeOldValGreaterThanOrEqualTo(String value) {
            addCriterion("attribute_old_val >=", value, "attributeOldVal");
            return (Criteria) this;
        }

        public Criteria andAttributeOldValLessThan(String value) {
            addCriterion("attribute_old_val <", value, "attributeOldVal");
            return (Criteria) this;
        }

        public Criteria andAttributeOldValLessThanOrEqualTo(String value) {
            addCriterion("attribute_old_val <=", value, "attributeOldVal");
            return (Criteria) this;
        }

        public Criteria andAttributeOldValLike(String value) {
            addCriterion("attribute_old_val like", value, "attributeOldVal");
            return (Criteria) this;
        }

        public Criteria andAttributeOldValNotLike(String value) {
            addCriterion("attribute_old_val not like", value, "attributeOldVal");
            return (Criteria) this;
        }

        public Criteria andAttributeOldValIn(List<String> values) {
            addCriterion("attribute_old_val in", values, "attributeOldVal");
            return (Criteria) this;
        }

        public Criteria andAttributeOldValNotIn(List<String> values) {
            addCriterion("attribute_old_val not in", values, "attributeOldVal");
            return (Criteria) this;
        }

        public Criteria andAttributeOldValBetween(String value1, String value2) {
            addCriterion("attribute_old_val between", value1, value2, "attributeOldVal");
            return (Criteria) this;
        }

        public Criteria andAttributeOldValNotBetween(String value1, String value2) {
            addCriterion("attribute_old_val not between", value1, value2, "attributeOldVal");
            return (Criteria) this;
        }

        public Criteria andAttributeNewValIsNull() {
            addCriterion("attribute_new_val is null");
            return (Criteria) this;
        }

        public Criteria andAttributeNewValIsNotNull() {
            addCriterion("attribute_new_val is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeNewValEqualTo(String value) {
            addCriterion("attribute_new_val =", value, "attributeNewVal");
            return (Criteria) this;
        }

        public Criteria andAttributeNewValNotEqualTo(String value) {
            addCriterion("attribute_new_val <>", value, "attributeNewVal");
            return (Criteria) this;
        }

        public Criteria andAttributeNewValGreaterThan(String value) {
            addCriterion("attribute_new_val >", value, "attributeNewVal");
            return (Criteria) this;
        }

        public Criteria andAttributeNewValGreaterThanOrEqualTo(String value) {
            addCriterion("attribute_new_val >=", value, "attributeNewVal");
            return (Criteria) this;
        }

        public Criteria andAttributeNewValLessThan(String value) {
            addCriterion("attribute_new_val <", value, "attributeNewVal");
            return (Criteria) this;
        }

        public Criteria andAttributeNewValLessThanOrEqualTo(String value) {
            addCriterion("attribute_new_val <=", value, "attributeNewVal");
            return (Criteria) this;
        }

        public Criteria andAttributeNewValLike(String value) {
            addCriterion("attribute_new_val like", value, "attributeNewVal");
            return (Criteria) this;
        }

        public Criteria andAttributeNewValNotLike(String value) {
            addCriterion("attribute_new_val not like", value, "attributeNewVal");
            return (Criteria) this;
        }

        public Criteria andAttributeNewValIn(List<String> values) {
            addCriterion("attribute_new_val in", values, "attributeNewVal");
            return (Criteria) this;
        }

        public Criteria andAttributeNewValNotIn(List<String> values) {
            addCriterion("attribute_new_val not in", values, "attributeNewVal");
            return (Criteria) this;
        }

        public Criteria andAttributeNewValBetween(String value1, String value2) {
            addCriterion("attribute_new_val between", value1, value2, "attributeNewVal");
            return (Criteria) this;
        }

        public Criteria andAttributeNewValNotBetween(String value1, String value2) {
            addCriterion("attribute_new_val not between", value1, value2, "attributeNewVal");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Integer value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Integer value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Integer value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Integer value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Integer> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Integer> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Integer value1, Integer value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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