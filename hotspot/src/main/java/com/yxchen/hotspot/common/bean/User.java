package com.yxchen.hotspot.common.bean;

import java.util.Date;

/**
 * user bean
 */
public class User {
    private int id;
    private String username;
    private int age;
    private Date ctm;

    public User() {
    }

    public User(String username, int age) {
        this.username = username;
        this.age = age;
        this.ctm = new Date();
    }
}
