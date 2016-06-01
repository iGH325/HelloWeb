package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
        new GrowthList();
    }

    public String getName() {
        return name;
    }
}
