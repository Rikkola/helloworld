package org.test1;


import org.slf4j.Logger;

/**
 * Created by rikkola on 3/19/14.
 */
public class A {

    Logger logger;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer sum(int x, int y) {
        return x + y;
    }
}
