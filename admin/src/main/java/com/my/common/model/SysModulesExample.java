package com.my.common.model;

import java.util.ArrayList;
import java.util.List;

public class SysModulesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_modules
     *
     * @mbggenerated Sat Jan 10 22:22:21 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_modules
     *
     * @mbggenerated Sat Jan 10 22:22:21 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_modules
     *
     * @mbggenerated Sat Jan 10 22:22:21 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_modules
     *
     * @mbggenerated Sat Jan 10 22:22:21 CST 2015
     */
    public SysModulesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_modules
     *
     * @mbggenerated Sat Jan 10 22:22:21 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_modules
     *
     * @mbggenerated Sat Jan 10 22:22:21 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_modules
     *
     * @mbggenerated Sat Jan 10 22:22:21 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_modules
     *
     * @mbggenerated Sat Jan 10 22:22:21 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_modules
     *
     * @mbggenerated Sat Jan 10 22:22:21 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_modules
     *
     * @mbggenerated Sat Jan 10 22:22:21 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_modules
     *
     * @mbggenerated Sat Jan 10 22:22:21 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_modules
     *
     * @mbggenerated Sat Jan 10 22:22:21 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_modules
     *
     * @mbggenerated Sat Jan 10 22:22:21 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_modules
     *
     * @mbggenerated Sat Jan 10 22:22:21 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_modules
     *
     * @mbggenerated Sat Jan 10 22:22:21 CST 2015
     */
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

        public Criteria andModuleIdIsNull() {
            addCriterion("MODULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("MODULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualTo(String value) {
            addCriterion("MODULE_ID =", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualTo(String value) {
            addCriterion("MODULE_ID <>", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThan(String value) {
            addCriterion("MODULE_ID >", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_ID >=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThan(String value) {
            addCriterion("MODULE_ID <", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(String value) {
            addCriterion("MODULE_ID <=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLike(String value) {
            addCriterion("MODULE_ID like", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotLike(String value) {
            addCriterion("MODULE_ID not like", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIn(List<String> values) {
            addCriterion("MODULE_ID in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotIn(List<String> values) {
            addCriterion("MODULE_ID not in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdBetween(String value1, String value2) {
            addCriterion("MODULE_ID between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotBetween(String value1, String value2) {
            addCriterion("MODULE_ID not between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNull() {
            addCriterion("MODULE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNotNull() {
            addCriterion("MODULE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andModuleNameEqualTo(String value) {
            addCriterion("MODULE_NAME =", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotEqualTo(String value) {
            addCriterion("MODULE_NAME <>", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThan(String value) {
            addCriterion("MODULE_NAME >", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_NAME >=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThan(String value) {
            addCriterion("MODULE_NAME <", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThanOrEqualTo(String value) {
            addCriterion("MODULE_NAME <=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLike(String value) {
            addCriterion("MODULE_NAME like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotLike(String value) {
            addCriterion("MODULE_NAME not like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameIn(List<String> values) {
            addCriterion("MODULE_NAME in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotIn(List<String> values) {
            addCriterion("MODULE_NAME not in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameBetween(String value1, String value2) {
            addCriterion("MODULE_NAME between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotBetween(String value1, String value2) {
            addCriterion("MODULE_NAME not between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleDescIsNull() {
            addCriterion("MODULE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andModuleDescIsNotNull() {
            addCriterion("MODULE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andModuleDescEqualTo(String value) {
            addCriterion("MODULE_DESC =", value, "moduleDesc");
            return (Criteria) this;
        }

        public Criteria andModuleDescNotEqualTo(String value) {
            addCriterion("MODULE_DESC <>", value, "moduleDesc");
            return (Criteria) this;
        }

        public Criteria andModuleDescGreaterThan(String value) {
            addCriterion("MODULE_DESC >", value, "moduleDesc");
            return (Criteria) this;
        }

        public Criteria andModuleDescGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_DESC >=", value, "moduleDesc");
            return (Criteria) this;
        }

        public Criteria andModuleDescLessThan(String value) {
            addCriterion("MODULE_DESC <", value, "moduleDesc");
            return (Criteria) this;
        }

        public Criteria andModuleDescLessThanOrEqualTo(String value) {
            addCriterion("MODULE_DESC <=", value, "moduleDesc");
            return (Criteria) this;
        }

        public Criteria andModuleDescLike(String value) {
            addCriterion("MODULE_DESC like", value, "moduleDesc");
            return (Criteria) this;
        }

        public Criteria andModuleDescNotLike(String value) {
            addCriterion("MODULE_DESC not like", value, "moduleDesc");
            return (Criteria) this;
        }

        public Criteria andModuleDescIn(List<String> values) {
            addCriterion("MODULE_DESC in", values, "moduleDesc");
            return (Criteria) this;
        }

        public Criteria andModuleDescNotIn(List<String> values) {
            addCriterion("MODULE_DESC not in", values, "moduleDesc");
            return (Criteria) this;
        }

        public Criteria andModuleDescBetween(String value1, String value2) {
            addCriterion("MODULE_DESC between", value1, value2, "moduleDesc");
            return (Criteria) this;
        }

        public Criteria andModuleDescNotBetween(String value1, String value2) {
            addCriterion("MODULE_DESC not between", value1, value2, "moduleDesc");
            return (Criteria) this;
        }

        public Criteria andModuleTypeIsNull() {
            addCriterion("MODULE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andModuleTypeIsNotNull() {
            addCriterion("MODULE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andModuleTypeEqualTo(String value) {
            addCriterion("MODULE_TYPE =", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeNotEqualTo(String value) {
            addCriterion("MODULE_TYPE <>", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeGreaterThan(String value) {
            addCriterion("MODULE_TYPE >", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_TYPE >=", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeLessThan(String value) {
            addCriterion("MODULE_TYPE <", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeLessThanOrEqualTo(String value) {
            addCriterion("MODULE_TYPE <=", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeLike(String value) {
            addCriterion("MODULE_TYPE like", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeNotLike(String value) {
            addCriterion("MODULE_TYPE not like", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeIn(List<String> values) {
            addCriterion("MODULE_TYPE in", values, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeNotIn(List<String> values) {
            addCriterion("MODULE_TYPE not in", values, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeBetween(String value1, String value2) {
            addCriterion("MODULE_TYPE between", value1, value2, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeNotBetween(String value1, String value2) {
            addCriterion("MODULE_TYPE not between", value1, value2, "moduleType");
            return (Criteria) this;
        }

        public Criteria andParentIsNull() {
            addCriterion("PARENT is null");
            return (Criteria) this;
        }

        public Criteria andParentIsNotNull() {
            addCriterion("PARENT is not null");
            return (Criteria) this;
        }

        public Criteria andParentEqualTo(String value) {
            addCriterion("PARENT =", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotEqualTo(String value) {
            addCriterion("PARENT <>", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentGreaterThan(String value) {
            addCriterion("PARENT >", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT >=", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLessThan(String value) {
            addCriterion("PARENT <", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLessThanOrEqualTo(String value) {
            addCriterion("PARENT <=", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLike(String value) {
            addCriterion("PARENT like", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotLike(String value) {
            addCriterion("PARENT not like", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentIn(List<String> values) {
            addCriterion("PARENT in", values, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotIn(List<String> values) {
            addCriterion("PARENT not in", values, "parent");
            return (Criteria) this;
        }

        public Criteria andParentBetween(String value1, String value2) {
            addCriterion("PARENT between", value1, value2, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotBetween(String value1, String value2) {
            addCriterion("PARENT not between", value1, value2, "parent");
            return (Criteria) this;
        }

        public Criteria andModuleUrlIsNull() {
            addCriterion("MODULE_URL is null");
            return (Criteria) this;
        }

        public Criteria andModuleUrlIsNotNull() {
            addCriterion("MODULE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andModuleUrlEqualTo(String value) {
            addCriterion("MODULE_URL =", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlNotEqualTo(String value) {
            addCriterion("MODULE_URL <>", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlGreaterThan(String value) {
            addCriterion("MODULE_URL >", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_URL >=", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlLessThan(String value) {
            addCriterion("MODULE_URL <", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlLessThanOrEqualTo(String value) {
            addCriterion("MODULE_URL <=", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlLike(String value) {
            addCriterion("MODULE_URL like", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlNotLike(String value) {
            addCriterion("MODULE_URL not like", value, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlIn(List<String> values) {
            addCriterion("MODULE_URL in", values, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlNotIn(List<String> values) {
            addCriterion("MODULE_URL not in", values, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlBetween(String value1, String value2) {
            addCriterion("MODULE_URL between", value1, value2, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andModuleUrlNotBetween(String value1, String value2) {
            addCriterion("MODULE_URL not between", value1, value2, "moduleUrl");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("LEVEL =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("LEVEL <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("LEVEL >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("LEVEL <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("LEVEL <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("LEVEL like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("LEVEL not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("LEVEL in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("LEVEL not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("LEVEL between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("LEVEL not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLeafIsNull() {
            addCriterion("LEAF is null");
            return (Criteria) this;
        }

        public Criteria andLeafIsNotNull() {
            addCriterion("LEAF is not null");
            return (Criteria) this;
        }

        public Criteria andLeafEqualTo(String value) {
            addCriterion("LEAF =", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotEqualTo(String value) {
            addCriterion("LEAF <>", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafGreaterThan(String value) {
            addCriterion("LEAF >", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafGreaterThanOrEqualTo(String value) {
            addCriterion("LEAF >=", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafLessThan(String value) {
            addCriterion("LEAF <", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafLessThanOrEqualTo(String value) {
            addCriterion("LEAF <=", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafLike(String value) {
            addCriterion("LEAF like", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotLike(String value) {
            addCriterion("LEAF not like", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafIn(List<String> values) {
            addCriterion("LEAF in", values, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotIn(List<String> values) {
            addCriterion("LEAF not in", values, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafBetween(String value1, String value2) {
            addCriterion("LEAF between", value1, value2, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotBetween(String value1, String value2) {
            addCriterion("LEAF not between", value1, value2, "leaf");
            return (Criteria) this;
        }

        public Criteria andApplicationIsNull() {
            addCriterion("APPLICATION is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIsNotNull() {
            addCriterion("APPLICATION is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationEqualTo(String value) {
            addCriterion("APPLICATION =", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotEqualTo(String value) {
            addCriterion("APPLICATION <>", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationGreaterThan(String value) {
            addCriterion("APPLICATION >", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION >=", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLessThan(String value) {
            addCriterion("APPLICATION <", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION <=", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLike(String value) {
            addCriterion("APPLICATION like", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotLike(String value) {
            addCriterion("APPLICATION not like", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationIn(List<String> values) {
            addCriterion("APPLICATION in", values, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotIn(List<String> values) {
            addCriterion("APPLICATION not in", values, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationBetween(String value1, String value2) {
            addCriterion("APPLICATION between", value1, value2, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotBetween(String value1, String value2) {
            addCriterion("APPLICATION not between", value1, value2, "application");
            return (Criteria) this;
        }

        public Criteria andControllerIsNull() {
            addCriterion("CONTROLLER is null");
            return (Criteria) this;
        }

        public Criteria andControllerIsNotNull() {
            addCriterion("CONTROLLER is not null");
            return (Criteria) this;
        }

        public Criteria andControllerEqualTo(String value) {
            addCriterion("CONTROLLER =", value, "controller");
            return (Criteria) this;
        }

        public Criteria andControllerNotEqualTo(String value) {
            addCriterion("CONTROLLER <>", value, "controller");
            return (Criteria) this;
        }

        public Criteria andControllerGreaterThan(String value) {
            addCriterion("CONTROLLER >", value, "controller");
            return (Criteria) this;
        }

        public Criteria andControllerGreaterThanOrEqualTo(String value) {
            addCriterion("CONTROLLER >=", value, "controller");
            return (Criteria) this;
        }

        public Criteria andControllerLessThan(String value) {
            addCriterion("CONTROLLER <", value, "controller");
            return (Criteria) this;
        }

        public Criteria andControllerLessThanOrEqualTo(String value) {
            addCriterion("CONTROLLER <=", value, "controller");
            return (Criteria) this;
        }

        public Criteria andControllerLike(String value) {
            addCriterion("CONTROLLER like", value, "controller");
            return (Criteria) this;
        }

        public Criteria andControllerNotLike(String value) {
            addCriterion("CONTROLLER not like", value, "controller");
            return (Criteria) this;
        }

        public Criteria andControllerIn(List<String> values) {
            addCriterion("CONTROLLER in", values, "controller");
            return (Criteria) this;
        }

        public Criteria andControllerNotIn(List<String> values) {
            addCriterion("CONTROLLER not in", values, "controller");
            return (Criteria) this;
        }

        public Criteria andControllerBetween(String value1, String value2) {
            addCriterion("CONTROLLER between", value1, value2, "controller");
            return (Criteria) this;
        }

        public Criteria andControllerNotBetween(String value1, String value2) {
            addCriterion("CONTROLLER not between", value1, value2, "controller");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("ENABLED is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("ENABLED is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("ENABLED =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("ENABLED <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("ENABLED >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLED >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("ENABLED <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("ENABLED <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("ENABLED like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("ENABLED not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("ENABLED in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("ENABLED not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("ENABLED between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("ENABLED not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("PRIORITY =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("PRIORITY <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("PRIORITY >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRIORITY >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("PRIORITY <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("PRIORITY <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("PRIORITY in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("PRIORITY not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("PRIORITY between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("PRIORITY not between", value1, value2, "priority");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_modules
     *
     * @mbggenerated do_not_delete_during_merge Sat Jan 10 22:22:21 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_modules
     *
     * @mbggenerated Sat Jan 10 22:22:21 CST 2015
     */
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