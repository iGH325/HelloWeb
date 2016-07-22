package org.gradle;

import org.apache.commons.collections.list.GrowthList;
// add some comments here.  update nth  -a tag
public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
        new GrowthList();
    }

    public String getName() {
        return name;
    }
}
