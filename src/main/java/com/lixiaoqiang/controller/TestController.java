package com.lixiaoqiang.controller;

import com.lixiaoqiang.entity.BookConfigBean;
import com.lixiaoqiang.entity.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;


@RestController
public class TestController {

    @Autowired
    private BookConfigBean bookConfigBean;

    @Autowired
    private ConfigBean configBean;

    @Autowired
    private MessageSource messageSource;

    @Value("${book.value}")
    private String BookValue;

    @GetMapping("hello")
    public String hello(){
        return "hello spring boot>>>>>"+bookConfigBean.getName() + BookValue;
    }

    @GetMapping("hello-config")
    public ConfigBean  helloConfig(){
        return configBean;
    }

    @GetMapping("hello-i18n")
    public String helloI18n(){
        Locale locale = LocaleContextHolder.getLocale();
        return  messageSource.getMessage("message",null,locale);
    }
}
