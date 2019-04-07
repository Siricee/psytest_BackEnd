package com.psytest.myproject.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Scl90Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Scl90Example() {
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

        public Criteria andAnswer26IsNull() {
            addCriterion("answer26 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer26IsNotNull() {
            addCriterion("answer26 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer26EqualTo(Integer value) {
            addCriterion("answer26 =", value, "answer26");
            return (Criteria) this;
        }

        public Criteria andAnswer26NotEqualTo(Integer value) {
            addCriterion("answer26 <>", value, "answer26");
            return (Criteria) this;
        }

        public Criteria andAnswer26GreaterThan(Integer value) {
            addCriterion("answer26 >", value, "answer26");
            return (Criteria) this;
        }

        public Criteria andAnswer26GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer26 >=", value, "answer26");
            return (Criteria) this;
        }

        public Criteria andAnswer26LessThan(Integer value) {
            addCriterion("answer26 <", value, "answer26");
            return (Criteria) this;
        }

        public Criteria andAnswer26LessThanOrEqualTo(Integer value) {
            addCriterion("answer26 <=", value, "answer26");
            return (Criteria) this;
        }

        public Criteria andAnswer26In(List<Integer> values) {
            addCriterion("answer26 in", values, "answer26");
            return (Criteria) this;
        }

        public Criteria andAnswer26NotIn(List<Integer> values) {
            addCriterion("answer26 not in", values, "answer26");
            return (Criteria) this;
        }

        public Criteria andAnswer26Between(Integer value1, Integer value2) {
            addCriterion("answer26 between", value1, value2, "answer26");
            return (Criteria) this;
        }

        public Criteria andAnswer26NotBetween(Integer value1, Integer value2) {
            addCriterion("answer26 not between", value1, value2, "answer26");
            return (Criteria) this;
        }

        public Criteria andAnswer27IsNull() {
            addCriterion("answer27 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer27IsNotNull() {
            addCriterion("answer27 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer27EqualTo(Integer value) {
            addCriterion("answer27 =", value, "answer27");
            return (Criteria) this;
        }

        public Criteria andAnswer27NotEqualTo(Integer value) {
            addCriterion("answer27 <>", value, "answer27");
            return (Criteria) this;
        }

        public Criteria andAnswer27GreaterThan(Integer value) {
            addCriterion("answer27 >", value, "answer27");
            return (Criteria) this;
        }

        public Criteria andAnswer27GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer27 >=", value, "answer27");
            return (Criteria) this;
        }

        public Criteria andAnswer27LessThan(Integer value) {
            addCriterion("answer27 <", value, "answer27");
            return (Criteria) this;
        }

        public Criteria andAnswer27LessThanOrEqualTo(Integer value) {
            addCriterion("answer27 <=", value, "answer27");
            return (Criteria) this;
        }

        public Criteria andAnswer27In(List<Integer> values) {
            addCriterion("answer27 in", values, "answer27");
            return (Criteria) this;
        }

        public Criteria andAnswer27NotIn(List<Integer> values) {
            addCriterion("answer27 not in", values, "answer27");
            return (Criteria) this;
        }

        public Criteria andAnswer27Between(Integer value1, Integer value2) {
            addCriterion("answer27 between", value1, value2, "answer27");
            return (Criteria) this;
        }

        public Criteria andAnswer27NotBetween(Integer value1, Integer value2) {
            addCriterion("answer27 not between", value1, value2, "answer27");
            return (Criteria) this;
        }

        public Criteria andAnswer28IsNull() {
            addCriterion("answer28 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer28IsNotNull() {
            addCriterion("answer28 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer28EqualTo(Integer value) {
            addCriterion("answer28 =", value, "answer28");
            return (Criteria) this;
        }

        public Criteria andAnswer28NotEqualTo(Integer value) {
            addCriterion("answer28 <>", value, "answer28");
            return (Criteria) this;
        }

        public Criteria andAnswer28GreaterThan(Integer value) {
            addCriterion("answer28 >", value, "answer28");
            return (Criteria) this;
        }

        public Criteria andAnswer28GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer28 >=", value, "answer28");
            return (Criteria) this;
        }

        public Criteria andAnswer28LessThan(Integer value) {
            addCriterion("answer28 <", value, "answer28");
            return (Criteria) this;
        }

        public Criteria andAnswer28LessThanOrEqualTo(Integer value) {
            addCriterion("answer28 <=", value, "answer28");
            return (Criteria) this;
        }

        public Criteria andAnswer28In(List<Integer> values) {
            addCriterion("answer28 in", values, "answer28");
            return (Criteria) this;
        }

        public Criteria andAnswer28NotIn(List<Integer> values) {
            addCriterion("answer28 not in", values, "answer28");
            return (Criteria) this;
        }

        public Criteria andAnswer28Between(Integer value1, Integer value2) {
            addCriterion("answer28 between", value1, value2, "answer28");
            return (Criteria) this;
        }

        public Criteria andAnswer28NotBetween(Integer value1, Integer value2) {
            addCriterion("answer28 not between", value1, value2, "answer28");
            return (Criteria) this;
        }

        public Criteria andAnswer29IsNull() {
            addCriterion("answer29 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer29IsNotNull() {
            addCriterion("answer29 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer29EqualTo(Integer value) {
            addCriterion("answer29 =", value, "answer29");
            return (Criteria) this;
        }

        public Criteria andAnswer29NotEqualTo(Integer value) {
            addCriterion("answer29 <>", value, "answer29");
            return (Criteria) this;
        }

        public Criteria andAnswer29GreaterThan(Integer value) {
            addCriterion("answer29 >", value, "answer29");
            return (Criteria) this;
        }

        public Criteria andAnswer29GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer29 >=", value, "answer29");
            return (Criteria) this;
        }

        public Criteria andAnswer29LessThan(Integer value) {
            addCriterion("answer29 <", value, "answer29");
            return (Criteria) this;
        }

        public Criteria andAnswer29LessThanOrEqualTo(Integer value) {
            addCriterion("answer29 <=", value, "answer29");
            return (Criteria) this;
        }

        public Criteria andAnswer29In(List<Integer> values) {
            addCriterion("answer29 in", values, "answer29");
            return (Criteria) this;
        }

        public Criteria andAnswer29NotIn(List<Integer> values) {
            addCriterion("answer29 not in", values, "answer29");
            return (Criteria) this;
        }

        public Criteria andAnswer29Between(Integer value1, Integer value2) {
            addCriterion("answer29 between", value1, value2, "answer29");
            return (Criteria) this;
        }

        public Criteria andAnswer29NotBetween(Integer value1, Integer value2) {
            addCriterion("answer29 not between", value1, value2, "answer29");
            return (Criteria) this;
        }

        public Criteria andAnswer30IsNull() {
            addCriterion("answer30 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer30IsNotNull() {
            addCriterion("answer30 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer30EqualTo(Integer value) {
            addCriterion("answer30 =", value, "answer30");
            return (Criteria) this;
        }

        public Criteria andAnswer30NotEqualTo(Integer value) {
            addCriterion("answer30 <>", value, "answer30");
            return (Criteria) this;
        }

        public Criteria andAnswer30GreaterThan(Integer value) {
            addCriterion("answer30 >", value, "answer30");
            return (Criteria) this;
        }

        public Criteria andAnswer30GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer30 >=", value, "answer30");
            return (Criteria) this;
        }

        public Criteria andAnswer30LessThan(Integer value) {
            addCriterion("answer30 <", value, "answer30");
            return (Criteria) this;
        }

        public Criteria andAnswer30LessThanOrEqualTo(Integer value) {
            addCriterion("answer30 <=", value, "answer30");
            return (Criteria) this;
        }

        public Criteria andAnswer30In(List<Integer> values) {
            addCriterion("answer30 in", values, "answer30");
            return (Criteria) this;
        }

        public Criteria andAnswer30NotIn(List<Integer> values) {
            addCriterion("answer30 not in", values, "answer30");
            return (Criteria) this;
        }

        public Criteria andAnswer30Between(Integer value1, Integer value2) {
            addCriterion("answer30 between", value1, value2, "answer30");
            return (Criteria) this;
        }

        public Criteria andAnswer30NotBetween(Integer value1, Integer value2) {
            addCriterion("answer30 not between", value1, value2, "answer30");
            return (Criteria) this;
        }

        public Criteria andAnswer31IsNull() {
            addCriterion("answer31 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer31IsNotNull() {
            addCriterion("answer31 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer31EqualTo(Integer value) {
            addCriterion("answer31 =", value, "answer31");
            return (Criteria) this;
        }

        public Criteria andAnswer31NotEqualTo(Integer value) {
            addCriterion("answer31 <>", value, "answer31");
            return (Criteria) this;
        }

        public Criteria andAnswer31GreaterThan(Integer value) {
            addCriterion("answer31 >", value, "answer31");
            return (Criteria) this;
        }

        public Criteria andAnswer31GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer31 >=", value, "answer31");
            return (Criteria) this;
        }

        public Criteria andAnswer31LessThan(Integer value) {
            addCriterion("answer31 <", value, "answer31");
            return (Criteria) this;
        }

        public Criteria andAnswer31LessThanOrEqualTo(Integer value) {
            addCriterion("answer31 <=", value, "answer31");
            return (Criteria) this;
        }

        public Criteria andAnswer31In(List<Integer> values) {
            addCriterion("answer31 in", values, "answer31");
            return (Criteria) this;
        }

        public Criteria andAnswer31NotIn(List<Integer> values) {
            addCriterion("answer31 not in", values, "answer31");
            return (Criteria) this;
        }

        public Criteria andAnswer31Between(Integer value1, Integer value2) {
            addCriterion("answer31 between", value1, value2, "answer31");
            return (Criteria) this;
        }

        public Criteria andAnswer31NotBetween(Integer value1, Integer value2) {
            addCriterion("answer31 not between", value1, value2, "answer31");
            return (Criteria) this;
        }

        public Criteria andAnswer32IsNull() {
            addCriterion("answer32 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer32IsNotNull() {
            addCriterion("answer32 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer32EqualTo(Integer value) {
            addCriterion("answer32 =", value, "answer32");
            return (Criteria) this;
        }

        public Criteria andAnswer32NotEqualTo(Integer value) {
            addCriterion("answer32 <>", value, "answer32");
            return (Criteria) this;
        }

        public Criteria andAnswer32GreaterThan(Integer value) {
            addCriterion("answer32 >", value, "answer32");
            return (Criteria) this;
        }

        public Criteria andAnswer32GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer32 >=", value, "answer32");
            return (Criteria) this;
        }

        public Criteria andAnswer32LessThan(Integer value) {
            addCriterion("answer32 <", value, "answer32");
            return (Criteria) this;
        }

        public Criteria andAnswer32LessThanOrEqualTo(Integer value) {
            addCriterion("answer32 <=", value, "answer32");
            return (Criteria) this;
        }

        public Criteria andAnswer32In(List<Integer> values) {
            addCriterion("answer32 in", values, "answer32");
            return (Criteria) this;
        }

        public Criteria andAnswer32NotIn(List<Integer> values) {
            addCriterion("answer32 not in", values, "answer32");
            return (Criteria) this;
        }

        public Criteria andAnswer32Between(Integer value1, Integer value2) {
            addCriterion("answer32 between", value1, value2, "answer32");
            return (Criteria) this;
        }

        public Criteria andAnswer32NotBetween(Integer value1, Integer value2) {
            addCriterion("answer32 not between", value1, value2, "answer32");
            return (Criteria) this;
        }

        public Criteria andAnswer33IsNull() {
            addCriterion("answer33 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer33IsNotNull() {
            addCriterion("answer33 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer33EqualTo(Integer value) {
            addCriterion("answer33 =", value, "answer33");
            return (Criteria) this;
        }

        public Criteria andAnswer33NotEqualTo(Integer value) {
            addCriterion("answer33 <>", value, "answer33");
            return (Criteria) this;
        }

        public Criteria andAnswer33GreaterThan(Integer value) {
            addCriterion("answer33 >", value, "answer33");
            return (Criteria) this;
        }

        public Criteria andAnswer33GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer33 >=", value, "answer33");
            return (Criteria) this;
        }

        public Criteria andAnswer33LessThan(Integer value) {
            addCriterion("answer33 <", value, "answer33");
            return (Criteria) this;
        }

        public Criteria andAnswer33LessThanOrEqualTo(Integer value) {
            addCriterion("answer33 <=", value, "answer33");
            return (Criteria) this;
        }

        public Criteria andAnswer33In(List<Integer> values) {
            addCriterion("answer33 in", values, "answer33");
            return (Criteria) this;
        }

        public Criteria andAnswer33NotIn(List<Integer> values) {
            addCriterion("answer33 not in", values, "answer33");
            return (Criteria) this;
        }

        public Criteria andAnswer33Between(Integer value1, Integer value2) {
            addCriterion("answer33 between", value1, value2, "answer33");
            return (Criteria) this;
        }

        public Criteria andAnswer33NotBetween(Integer value1, Integer value2) {
            addCriterion("answer33 not between", value1, value2, "answer33");
            return (Criteria) this;
        }

        public Criteria andAnswer34IsNull() {
            addCriterion("answer34 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer34IsNotNull() {
            addCriterion("answer34 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer34EqualTo(Integer value) {
            addCriterion("answer34 =", value, "answer34");
            return (Criteria) this;
        }

        public Criteria andAnswer34NotEqualTo(Integer value) {
            addCriterion("answer34 <>", value, "answer34");
            return (Criteria) this;
        }

        public Criteria andAnswer34GreaterThan(Integer value) {
            addCriterion("answer34 >", value, "answer34");
            return (Criteria) this;
        }

        public Criteria andAnswer34GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer34 >=", value, "answer34");
            return (Criteria) this;
        }

        public Criteria andAnswer34LessThan(Integer value) {
            addCriterion("answer34 <", value, "answer34");
            return (Criteria) this;
        }

        public Criteria andAnswer34LessThanOrEqualTo(Integer value) {
            addCriterion("answer34 <=", value, "answer34");
            return (Criteria) this;
        }

        public Criteria andAnswer34In(List<Integer> values) {
            addCriterion("answer34 in", values, "answer34");
            return (Criteria) this;
        }

        public Criteria andAnswer34NotIn(List<Integer> values) {
            addCriterion("answer34 not in", values, "answer34");
            return (Criteria) this;
        }

        public Criteria andAnswer34Between(Integer value1, Integer value2) {
            addCriterion("answer34 between", value1, value2, "answer34");
            return (Criteria) this;
        }

        public Criteria andAnswer34NotBetween(Integer value1, Integer value2) {
            addCriterion("answer34 not between", value1, value2, "answer34");
            return (Criteria) this;
        }

        public Criteria andAnswer35IsNull() {
            addCriterion("answer35 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer35IsNotNull() {
            addCriterion("answer35 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer35EqualTo(Integer value) {
            addCriterion("answer35 =", value, "answer35");
            return (Criteria) this;
        }

        public Criteria andAnswer35NotEqualTo(Integer value) {
            addCriterion("answer35 <>", value, "answer35");
            return (Criteria) this;
        }

        public Criteria andAnswer35GreaterThan(Integer value) {
            addCriterion("answer35 >", value, "answer35");
            return (Criteria) this;
        }

        public Criteria andAnswer35GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer35 >=", value, "answer35");
            return (Criteria) this;
        }

        public Criteria andAnswer35LessThan(Integer value) {
            addCriterion("answer35 <", value, "answer35");
            return (Criteria) this;
        }

        public Criteria andAnswer35LessThanOrEqualTo(Integer value) {
            addCriterion("answer35 <=", value, "answer35");
            return (Criteria) this;
        }

        public Criteria andAnswer35In(List<Integer> values) {
            addCriterion("answer35 in", values, "answer35");
            return (Criteria) this;
        }

        public Criteria andAnswer35NotIn(List<Integer> values) {
            addCriterion("answer35 not in", values, "answer35");
            return (Criteria) this;
        }

        public Criteria andAnswer35Between(Integer value1, Integer value2) {
            addCriterion("answer35 between", value1, value2, "answer35");
            return (Criteria) this;
        }

        public Criteria andAnswer35NotBetween(Integer value1, Integer value2) {
            addCriterion("answer35 not between", value1, value2, "answer35");
            return (Criteria) this;
        }

        public Criteria andAnswer36IsNull() {
            addCriterion("answer36 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer36IsNotNull() {
            addCriterion("answer36 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer36EqualTo(Integer value) {
            addCriterion("answer36 =", value, "answer36");
            return (Criteria) this;
        }

        public Criteria andAnswer36NotEqualTo(Integer value) {
            addCriterion("answer36 <>", value, "answer36");
            return (Criteria) this;
        }

        public Criteria andAnswer36GreaterThan(Integer value) {
            addCriterion("answer36 >", value, "answer36");
            return (Criteria) this;
        }

        public Criteria andAnswer36GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer36 >=", value, "answer36");
            return (Criteria) this;
        }

        public Criteria andAnswer36LessThan(Integer value) {
            addCriterion("answer36 <", value, "answer36");
            return (Criteria) this;
        }

        public Criteria andAnswer36LessThanOrEqualTo(Integer value) {
            addCriterion("answer36 <=", value, "answer36");
            return (Criteria) this;
        }

        public Criteria andAnswer36In(List<Integer> values) {
            addCriterion("answer36 in", values, "answer36");
            return (Criteria) this;
        }

        public Criteria andAnswer36NotIn(List<Integer> values) {
            addCriterion("answer36 not in", values, "answer36");
            return (Criteria) this;
        }

        public Criteria andAnswer36Between(Integer value1, Integer value2) {
            addCriterion("answer36 between", value1, value2, "answer36");
            return (Criteria) this;
        }

        public Criteria andAnswer36NotBetween(Integer value1, Integer value2) {
            addCriterion("answer36 not between", value1, value2, "answer36");
            return (Criteria) this;
        }

        public Criteria andAnswer37IsNull() {
            addCriterion("answer37 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer37IsNotNull() {
            addCriterion("answer37 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer37EqualTo(Integer value) {
            addCriterion("answer37 =", value, "answer37");
            return (Criteria) this;
        }

        public Criteria andAnswer37NotEqualTo(Integer value) {
            addCriterion("answer37 <>", value, "answer37");
            return (Criteria) this;
        }

        public Criteria andAnswer37GreaterThan(Integer value) {
            addCriterion("answer37 >", value, "answer37");
            return (Criteria) this;
        }

        public Criteria andAnswer37GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer37 >=", value, "answer37");
            return (Criteria) this;
        }

        public Criteria andAnswer37LessThan(Integer value) {
            addCriterion("answer37 <", value, "answer37");
            return (Criteria) this;
        }

        public Criteria andAnswer37LessThanOrEqualTo(Integer value) {
            addCriterion("answer37 <=", value, "answer37");
            return (Criteria) this;
        }

        public Criteria andAnswer37In(List<Integer> values) {
            addCriterion("answer37 in", values, "answer37");
            return (Criteria) this;
        }

        public Criteria andAnswer37NotIn(List<Integer> values) {
            addCriterion("answer37 not in", values, "answer37");
            return (Criteria) this;
        }

        public Criteria andAnswer37Between(Integer value1, Integer value2) {
            addCriterion("answer37 between", value1, value2, "answer37");
            return (Criteria) this;
        }

        public Criteria andAnswer37NotBetween(Integer value1, Integer value2) {
            addCriterion("answer37 not between", value1, value2, "answer37");
            return (Criteria) this;
        }

        public Criteria andAnswer38IsNull() {
            addCriterion("answer38 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer38IsNotNull() {
            addCriterion("answer38 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer38EqualTo(Integer value) {
            addCriterion("answer38 =", value, "answer38");
            return (Criteria) this;
        }

        public Criteria andAnswer38NotEqualTo(Integer value) {
            addCriterion("answer38 <>", value, "answer38");
            return (Criteria) this;
        }

        public Criteria andAnswer38GreaterThan(Integer value) {
            addCriterion("answer38 >", value, "answer38");
            return (Criteria) this;
        }

        public Criteria andAnswer38GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer38 >=", value, "answer38");
            return (Criteria) this;
        }

        public Criteria andAnswer38LessThan(Integer value) {
            addCriterion("answer38 <", value, "answer38");
            return (Criteria) this;
        }

        public Criteria andAnswer38LessThanOrEqualTo(Integer value) {
            addCriterion("answer38 <=", value, "answer38");
            return (Criteria) this;
        }

        public Criteria andAnswer38In(List<Integer> values) {
            addCriterion("answer38 in", values, "answer38");
            return (Criteria) this;
        }

        public Criteria andAnswer38NotIn(List<Integer> values) {
            addCriterion("answer38 not in", values, "answer38");
            return (Criteria) this;
        }

        public Criteria andAnswer38Between(Integer value1, Integer value2) {
            addCriterion("answer38 between", value1, value2, "answer38");
            return (Criteria) this;
        }

        public Criteria andAnswer38NotBetween(Integer value1, Integer value2) {
            addCriterion("answer38 not between", value1, value2, "answer38");
            return (Criteria) this;
        }

        public Criteria andAnswer39IsNull() {
            addCriterion("answer39 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer39IsNotNull() {
            addCriterion("answer39 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer39EqualTo(Integer value) {
            addCriterion("answer39 =", value, "answer39");
            return (Criteria) this;
        }

        public Criteria andAnswer39NotEqualTo(Integer value) {
            addCriterion("answer39 <>", value, "answer39");
            return (Criteria) this;
        }

        public Criteria andAnswer39GreaterThan(Integer value) {
            addCriterion("answer39 >", value, "answer39");
            return (Criteria) this;
        }

        public Criteria andAnswer39GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer39 >=", value, "answer39");
            return (Criteria) this;
        }

        public Criteria andAnswer39LessThan(Integer value) {
            addCriterion("answer39 <", value, "answer39");
            return (Criteria) this;
        }

        public Criteria andAnswer39LessThanOrEqualTo(Integer value) {
            addCriterion("answer39 <=", value, "answer39");
            return (Criteria) this;
        }

        public Criteria andAnswer39In(List<Integer> values) {
            addCriterion("answer39 in", values, "answer39");
            return (Criteria) this;
        }

        public Criteria andAnswer39NotIn(List<Integer> values) {
            addCriterion("answer39 not in", values, "answer39");
            return (Criteria) this;
        }

        public Criteria andAnswer39Between(Integer value1, Integer value2) {
            addCriterion("answer39 between", value1, value2, "answer39");
            return (Criteria) this;
        }

        public Criteria andAnswer39NotBetween(Integer value1, Integer value2) {
            addCriterion("answer39 not between", value1, value2, "answer39");
            return (Criteria) this;
        }

        public Criteria andAnswer40IsNull() {
            addCriterion("answer40 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer40IsNotNull() {
            addCriterion("answer40 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer40EqualTo(Integer value) {
            addCriterion("answer40 =", value, "answer40");
            return (Criteria) this;
        }

        public Criteria andAnswer40NotEqualTo(Integer value) {
            addCriterion("answer40 <>", value, "answer40");
            return (Criteria) this;
        }

        public Criteria andAnswer40GreaterThan(Integer value) {
            addCriterion("answer40 >", value, "answer40");
            return (Criteria) this;
        }

        public Criteria andAnswer40GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer40 >=", value, "answer40");
            return (Criteria) this;
        }

        public Criteria andAnswer40LessThan(Integer value) {
            addCriterion("answer40 <", value, "answer40");
            return (Criteria) this;
        }

        public Criteria andAnswer40LessThanOrEqualTo(Integer value) {
            addCriterion("answer40 <=", value, "answer40");
            return (Criteria) this;
        }

        public Criteria andAnswer40In(List<Integer> values) {
            addCriterion("answer40 in", values, "answer40");
            return (Criteria) this;
        }

        public Criteria andAnswer40NotIn(List<Integer> values) {
            addCriterion("answer40 not in", values, "answer40");
            return (Criteria) this;
        }

        public Criteria andAnswer40Between(Integer value1, Integer value2) {
            addCriterion("answer40 between", value1, value2, "answer40");
            return (Criteria) this;
        }

        public Criteria andAnswer40NotBetween(Integer value1, Integer value2) {
            addCriterion("answer40 not between", value1, value2, "answer40");
            return (Criteria) this;
        }

        public Criteria andAnswer41IsNull() {
            addCriterion("answer41 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer41IsNotNull() {
            addCriterion("answer41 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer41EqualTo(Integer value) {
            addCriterion("answer41 =", value, "answer41");
            return (Criteria) this;
        }

        public Criteria andAnswer41NotEqualTo(Integer value) {
            addCriterion("answer41 <>", value, "answer41");
            return (Criteria) this;
        }

        public Criteria andAnswer41GreaterThan(Integer value) {
            addCriterion("answer41 >", value, "answer41");
            return (Criteria) this;
        }

        public Criteria andAnswer41GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer41 >=", value, "answer41");
            return (Criteria) this;
        }

        public Criteria andAnswer41LessThan(Integer value) {
            addCriterion("answer41 <", value, "answer41");
            return (Criteria) this;
        }

        public Criteria andAnswer41LessThanOrEqualTo(Integer value) {
            addCriterion("answer41 <=", value, "answer41");
            return (Criteria) this;
        }

        public Criteria andAnswer41In(List<Integer> values) {
            addCriterion("answer41 in", values, "answer41");
            return (Criteria) this;
        }

        public Criteria andAnswer41NotIn(List<Integer> values) {
            addCriterion("answer41 not in", values, "answer41");
            return (Criteria) this;
        }

        public Criteria andAnswer41Between(Integer value1, Integer value2) {
            addCriterion("answer41 between", value1, value2, "answer41");
            return (Criteria) this;
        }

        public Criteria andAnswer41NotBetween(Integer value1, Integer value2) {
            addCriterion("answer41 not between", value1, value2, "answer41");
            return (Criteria) this;
        }

        public Criteria andAnswer42IsNull() {
            addCriterion("answer42 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer42IsNotNull() {
            addCriterion("answer42 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer42EqualTo(Integer value) {
            addCriterion("answer42 =", value, "answer42");
            return (Criteria) this;
        }

        public Criteria andAnswer42NotEqualTo(Integer value) {
            addCriterion("answer42 <>", value, "answer42");
            return (Criteria) this;
        }

        public Criteria andAnswer42GreaterThan(Integer value) {
            addCriterion("answer42 >", value, "answer42");
            return (Criteria) this;
        }

        public Criteria andAnswer42GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer42 >=", value, "answer42");
            return (Criteria) this;
        }

        public Criteria andAnswer42LessThan(Integer value) {
            addCriterion("answer42 <", value, "answer42");
            return (Criteria) this;
        }

        public Criteria andAnswer42LessThanOrEqualTo(Integer value) {
            addCriterion("answer42 <=", value, "answer42");
            return (Criteria) this;
        }

        public Criteria andAnswer42In(List<Integer> values) {
            addCriterion("answer42 in", values, "answer42");
            return (Criteria) this;
        }

        public Criteria andAnswer42NotIn(List<Integer> values) {
            addCriterion("answer42 not in", values, "answer42");
            return (Criteria) this;
        }

        public Criteria andAnswer42Between(Integer value1, Integer value2) {
            addCriterion("answer42 between", value1, value2, "answer42");
            return (Criteria) this;
        }

        public Criteria andAnswer42NotBetween(Integer value1, Integer value2) {
            addCriterion("answer42 not between", value1, value2, "answer42");
            return (Criteria) this;
        }

        public Criteria andAnswer43IsNull() {
            addCriterion("answer43 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer43IsNotNull() {
            addCriterion("answer43 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer43EqualTo(Integer value) {
            addCriterion("answer43 =", value, "answer43");
            return (Criteria) this;
        }

        public Criteria andAnswer43NotEqualTo(Integer value) {
            addCriterion("answer43 <>", value, "answer43");
            return (Criteria) this;
        }

        public Criteria andAnswer43GreaterThan(Integer value) {
            addCriterion("answer43 >", value, "answer43");
            return (Criteria) this;
        }

        public Criteria andAnswer43GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer43 >=", value, "answer43");
            return (Criteria) this;
        }

        public Criteria andAnswer43LessThan(Integer value) {
            addCriterion("answer43 <", value, "answer43");
            return (Criteria) this;
        }

        public Criteria andAnswer43LessThanOrEqualTo(Integer value) {
            addCriterion("answer43 <=", value, "answer43");
            return (Criteria) this;
        }

        public Criteria andAnswer43In(List<Integer> values) {
            addCriterion("answer43 in", values, "answer43");
            return (Criteria) this;
        }

        public Criteria andAnswer43NotIn(List<Integer> values) {
            addCriterion("answer43 not in", values, "answer43");
            return (Criteria) this;
        }

        public Criteria andAnswer43Between(Integer value1, Integer value2) {
            addCriterion("answer43 between", value1, value2, "answer43");
            return (Criteria) this;
        }

        public Criteria andAnswer43NotBetween(Integer value1, Integer value2) {
            addCriterion("answer43 not between", value1, value2, "answer43");
            return (Criteria) this;
        }

        public Criteria andAnswer44IsNull() {
            addCriterion("answer44 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer44IsNotNull() {
            addCriterion("answer44 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer44EqualTo(Integer value) {
            addCriterion("answer44 =", value, "answer44");
            return (Criteria) this;
        }

        public Criteria andAnswer44NotEqualTo(Integer value) {
            addCriterion("answer44 <>", value, "answer44");
            return (Criteria) this;
        }

        public Criteria andAnswer44GreaterThan(Integer value) {
            addCriterion("answer44 >", value, "answer44");
            return (Criteria) this;
        }

        public Criteria andAnswer44GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer44 >=", value, "answer44");
            return (Criteria) this;
        }

        public Criteria andAnswer44LessThan(Integer value) {
            addCriterion("answer44 <", value, "answer44");
            return (Criteria) this;
        }

        public Criteria andAnswer44LessThanOrEqualTo(Integer value) {
            addCriterion("answer44 <=", value, "answer44");
            return (Criteria) this;
        }

        public Criteria andAnswer44In(List<Integer> values) {
            addCriterion("answer44 in", values, "answer44");
            return (Criteria) this;
        }

        public Criteria andAnswer44NotIn(List<Integer> values) {
            addCriterion("answer44 not in", values, "answer44");
            return (Criteria) this;
        }

        public Criteria andAnswer44Between(Integer value1, Integer value2) {
            addCriterion("answer44 between", value1, value2, "answer44");
            return (Criteria) this;
        }

        public Criteria andAnswer44NotBetween(Integer value1, Integer value2) {
            addCriterion("answer44 not between", value1, value2, "answer44");
            return (Criteria) this;
        }

        public Criteria andAnswer45IsNull() {
            addCriterion("answer45 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer45IsNotNull() {
            addCriterion("answer45 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer45EqualTo(Integer value) {
            addCriterion("answer45 =", value, "answer45");
            return (Criteria) this;
        }

        public Criteria andAnswer45NotEqualTo(Integer value) {
            addCriterion("answer45 <>", value, "answer45");
            return (Criteria) this;
        }

        public Criteria andAnswer45GreaterThan(Integer value) {
            addCriterion("answer45 >", value, "answer45");
            return (Criteria) this;
        }

        public Criteria andAnswer45GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer45 >=", value, "answer45");
            return (Criteria) this;
        }

        public Criteria andAnswer45LessThan(Integer value) {
            addCriterion("answer45 <", value, "answer45");
            return (Criteria) this;
        }

        public Criteria andAnswer45LessThanOrEqualTo(Integer value) {
            addCriterion("answer45 <=", value, "answer45");
            return (Criteria) this;
        }

        public Criteria andAnswer45In(List<Integer> values) {
            addCriterion("answer45 in", values, "answer45");
            return (Criteria) this;
        }

        public Criteria andAnswer45NotIn(List<Integer> values) {
            addCriterion("answer45 not in", values, "answer45");
            return (Criteria) this;
        }

        public Criteria andAnswer45Between(Integer value1, Integer value2) {
            addCriterion("answer45 between", value1, value2, "answer45");
            return (Criteria) this;
        }

        public Criteria andAnswer45NotBetween(Integer value1, Integer value2) {
            addCriterion("answer45 not between", value1, value2, "answer45");
            return (Criteria) this;
        }

        public Criteria andAnswer46IsNull() {
            addCriterion("answer46 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer46IsNotNull() {
            addCriterion("answer46 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer46EqualTo(Integer value) {
            addCriterion("answer46 =", value, "answer46");
            return (Criteria) this;
        }

        public Criteria andAnswer46NotEqualTo(Integer value) {
            addCriterion("answer46 <>", value, "answer46");
            return (Criteria) this;
        }

        public Criteria andAnswer46GreaterThan(Integer value) {
            addCriterion("answer46 >", value, "answer46");
            return (Criteria) this;
        }

        public Criteria andAnswer46GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer46 >=", value, "answer46");
            return (Criteria) this;
        }

        public Criteria andAnswer46LessThan(Integer value) {
            addCriterion("answer46 <", value, "answer46");
            return (Criteria) this;
        }

        public Criteria andAnswer46LessThanOrEqualTo(Integer value) {
            addCriterion("answer46 <=", value, "answer46");
            return (Criteria) this;
        }

        public Criteria andAnswer46In(List<Integer> values) {
            addCriterion("answer46 in", values, "answer46");
            return (Criteria) this;
        }

        public Criteria andAnswer46NotIn(List<Integer> values) {
            addCriterion("answer46 not in", values, "answer46");
            return (Criteria) this;
        }

        public Criteria andAnswer46Between(Integer value1, Integer value2) {
            addCriterion("answer46 between", value1, value2, "answer46");
            return (Criteria) this;
        }

        public Criteria andAnswer46NotBetween(Integer value1, Integer value2) {
            addCriterion("answer46 not between", value1, value2, "answer46");
            return (Criteria) this;
        }

        public Criteria andAnswer47IsNull() {
            addCriterion("answer47 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer47IsNotNull() {
            addCriterion("answer47 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer47EqualTo(Integer value) {
            addCriterion("answer47 =", value, "answer47");
            return (Criteria) this;
        }

        public Criteria andAnswer47NotEqualTo(Integer value) {
            addCriterion("answer47 <>", value, "answer47");
            return (Criteria) this;
        }

        public Criteria andAnswer47GreaterThan(Integer value) {
            addCriterion("answer47 >", value, "answer47");
            return (Criteria) this;
        }

        public Criteria andAnswer47GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer47 >=", value, "answer47");
            return (Criteria) this;
        }

        public Criteria andAnswer47LessThan(Integer value) {
            addCriterion("answer47 <", value, "answer47");
            return (Criteria) this;
        }

        public Criteria andAnswer47LessThanOrEqualTo(Integer value) {
            addCriterion("answer47 <=", value, "answer47");
            return (Criteria) this;
        }

        public Criteria andAnswer47In(List<Integer> values) {
            addCriterion("answer47 in", values, "answer47");
            return (Criteria) this;
        }

        public Criteria andAnswer47NotIn(List<Integer> values) {
            addCriterion("answer47 not in", values, "answer47");
            return (Criteria) this;
        }

        public Criteria andAnswer47Between(Integer value1, Integer value2) {
            addCriterion("answer47 between", value1, value2, "answer47");
            return (Criteria) this;
        }

        public Criteria andAnswer47NotBetween(Integer value1, Integer value2) {
            addCriterion("answer47 not between", value1, value2, "answer47");
            return (Criteria) this;
        }

        public Criteria andAnswer48IsNull() {
            addCriterion("answer48 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer48IsNotNull() {
            addCriterion("answer48 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer48EqualTo(Integer value) {
            addCriterion("answer48 =", value, "answer48");
            return (Criteria) this;
        }

        public Criteria andAnswer48NotEqualTo(Integer value) {
            addCriterion("answer48 <>", value, "answer48");
            return (Criteria) this;
        }

        public Criteria andAnswer48GreaterThan(Integer value) {
            addCriterion("answer48 >", value, "answer48");
            return (Criteria) this;
        }

        public Criteria andAnswer48GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer48 >=", value, "answer48");
            return (Criteria) this;
        }

        public Criteria andAnswer48LessThan(Integer value) {
            addCriterion("answer48 <", value, "answer48");
            return (Criteria) this;
        }

        public Criteria andAnswer48LessThanOrEqualTo(Integer value) {
            addCriterion("answer48 <=", value, "answer48");
            return (Criteria) this;
        }

        public Criteria andAnswer48In(List<Integer> values) {
            addCriterion("answer48 in", values, "answer48");
            return (Criteria) this;
        }

        public Criteria andAnswer48NotIn(List<Integer> values) {
            addCriterion("answer48 not in", values, "answer48");
            return (Criteria) this;
        }

        public Criteria andAnswer48Between(Integer value1, Integer value2) {
            addCriterion("answer48 between", value1, value2, "answer48");
            return (Criteria) this;
        }

        public Criteria andAnswer48NotBetween(Integer value1, Integer value2) {
            addCriterion("answer48 not between", value1, value2, "answer48");
            return (Criteria) this;
        }

        public Criteria andAnswer49IsNull() {
            addCriterion("answer49 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer49IsNotNull() {
            addCriterion("answer49 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer49EqualTo(Integer value) {
            addCriterion("answer49 =", value, "answer49");
            return (Criteria) this;
        }

        public Criteria andAnswer49NotEqualTo(Integer value) {
            addCriterion("answer49 <>", value, "answer49");
            return (Criteria) this;
        }

        public Criteria andAnswer49GreaterThan(Integer value) {
            addCriterion("answer49 >", value, "answer49");
            return (Criteria) this;
        }

        public Criteria andAnswer49GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer49 >=", value, "answer49");
            return (Criteria) this;
        }

        public Criteria andAnswer49LessThan(Integer value) {
            addCriterion("answer49 <", value, "answer49");
            return (Criteria) this;
        }

        public Criteria andAnswer49LessThanOrEqualTo(Integer value) {
            addCriterion("answer49 <=", value, "answer49");
            return (Criteria) this;
        }

        public Criteria andAnswer49In(List<Integer> values) {
            addCriterion("answer49 in", values, "answer49");
            return (Criteria) this;
        }

        public Criteria andAnswer49NotIn(List<Integer> values) {
            addCriterion("answer49 not in", values, "answer49");
            return (Criteria) this;
        }

        public Criteria andAnswer49Between(Integer value1, Integer value2) {
            addCriterion("answer49 between", value1, value2, "answer49");
            return (Criteria) this;
        }

        public Criteria andAnswer49NotBetween(Integer value1, Integer value2) {
            addCriterion("answer49 not between", value1, value2, "answer49");
            return (Criteria) this;
        }

        public Criteria andAnswer50IsNull() {
            addCriterion("answer50 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer50IsNotNull() {
            addCriterion("answer50 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer50EqualTo(Integer value) {
            addCriterion("answer50 =", value, "answer50");
            return (Criteria) this;
        }

        public Criteria andAnswer50NotEqualTo(Integer value) {
            addCriterion("answer50 <>", value, "answer50");
            return (Criteria) this;
        }

        public Criteria andAnswer50GreaterThan(Integer value) {
            addCriterion("answer50 >", value, "answer50");
            return (Criteria) this;
        }

        public Criteria andAnswer50GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer50 >=", value, "answer50");
            return (Criteria) this;
        }

        public Criteria andAnswer50LessThan(Integer value) {
            addCriterion("answer50 <", value, "answer50");
            return (Criteria) this;
        }

        public Criteria andAnswer50LessThanOrEqualTo(Integer value) {
            addCriterion("answer50 <=", value, "answer50");
            return (Criteria) this;
        }

        public Criteria andAnswer50In(List<Integer> values) {
            addCriterion("answer50 in", values, "answer50");
            return (Criteria) this;
        }

        public Criteria andAnswer50NotIn(List<Integer> values) {
            addCriterion("answer50 not in", values, "answer50");
            return (Criteria) this;
        }

        public Criteria andAnswer50Between(Integer value1, Integer value2) {
            addCriterion("answer50 between", value1, value2, "answer50");
            return (Criteria) this;
        }

        public Criteria andAnswer50NotBetween(Integer value1, Integer value2) {
            addCriterion("answer50 not between", value1, value2, "answer50");
            return (Criteria) this;
        }

        public Criteria andAnswer51IsNull() {
            addCriterion("answer51 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer51IsNotNull() {
            addCriterion("answer51 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer51EqualTo(Integer value) {
            addCriterion("answer51 =", value, "answer51");
            return (Criteria) this;
        }

        public Criteria andAnswer51NotEqualTo(Integer value) {
            addCriterion("answer51 <>", value, "answer51");
            return (Criteria) this;
        }

        public Criteria andAnswer51GreaterThan(Integer value) {
            addCriterion("answer51 >", value, "answer51");
            return (Criteria) this;
        }

        public Criteria andAnswer51GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer51 >=", value, "answer51");
            return (Criteria) this;
        }

        public Criteria andAnswer51LessThan(Integer value) {
            addCriterion("answer51 <", value, "answer51");
            return (Criteria) this;
        }

        public Criteria andAnswer51LessThanOrEqualTo(Integer value) {
            addCriterion("answer51 <=", value, "answer51");
            return (Criteria) this;
        }

        public Criteria andAnswer51In(List<Integer> values) {
            addCriterion("answer51 in", values, "answer51");
            return (Criteria) this;
        }

        public Criteria andAnswer51NotIn(List<Integer> values) {
            addCriterion("answer51 not in", values, "answer51");
            return (Criteria) this;
        }

        public Criteria andAnswer51Between(Integer value1, Integer value2) {
            addCriterion("answer51 between", value1, value2, "answer51");
            return (Criteria) this;
        }

        public Criteria andAnswer51NotBetween(Integer value1, Integer value2) {
            addCriterion("answer51 not between", value1, value2, "answer51");
            return (Criteria) this;
        }

        public Criteria andAnswer52IsNull() {
            addCriterion("answer52 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer52IsNotNull() {
            addCriterion("answer52 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer52EqualTo(Integer value) {
            addCriterion("answer52 =", value, "answer52");
            return (Criteria) this;
        }

        public Criteria andAnswer52NotEqualTo(Integer value) {
            addCriterion("answer52 <>", value, "answer52");
            return (Criteria) this;
        }

        public Criteria andAnswer52GreaterThan(Integer value) {
            addCriterion("answer52 >", value, "answer52");
            return (Criteria) this;
        }

        public Criteria andAnswer52GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer52 >=", value, "answer52");
            return (Criteria) this;
        }

        public Criteria andAnswer52LessThan(Integer value) {
            addCriterion("answer52 <", value, "answer52");
            return (Criteria) this;
        }

        public Criteria andAnswer52LessThanOrEqualTo(Integer value) {
            addCriterion("answer52 <=", value, "answer52");
            return (Criteria) this;
        }

        public Criteria andAnswer52In(List<Integer> values) {
            addCriterion("answer52 in", values, "answer52");
            return (Criteria) this;
        }

        public Criteria andAnswer52NotIn(List<Integer> values) {
            addCriterion("answer52 not in", values, "answer52");
            return (Criteria) this;
        }

        public Criteria andAnswer52Between(Integer value1, Integer value2) {
            addCriterion("answer52 between", value1, value2, "answer52");
            return (Criteria) this;
        }

        public Criteria andAnswer52NotBetween(Integer value1, Integer value2) {
            addCriterion("answer52 not between", value1, value2, "answer52");
            return (Criteria) this;
        }

        public Criteria andAnswer53IsNull() {
            addCriterion("answer53 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer53IsNotNull() {
            addCriterion("answer53 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer53EqualTo(Integer value) {
            addCriterion("answer53 =", value, "answer53");
            return (Criteria) this;
        }

        public Criteria andAnswer53NotEqualTo(Integer value) {
            addCriterion("answer53 <>", value, "answer53");
            return (Criteria) this;
        }

        public Criteria andAnswer53GreaterThan(Integer value) {
            addCriterion("answer53 >", value, "answer53");
            return (Criteria) this;
        }

        public Criteria andAnswer53GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer53 >=", value, "answer53");
            return (Criteria) this;
        }

        public Criteria andAnswer53LessThan(Integer value) {
            addCriterion("answer53 <", value, "answer53");
            return (Criteria) this;
        }

        public Criteria andAnswer53LessThanOrEqualTo(Integer value) {
            addCriterion("answer53 <=", value, "answer53");
            return (Criteria) this;
        }

        public Criteria andAnswer53In(List<Integer> values) {
            addCriterion("answer53 in", values, "answer53");
            return (Criteria) this;
        }

        public Criteria andAnswer53NotIn(List<Integer> values) {
            addCriterion("answer53 not in", values, "answer53");
            return (Criteria) this;
        }

        public Criteria andAnswer53Between(Integer value1, Integer value2) {
            addCriterion("answer53 between", value1, value2, "answer53");
            return (Criteria) this;
        }

        public Criteria andAnswer53NotBetween(Integer value1, Integer value2) {
            addCriterion("answer53 not between", value1, value2, "answer53");
            return (Criteria) this;
        }

        public Criteria andAnswer54IsNull() {
            addCriterion("answer54 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer54IsNotNull() {
            addCriterion("answer54 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer54EqualTo(Integer value) {
            addCriterion("answer54 =", value, "answer54");
            return (Criteria) this;
        }

        public Criteria andAnswer54NotEqualTo(Integer value) {
            addCriterion("answer54 <>", value, "answer54");
            return (Criteria) this;
        }

        public Criteria andAnswer54GreaterThan(Integer value) {
            addCriterion("answer54 >", value, "answer54");
            return (Criteria) this;
        }

        public Criteria andAnswer54GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer54 >=", value, "answer54");
            return (Criteria) this;
        }

        public Criteria andAnswer54LessThan(Integer value) {
            addCriterion("answer54 <", value, "answer54");
            return (Criteria) this;
        }

        public Criteria andAnswer54LessThanOrEqualTo(Integer value) {
            addCriterion("answer54 <=", value, "answer54");
            return (Criteria) this;
        }

        public Criteria andAnswer54In(List<Integer> values) {
            addCriterion("answer54 in", values, "answer54");
            return (Criteria) this;
        }

        public Criteria andAnswer54NotIn(List<Integer> values) {
            addCriterion("answer54 not in", values, "answer54");
            return (Criteria) this;
        }

        public Criteria andAnswer54Between(Integer value1, Integer value2) {
            addCriterion("answer54 between", value1, value2, "answer54");
            return (Criteria) this;
        }

        public Criteria andAnswer54NotBetween(Integer value1, Integer value2) {
            addCriterion("answer54 not between", value1, value2, "answer54");
            return (Criteria) this;
        }

        public Criteria andAnswer55IsNull() {
            addCriterion("answer55 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer55IsNotNull() {
            addCriterion("answer55 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer55EqualTo(Integer value) {
            addCriterion("answer55 =", value, "answer55");
            return (Criteria) this;
        }

        public Criteria andAnswer55NotEqualTo(Integer value) {
            addCriterion("answer55 <>", value, "answer55");
            return (Criteria) this;
        }

        public Criteria andAnswer55GreaterThan(Integer value) {
            addCriterion("answer55 >", value, "answer55");
            return (Criteria) this;
        }

        public Criteria andAnswer55GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer55 >=", value, "answer55");
            return (Criteria) this;
        }

        public Criteria andAnswer55LessThan(Integer value) {
            addCriterion("answer55 <", value, "answer55");
            return (Criteria) this;
        }

        public Criteria andAnswer55LessThanOrEqualTo(Integer value) {
            addCriterion("answer55 <=", value, "answer55");
            return (Criteria) this;
        }

        public Criteria andAnswer55In(List<Integer> values) {
            addCriterion("answer55 in", values, "answer55");
            return (Criteria) this;
        }

        public Criteria andAnswer55NotIn(List<Integer> values) {
            addCriterion("answer55 not in", values, "answer55");
            return (Criteria) this;
        }

        public Criteria andAnswer55Between(Integer value1, Integer value2) {
            addCriterion("answer55 between", value1, value2, "answer55");
            return (Criteria) this;
        }

        public Criteria andAnswer55NotBetween(Integer value1, Integer value2) {
            addCriterion("answer55 not between", value1, value2, "answer55");
            return (Criteria) this;
        }

        public Criteria andAnswer56IsNull() {
            addCriterion("answer56 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer56IsNotNull() {
            addCriterion("answer56 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer56EqualTo(Integer value) {
            addCriterion("answer56 =", value, "answer56");
            return (Criteria) this;
        }

        public Criteria andAnswer56NotEqualTo(Integer value) {
            addCriterion("answer56 <>", value, "answer56");
            return (Criteria) this;
        }

        public Criteria andAnswer56GreaterThan(Integer value) {
            addCriterion("answer56 >", value, "answer56");
            return (Criteria) this;
        }

        public Criteria andAnswer56GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer56 >=", value, "answer56");
            return (Criteria) this;
        }

        public Criteria andAnswer56LessThan(Integer value) {
            addCriterion("answer56 <", value, "answer56");
            return (Criteria) this;
        }

        public Criteria andAnswer56LessThanOrEqualTo(Integer value) {
            addCriterion("answer56 <=", value, "answer56");
            return (Criteria) this;
        }

        public Criteria andAnswer56In(List<Integer> values) {
            addCriterion("answer56 in", values, "answer56");
            return (Criteria) this;
        }

        public Criteria andAnswer56NotIn(List<Integer> values) {
            addCriterion("answer56 not in", values, "answer56");
            return (Criteria) this;
        }

        public Criteria andAnswer56Between(Integer value1, Integer value2) {
            addCriterion("answer56 between", value1, value2, "answer56");
            return (Criteria) this;
        }

        public Criteria andAnswer56NotBetween(Integer value1, Integer value2) {
            addCriterion("answer56 not between", value1, value2, "answer56");
            return (Criteria) this;
        }

        public Criteria andAnswer57IsNull() {
            addCriterion("answer57 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer57IsNotNull() {
            addCriterion("answer57 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer57EqualTo(Integer value) {
            addCriterion("answer57 =", value, "answer57");
            return (Criteria) this;
        }

        public Criteria andAnswer57NotEqualTo(Integer value) {
            addCriterion("answer57 <>", value, "answer57");
            return (Criteria) this;
        }

        public Criteria andAnswer57GreaterThan(Integer value) {
            addCriterion("answer57 >", value, "answer57");
            return (Criteria) this;
        }

        public Criteria andAnswer57GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer57 >=", value, "answer57");
            return (Criteria) this;
        }

        public Criteria andAnswer57LessThan(Integer value) {
            addCriterion("answer57 <", value, "answer57");
            return (Criteria) this;
        }

        public Criteria andAnswer57LessThanOrEqualTo(Integer value) {
            addCriterion("answer57 <=", value, "answer57");
            return (Criteria) this;
        }

        public Criteria andAnswer57In(List<Integer> values) {
            addCriterion("answer57 in", values, "answer57");
            return (Criteria) this;
        }

        public Criteria andAnswer57NotIn(List<Integer> values) {
            addCriterion("answer57 not in", values, "answer57");
            return (Criteria) this;
        }

        public Criteria andAnswer57Between(Integer value1, Integer value2) {
            addCriterion("answer57 between", value1, value2, "answer57");
            return (Criteria) this;
        }

        public Criteria andAnswer57NotBetween(Integer value1, Integer value2) {
            addCriterion("answer57 not between", value1, value2, "answer57");
            return (Criteria) this;
        }

        public Criteria andAnswer58IsNull() {
            addCriterion("answer58 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer58IsNotNull() {
            addCriterion("answer58 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer58EqualTo(Integer value) {
            addCriterion("answer58 =", value, "answer58");
            return (Criteria) this;
        }

        public Criteria andAnswer58NotEqualTo(Integer value) {
            addCriterion("answer58 <>", value, "answer58");
            return (Criteria) this;
        }

        public Criteria andAnswer58GreaterThan(Integer value) {
            addCriterion("answer58 >", value, "answer58");
            return (Criteria) this;
        }

        public Criteria andAnswer58GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer58 >=", value, "answer58");
            return (Criteria) this;
        }

        public Criteria andAnswer58LessThan(Integer value) {
            addCriterion("answer58 <", value, "answer58");
            return (Criteria) this;
        }

        public Criteria andAnswer58LessThanOrEqualTo(Integer value) {
            addCriterion("answer58 <=", value, "answer58");
            return (Criteria) this;
        }

        public Criteria andAnswer58In(List<Integer> values) {
            addCriterion("answer58 in", values, "answer58");
            return (Criteria) this;
        }

        public Criteria andAnswer58NotIn(List<Integer> values) {
            addCriterion("answer58 not in", values, "answer58");
            return (Criteria) this;
        }

        public Criteria andAnswer58Between(Integer value1, Integer value2) {
            addCriterion("answer58 between", value1, value2, "answer58");
            return (Criteria) this;
        }

        public Criteria andAnswer58NotBetween(Integer value1, Integer value2) {
            addCriterion("answer58 not between", value1, value2, "answer58");
            return (Criteria) this;
        }

        public Criteria andAnswer59IsNull() {
            addCriterion("answer59 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer59IsNotNull() {
            addCriterion("answer59 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer59EqualTo(Integer value) {
            addCriterion("answer59 =", value, "answer59");
            return (Criteria) this;
        }

        public Criteria andAnswer59NotEqualTo(Integer value) {
            addCriterion("answer59 <>", value, "answer59");
            return (Criteria) this;
        }

        public Criteria andAnswer59GreaterThan(Integer value) {
            addCriterion("answer59 >", value, "answer59");
            return (Criteria) this;
        }

        public Criteria andAnswer59GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer59 >=", value, "answer59");
            return (Criteria) this;
        }

        public Criteria andAnswer59LessThan(Integer value) {
            addCriterion("answer59 <", value, "answer59");
            return (Criteria) this;
        }

        public Criteria andAnswer59LessThanOrEqualTo(Integer value) {
            addCriterion("answer59 <=", value, "answer59");
            return (Criteria) this;
        }

        public Criteria andAnswer59In(List<Integer> values) {
            addCriterion("answer59 in", values, "answer59");
            return (Criteria) this;
        }

        public Criteria andAnswer59NotIn(List<Integer> values) {
            addCriterion("answer59 not in", values, "answer59");
            return (Criteria) this;
        }

        public Criteria andAnswer59Between(Integer value1, Integer value2) {
            addCriterion("answer59 between", value1, value2, "answer59");
            return (Criteria) this;
        }

        public Criteria andAnswer59NotBetween(Integer value1, Integer value2) {
            addCriterion("answer59 not between", value1, value2, "answer59");
            return (Criteria) this;
        }

        public Criteria andAnswer60IsNull() {
            addCriterion("answer60 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer60IsNotNull() {
            addCriterion("answer60 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer60EqualTo(Integer value) {
            addCriterion("answer60 =", value, "answer60");
            return (Criteria) this;
        }

        public Criteria andAnswer60NotEqualTo(Integer value) {
            addCriterion("answer60 <>", value, "answer60");
            return (Criteria) this;
        }

        public Criteria andAnswer60GreaterThan(Integer value) {
            addCriterion("answer60 >", value, "answer60");
            return (Criteria) this;
        }

        public Criteria andAnswer60GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer60 >=", value, "answer60");
            return (Criteria) this;
        }

        public Criteria andAnswer60LessThan(Integer value) {
            addCriterion("answer60 <", value, "answer60");
            return (Criteria) this;
        }

        public Criteria andAnswer60LessThanOrEqualTo(Integer value) {
            addCriterion("answer60 <=", value, "answer60");
            return (Criteria) this;
        }

        public Criteria andAnswer60In(List<Integer> values) {
            addCriterion("answer60 in", values, "answer60");
            return (Criteria) this;
        }

        public Criteria andAnswer60NotIn(List<Integer> values) {
            addCriterion("answer60 not in", values, "answer60");
            return (Criteria) this;
        }

        public Criteria andAnswer60Between(Integer value1, Integer value2) {
            addCriterion("answer60 between", value1, value2, "answer60");
            return (Criteria) this;
        }

        public Criteria andAnswer60NotBetween(Integer value1, Integer value2) {
            addCriterion("answer60 not between", value1, value2, "answer60");
            return (Criteria) this;
        }

        public Criteria andAnswer61IsNull() {
            addCriterion("answer61 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer61IsNotNull() {
            addCriterion("answer61 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer61EqualTo(Integer value) {
            addCriterion("answer61 =", value, "answer61");
            return (Criteria) this;
        }

        public Criteria andAnswer61NotEqualTo(Integer value) {
            addCriterion("answer61 <>", value, "answer61");
            return (Criteria) this;
        }

        public Criteria andAnswer61GreaterThan(Integer value) {
            addCriterion("answer61 >", value, "answer61");
            return (Criteria) this;
        }

        public Criteria andAnswer61GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer61 >=", value, "answer61");
            return (Criteria) this;
        }

        public Criteria andAnswer61LessThan(Integer value) {
            addCriterion("answer61 <", value, "answer61");
            return (Criteria) this;
        }

        public Criteria andAnswer61LessThanOrEqualTo(Integer value) {
            addCriterion("answer61 <=", value, "answer61");
            return (Criteria) this;
        }

        public Criteria andAnswer61In(List<Integer> values) {
            addCriterion("answer61 in", values, "answer61");
            return (Criteria) this;
        }

        public Criteria andAnswer61NotIn(List<Integer> values) {
            addCriterion("answer61 not in", values, "answer61");
            return (Criteria) this;
        }

        public Criteria andAnswer61Between(Integer value1, Integer value2) {
            addCriterion("answer61 between", value1, value2, "answer61");
            return (Criteria) this;
        }

        public Criteria andAnswer61NotBetween(Integer value1, Integer value2) {
            addCriterion("answer61 not between", value1, value2, "answer61");
            return (Criteria) this;
        }

        public Criteria andAnswer62IsNull() {
            addCriterion("answer62 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer62IsNotNull() {
            addCriterion("answer62 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer62EqualTo(Integer value) {
            addCriterion("answer62 =", value, "answer62");
            return (Criteria) this;
        }

        public Criteria andAnswer62NotEqualTo(Integer value) {
            addCriterion("answer62 <>", value, "answer62");
            return (Criteria) this;
        }

        public Criteria andAnswer62GreaterThan(Integer value) {
            addCriterion("answer62 >", value, "answer62");
            return (Criteria) this;
        }

        public Criteria andAnswer62GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer62 >=", value, "answer62");
            return (Criteria) this;
        }

        public Criteria andAnswer62LessThan(Integer value) {
            addCriterion("answer62 <", value, "answer62");
            return (Criteria) this;
        }

        public Criteria andAnswer62LessThanOrEqualTo(Integer value) {
            addCriterion("answer62 <=", value, "answer62");
            return (Criteria) this;
        }

        public Criteria andAnswer62In(List<Integer> values) {
            addCriterion("answer62 in", values, "answer62");
            return (Criteria) this;
        }

        public Criteria andAnswer62NotIn(List<Integer> values) {
            addCriterion("answer62 not in", values, "answer62");
            return (Criteria) this;
        }

        public Criteria andAnswer62Between(Integer value1, Integer value2) {
            addCriterion("answer62 between", value1, value2, "answer62");
            return (Criteria) this;
        }

        public Criteria andAnswer62NotBetween(Integer value1, Integer value2) {
            addCriterion("answer62 not between", value1, value2, "answer62");
            return (Criteria) this;
        }

        public Criteria andAnswer63IsNull() {
            addCriterion("answer63 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer63IsNotNull() {
            addCriterion("answer63 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer63EqualTo(Integer value) {
            addCriterion("answer63 =", value, "answer63");
            return (Criteria) this;
        }

        public Criteria andAnswer63NotEqualTo(Integer value) {
            addCriterion("answer63 <>", value, "answer63");
            return (Criteria) this;
        }

        public Criteria andAnswer63GreaterThan(Integer value) {
            addCriterion("answer63 >", value, "answer63");
            return (Criteria) this;
        }

        public Criteria andAnswer63GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer63 >=", value, "answer63");
            return (Criteria) this;
        }

        public Criteria andAnswer63LessThan(Integer value) {
            addCriterion("answer63 <", value, "answer63");
            return (Criteria) this;
        }

        public Criteria andAnswer63LessThanOrEqualTo(Integer value) {
            addCriterion("answer63 <=", value, "answer63");
            return (Criteria) this;
        }

        public Criteria andAnswer63In(List<Integer> values) {
            addCriterion("answer63 in", values, "answer63");
            return (Criteria) this;
        }

        public Criteria andAnswer63NotIn(List<Integer> values) {
            addCriterion("answer63 not in", values, "answer63");
            return (Criteria) this;
        }

        public Criteria andAnswer63Between(Integer value1, Integer value2) {
            addCriterion("answer63 between", value1, value2, "answer63");
            return (Criteria) this;
        }

        public Criteria andAnswer63NotBetween(Integer value1, Integer value2) {
            addCriterion("answer63 not between", value1, value2, "answer63");
            return (Criteria) this;
        }

        public Criteria andAnswer64IsNull() {
            addCriterion("answer64 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer64IsNotNull() {
            addCriterion("answer64 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer64EqualTo(Integer value) {
            addCriterion("answer64 =", value, "answer64");
            return (Criteria) this;
        }

        public Criteria andAnswer64NotEqualTo(Integer value) {
            addCriterion("answer64 <>", value, "answer64");
            return (Criteria) this;
        }

        public Criteria andAnswer64GreaterThan(Integer value) {
            addCriterion("answer64 >", value, "answer64");
            return (Criteria) this;
        }

        public Criteria andAnswer64GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer64 >=", value, "answer64");
            return (Criteria) this;
        }

        public Criteria andAnswer64LessThan(Integer value) {
            addCriterion("answer64 <", value, "answer64");
            return (Criteria) this;
        }

        public Criteria andAnswer64LessThanOrEqualTo(Integer value) {
            addCriterion("answer64 <=", value, "answer64");
            return (Criteria) this;
        }

        public Criteria andAnswer64In(List<Integer> values) {
            addCriterion("answer64 in", values, "answer64");
            return (Criteria) this;
        }

        public Criteria andAnswer64NotIn(List<Integer> values) {
            addCriterion("answer64 not in", values, "answer64");
            return (Criteria) this;
        }

        public Criteria andAnswer64Between(Integer value1, Integer value2) {
            addCriterion("answer64 between", value1, value2, "answer64");
            return (Criteria) this;
        }

        public Criteria andAnswer64NotBetween(Integer value1, Integer value2) {
            addCriterion("answer64 not between", value1, value2, "answer64");
            return (Criteria) this;
        }

        public Criteria andAnswer65IsNull() {
            addCriterion("answer65 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer65IsNotNull() {
            addCriterion("answer65 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer65EqualTo(Integer value) {
            addCriterion("answer65 =", value, "answer65");
            return (Criteria) this;
        }

        public Criteria andAnswer65NotEqualTo(Integer value) {
            addCriterion("answer65 <>", value, "answer65");
            return (Criteria) this;
        }

        public Criteria andAnswer65GreaterThan(Integer value) {
            addCriterion("answer65 >", value, "answer65");
            return (Criteria) this;
        }

        public Criteria andAnswer65GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer65 >=", value, "answer65");
            return (Criteria) this;
        }

        public Criteria andAnswer65LessThan(Integer value) {
            addCriterion("answer65 <", value, "answer65");
            return (Criteria) this;
        }

        public Criteria andAnswer65LessThanOrEqualTo(Integer value) {
            addCriterion("answer65 <=", value, "answer65");
            return (Criteria) this;
        }

        public Criteria andAnswer65In(List<Integer> values) {
            addCriterion("answer65 in", values, "answer65");
            return (Criteria) this;
        }

        public Criteria andAnswer65NotIn(List<Integer> values) {
            addCriterion("answer65 not in", values, "answer65");
            return (Criteria) this;
        }

        public Criteria andAnswer65Between(Integer value1, Integer value2) {
            addCriterion("answer65 between", value1, value2, "answer65");
            return (Criteria) this;
        }

        public Criteria andAnswer65NotBetween(Integer value1, Integer value2) {
            addCriterion("answer65 not between", value1, value2, "answer65");
            return (Criteria) this;
        }

        public Criteria andAnswer66IsNull() {
            addCriterion("answer66 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer66IsNotNull() {
            addCriterion("answer66 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer66EqualTo(Integer value) {
            addCriterion("answer66 =", value, "answer66");
            return (Criteria) this;
        }

        public Criteria andAnswer66NotEqualTo(Integer value) {
            addCriterion("answer66 <>", value, "answer66");
            return (Criteria) this;
        }

        public Criteria andAnswer66GreaterThan(Integer value) {
            addCriterion("answer66 >", value, "answer66");
            return (Criteria) this;
        }

        public Criteria andAnswer66GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer66 >=", value, "answer66");
            return (Criteria) this;
        }

        public Criteria andAnswer66LessThan(Integer value) {
            addCriterion("answer66 <", value, "answer66");
            return (Criteria) this;
        }

        public Criteria andAnswer66LessThanOrEqualTo(Integer value) {
            addCriterion("answer66 <=", value, "answer66");
            return (Criteria) this;
        }

        public Criteria andAnswer66In(List<Integer> values) {
            addCriterion("answer66 in", values, "answer66");
            return (Criteria) this;
        }

        public Criteria andAnswer66NotIn(List<Integer> values) {
            addCriterion("answer66 not in", values, "answer66");
            return (Criteria) this;
        }

        public Criteria andAnswer66Between(Integer value1, Integer value2) {
            addCriterion("answer66 between", value1, value2, "answer66");
            return (Criteria) this;
        }

        public Criteria andAnswer66NotBetween(Integer value1, Integer value2) {
            addCriterion("answer66 not between", value1, value2, "answer66");
            return (Criteria) this;
        }

        public Criteria andAnswer67IsNull() {
            addCriterion("answer67 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer67IsNotNull() {
            addCriterion("answer67 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer67EqualTo(Integer value) {
            addCriterion("answer67 =", value, "answer67");
            return (Criteria) this;
        }

        public Criteria andAnswer67NotEqualTo(Integer value) {
            addCriterion("answer67 <>", value, "answer67");
            return (Criteria) this;
        }

        public Criteria andAnswer67GreaterThan(Integer value) {
            addCriterion("answer67 >", value, "answer67");
            return (Criteria) this;
        }

        public Criteria andAnswer67GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer67 >=", value, "answer67");
            return (Criteria) this;
        }

        public Criteria andAnswer67LessThan(Integer value) {
            addCriterion("answer67 <", value, "answer67");
            return (Criteria) this;
        }

        public Criteria andAnswer67LessThanOrEqualTo(Integer value) {
            addCriterion("answer67 <=", value, "answer67");
            return (Criteria) this;
        }

        public Criteria andAnswer67In(List<Integer> values) {
            addCriterion("answer67 in", values, "answer67");
            return (Criteria) this;
        }

        public Criteria andAnswer67NotIn(List<Integer> values) {
            addCriterion("answer67 not in", values, "answer67");
            return (Criteria) this;
        }

        public Criteria andAnswer67Between(Integer value1, Integer value2) {
            addCriterion("answer67 between", value1, value2, "answer67");
            return (Criteria) this;
        }

        public Criteria andAnswer67NotBetween(Integer value1, Integer value2) {
            addCriterion("answer67 not between", value1, value2, "answer67");
            return (Criteria) this;
        }

        public Criteria andAnswer68IsNull() {
            addCriterion("answer68 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer68IsNotNull() {
            addCriterion("answer68 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer68EqualTo(Integer value) {
            addCriterion("answer68 =", value, "answer68");
            return (Criteria) this;
        }

        public Criteria andAnswer68NotEqualTo(Integer value) {
            addCriterion("answer68 <>", value, "answer68");
            return (Criteria) this;
        }

        public Criteria andAnswer68GreaterThan(Integer value) {
            addCriterion("answer68 >", value, "answer68");
            return (Criteria) this;
        }

        public Criteria andAnswer68GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer68 >=", value, "answer68");
            return (Criteria) this;
        }

        public Criteria andAnswer68LessThan(Integer value) {
            addCriterion("answer68 <", value, "answer68");
            return (Criteria) this;
        }

        public Criteria andAnswer68LessThanOrEqualTo(Integer value) {
            addCriterion("answer68 <=", value, "answer68");
            return (Criteria) this;
        }

        public Criteria andAnswer68In(List<Integer> values) {
            addCriterion("answer68 in", values, "answer68");
            return (Criteria) this;
        }

        public Criteria andAnswer68NotIn(List<Integer> values) {
            addCriterion("answer68 not in", values, "answer68");
            return (Criteria) this;
        }

        public Criteria andAnswer68Between(Integer value1, Integer value2) {
            addCriterion("answer68 between", value1, value2, "answer68");
            return (Criteria) this;
        }

        public Criteria andAnswer68NotBetween(Integer value1, Integer value2) {
            addCriterion("answer68 not between", value1, value2, "answer68");
            return (Criteria) this;
        }

        public Criteria andAnswer69IsNull() {
            addCriterion("answer69 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer69IsNotNull() {
            addCriterion("answer69 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer69EqualTo(Integer value) {
            addCriterion("answer69 =", value, "answer69");
            return (Criteria) this;
        }

        public Criteria andAnswer69NotEqualTo(Integer value) {
            addCriterion("answer69 <>", value, "answer69");
            return (Criteria) this;
        }

        public Criteria andAnswer69GreaterThan(Integer value) {
            addCriterion("answer69 >", value, "answer69");
            return (Criteria) this;
        }

        public Criteria andAnswer69GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer69 >=", value, "answer69");
            return (Criteria) this;
        }

        public Criteria andAnswer69LessThan(Integer value) {
            addCriterion("answer69 <", value, "answer69");
            return (Criteria) this;
        }

        public Criteria andAnswer69LessThanOrEqualTo(Integer value) {
            addCriterion("answer69 <=", value, "answer69");
            return (Criteria) this;
        }

        public Criteria andAnswer69In(List<Integer> values) {
            addCriterion("answer69 in", values, "answer69");
            return (Criteria) this;
        }

        public Criteria andAnswer69NotIn(List<Integer> values) {
            addCriterion("answer69 not in", values, "answer69");
            return (Criteria) this;
        }

        public Criteria andAnswer69Between(Integer value1, Integer value2) {
            addCriterion("answer69 between", value1, value2, "answer69");
            return (Criteria) this;
        }

        public Criteria andAnswer69NotBetween(Integer value1, Integer value2) {
            addCriterion("answer69 not between", value1, value2, "answer69");
            return (Criteria) this;
        }

        public Criteria andAnswer70IsNull() {
            addCriterion("answer70 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer70IsNotNull() {
            addCriterion("answer70 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer70EqualTo(Integer value) {
            addCriterion("answer70 =", value, "answer70");
            return (Criteria) this;
        }

        public Criteria andAnswer70NotEqualTo(Integer value) {
            addCriterion("answer70 <>", value, "answer70");
            return (Criteria) this;
        }

        public Criteria andAnswer70GreaterThan(Integer value) {
            addCriterion("answer70 >", value, "answer70");
            return (Criteria) this;
        }

        public Criteria andAnswer70GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer70 >=", value, "answer70");
            return (Criteria) this;
        }

        public Criteria andAnswer70LessThan(Integer value) {
            addCriterion("answer70 <", value, "answer70");
            return (Criteria) this;
        }

        public Criteria andAnswer70LessThanOrEqualTo(Integer value) {
            addCriterion("answer70 <=", value, "answer70");
            return (Criteria) this;
        }

        public Criteria andAnswer70In(List<Integer> values) {
            addCriterion("answer70 in", values, "answer70");
            return (Criteria) this;
        }

        public Criteria andAnswer70NotIn(List<Integer> values) {
            addCriterion("answer70 not in", values, "answer70");
            return (Criteria) this;
        }

        public Criteria andAnswer70Between(Integer value1, Integer value2) {
            addCriterion("answer70 between", value1, value2, "answer70");
            return (Criteria) this;
        }

        public Criteria andAnswer70NotBetween(Integer value1, Integer value2) {
            addCriterion("answer70 not between", value1, value2, "answer70");
            return (Criteria) this;
        }

        public Criteria andAnswer71IsNull() {
            addCriterion("answer71 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer71IsNotNull() {
            addCriterion("answer71 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer71EqualTo(Integer value) {
            addCriterion("answer71 =", value, "answer71");
            return (Criteria) this;
        }

        public Criteria andAnswer71NotEqualTo(Integer value) {
            addCriterion("answer71 <>", value, "answer71");
            return (Criteria) this;
        }

        public Criteria andAnswer71GreaterThan(Integer value) {
            addCriterion("answer71 >", value, "answer71");
            return (Criteria) this;
        }

        public Criteria andAnswer71GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer71 >=", value, "answer71");
            return (Criteria) this;
        }

        public Criteria andAnswer71LessThan(Integer value) {
            addCriterion("answer71 <", value, "answer71");
            return (Criteria) this;
        }

        public Criteria andAnswer71LessThanOrEqualTo(Integer value) {
            addCriterion("answer71 <=", value, "answer71");
            return (Criteria) this;
        }

        public Criteria andAnswer71In(List<Integer> values) {
            addCriterion("answer71 in", values, "answer71");
            return (Criteria) this;
        }

        public Criteria andAnswer71NotIn(List<Integer> values) {
            addCriterion("answer71 not in", values, "answer71");
            return (Criteria) this;
        }

        public Criteria andAnswer71Between(Integer value1, Integer value2) {
            addCriterion("answer71 between", value1, value2, "answer71");
            return (Criteria) this;
        }

        public Criteria andAnswer71NotBetween(Integer value1, Integer value2) {
            addCriterion("answer71 not between", value1, value2, "answer71");
            return (Criteria) this;
        }

        public Criteria andAnswer72IsNull() {
            addCriterion("answer72 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer72IsNotNull() {
            addCriterion("answer72 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer72EqualTo(Integer value) {
            addCriterion("answer72 =", value, "answer72");
            return (Criteria) this;
        }

        public Criteria andAnswer72NotEqualTo(Integer value) {
            addCriterion("answer72 <>", value, "answer72");
            return (Criteria) this;
        }

        public Criteria andAnswer72GreaterThan(Integer value) {
            addCriterion("answer72 >", value, "answer72");
            return (Criteria) this;
        }

        public Criteria andAnswer72GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer72 >=", value, "answer72");
            return (Criteria) this;
        }

        public Criteria andAnswer72LessThan(Integer value) {
            addCriterion("answer72 <", value, "answer72");
            return (Criteria) this;
        }

        public Criteria andAnswer72LessThanOrEqualTo(Integer value) {
            addCriterion("answer72 <=", value, "answer72");
            return (Criteria) this;
        }

        public Criteria andAnswer72In(List<Integer> values) {
            addCriterion("answer72 in", values, "answer72");
            return (Criteria) this;
        }

        public Criteria andAnswer72NotIn(List<Integer> values) {
            addCriterion("answer72 not in", values, "answer72");
            return (Criteria) this;
        }

        public Criteria andAnswer72Between(Integer value1, Integer value2) {
            addCriterion("answer72 between", value1, value2, "answer72");
            return (Criteria) this;
        }

        public Criteria andAnswer72NotBetween(Integer value1, Integer value2) {
            addCriterion("answer72 not between", value1, value2, "answer72");
            return (Criteria) this;
        }

        public Criteria andAnswer73IsNull() {
            addCriterion("answer73 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer73IsNotNull() {
            addCriterion("answer73 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer73EqualTo(Integer value) {
            addCriterion("answer73 =", value, "answer73");
            return (Criteria) this;
        }

        public Criteria andAnswer73NotEqualTo(Integer value) {
            addCriterion("answer73 <>", value, "answer73");
            return (Criteria) this;
        }

        public Criteria andAnswer73GreaterThan(Integer value) {
            addCriterion("answer73 >", value, "answer73");
            return (Criteria) this;
        }

        public Criteria andAnswer73GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer73 >=", value, "answer73");
            return (Criteria) this;
        }

        public Criteria andAnswer73LessThan(Integer value) {
            addCriterion("answer73 <", value, "answer73");
            return (Criteria) this;
        }

        public Criteria andAnswer73LessThanOrEqualTo(Integer value) {
            addCriterion("answer73 <=", value, "answer73");
            return (Criteria) this;
        }

        public Criteria andAnswer73In(List<Integer> values) {
            addCriterion("answer73 in", values, "answer73");
            return (Criteria) this;
        }

        public Criteria andAnswer73NotIn(List<Integer> values) {
            addCriterion("answer73 not in", values, "answer73");
            return (Criteria) this;
        }

        public Criteria andAnswer73Between(Integer value1, Integer value2) {
            addCriterion("answer73 between", value1, value2, "answer73");
            return (Criteria) this;
        }

        public Criteria andAnswer73NotBetween(Integer value1, Integer value2) {
            addCriterion("answer73 not between", value1, value2, "answer73");
            return (Criteria) this;
        }

        public Criteria andAnswer74IsNull() {
            addCriterion("answer74 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer74IsNotNull() {
            addCriterion("answer74 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer74EqualTo(Integer value) {
            addCriterion("answer74 =", value, "answer74");
            return (Criteria) this;
        }

        public Criteria andAnswer74NotEqualTo(Integer value) {
            addCriterion("answer74 <>", value, "answer74");
            return (Criteria) this;
        }

        public Criteria andAnswer74GreaterThan(Integer value) {
            addCriterion("answer74 >", value, "answer74");
            return (Criteria) this;
        }

        public Criteria andAnswer74GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer74 >=", value, "answer74");
            return (Criteria) this;
        }

        public Criteria andAnswer74LessThan(Integer value) {
            addCriterion("answer74 <", value, "answer74");
            return (Criteria) this;
        }

        public Criteria andAnswer74LessThanOrEqualTo(Integer value) {
            addCriterion("answer74 <=", value, "answer74");
            return (Criteria) this;
        }

        public Criteria andAnswer74In(List<Integer> values) {
            addCriterion("answer74 in", values, "answer74");
            return (Criteria) this;
        }

        public Criteria andAnswer74NotIn(List<Integer> values) {
            addCriterion("answer74 not in", values, "answer74");
            return (Criteria) this;
        }

        public Criteria andAnswer74Between(Integer value1, Integer value2) {
            addCriterion("answer74 between", value1, value2, "answer74");
            return (Criteria) this;
        }

        public Criteria andAnswer74NotBetween(Integer value1, Integer value2) {
            addCriterion("answer74 not between", value1, value2, "answer74");
            return (Criteria) this;
        }

        public Criteria andAnswer75IsNull() {
            addCriterion("answer75 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer75IsNotNull() {
            addCriterion("answer75 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer75EqualTo(Integer value) {
            addCriterion("answer75 =", value, "answer75");
            return (Criteria) this;
        }

        public Criteria andAnswer75NotEqualTo(Integer value) {
            addCriterion("answer75 <>", value, "answer75");
            return (Criteria) this;
        }

        public Criteria andAnswer75GreaterThan(Integer value) {
            addCriterion("answer75 >", value, "answer75");
            return (Criteria) this;
        }

        public Criteria andAnswer75GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer75 >=", value, "answer75");
            return (Criteria) this;
        }

        public Criteria andAnswer75LessThan(Integer value) {
            addCriterion("answer75 <", value, "answer75");
            return (Criteria) this;
        }

        public Criteria andAnswer75LessThanOrEqualTo(Integer value) {
            addCriterion("answer75 <=", value, "answer75");
            return (Criteria) this;
        }

        public Criteria andAnswer75In(List<Integer> values) {
            addCriterion("answer75 in", values, "answer75");
            return (Criteria) this;
        }

        public Criteria andAnswer75NotIn(List<Integer> values) {
            addCriterion("answer75 not in", values, "answer75");
            return (Criteria) this;
        }

        public Criteria andAnswer75Between(Integer value1, Integer value2) {
            addCriterion("answer75 between", value1, value2, "answer75");
            return (Criteria) this;
        }

        public Criteria andAnswer75NotBetween(Integer value1, Integer value2) {
            addCriterion("answer75 not between", value1, value2, "answer75");
            return (Criteria) this;
        }

        public Criteria andAnswer76IsNull() {
            addCriterion("answer76 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer76IsNotNull() {
            addCriterion("answer76 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer76EqualTo(Integer value) {
            addCriterion("answer76 =", value, "answer76");
            return (Criteria) this;
        }

        public Criteria andAnswer76NotEqualTo(Integer value) {
            addCriterion("answer76 <>", value, "answer76");
            return (Criteria) this;
        }

        public Criteria andAnswer76GreaterThan(Integer value) {
            addCriterion("answer76 >", value, "answer76");
            return (Criteria) this;
        }

        public Criteria andAnswer76GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer76 >=", value, "answer76");
            return (Criteria) this;
        }

        public Criteria andAnswer76LessThan(Integer value) {
            addCriterion("answer76 <", value, "answer76");
            return (Criteria) this;
        }

        public Criteria andAnswer76LessThanOrEqualTo(Integer value) {
            addCriterion("answer76 <=", value, "answer76");
            return (Criteria) this;
        }

        public Criteria andAnswer76In(List<Integer> values) {
            addCriterion("answer76 in", values, "answer76");
            return (Criteria) this;
        }

        public Criteria andAnswer76NotIn(List<Integer> values) {
            addCriterion("answer76 not in", values, "answer76");
            return (Criteria) this;
        }

        public Criteria andAnswer76Between(Integer value1, Integer value2) {
            addCriterion("answer76 between", value1, value2, "answer76");
            return (Criteria) this;
        }

        public Criteria andAnswer76NotBetween(Integer value1, Integer value2) {
            addCriterion("answer76 not between", value1, value2, "answer76");
            return (Criteria) this;
        }

        public Criteria andAnswer77IsNull() {
            addCriterion("answer77 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer77IsNotNull() {
            addCriterion("answer77 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer77EqualTo(Integer value) {
            addCriterion("answer77 =", value, "answer77");
            return (Criteria) this;
        }

        public Criteria andAnswer77NotEqualTo(Integer value) {
            addCriterion("answer77 <>", value, "answer77");
            return (Criteria) this;
        }

        public Criteria andAnswer77GreaterThan(Integer value) {
            addCriterion("answer77 >", value, "answer77");
            return (Criteria) this;
        }

        public Criteria andAnswer77GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer77 >=", value, "answer77");
            return (Criteria) this;
        }

        public Criteria andAnswer77LessThan(Integer value) {
            addCriterion("answer77 <", value, "answer77");
            return (Criteria) this;
        }

        public Criteria andAnswer77LessThanOrEqualTo(Integer value) {
            addCriterion("answer77 <=", value, "answer77");
            return (Criteria) this;
        }

        public Criteria andAnswer77In(List<Integer> values) {
            addCriterion("answer77 in", values, "answer77");
            return (Criteria) this;
        }

        public Criteria andAnswer77NotIn(List<Integer> values) {
            addCriterion("answer77 not in", values, "answer77");
            return (Criteria) this;
        }

        public Criteria andAnswer77Between(Integer value1, Integer value2) {
            addCriterion("answer77 between", value1, value2, "answer77");
            return (Criteria) this;
        }

        public Criteria andAnswer77NotBetween(Integer value1, Integer value2) {
            addCriterion("answer77 not between", value1, value2, "answer77");
            return (Criteria) this;
        }

        public Criteria andAnswer78IsNull() {
            addCriterion("answer78 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer78IsNotNull() {
            addCriterion("answer78 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer78EqualTo(Integer value) {
            addCriterion("answer78 =", value, "answer78");
            return (Criteria) this;
        }

        public Criteria andAnswer78NotEqualTo(Integer value) {
            addCriterion("answer78 <>", value, "answer78");
            return (Criteria) this;
        }

        public Criteria andAnswer78GreaterThan(Integer value) {
            addCriterion("answer78 >", value, "answer78");
            return (Criteria) this;
        }

        public Criteria andAnswer78GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer78 >=", value, "answer78");
            return (Criteria) this;
        }

        public Criteria andAnswer78LessThan(Integer value) {
            addCriterion("answer78 <", value, "answer78");
            return (Criteria) this;
        }

        public Criteria andAnswer78LessThanOrEqualTo(Integer value) {
            addCriterion("answer78 <=", value, "answer78");
            return (Criteria) this;
        }

        public Criteria andAnswer78In(List<Integer> values) {
            addCriterion("answer78 in", values, "answer78");
            return (Criteria) this;
        }

        public Criteria andAnswer78NotIn(List<Integer> values) {
            addCriterion("answer78 not in", values, "answer78");
            return (Criteria) this;
        }

        public Criteria andAnswer78Between(Integer value1, Integer value2) {
            addCriterion("answer78 between", value1, value2, "answer78");
            return (Criteria) this;
        }

        public Criteria andAnswer78NotBetween(Integer value1, Integer value2) {
            addCriterion("answer78 not between", value1, value2, "answer78");
            return (Criteria) this;
        }

        public Criteria andAnswer79IsNull() {
            addCriterion("answer79 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer79IsNotNull() {
            addCriterion("answer79 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer79EqualTo(Integer value) {
            addCriterion("answer79 =", value, "answer79");
            return (Criteria) this;
        }

        public Criteria andAnswer79NotEqualTo(Integer value) {
            addCriterion("answer79 <>", value, "answer79");
            return (Criteria) this;
        }

        public Criteria andAnswer79GreaterThan(Integer value) {
            addCriterion("answer79 >", value, "answer79");
            return (Criteria) this;
        }

        public Criteria andAnswer79GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer79 >=", value, "answer79");
            return (Criteria) this;
        }

        public Criteria andAnswer79LessThan(Integer value) {
            addCriterion("answer79 <", value, "answer79");
            return (Criteria) this;
        }

        public Criteria andAnswer79LessThanOrEqualTo(Integer value) {
            addCriterion("answer79 <=", value, "answer79");
            return (Criteria) this;
        }

        public Criteria andAnswer79In(List<Integer> values) {
            addCriterion("answer79 in", values, "answer79");
            return (Criteria) this;
        }

        public Criteria andAnswer79NotIn(List<Integer> values) {
            addCriterion("answer79 not in", values, "answer79");
            return (Criteria) this;
        }

        public Criteria andAnswer79Between(Integer value1, Integer value2) {
            addCriterion("answer79 between", value1, value2, "answer79");
            return (Criteria) this;
        }

        public Criteria andAnswer79NotBetween(Integer value1, Integer value2) {
            addCriterion("answer79 not between", value1, value2, "answer79");
            return (Criteria) this;
        }

        public Criteria andAnswer80IsNull() {
            addCriterion("answer80 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer80IsNotNull() {
            addCriterion("answer80 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer80EqualTo(Integer value) {
            addCriterion("answer80 =", value, "answer80");
            return (Criteria) this;
        }

        public Criteria andAnswer80NotEqualTo(Integer value) {
            addCriterion("answer80 <>", value, "answer80");
            return (Criteria) this;
        }

        public Criteria andAnswer80GreaterThan(Integer value) {
            addCriterion("answer80 >", value, "answer80");
            return (Criteria) this;
        }

        public Criteria andAnswer80GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer80 >=", value, "answer80");
            return (Criteria) this;
        }

        public Criteria andAnswer80LessThan(Integer value) {
            addCriterion("answer80 <", value, "answer80");
            return (Criteria) this;
        }

        public Criteria andAnswer80LessThanOrEqualTo(Integer value) {
            addCriterion("answer80 <=", value, "answer80");
            return (Criteria) this;
        }

        public Criteria andAnswer80In(List<Integer> values) {
            addCriterion("answer80 in", values, "answer80");
            return (Criteria) this;
        }

        public Criteria andAnswer80NotIn(List<Integer> values) {
            addCriterion("answer80 not in", values, "answer80");
            return (Criteria) this;
        }

        public Criteria andAnswer80Between(Integer value1, Integer value2) {
            addCriterion("answer80 between", value1, value2, "answer80");
            return (Criteria) this;
        }

        public Criteria andAnswer80NotBetween(Integer value1, Integer value2) {
            addCriterion("answer80 not between", value1, value2, "answer80");
            return (Criteria) this;
        }

        public Criteria andAnswer81IsNull() {
            addCriterion("answer81 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer81IsNotNull() {
            addCriterion("answer81 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer81EqualTo(Integer value) {
            addCriterion("answer81 =", value, "answer81");
            return (Criteria) this;
        }

        public Criteria andAnswer81NotEqualTo(Integer value) {
            addCriterion("answer81 <>", value, "answer81");
            return (Criteria) this;
        }

        public Criteria andAnswer81GreaterThan(Integer value) {
            addCriterion("answer81 >", value, "answer81");
            return (Criteria) this;
        }

        public Criteria andAnswer81GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer81 >=", value, "answer81");
            return (Criteria) this;
        }

        public Criteria andAnswer81LessThan(Integer value) {
            addCriterion("answer81 <", value, "answer81");
            return (Criteria) this;
        }

        public Criteria andAnswer81LessThanOrEqualTo(Integer value) {
            addCriterion("answer81 <=", value, "answer81");
            return (Criteria) this;
        }

        public Criteria andAnswer81In(List<Integer> values) {
            addCriterion("answer81 in", values, "answer81");
            return (Criteria) this;
        }

        public Criteria andAnswer81NotIn(List<Integer> values) {
            addCriterion("answer81 not in", values, "answer81");
            return (Criteria) this;
        }

        public Criteria andAnswer81Between(Integer value1, Integer value2) {
            addCriterion("answer81 between", value1, value2, "answer81");
            return (Criteria) this;
        }

        public Criteria andAnswer81NotBetween(Integer value1, Integer value2) {
            addCriterion("answer81 not between", value1, value2, "answer81");
            return (Criteria) this;
        }

        public Criteria andAnswer82IsNull() {
            addCriterion("answer82 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer82IsNotNull() {
            addCriterion("answer82 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer82EqualTo(Integer value) {
            addCriterion("answer82 =", value, "answer82");
            return (Criteria) this;
        }

        public Criteria andAnswer82NotEqualTo(Integer value) {
            addCriterion("answer82 <>", value, "answer82");
            return (Criteria) this;
        }

        public Criteria andAnswer82GreaterThan(Integer value) {
            addCriterion("answer82 >", value, "answer82");
            return (Criteria) this;
        }

        public Criteria andAnswer82GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer82 >=", value, "answer82");
            return (Criteria) this;
        }

        public Criteria andAnswer82LessThan(Integer value) {
            addCriterion("answer82 <", value, "answer82");
            return (Criteria) this;
        }

        public Criteria andAnswer82LessThanOrEqualTo(Integer value) {
            addCriterion("answer82 <=", value, "answer82");
            return (Criteria) this;
        }

        public Criteria andAnswer82In(List<Integer> values) {
            addCriterion("answer82 in", values, "answer82");
            return (Criteria) this;
        }

        public Criteria andAnswer82NotIn(List<Integer> values) {
            addCriterion("answer82 not in", values, "answer82");
            return (Criteria) this;
        }

        public Criteria andAnswer82Between(Integer value1, Integer value2) {
            addCriterion("answer82 between", value1, value2, "answer82");
            return (Criteria) this;
        }

        public Criteria andAnswer82NotBetween(Integer value1, Integer value2) {
            addCriterion("answer82 not between", value1, value2, "answer82");
            return (Criteria) this;
        }

        public Criteria andAnswer83IsNull() {
            addCriterion("answer83 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer83IsNotNull() {
            addCriterion("answer83 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer83EqualTo(Integer value) {
            addCriterion("answer83 =", value, "answer83");
            return (Criteria) this;
        }

        public Criteria andAnswer83NotEqualTo(Integer value) {
            addCriterion("answer83 <>", value, "answer83");
            return (Criteria) this;
        }

        public Criteria andAnswer83GreaterThan(Integer value) {
            addCriterion("answer83 >", value, "answer83");
            return (Criteria) this;
        }

        public Criteria andAnswer83GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer83 >=", value, "answer83");
            return (Criteria) this;
        }

        public Criteria andAnswer83LessThan(Integer value) {
            addCriterion("answer83 <", value, "answer83");
            return (Criteria) this;
        }

        public Criteria andAnswer83LessThanOrEqualTo(Integer value) {
            addCriterion("answer83 <=", value, "answer83");
            return (Criteria) this;
        }

        public Criteria andAnswer83In(List<Integer> values) {
            addCriterion("answer83 in", values, "answer83");
            return (Criteria) this;
        }

        public Criteria andAnswer83NotIn(List<Integer> values) {
            addCriterion("answer83 not in", values, "answer83");
            return (Criteria) this;
        }

        public Criteria andAnswer83Between(Integer value1, Integer value2) {
            addCriterion("answer83 between", value1, value2, "answer83");
            return (Criteria) this;
        }

        public Criteria andAnswer83NotBetween(Integer value1, Integer value2) {
            addCriterion("answer83 not between", value1, value2, "answer83");
            return (Criteria) this;
        }

        public Criteria andAnswer84IsNull() {
            addCriterion("answer84 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer84IsNotNull() {
            addCriterion("answer84 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer84EqualTo(Integer value) {
            addCriterion("answer84 =", value, "answer84");
            return (Criteria) this;
        }

        public Criteria andAnswer84NotEqualTo(Integer value) {
            addCriterion("answer84 <>", value, "answer84");
            return (Criteria) this;
        }

        public Criteria andAnswer84GreaterThan(Integer value) {
            addCriterion("answer84 >", value, "answer84");
            return (Criteria) this;
        }

        public Criteria andAnswer84GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer84 >=", value, "answer84");
            return (Criteria) this;
        }

        public Criteria andAnswer84LessThan(Integer value) {
            addCriterion("answer84 <", value, "answer84");
            return (Criteria) this;
        }

        public Criteria andAnswer84LessThanOrEqualTo(Integer value) {
            addCriterion("answer84 <=", value, "answer84");
            return (Criteria) this;
        }

        public Criteria andAnswer84In(List<Integer> values) {
            addCriterion("answer84 in", values, "answer84");
            return (Criteria) this;
        }

        public Criteria andAnswer84NotIn(List<Integer> values) {
            addCriterion("answer84 not in", values, "answer84");
            return (Criteria) this;
        }

        public Criteria andAnswer84Between(Integer value1, Integer value2) {
            addCriterion("answer84 between", value1, value2, "answer84");
            return (Criteria) this;
        }

        public Criteria andAnswer84NotBetween(Integer value1, Integer value2) {
            addCriterion("answer84 not between", value1, value2, "answer84");
            return (Criteria) this;
        }

        public Criteria andAnswer85IsNull() {
            addCriterion("answer85 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer85IsNotNull() {
            addCriterion("answer85 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer85EqualTo(Integer value) {
            addCriterion("answer85 =", value, "answer85");
            return (Criteria) this;
        }

        public Criteria andAnswer85NotEqualTo(Integer value) {
            addCriterion("answer85 <>", value, "answer85");
            return (Criteria) this;
        }

        public Criteria andAnswer85GreaterThan(Integer value) {
            addCriterion("answer85 >", value, "answer85");
            return (Criteria) this;
        }

        public Criteria andAnswer85GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer85 >=", value, "answer85");
            return (Criteria) this;
        }

        public Criteria andAnswer85LessThan(Integer value) {
            addCriterion("answer85 <", value, "answer85");
            return (Criteria) this;
        }

        public Criteria andAnswer85LessThanOrEqualTo(Integer value) {
            addCriterion("answer85 <=", value, "answer85");
            return (Criteria) this;
        }

        public Criteria andAnswer85In(List<Integer> values) {
            addCriterion("answer85 in", values, "answer85");
            return (Criteria) this;
        }

        public Criteria andAnswer85NotIn(List<Integer> values) {
            addCriterion("answer85 not in", values, "answer85");
            return (Criteria) this;
        }

        public Criteria andAnswer85Between(Integer value1, Integer value2) {
            addCriterion("answer85 between", value1, value2, "answer85");
            return (Criteria) this;
        }

        public Criteria andAnswer85NotBetween(Integer value1, Integer value2) {
            addCriterion("answer85 not between", value1, value2, "answer85");
            return (Criteria) this;
        }

        public Criteria andAnswer86IsNull() {
            addCriterion("answer86 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer86IsNotNull() {
            addCriterion("answer86 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer86EqualTo(Integer value) {
            addCriterion("answer86 =", value, "answer86");
            return (Criteria) this;
        }

        public Criteria andAnswer86NotEqualTo(Integer value) {
            addCriterion("answer86 <>", value, "answer86");
            return (Criteria) this;
        }

        public Criteria andAnswer86GreaterThan(Integer value) {
            addCriterion("answer86 >", value, "answer86");
            return (Criteria) this;
        }

        public Criteria andAnswer86GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer86 >=", value, "answer86");
            return (Criteria) this;
        }

        public Criteria andAnswer86LessThan(Integer value) {
            addCriterion("answer86 <", value, "answer86");
            return (Criteria) this;
        }

        public Criteria andAnswer86LessThanOrEqualTo(Integer value) {
            addCriterion("answer86 <=", value, "answer86");
            return (Criteria) this;
        }

        public Criteria andAnswer86In(List<Integer> values) {
            addCriterion("answer86 in", values, "answer86");
            return (Criteria) this;
        }

        public Criteria andAnswer86NotIn(List<Integer> values) {
            addCriterion("answer86 not in", values, "answer86");
            return (Criteria) this;
        }

        public Criteria andAnswer86Between(Integer value1, Integer value2) {
            addCriterion("answer86 between", value1, value2, "answer86");
            return (Criteria) this;
        }

        public Criteria andAnswer86NotBetween(Integer value1, Integer value2) {
            addCriterion("answer86 not between", value1, value2, "answer86");
            return (Criteria) this;
        }

        public Criteria andAnswer87IsNull() {
            addCriterion("answer87 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer87IsNotNull() {
            addCriterion("answer87 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer87EqualTo(Integer value) {
            addCriterion("answer87 =", value, "answer87");
            return (Criteria) this;
        }

        public Criteria andAnswer87NotEqualTo(Integer value) {
            addCriterion("answer87 <>", value, "answer87");
            return (Criteria) this;
        }

        public Criteria andAnswer87GreaterThan(Integer value) {
            addCriterion("answer87 >", value, "answer87");
            return (Criteria) this;
        }

        public Criteria andAnswer87GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer87 >=", value, "answer87");
            return (Criteria) this;
        }

        public Criteria andAnswer87LessThan(Integer value) {
            addCriterion("answer87 <", value, "answer87");
            return (Criteria) this;
        }

        public Criteria andAnswer87LessThanOrEqualTo(Integer value) {
            addCriterion("answer87 <=", value, "answer87");
            return (Criteria) this;
        }

        public Criteria andAnswer87In(List<Integer> values) {
            addCriterion("answer87 in", values, "answer87");
            return (Criteria) this;
        }

        public Criteria andAnswer87NotIn(List<Integer> values) {
            addCriterion("answer87 not in", values, "answer87");
            return (Criteria) this;
        }

        public Criteria andAnswer87Between(Integer value1, Integer value2) {
            addCriterion("answer87 between", value1, value2, "answer87");
            return (Criteria) this;
        }

        public Criteria andAnswer87NotBetween(Integer value1, Integer value2) {
            addCriterion("answer87 not between", value1, value2, "answer87");
            return (Criteria) this;
        }

        public Criteria andAnswer88IsNull() {
            addCriterion("answer88 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer88IsNotNull() {
            addCriterion("answer88 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer88EqualTo(Integer value) {
            addCriterion("answer88 =", value, "answer88");
            return (Criteria) this;
        }

        public Criteria andAnswer88NotEqualTo(Integer value) {
            addCriterion("answer88 <>", value, "answer88");
            return (Criteria) this;
        }

        public Criteria andAnswer88GreaterThan(Integer value) {
            addCriterion("answer88 >", value, "answer88");
            return (Criteria) this;
        }

        public Criteria andAnswer88GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer88 >=", value, "answer88");
            return (Criteria) this;
        }

        public Criteria andAnswer88LessThan(Integer value) {
            addCriterion("answer88 <", value, "answer88");
            return (Criteria) this;
        }

        public Criteria andAnswer88LessThanOrEqualTo(Integer value) {
            addCriterion("answer88 <=", value, "answer88");
            return (Criteria) this;
        }

        public Criteria andAnswer88In(List<Integer> values) {
            addCriterion("answer88 in", values, "answer88");
            return (Criteria) this;
        }

        public Criteria andAnswer88NotIn(List<Integer> values) {
            addCriterion("answer88 not in", values, "answer88");
            return (Criteria) this;
        }

        public Criteria andAnswer88Between(Integer value1, Integer value2) {
            addCriterion("answer88 between", value1, value2, "answer88");
            return (Criteria) this;
        }

        public Criteria andAnswer88NotBetween(Integer value1, Integer value2) {
            addCriterion("answer88 not between", value1, value2, "answer88");
            return (Criteria) this;
        }

        public Criteria andAnswer89IsNull() {
            addCriterion("answer89 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer89IsNotNull() {
            addCriterion("answer89 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer89EqualTo(Integer value) {
            addCriterion("answer89 =", value, "answer89");
            return (Criteria) this;
        }

        public Criteria andAnswer89NotEqualTo(Integer value) {
            addCriterion("answer89 <>", value, "answer89");
            return (Criteria) this;
        }

        public Criteria andAnswer89GreaterThan(Integer value) {
            addCriterion("answer89 >", value, "answer89");
            return (Criteria) this;
        }

        public Criteria andAnswer89GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer89 >=", value, "answer89");
            return (Criteria) this;
        }

        public Criteria andAnswer89LessThan(Integer value) {
            addCriterion("answer89 <", value, "answer89");
            return (Criteria) this;
        }

        public Criteria andAnswer89LessThanOrEqualTo(Integer value) {
            addCriterion("answer89 <=", value, "answer89");
            return (Criteria) this;
        }

        public Criteria andAnswer89In(List<Integer> values) {
            addCriterion("answer89 in", values, "answer89");
            return (Criteria) this;
        }

        public Criteria andAnswer89NotIn(List<Integer> values) {
            addCriterion("answer89 not in", values, "answer89");
            return (Criteria) this;
        }

        public Criteria andAnswer89Between(Integer value1, Integer value2) {
            addCriterion("answer89 between", value1, value2, "answer89");
            return (Criteria) this;
        }

        public Criteria andAnswer89NotBetween(Integer value1, Integer value2) {
            addCriterion("answer89 not between", value1, value2, "answer89");
            return (Criteria) this;
        }

        public Criteria andAnswer90IsNull() {
            addCriterion("answer90 is null");
            return (Criteria) this;
        }

        public Criteria andAnswer90IsNotNull() {
            addCriterion("answer90 is not null");
            return (Criteria) this;
        }

        public Criteria andAnswer90EqualTo(Integer value) {
            addCriterion("answer90 =", value, "answer90");
            return (Criteria) this;
        }

        public Criteria andAnswer90NotEqualTo(Integer value) {
            addCriterion("answer90 <>", value, "answer90");
            return (Criteria) this;
        }

        public Criteria andAnswer90GreaterThan(Integer value) {
            addCriterion("answer90 >", value, "answer90");
            return (Criteria) this;
        }

        public Criteria andAnswer90GreaterThanOrEqualTo(Integer value) {
            addCriterion("answer90 >=", value, "answer90");
            return (Criteria) this;
        }

        public Criteria andAnswer90LessThan(Integer value) {
            addCriterion("answer90 <", value, "answer90");
            return (Criteria) this;
        }

        public Criteria andAnswer90LessThanOrEqualTo(Integer value) {
            addCriterion("answer90 <=", value, "answer90");
            return (Criteria) this;
        }

        public Criteria andAnswer90In(List<Integer> values) {
            addCriterion("answer90 in", values, "answer90");
            return (Criteria) this;
        }

        public Criteria andAnswer90NotIn(List<Integer> values) {
            addCriterion("answer90 not in", values, "answer90");
            return (Criteria) this;
        }

        public Criteria andAnswer90Between(Integer value1, Integer value2) {
            addCriterion("answer90 between", value1, value2, "answer90");
            return (Criteria) this;
        }

        public Criteria andAnswer90NotBetween(Integer value1, Integer value2) {
            addCriterion("answer90 not between", value1, value2, "answer90");
            return (Criteria) this;
        }

        public Criteria andSumscoreIsNull() {
            addCriterion("sumscore is null");
            return (Criteria) this;
        }

        public Criteria andSumscoreIsNotNull() {
            addCriterion("sumscore is not null");
            return (Criteria) this;
        }

        public Criteria andSumscoreEqualTo(Integer value) {
            addCriterion("sumscore =", value, "sumscore");
            return (Criteria) this;
        }

        public Criteria andSumscoreNotEqualTo(Integer value) {
            addCriterion("sumscore <>", value, "sumscore");
            return (Criteria) this;
        }

        public Criteria andSumscoreGreaterThan(Integer value) {
            addCriterion("sumscore >", value, "sumscore");
            return (Criteria) this;
        }

        public Criteria andSumscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("sumscore >=", value, "sumscore");
            return (Criteria) this;
        }

        public Criteria andSumscoreLessThan(Integer value) {
            addCriterion("sumscore <", value, "sumscore");
            return (Criteria) this;
        }

        public Criteria andSumscoreLessThanOrEqualTo(Integer value) {
            addCriterion("sumscore <=", value, "sumscore");
            return (Criteria) this;
        }

        public Criteria andSumscoreIn(List<Integer> values) {
            addCriterion("sumscore in", values, "sumscore");
            return (Criteria) this;
        }

        public Criteria andSumscoreNotIn(List<Integer> values) {
            addCriterion("sumscore not in", values, "sumscore");
            return (Criteria) this;
        }

        public Criteria andSumscoreBetween(Integer value1, Integer value2) {
            addCriterion("sumscore between", value1, value2, "sumscore");
            return (Criteria) this;
        }

        public Criteria andSumscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("sumscore not between", value1, value2, "sumscore");
            return (Criteria) this;
        }

        public Criteria andAverageIsNull() {
            addCriterion("average is null");
            return (Criteria) this;
        }

        public Criteria andAverageIsNotNull() {
            addCriterion("average is not null");
            return (Criteria) this;
        }

        public Criteria andAverageEqualTo(Float value) {
            addCriterion("average =", value, "average");
            return (Criteria) this;
        }

        public Criteria andAverageNotEqualTo(Float value) {
            addCriterion("average <>", value, "average");
            return (Criteria) this;
        }

        public Criteria andAverageGreaterThan(Float value) {
            addCriterion("average >", value, "average");
            return (Criteria) this;
        }

        public Criteria andAverageGreaterThanOrEqualTo(Float value) {
            addCriterion("average >=", value, "average");
            return (Criteria) this;
        }

        public Criteria andAverageLessThan(Float value) {
            addCriterion("average <", value, "average");
            return (Criteria) this;
        }

        public Criteria andAverageLessThanOrEqualTo(Float value) {
            addCriterion("average <=", value, "average");
            return (Criteria) this;
        }

        public Criteria andAverageIn(List<Float> values) {
            addCriterion("average in", values, "average");
            return (Criteria) this;
        }

        public Criteria andAverageNotIn(List<Float> values) {
            addCriterion("average not in", values, "average");
            return (Criteria) this;
        }

        public Criteria andAverageBetween(Float value1, Float value2) {
            addCriterion("average between", value1, value2, "average");
            return (Criteria) this;
        }

        public Criteria andAverageNotBetween(Float value1, Float value2) {
            addCriterion("average not between", value1, value2, "average");
            return (Criteria) this;
        }

        public Criteria andPosSymptomIsNull() {
            addCriterion("pos_symptom is null");
            return (Criteria) this;
        }

        public Criteria andPosSymptomIsNotNull() {
            addCriterion("pos_symptom is not null");
            return (Criteria) this;
        }

        public Criteria andPosSymptomEqualTo(Integer value) {
            addCriterion("pos_symptom =", value, "posSymptom");
            return (Criteria) this;
        }

        public Criteria andPosSymptomNotEqualTo(Integer value) {
            addCriterion("pos_symptom <>", value, "posSymptom");
            return (Criteria) this;
        }

        public Criteria andPosSymptomGreaterThan(Integer value) {
            addCriterion("pos_symptom >", value, "posSymptom");
            return (Criteria) this;
        }

        public Criteria andPosSymptomGreaterThanOrEqualTo(Integer value) {
            addCriterion("pos_symptom >=", value, "posSymptom");
            return (Criteria) this;
        }

        public Criteria andPosSymptomLessThan(Integer value) {
            addCriterion("pos_symptom <", value, "posSymptom");
            return (Criteria) this;
        }

        public Criteria andPosSymptomLessThanOrEqualTo(Integer value) {
            addCriterion("pos_symptom <=", value, "posSymptom");
            return (Criteria) this;
        }

        public Criteria andPosSymptomIn(List<Integer> values) {
            addCriterion("pos_symptom in", values, "posSymptom");
            return (Criteria) this;
        }

        public Criteria andPosSymptomNotIn(List<Integer> values) {
            addCriterion("pos_symptom not in", values, "posSymptom");
            return (Criteria) this;
        }

        public Criteria andPosSymptomBetween(Integer value1, Integer value2) {
            addCriterion("pos_symptom between", value1, value2, "posSymptom");
            return (Criteria) this;
        }

        public Criteria andPosSymptomNotBetween(Integer value1, Integer value2) {
            addCriterion("pos_symptom not between", value1, value2, "posSymptom");
            return (Criteria) this;
        }

        public Criteria andNegSymptomIsNull() {
            addCriterion("neg_symptom is null");
            return (Criteria) this;
        }

        public Criteria andNegSymptomIsNotNull() {
            addCriterion("neg_symptom is not null");
            return (Criteria) this;
        }

        public Criteria andNegSymptomEqualTo(Integer value) {
            addCriterion("neg_symptom =", value, "negSymptom");
            return (Criteria) this;
        }

        public Criteria andNegSymptomNotEqualTo(Integer value) {
            addCriterion("neg_symptom <>", value, "negSymptom");
            return (Criteria) this;
        }

        public Criteria andNegSymptomGreaterThan(Integer value) {
            addCriterion("neg_symptom >", value, "negSymptom");
            return (Criteria) this;
        }

        public Criteria andNegSymptomGreaterThanOrEqualTo(Integer value) {
            addCriterion("neg_symptom >=", value, "negSymptom");
            return (Criteria) this;
        }

        public Criteria andNegSymptomLessThan(Integer value) {
            addCriterion("neg_symptom <", value, "negSymptom");
            return (Criteria) this;
        }

        public Criteria andNegSymptomLessThanOrEqualTo(Integer value) {
            addCriterion("neg_symptom <=", value, "negSymptom");
            return (Criteria) this;
        }

        public Criteria andNegSymptomIn(List<Integer> values) {
            addCriterion("neg_symptom in", values, "negSymptom");
            return (Criteria) this;
        }

        public Criteria andNegSymptomNotIn(List<Integer> values) {
            addCriterion("neg_symptom not in", values, "negSymptom");
            return (Criteria) this;
        }

        public Criteria andNegSymptomBetween(Integer value1, Integer value2) {
            addCriterion("neg_symptom between", value1, value2, "negSymptom");
            return (Criteria) this;
        }

        public Criteria andNegSymptomNotBetween(Integer value1, Integer value2) {
            addCriterion("neg_symptom not between", value1, value2, "negSymptom");
            return (Criteria) this;
        }

        public Criteria andPosSymptomAvgIsNull() {
            addCriterion("pos_symptom_avg is null");
            return (Criteria) this;
        }

        public Criteria andPosSymptomAvgIsNotNull() {
            addCriterion("pos_symptom_avg is not null");
            return (Criteria) this;
        }

        public Criteria andPosSymptomAvgEqualTo(Float value) {
            addCriterion("pos_symptom_avg =", value, "posSymptomAvg");
            return (Criteria) this;
        }

        public Criteria andPosSymptomAvgNotEqualTo(Float value) {
            addCriterion("pos_symptom_avg <>", value, "posSymptomAvg");
            return (Criteria) this;
        }

        public Criteria andPosSymptomAvgGreaterThan(Float value) {
            addCriterion("pos_symptom_avg >", value, "posSymptomAvg");
            return (Criteria) this;
        }

        public Criteria andPosSymptomAvgGreaterThanOrEqualTo(Float value) {
            addCriterion("pos_symptom_avg >=", value, "posSymptomAvg");
            return (Criteria) this;
        }

        public Criteria andPosSymptomAvgLessThan(Float value) {
            addCriterion("pos_symptom_avg <", value, "posSymptomAvg");
            return (Criteria) this;
        }

        public Criteria andPosSymptomAvgLessThanOrEqualTo(Float value) {
            addCriterion("pos_symptom_avg <=", value, "posSymptomAvg");
            return (Criteria) this;
        }

        public Criteria andPosSymptomAvgIn(List<Float> values) {
            addCriterion("pos_symptom_avg in", values, "posSymptomAvg");
            return (Criteria) this;
        }

        public Criteria andPosSymptomAvgNotIn(List<Float> values) {
            addCriterion("pos_symptom_avg not in", values, "posSymptomAvg");
            return (Criteria) this;
        }

        public Criteria andPosSymptomAvgBetween(Float value1, Float value2) {
            addCriterion("pos_symptom_avg between", value1, value2, "posSymptomAvg");
            return (Criteria) this;
        }

        public Criteria andPosSymptomAvgNotBetween(Float value1, Float value2) {
            addCriterion("pos_symptom_avg not between", value1, value2, "posSymptomAvg");
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