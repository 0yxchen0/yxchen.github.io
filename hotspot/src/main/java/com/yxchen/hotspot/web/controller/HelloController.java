package com.yxchen.hotspot.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * holle word
 * 开始框架学习
 */

/**
 * @RestController == @Controller + @ResponseBody
 */
@RestController
public class HelloController {

    @RequestMapping(value = "sayHello",method = RequestMethod.GET)
    public String getHello()
    {
        return "HelloSpringBoot！！！";
    }
}
