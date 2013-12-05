package com.thoughtworks.yafei;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class Teacher {
    @Required
    public void setId(int id) {
        this.id = id;
    }

    public void pringMsg() {
        System.out.println("The teacher's id is " + id);
    }
    private int id;
}
