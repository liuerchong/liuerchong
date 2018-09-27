package com.liuerchong.goods.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsDescExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsDescExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("GOODS_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("GOODS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(BigDecimal value) {
            addCriterion("GOODS_ID =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(BigDecimal value) {
            addCriterion("GOODS_ID <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(BigDecimal value) {
            addCriterion("GOODS_ID >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODS_ID >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(BigDecimal value) {
            addCriterion("GOODS_ID <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODS_ID <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<BigDecimal> values) {
            addCriterion("GOODS_ID in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<BigDecimal> values) {
            addCriterion("GOODS_ID not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODS_ID between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODS_ID not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("INTRODUCTION is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("INTRODUCTION is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("INTRODUCTION =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("INTRODUCTION <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("INTRODUCTION >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("INTRODUCTION >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("INTRODUCTION <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("INTRODUCTION <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("INTRODUCTION like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("INTRODUCTION not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("INTRODUCTION in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("INTRODUCTION not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("INTRODUCTION between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("INTRODUCTION not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsIsNull() {
            addCriterion("SPECIFICATION_ITEMS is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsIsNotNull() {
            addCriterion("SPECIFICATION_ITEMS is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsEqualTo(String value) {
            addCriterion("SPECIFICATION_ITEMS =", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsNotEqualTo(String value) {
            addCriterion("SPECIFICATION_ITEMS <>", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsGreaterThan(String value) {
            addCriterion("SPECIFICATION_ITEMS >", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIFICATION_ITEMS >=", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsLessThan(String value) {
            addCriterion("SPECIFICATION_ITEMS <", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsLessThanOrEqualTo(String value) {
            addCriterion("SPECIFICATION_ITEMS <=", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsLike(String value) {
            addCriterion("SPECIFICATION_ITEMS like", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsNotLike(String value) {
            addCriterion("SPECIFICATION_ITEMS not like", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsIn(List<String> values) {
            addCriterion("SPECIFICATION_ITEMS in", values, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsNotIn(List<String> values) {
            addCriterion("SPECIFICATION_ITEMS not in", values, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsBetween(String value1, String value2) {
            addCriterion("SPECIFICATION_ITEMS between", value1, value2, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsNotBetween(String value1, String value2) {
            addCriterion("SPECIFICATION_ITEMS not between", value1, value2, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andItemImagesIsNull() {
            addCriterion("ITEM_IMAGES is null");
            return (Criteria) this;
        }

        public Criteria andItemImagesIsNotNull() {
            addCriterion("ITEM_IMAGES is not null");
            return (Criteria) this;
        }

        public Criteria andItemImagesEqualTo(String value) {
            addCriterion("ITEM_IMAGES =", value, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemImagesNotEqualTo(String value) {
            addCriterion("ITEM_IMAGES <>", value, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemImagesGreaterThan(String value) {
            addCriterion("ITEM_IMAGES >", value, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemImagesGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_IMAGES >=", value, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemImagesLessThan(String value) {
            addCriterion("ITEM_IMAGES <", value, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemImagesLessThanOrEqualTo(String value) {
            addCriterion("ITEM_IMAGES <=", value, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemImagesLike(String value) {
            addCriterion("ITEM_IMAGES like", value, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemImagesNotLike(String value) {
            addCriterion("ITEM_IMAGES not like", value, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemImagesIn(List<String> values) {
            addCriterion("ITEM_IMAGES in", values, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemImagesNotIn(List<String> values) {
            addCriterion("ITEM_IMAGES not in", values, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemImagesBetween(String value1, String value2) {
            addCriterion("ITEM_IMAGES between", value1, value2, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemImagesNotBetween(String value1, String value2) {
            addCriterion("ITEM_IMAGES not between", value1, value2, "itemImages");
            return (Criteria) this;
        }

        public Criteria andSaleServiceIsNull() {
            addCriterion("SALE_SERVICE is null");
            return (Criteria) this;
        }

        public Criteria andSaleServiceIsNotNull() {
            addCriterion("SALE_SERVICE is not null");
            return (Criteria) this;
        }

        public Criteria andSaleServiceEqualTo(String value) {
            addCriterion("SALE_SERVICE =", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceNotEqualTo(String value) {
            addCriterion("SALE_SERVICE <>", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceGreaterThan(String value) {
            addCriterion("SALE_SERVICE >", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_SERVICE >=", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceLessThan(String value) {
            addCriterion("SALE_SERVICE <", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceLessThanOrEqualTo(String value) {
            addCriterion("SALE_SERVICE <=", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceLike(String value) {
            addCriterion("SALE_SERVICE like", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceNotLike(String value) {
            addCriterion("SALE_SERVICE not like", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceIn(List<String> values) {
            addCriterion("SALE_SERVICE in", values, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceNotIn(List<String> values) {
            addCriterion("SALE_SERVICE not in", values, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceBetween(String value1, String value2) {
            addCriterion("SALE_SERVICE between", value1, value2, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceNotBetween(String value1, String value2) {
            addCriterion("SALE_SERVICE not between", value1, value2, "saleService");
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