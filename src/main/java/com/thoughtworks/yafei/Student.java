package com.thoughtworks.yafei;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;

@Scope("singleton")
public class Student {

    public void pringMsg() {
        System.out.println("the id of this student is " + id);
    }

    @Required
    public void setId(int id) {
        this.id = id;
    }

    private int id;
}
