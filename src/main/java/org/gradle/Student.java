package org.gradle;

import org.apache.commons.collections.list.GrowthList;
//comments -a 
public class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
        new GrowthList();
        //test
    }

    public String getName() {
        return name;
    }
}
