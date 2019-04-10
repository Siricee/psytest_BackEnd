package com.psytest.myproject.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NovackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NovackExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andAnswer1IsNull() {
            addCriterion("answer1 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer1IsNotNull() {
            addCriterion("answer1 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer1EqualTo(Integer value) {
            addCriterion("answer1 =", value, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1NotEqualTo(Integer value) {
            addCriterion("answer1 <>", value, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1GreaterThan(Integer value) {
            addCriterion("answer1 >", value, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer1 >=", value, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1LessThan(Integer value) {
            addCriterion("answer1 <", value, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1LessThanOrEqualTo(Integer value) {
            addCriterion("answer1 <=", value, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1In(List<Integer> values) {
            addCriterion("answer1 in", values, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1NotIn(List<Integer> values) {
            addCriterion("answer1 not in", values, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1Between(Integer value1, Integer value2) {
            addCriterion("answer1 between", value1, value2, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer1NotBetween(Integer value1, Integer value2) {
            addCriterion("answer1 not between", value1, value2, "answer1");
            return (Criteria) this;
        }

        public Criteria andAnswer2IsNull() {
            addCriterion("answer2 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer2IsNotNull() {
            addCriterion("answer2 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer2EqualTo(Integer value) {
            addCriterion("answer2 =", value, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2NotEqualTo(Integer value) {
            addCriterion("answer2 <>", value, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2GreaterThan(Integer value) {
            addCriterion("answer2 >", value, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer2 >=", value, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2LessThan(Integer value) {
            addCriterion("answer2 <", value, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2LessThanOrEqualTo(Integer value) {
            addCriterion("answer2 <=", value, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2In(List<Integer> values) {
            addCriterion("answer2 in", values, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2NotIn(List<Integer> values) {
            addCriterion("answer2 not in", values, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2Between(Integer value1, Integer value2) {
            addCriterion("answer2 between", value1, value2, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer2NotBetween(Integer value1, Integer value2) {
            addCriterion("answer2 not between", value1, value2, "answer2");
            return (Criteria) this;
        }

        public Criteria andAnswer3IsNull() {
            addCriterion("answer3 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer3IsNotNull() {
            addCriterion("answer3 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer3EqualTo(Integer value) {
            addCriterion("answer3 =", value, "answer3");
            return (Criteria) this;
        }

        public Criteria andAnswer3NotEqualTo(Integer value) {
            addCriterion("answer3 <>", value, "answer3");
            return (Criteria) this;
        }

        public Criteria andAnswer3GreaterThan(Integer value) {
            addCriterion("answer3 >", value, "answer3");
            return (Criteria) this;
        }

        public Criteria andAnswer3GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer3 >=", value, "answer3");
            return (Criteria) this;
        }

        public Criteria andAnswer3LessThan(Integer value) {
            addCriterion("answer3 <", value, "answer3");
            return (Criteria) this;
        }

        public Criteria andAnswer3LessThanOrEqualTo(Integer value) {
            addCriterion("answer3 <=", value, "answer3");
            return (Criteria) this;
        }

        public Criteria andAnswer3In(List<Integer> values) {
            addCriterion("answer3 in", values, "answer3");
            return (Criteria) this;
        }

        public Criteria andAnswer3NotIn(List<Integer> values) {
            addCriterion("answer3 not in", values, "answer3");
            return (Criteria) this;
        }

        public Criteria andAnswer3Between(Integer value1, Integer value2) {
            addCriterion("answer3 between", value1, value2, "answer3");
            return (Criteria) this;
        }

        public Criteria andAnswer3NotBetween(Integer value1, Integer value2) {
            addCriterion("answer3 not between", value1, value2, "answer3");
            return (Criteria) this;
        }

        public Criteria andAnswer4IsNull() {
            addCriterion("answer4 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer4IsNotNull() {
            addCriterion("answer4 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer4EqualTo(Integer value) {
            addCriterion("answer4 =", value, "answer4");
            return (Criteria) this;
        }

        public Criteria andAnswer4NotEqualTo(Integer value) {
            addCriterion("answer4 <>", value, "answer4");
            return (Criteria) this;
        }

        public Criteria andAnswer4GreaterThan(Integer value) {
            addCriterion("answer4 >", value, "answer4");
            return (Criteria) this;
        }

        public Criteria andAnswer4GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer4 >=", value, "answer4");
            return (Criteria) this;
        }

        public Criteria andAnswer4LessThan(Integer value) {
            addCriterion("answer4 <", value, "answer4");
            return (Criteria) this;
        }

        public Criteria andAnswer4LessThanOrEqualTo(Integer value) {
            addCriterion("answer4 <=", value, "answer4");
            return (Criteria) this;
        }

        public Criteria andAnswer4In(List<Integer> values) {
            addCriterion("answer4 in", values, "answer4");
            return (Criteria) this;
        }

        public Criteria andAnswer4NotIn(List<Integer> values) {
            addCriterion("answer4 not in", values, "answer4");
            return (Criteria) this;
        }

        public Criteria andAnswer4Between(Integer value1, Integer value2) {
            addCriterion("answer4 between", value1, value2, "answer4");
            return (Criteria) this;
        }

        public Criteria andAnswer4NotBetween(Integer value1, Integer value2) {
            addCriterion("answer4 not between", value1, value2, "answer4");
            return (Criteria) this;
        }

        public Criteria andAnswer5IsNull() {
            addCriterion("answer5 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer5IsNotNull() {
            addCriterion("answer5 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer5EqualTo(Integer value) {
            addCriterion("answer5 =", value, "answer5");
            return (Criteria) this;
        }

        public Criteria andAnswer5NotEqualTo(Integer value) {
            addCriterion("answer5 <>", value, "answer5");
            return (Criteria) this;
        }

        public Criteria andAnswer5GreaterThan(Integer value) {
            addCriterion("answer5 >", value, "answer5");
            return (Criteria) this;
        }

        public Criteria andAnswer5GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer5 >=", value, "answer5");
            return (Criteria) this;
        }

        public Criteria andAnswer5LessThan(Integer value) {
            addCriterion("answer5 <", value, "answer5");
            return (Criteria) this;
        }

        public Criteria andAnswer5LessThanOrEqualTo(Integer value) {
            addCriterion("answer5 <=", value, "answer5");
            return (Criteria) this;
        }

        public Criteria andAnswer5In(List<Integer> values) {
            addCriterion("answer5 in", values, "answer5");
            return (Criteria) this;
        }

        public Criteria andAnswer5NotIn(List<Integer> values) {
            addCriterion("answer5 not in", values, "answer5");
            return (Criteria) this;
        }

        public Criteria andAnswer5Between(Integer value1, Integer value2) {
            addCriterion("answer5 between", value1, value2, "answer5");
            return (Criteria) this;
        }

        public Criteria andAnswer5NotBetween(Integer value1, Integer value2) {
            addCriterion("answer5 not between", value1, value2, "answer5");
            return (Criteria) this;
        }

        public Criteria andAnswer6IsNull() {
            addCriterion("answer6 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer6IsNotNull() {
            addCriterion("answer6 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer6EqualTo(Integer value) {
            addCriterion("answer6 =", value, "answer6");
            return (Criteria) this;
        }

        public Criteria andAnswer6NotEqualTo(Integer value) {
            addCriterion("answer6 <>", value, "answer6");
            return (Criteria) this;
        }

        public Criteria andAnswer6GreaterThan(Integer value) {
            addCriterion("answer6 >", value, "answer6");
            return (Criteria) this;
        }

        public Criteria andAnswer6GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer6 >=", value, "answer6");
            return (Criteria) this;
        }

        public Criteria andAnswer6LessThan(Integer value) {
            addCriterion("answer6 <", value, "answer6");
            return (Criteria) this;
        }

        public Criteria andAnswer6LessThanOrEqualTo(Integer value) {
            addCriterion("answer6 <=", value, "answer6");
            return (Criteria) this;
        }

        public Criteria andAnswer6In(List<Integer> values) {
            addCriterion("answer6 in", values, "answer6");
            return (Criteria) this;
        }

        public Criteria andAnswer6NotIn(List<Integer> values) {
            addCriterion("answer6 not in", values, "answer6");
            return (Criteria) this;
        }

        public Criteria andAnswer6Between(Integer value1, Integer value2) {
            addCriterion("answer6 between", value1, value2, "answer6");
            return (Criteria) this;
        }

        public Criteria andAnswer6NotBetween(Integer value1, Integer value2) {
            addCriterion("answer6 not between", value1, value2, "answer6");
            return (Criteria) this;
        }

        public Criteria andAnswer7IsNull() {
            addCriterion("answer7 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer7IsNotNull() {
            addCriterion("answer7 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer7EqualTo(Integer value) {
            addCriterion("answer7 =", value, "answer7");
            return (Criteria) this;
        }

        public Criteria andAnswer7NotEqualTo(Integer value) {
            addCriterion("answer7 <>", value, "answer7");
            return (Criteria) this;
        }

        public Criteria andAnswer7GreaterThan(Integer value) {
            addCriterion("answer7 >", value, "answer7");
            return (Criteria) this;
        }

        public Criteria andAnswer7GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer7 >=", value, "answer7");
            return (Criteria) this;
        }

        public Criteria andAnswer7LessThan(Integer value) {
            addCriterion("answer7 <", value, "answer7");
            return (Criteria) this;
        }

        public Criteria andAnswer7LessThanOrEqualTo(Integer value) {
            addCriterion("answer7 <=", value, "answer7");
            return (Criteria) this;
        }

        public Criteria andAnswer7In(List<Integer> values) {
            addCriterion("answer7 in", values, "answer7");
            return (Criteria) this;
        }

        public Criteria andAnswer7NotIn(List<Integer> values) {
            addCriterion("answer7 not in", values, "answer7");
            return (Criteria) this;
        }

        public Criteria andAnswer7Between(Integer value1, Integer value2) {
            addCriterion("answer7 between", value1, value2, "answer7");
            return (Criteria) this;
        }

        public Criteria andAnswer7NotBetween(Integer value1, Integer value2) {
            addCriterion("answer7 not between", value1, value2, "answer7");
            return (Criteria) this;
        }

        public Criteria andAnswer8IsNull() {
            addCriterion("answer8 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer8IsNotNull() {
            addCriterion("answer8 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer8EqualTo(Integer value) {
            addCriterion("answer8 =", value, "answer8");
            return (Criteria) this;
        }

        public Criteria andAnswer8NotEqualTo(Integer value) {
            addCriterion("answer8 <>", value, "answer8");
            return (Criteria) this;
        }

        public Criteria andAnswer8GreaterThan(Integer value) {
            addCriterion("answer8 >", value, "answer8");
            return (Criteria) this;
        }

        public Criteria andAnswer8GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer8 >=", value, "answer8");
            return (Criteria) this;
        }

        public Criteria andAnswer8LessThan(Integer value) {
            addCriterion("answer8 <", value, "answer8");
            return (Criteria) this;
        }

        public Criteria andAnswer8LessThanOrEqualTo(Integer value) {
            addCriterion("answer8 <=", value, "answer8");
            return (Criteria) this;
        }

        public Criteria andAnswer8In(List<Integer> values) {
            addCriterion("answer8 in", values, "answer8");
            return (Criteria) this;
        }

        public Criteria andAnswer8NotIn(List<Integer> values) {
            addCriterion("answer8 not in", values, "answer8");
            return (Criteria) this;
        }

        public Criteria andAnswer8Between(Integer value1, Integer value2) {
            addCriterion("answer8 between", value1, value2, "answer8");
            return (Criteria) this;
        }

        public Criteria andAnswer8NotBetween(Integer value1, Integer value2) {
            addCriterion("answer8 not between", value1, value2, "answer8");
            return (Criteria) this;
        }

        public Criteria andAnswer9IsNull() {
            addCriterion("answer9 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer9IsNotNull() {
            addCriterion("answer9 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer9EqualTo(Integer value) {
            addCriterion("answer9 =", value, "answer9");
            return (Criteria) this;
        }

        public Criteria andAnswer9NotEqualTo(Integer value) {
            addCriterion("answer9 <>", value, "answer9");
            return (Criteria) this;
        }

        public Criteria andAnswer9GreaterThan(Integer value) {
            addCriterion("answer9 >", value, "answer9");
            return (Criteria) this;
        }

        public Criteria andAnswer9GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer9 >=", value, "answer9");
            return (Criteria) this;
        }

        public Criteria andAnswer9LessThan(Integer value) {
            addCriterion("answer9 <", value, "answer9");
            return (Criteria) this;
        }

        public Criteria andAnswer9LessThanOrEqualTo(Integer value) {
            addCriterion("answer9 <=", value, "answer9");
            return (Criteria) this;
        }

        public Criteria andAnswer9In(List<Integer> values) {
            addCriterion("answer9 in", values, "answer9");
            return (Criteria) this;
        }

        public Criteria andAnswer9NotIn(List<Integer> values) {
            addCriterion("answer9 not in", values, "answer9");
            return (Criteria) this;
        }

        public Criteria andAnswer9Between(Integer value1, Integer value2) {
            addCriterion("answer9 between", value1, value2, "answer9");
            return (Criteria) this;
        }

        public Criteria andAnswer9NotBetween(Integer value1, Integer value2) {
            addCriterion("answer9 not between", value1, value2, "answer9");
            return (Criteria) this;
        }

        public Criteria andAnswer10IsNull() {
            addCriterion("answer10 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer10IsNotNull() {
            addCriterion("answer10 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer10EqualTo(Integer value) {
            addCriterion("answer10 =", value, "answer10");
            return (Criteria) this;
        }

        public Criteria andAnswer10NotEqualTo(Integer value) {
            addCriterion("answer10 <>", value, "answer10");
            return (Criteria) this;
        }

        public Criteria andAnswer10GreaterThan(Integer value) {
            addCriterion("answer10 >", value, "answer10");
            return (Criteria) this;
        }

        public Criteria andAnswer10GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer10 >=", value, "answer10");
            return (Criteria) this;
        }

        public Criteria andAnswer10LessThan(Integer value) {
            addCriterion("answer10 <", value, "answer10");
            return (Criteria) this;
        }

        public Criteria andAnswer10LessThanOrEqualTo(Integer value) {
            addCriterion("answer10 <=", value, "answer10");
            return (Criteria) this;
        }

        public Criteria andAnswer10In(List<Integer> values) {
            addCriterion("answer10 in", values, "answer10");
            return (Criteria) this;
        }

        public Criteria andAnswer10NotIn(List<Integer> values) {
            addCriterion("answer10 not in", values, "answer10");
            return (Criteria) this;
        }

        public Criteria andAnswer10Between(Integer value1, Integer value2) {
            addCriterion("answer10 between", value1, value2, "answer10");
            return (Criteria) this;
        }

        public Criteria andAnswer10NotBetween(Integer value1, Integer value2) {
            addCriterion("answer10 not between", value1, value2, "answer10");
            return (Criteria) this;
        }

        public Criteria andAnswer11IsNull() {
            addCriterion("answer11 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer11IsNotNull() {
            addCriterion("answer11 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer11EqualTo(Integer value) {
            addCriterion("answer11 =", value, "answer11");
            return (Criteria) this;
        }

        public Criteria andAnswer11NotEqualTo(Integer value) {
            addCriterion("answer11 <>", value, "answer11");
            return (Criteria) this;
        }

        public Criteria andAnswer11GreaterThan(Integer value) {
            addCriterion("answer11 >", value, "answer11");
            return (Criteria) this;
        }

        public Criteria andAnswer11GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer11 >=", value, "answer11");
            return (Criteria) this;
        }

        public Criteria andAnswer11LessThan(Integer value) {
            addCriterion("answer11 <", value, "answer11");
            return (Criteria) this;
        }

        public Criteria andAnswer11LessThanOrEqualTo(Integer value) {
            addCriterion("answer11 <=", value, "answer11");
            return (Criteria) this;
        }

        public Criteria andAnswer11In(List<Integer> values) {
            addCriterion("answer11 in", values, "answer11");
            return (Criteria) this;
        }

        public Criteria andAnswer11NotIn(List<Integer> values) {
            addCriterion("answer11 not in", values, "answer11");
            return (Criteria) this;
        }

        public Criteria andAnswer11Between(Integer value1, Integer value2) {
            addCriterion("answer11 between", value1, value2, "answer11");
            return (Criteria) this;
        }

        public Criteria andAnswer11NotBetween(Integer value1, Integer value2) {
            addCriterion("answer11 not between", value1, value2, "answer11");
            return (Criteria) this;
        }

        public Criteria andAnswer12IsNull() {
            addCriterion("answer12 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer12IsNotNull() {
            addCriterion("answer12 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer12EqualTo(Integer value) {
            addCriterion("answer12 =", value, "answer12");
            return (Criteria) this;
        }

        public Criteria andAnswer12NotEqualTo(Integer value) {
            addCriterion("answer12 <>", value, "answer12");
            return (Criteria) this;
        }

        public Criteria andAnswer12GreaterThan(Integer value) {
            addCriterion("answer12 >", value, "answer12");
            return (Criteria) this;
        }

        public Criteria andAnswer12GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer12 >=", value, "answer12");
            return (Criteria) this;
        }

        public Criteria andAnswer12LessThan(Integer value) {
            addCriterion("answer12 <", value, "answer12");
            return (Criteria) this;
        }

        public Criteria andAnswer12LessThanOrEqualTo(Integer value) {
            addCriterion("answer12 <=", value, "answer12");
            return (Criteria) this;
        }

        public Criteria andAnswer12In(List<Integer> values) {
            addCriterion("answer12 in", values, "answer12");
            return (Criteria) this;
        }

        public Criteria andAnswer12NotIn(List<Integer> values) {
            addCriterion("answer12 not in", values, "answer12");
            return (Criteria) this;
        }

        public Criteria andAnswer12Between(Integer value1, Integer value2) {
            addCriterion("answer12 between", value1, value2, "answer12");
            return (Criteria) this;
        }

        public Criteria andAnswer12NotBetween(Integer value1, Integer value2) {
            addCriterion("answer12 not between", value1, value2, "answer12");
            return (Criteria) this;
        }

        public Criteria andAnswer13IsNull() {
            addCriterion("answer13 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer13IsNotNull() {
            addCriterion("answer13 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer13EqualTo(Integer value) {
            addCriterion("answer13 =", value, "answer13");
            return (Criteria) this;
        }

        public Criteria andAnswer13NotEqualTo(Integer value) {
            addCriterion("answer13 <>", value, "answer13");
            return (Criteria) this;
        }

        public Criteria andAnswer13GreaterThan(Integer value) {
            addCriterion("answer13 >", value, "answer13");
            return (Criteria) this;
        }

        public Criteria andAnswer13GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer13 >=", value, "answer13");
            return (Criteria) this;
        }

        public Criteria andAnswer13LessThan(Integer value) {
            addCriterion("answer13 <", value, "answer13");
            return (Criteria) this;
        }

        public Criteria andAnswer13LessThanOrEqualTo(Integer value) {
            addCriterion("answer13 <=", value, "answer13");
            return (Criteria) this;
        }

        public Criteria andAnswer13In(List<Integer> values) {
            addCriterion("answer13 in", values, "answer13");
            return (Criteria) this;
        }

        public Criteria andAnswer13NotIn(List<Integer> values) {
            addCriterion("answer13 not in", values, "answer13");
            return (Criteria) this;
        }

        public Criteria andAnswer13Between(Integer value1, Integer value2) {
            addCriterion("answer13 between", value1, value2, "answer13");
            return (Criteria) this;
        }

        public Criteria andAnswer13NotBetween(Integer value1, Integer value2) {
            addCriterion("answer13 not between", value1, value2, "answer13");
            return (Criteria) this;
        }

        public Criteria andAnswer14IsNull() {
            addCriterion("answer14 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer14IsNotNull() {
            addCriterion("answer14 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer14EqualTo(Integer value) {
            addCriterion("answer14 =", value, "answer14");
            return (Criteria) this;
        }

        public Criteria andAnswer14NotEqualTo(Integer value) {
            addCriterion("answer14 <>", value, "answer14");
            return (Criteria) this;
        }

        public Criteria andAnswer14GreaterThan(Integer value) {
            addCriterion("answer14 >", value, "answer14");
            return (Criteria) this;
        }

        public Criteria andAnswer14GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer14 >=", value, "answer14");
            return (Criteria) this;
        }

        public Criteria andAnswer14LessThan(Integer value) {
            addCriterion("answer14 <", value, "answer14");
            return (Criteria) this;
        }

        public Criteria andAnswer14LessThanOrEqualTo(Integer value) {
            addCriterion("answer14 <=", value, "answer14");
            return (Criteria) this;
        }

        public Criteria andAnswer14In(List<Integer> values) {
            addCriterion("answer14 in", values, "answer14");
            return (Criteria) this;
        }

        public Criteria andAnswer14NotIn(List<Integer> values) {
            addCriterion("answer14 not in", values, "answer14");
            return (Criteria) this;
        }

        public Criteria andAnswer14Between(Integer value1, Integer value2) {
            addCriterion("answer14 between", value1, value2, "answer14");
            return (Criteria) this;
        }

        public Criteria andAnswer14NotBetween(Integer value1, Integer value2) {
            addCriterion("answer14 not between", value1, value2, "answer14");
            return (Criteria) this;
        }

        public Criteria andAnswer15IsNull() {
            addCriterion("answer15 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer15IsNotNull() {
            addCriterion("answer15 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer15EqualTo(Integer value) {
            addCriterion("answer15 =", value, "answer15");
            return (Criteria) this;
        }

        public Criteria andAnswer15NotEqualTo(Integer value) {
            addCriterion("answer15 <>", value, "answer15");
            return (Criteria) this;
        }

        public Criteria andAnswer15GreaterThan(Integer value) {
            addCriterion("answer15 >", value, "answer15");
            return (Criteria) this;
        }

        public Criteria andAnswer15GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer15 >=", value, "answer15");
            return (Criteria) this;
        }

        public Criteria andAnswer15LessThan(Integer value) {
            addCriterion("answer15 <", value, "answer15");
            return (Criteria) this;
        }

        public Criteria andAnswer15LessThanOrEqualTo(Integer value) {
            addCriterion("answer15 <=", value, "answer15");
            return (Criteria) this;
        }

        public Criteria andAnswer15In(List<Integer> values) {
            addCriterion("answer15 in", values, "answer15");
            return (Criteria) this;
        }

        public Criteria andAnswer15NotIn(List<Integer> values) {
            addCriterion("answer15 not in", values, "answer15");
            return (Criteria) this;
        }

        public Criteria andAnswer15Between(Integer value1, Integer value2) {
            addCriterion("answer15 between", value1, value2, "answer15");
            return (Criteria) this;
        }

        public Criteria andAnswer15NotBetween(Integer value1, Integer value2) {
            addCriterion("answer15 not between", value1, value2, "answer15");
            return (Criteria) this;
        }

        public Criteria andAnswer16IsNull() {
            addCriterion("answer16 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer16IsNotNull() {
            addCriterion("answer16 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer16EqualTo(Integer value) {
            addCriterion("answer16 =", value, "answer16");
            return (Criteria) this;
        }

        public Criteria andAnswer16NotEqualTo(Integer value) {
            addCriterion("answer16 <>", value, "answer16");
            return (Criteria) this;
        }

        public Criteria andAnswer16GreaterThan(Integer value) {
            addCriterion("answer16 >", value, "answer16");
            return (Criteria) this;
        }

        public Criteria andAnswer16GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer16 >=", value, "answer16");
            return (Criteria) this;
        }

        public Criteria andAnswer16LessThan(Integer value) {
            addCriterion("answer16 <", value, "answer16");
            return (Criteria) this;
        }

        public Criteria andAnswer16LessThanOrEqualTo(Integer value) {
            addCriterion("answer16 <=", value, "answer16");
            return (Criteria) this;
        }

        public Criteria andAnswer16In(List<Integer> values) {
            addCriterion("answer16 in", values, "answer16");
            return (Criteria) this;
        }

        public Criteria andAnswer16NotIn(List<Integer> values) {
            addCriterion("answer16 not in", values, "answer16");
            return (Criteria) this;
        }

        public Criteria andAnswer16Between(Integer value1, Integer value2) {
            addCriterion("answer16 between", value1, value2, "answer16");
            return (Criteria) this;
        }

        public Criteria andAnswer16NotBetween(Integer value1, Integer value2) {
            addCriterion("answer16 not between", value1, value2, "answer16");
            return (Criteria) this;
        }

        public Criteria andAnswer17IsNull() {
            addCriterion("answer17 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer17IsNotNull() {
            addCriterion("answer17 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer17EqualTo(Integer value) {
            addCriterion("answer17 =", value, "answer17");
            return (Criteria) this;
        }

        public Criteria andAnswer17NotEqualTo(Integer value) {
            addCriterion("answer17 <>", value, "answer17");
            return (Criteria) this;
        }

        public Criteria andAnswer17GreaterThan(Integer value) {
            addCriterion("answer17 >", value, "answer17");
            return (Criteria) this;
        }

        public Criteria andAnswer17GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer17 >=", value, "answer17");
            return (Criteria) this;
        }

        public Criteria andAnswer17LessThan(Integer value) {
            addCriterion("answer17 <", value, "answer17");
            return (Criteria) this;
        }

        public Criteria andAnswer17LessThanOrEqualTo(Integer value) {
            addCriterion("answer17 <=", value, "answer17");
            return (Criteria) this;
        }

        public Criteria andAnswer17In(List<Integer> values) {
            addCriterion("answer17 in", values, "answer17");
            return (Criteria) this;
        }

        public Criteria andAnswer17NotIn(List<Integer> values) {
            addCriterion("answer17 not in", values, "answer17");
            return (Criteria) this;
        }

        public Criteria andAnswer17Between(Integer value1, Integer value2) {
            addCriterion("answer17 between", value1, value2, "answer17");
            return (Criteria) this;
        }

        public Criteria andAnswer17NotBetween(Integer value1, Integer value2) {
            addCriterion("answer17 not between", value1, value2, "answer17");
            return (Criteria) this;
        }

        public Criteria andAnswer18IsNull() {
            addCriterion("answer18 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer18IsNotNull() {
            addCriterion("answer18 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer18EqualTo(Integer value) {
            addCriterion("answer18 =", value, "answer18");
            return (Criteria) this;
        }

        public Criteria andAnswer18NotEqualTo(Integer value) {
            addCriterion("answer18 <>", value, "answer18");
            return (Criteria) this;
        }

        public Criteria andAnswer18GreaterThan(Integer value) {
            addCriterion("answer18 >", value, "answer18");
            return (Criteria) this;
        }

        public Criteria andAnswer18GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer18 >=", value, "answer18");
            return (Criteria) this;
        }

        public Criteria andAnswer18LessThan(Integer value) {
            addCriterion("answer18 <", value, "answer18");
            return (Criteria) this;
        }

        public Criteria andAnswer18LessThanOrEqualTo(Integer value) {
            addCriterion("answer18 <=", value, "answer18");
            return (Criteria) this;
        }

        public Criteria andAnswer18In(List<Integer> values) {
            addCriterion("answer18 in", values, "answer18");
            return (Criteria) this;
        }

        public Criteria andAnswer18NotIn(List<Integer> values) {
            addCriterion("answer18 not in", values, "answer18");
            return (Criteria) this;
        }

        public Criteria andAnswer18Between(Integer value1, Integer value2) {
            addCriterion("answer18 between", value1, value2, "answer18");
            return (Criteria) this;
        }

        public Criteria andAnswer18NotBetween(Integer value1, Integer value2) {
            addCriterion("answer18 not between", value1, value2, "answer18");
            return (Criteria) this;
        }

        public Criteria andAnswer19IsNull() {
            addCriterion("answer19 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer19IsNotNull() {
            addCriterion("answer19 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer19EqualTo(Integer value) {
            addCriterion("answer19 =", value, "answer19");
            return (Criteria) this;
        }

        public Criteria andAnswer19NotEqualTo(Integer value) {
            addCriterion("answer19 <>", value, "answer19");
            return (Criteria) this;
        }

        public Criteria andAnswer19GreaterThan(Integer value) {
            addCriterion("answer19 >", value, "answer19");
            return (Criteria) this;
        }

        public Criteria andAnswer19GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer19 >=", value, "answer19");
            return (Criteria) this;
        }

        public Criteria andAnswer19LessThan(Integer value) {
            addCriterion("answer19 <", value, "answer19");
            return (Criteria) this;
        }

        public Criteria andAnswer19LessThanOrEqualTo(Integer value) {
            addCriterion("answer19 <=", value, "answer19");
            return (Criteria) this;
        }

        public Criteria andAnswer19In(List<Integer> values) {
            addCriterion("answer19 in", values, "answer19");
            return (Criteria) this;
        }

        public Criteria andAnswer19NotIn(List<Integer> values) {
            addCriterion("answer19 not in", values, "answer19");
            return (Criteria) this;
        }

        public Criteria andAnswer19Between(Integer value1, Integer value2) {
            addCriterion("answer19 between", value1, value2, "answer19");
            return (Criteria) this;
        }

        public Criteria andAnswer19NotBetween(Integer value1, Integer value2) {
            addCriterion("answer19 not between", value1, value2, "answer19");
            return (Criteria) this;
        }

        public Criteria andAnswer20IsNull() {
            addCriterion("answer20 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer20IsNotNull() {
            addCriterion("answer20 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer20EqualTo(Integer value) {
            addCriterion("answer20 =", value, "answer20");
            return (Criteria) this;
        }

        public Criteria andAnswer20NotEqualTo(Integer value) {
            addCriterion("answer20 <>", value, "answer20");
            return (Criteria) this;
        }

        public Criteria andAnswer20GreaterThan(Integer value) {
            addCriterion("answer20 >", value, "answer20");
            return (Criteria) this;
        }

        public Criteria andAnswer20GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer20 >=", value, "answer20");
            return (Criteria) this;
        }

        public Criteria andAnswer20LessThan(Integer value) {
            addCriterion("answer20 <", value, "answer20");
            return (Criteria) this;
        }

        public Criteria andAnswer20LessThanOrEqualTo(Integer value) {
            addCriterion("answer20 <=", value, "answer20");
            return (Criteria) this;
        }

        public Criteria andAnswer20In(List<Integer> values) {
            addCriterion("answer20 in", values, "answer20");
            return (Criteria) this;
        }

        public Criteria andAnswer20NotIn(List<Integer> values) {
            addCriterion("answer20 not in", values, "answer20");
            return (Criteria) this;
        }

        public Criteria andAnswer20Between(Integer value1, Integer value2) {
            addCriterion("answer20 between", value1, value2, "answer20");
            return (Criteria) this;
        }

        public Criteria andAnswer20NotBetween(Integer value1, Integer value2) {
            addCriterion("answer20 not between", value1, value2, "answer20");
            return (Criteria) this;
        }

        public Criteria andAnswer21IsNull() {
            addCriterion("answer21 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer21IsNotNull() {
            addCriterion("answer21 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer21EqualTo(Integer value) {
            addCriterion("answer21 =", value, "answer21");
            return (Criteria) this;
        }

        public Criteria andAnswer21NotEqualTo(Integer value) {
            addCriterion("answer21 <>", value, "answer21");
            return (Criteria) this;
        }

        public Criteria andAnswer21GreaterThan(Integer value) {
            addCriterion("answer21 >", value, "answer21");
            return (Criteria) this;
        }

        public Criteria andAnswer21GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer21 >=", value, "answer21");
            return (Criteria) this;
        }

        public Criteria andAnswer21LessThan(Integer value) {
            addCriterion("answer21 <", value, "answer21");
            return (Criteria) this;
        }

        public Criteria andAnswer21LessThanOrEqualTo(Integer value) {
            addCriterion("answer21 <=", value, "answer21");
            return (Criteria) this;
        }

        public Criteria andAnswer21In(List<Integer> values) {
            addCriterion("answer21 in", values, "answer21");
            return (Criteria) this;
        }

        public Criteria andAnswer21NotIn(List<Integer> values) {
            addCriterion("answer21 not in", values, "answer21");
            return (Criteria) this;
        }

        public Criteria andAnswer21Between(Integer value1, Integer value2) {
            addCriterion("answer21 between", value1, value2, "answer21");
            return (Criteria) this;
        }

        public Criteria andAnswer21NotBetween(Integer value1, Integer value2) {
            addCriterion("answer21 not between", value1, value2, "answer21");
            return (Criteria) this;
        }

        public Criteria andAnswer22IsNull() {
            addCriterion("answer22 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer22IsNotNull() {
            addCriterion("answer22 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer22EqualTo(Integer value) {
            addCriterion("answer22 =", value, "answer22");
            return (Criteria) this;
        }

        public Criteria andAnswer22NotEqualTo(Integer value) {
            addCriterion("answer22 <>", value, "answer22");
            return (Criteria) this;
        }

        public Criteria andAnswer22GreaterThan(Integer value) {
            addCriterion("answer22 >", value, "answer22");
            return (Criteria) this;
        }

        public Criteria andAnswer22GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer22 >=", value, "answer22");
            return (Criteria) this;
        }

        public Criteria andAnswer22LessThan(Integer value) {
            addCriterion("answer22 <", value, "answer22");
            return (Criteria) this;
        }

        public Criteria andAnswer22LessThanOrEqualTo(Integer value) {
            addCriterion("answer22 <=", value, "answer22");
            return (Criteria) this;
        }

        public Criteria andAnswer22In(List<Integer> values) {
            addCriterion("answer22 in", values, "answer22");
            return (Criteria) this;
        }

        public Criteria andAnswer22NotIn(List<Integer> values) {
            addCriterion("answer22 not in", values, "answer22");
            return (Criteria) this;
        }

        public Criteria andAnswer22Between(Integer value1, Integer value2) {
            addCriterion("answer22 between", value1, value2, "answer22");
            return (Criteria) this;
        }

        public Criteria andAnswer22NotBetween(Integer value1, Integer value2) {
            addCriterion("answer22 not between", value1, value2, "answer22");
            return (Criteria) this;
        }

        public Criteria andAnswer23IsNull() {
            addCriterion("answer23 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer23IsNotNull() {
            addCriterion("answer23 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer23EqualTo(Integer value) {
            addCriterion("answer23 =", value, "answer23");
            return (Criteria) this;
        }

        public Criteria andAnswer23NotEqualTo(Integer value) {
            addCriterion("answer23 <>", value, "answer23");
            return (Criteria) this;
        }

        public Criteria andAnswer23GreaterThan(Integer value) {
            addCriterion("answer23 >", value, "answer23");
            return (Criteria) this;
        }

        public Criteria andAnswer23GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer23 >=", value, "answer23");
            return (Criteria) this;
        }

        public Criteria andAnswer23LessThan(Integer value) {
            addCriterion("answer23 <", value, "answer23");
            return (Criteria) this;
        }

        public Criteria andAnswer23LessThanOrEqualTo(Integer value) {
            addCriterion("answer23 <=", value, "answer23");
            return (Criteria) this;
        }

        public Criteria andAnswer23In(List<Integer> values) {
            addCriterion("answer23 in", values, "answer23");
            return (Criteria) this;
        }

        public Criteria andAnswer23NotIn(List<Integer> values) {
            addCriterion("answer23 not in", values, "answer23");
            return (Criteria) this;
        }

        public Criteria andAnswer23Between(Integer value1, Integer value2) {
            addCriterion("answer23 between", value1, value2, "answer23");
            return (Criteria) this;
        }

        public Criteria andAnswer23NotBetween(Integer value1, Integer value2) {
            addCriterion("answer23 not between", value1, value2, "answer23");
            return (Criteria) this;
        }

        public Criteria andAnswer24IsNull() {
            addCriterion("answer24 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer24IsNotNull() {
            addCriterion("answer24 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer24EqualTo(Integer value) {
            addCriterion("answer24 =", value, "answer24");
            return (Criteria) this;
        }

        public Criteria andAnswer24NotEqualTo(Integer value) {
            addCriterion("answer24 <>", value, "answer24");
            return (Criteria) this;
        }

        public Criteria andAnswer24GreaterThan(Integer value) {
            addCriterion("answer24 >", value, "answer24");
            return (Criteria) this;
        }

        public Criteria andAnswer24GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer24 >=", value, "answer24");
            return (Criteria) this;
        }

        public Criteria andAnswer24LessThan(Integer value) {
            addCriterion("answer24 <", value, "answer24");
            return (Criteria) this;
        }

        public Criteria andAnswer24LessThanOrEqualTo(Integer value) {
            addCriterion("answer24 <=", value, "answer24");
            return (Criteria) this;
        }

        public Criteria andAnswer24In(List<Integer> values) {
            addCriterion("answer24 in", values, "answer24");
            return (Criteria) this;
        }

        public Criteria andAnswer24NotIn(List<Integer> values) {
            addCriterion("answer24 not in", values, "answer24");
            return (Criteria) this;
        }

        public Criteria andAnswer24Between(Integer value1, Integer value2) {
            addCriterion("answer24 between", value1, value2, "answer24");
            return (Criteria) this;
        }

        public Criteria andAnswer24NotBetween(Integer value1, Integer value2) {
            addCriterion("answer24 not between", value1, value2, "answer24");
            return (Criteria) this;
        }

        public Criteria andAnswer25IsNull() {
            addCriterion("answer25 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer25IsNotNull() {
            addCriterion("answer25 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer25EqualTo(Integer value) {
            addCriterion("answer25 =", value, "answer25");
            return (Criteria) this;
        }

        public Criteria andAnswer25NotEqualTo(Integer value) {
            addCriterion("answer25 <>", value, "answer25");
            return (Criteria) this;
        }

        public Criteria andAnswer25GreaterThan(Integer value) {
            addCriterion("answer25 >", value, "answer25");
            return (Criteria) this;
        }

        public Criteria andAnswer25GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer25 >=", value, "answer25");
            return (Criteria) this;
        }

        public Criteria andAnswer25LessThan(Integer value) {
            addCriterion("answer25 <", value, "answer25");
            return (Criteria) this;
        }

        public Criteria andAnswer25LessThanOrEqualTo(Integer value) {
            addCriterion("answer25 <=", value, "answer25");
            return (Criteria) this;
        }

        public Criteria andAnswer25In(List<Integer> values) {
            addCriterion("answer25 in", values, "answer25");
            return (Criteria) this;
        }

        public Criteria andAnswer25NotIn(List<Integer> values) {
            addCriterion("answer25 not in", values, "answer25");
            return (Criteria) this;
        }

        public Criteria andAnswer25Between(Integer value1, Integer value2) {
            addCriterion("answer25 between", value1, value2, "answer25");
            return (Criteria) this;
        }

        public Criteria andAnswer25NotBetween(Integer value1, Integer value2) {
            addCriterion("answer25 not between", value1, value2, "answer25");
            return (Criteria) this;
        }

        public Criteria andSumIsNull() {
            addCriterion("sum is null");
            return (Criteria) this;
        }

        public Criteria andSumIsNotNull() {
            addCriterion("sum is not null");
            return (Criteria) this;
        }

        public Criteria andSumEqualTo(Integer value) {
            addCriterion("sum =", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotEqualTo(Integer value) {
            addCriterion("sum <>", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThan(Integer value) {
            addCriterion("sum >", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum >=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThan(Integer value) {
            addCriterion("sum <", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThanOrEqualTo(Integer value) {
            addCriterion("sum <=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumIn(List<Integer> values) {
            addCriterion("sum in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotIn(List<Integer> values) {
            addCriterion("sum not in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumBetween(Integer value1, Integer value2) {
            addCriterion("sum between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotBetween(Integer value1, Integer value2) {
            addCriterion("sum not between", value1, value2, "sum");
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