package myspring.domain;

import myspring.annotation.MyIoc;

@MyIoc
public class Student {
    public String play() {
        return "student" + this.toString();
    }
}
