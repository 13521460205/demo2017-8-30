package com.example.demo.domain;

import java.io.Serializable;

/**
 * Created by huangmao on 2017/8/30.
 */
public class User implements Serializable {
     private long id;
     private String name;
     private int age;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
