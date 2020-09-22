package com.lixiaoqiang;

import com.lixiaoqiang.entity.BookConfigBean;
import com.lixiaoqiang.entity.ConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableConfigurationProperties({BookConfigBean.class, ConfigBean.class})
@Controller
public class TestApplication {
    public static void main(String[] args){
        SpringApplication.run(TestApplication.class,args);
    }

    @GetMapping("/")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("msg", "文件上传下载");
        return "index";
    }
}
