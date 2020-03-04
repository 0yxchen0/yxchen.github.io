package com.yxchen.hotspot.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * （把普通pojo实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>）
 * 泛指各种组件，就是说当我们的类不属于各种归类的时候（不属于@Controller、@Services等的时候），我们就可以使用@Component来标注这个类。
 */
@Component
public class PropertiesConfig {

    @Value("${test.user.username}")
    private String username;

    @Value("${test.user.age}")
    private String age;

    @Value("${test.user.toString}")
    private String toString;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getToString() {
        return toString;
    }

    public void setToString(String toString) {
        this.toString = toString;
    }


}
