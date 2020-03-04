package com.yxchen.hotspot.web.controller;

import com.yxchen.hotspot.common.config.PropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 属性类的加载方式
 */
@RestController
public class TestPropertiesConfigController {
    
    @Autowired
    private PropertiesConfig propertiesConfig;//属性类

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(){
//		return propertiesConfig.getUsername() + ":" + propertiesConfig.getAge();
        return propertiesConfig.getToString();
    }
}
