package com.yxchen.hotspot.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * application.yml文件中的test.user注入到User对象里，注意这里的prefix指定的是test.user，对应配置文件中的结构
 */
@Component
@ConfigurationProperties(prefix = "test.user")
public class UserTest {

    private String username;

    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
