package com.yxchen.hotspot.web.controller;

import com.yxchen.hotspot.common.UserTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通过自定义属性注入bean
 * 普通自定义属性，使用@Value("${xxx}")注入 2、注入对象，使用@ConfigurationProperties(prefix="test.user")
 */
@RestController
public class TestPropertiesBeanController {

    @Autowired
    private UserTest userTest;

    @RequestMapping(value = "test2",method = RequestMethod.GET)
    public String tset2() {
        return userTest.getUsername() + ":" + userTest.getAge();
    }
}
