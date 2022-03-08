package com.structualPattern.filterPattern;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> people);
}
