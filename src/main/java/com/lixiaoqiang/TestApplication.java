package com.lixiaoqiang;

import com.lixiaoqiang.entity.BookConfigBean;
import com.lixiaoqiang.entity.ConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({BookConfigBean.class, ConfigBean.class})
public class TestApplication {
    public static void main(String[] args){
        SpringApplication.run(TestApplication.class,args);
    }
}
