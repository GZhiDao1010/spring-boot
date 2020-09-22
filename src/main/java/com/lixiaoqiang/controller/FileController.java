package com.lixiaoqiang.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.*;

import java.io.IOException;

@RestController
public class FileController {


    private static final String filePath="/Users/lixiaoqiang/gutong/spring-boot/";
    private static final Logger log = LoggerFactory.getLogger(FileController.class);

    @RequestMapping(value = "/upload")
    public String upload(@RequestParam("file") MultipartFile file){
        try {
            if(file.isEmpty()){
                return  "文件为空";
            }
            String fileName = file.getOriginalFilename();
            log.info("文件名为："+fileName);
            // 设置文件存储路径
            String path = filePath+fileName;
            File dest =  new File(path);
            if(!dest.getParentFile().exists()){
                dest.getParentFile().mkdirs(); // 新建文件夹
            }
            file.transferTo(dest); // 文件写入
            return "上传成功";

        }catch (IllegalStateException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return "上传失败";
    }
}
