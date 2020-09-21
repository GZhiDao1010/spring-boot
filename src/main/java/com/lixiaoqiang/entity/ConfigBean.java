package com.lixiaoqiang.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.stereotype.Component;

//@Component
@PropertySource(value= "classpath:application-test.yml")
@ConfigurationProperties(prefix = "book")
public class ConfigBean {
    private String name;
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
