package com.afei.auto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * 文件上传
 * @author shihengfei
 */
@Controller
public class UploadController {

    @ResponseBody
    @RequestMapping("/upload")
    public String upload(@RequestPart("file") MultipartFile file) throws IOException {
        FileCopyUtils.copy(file.getBytes(),new File("/Users/shihengfei/Documents/workSpace/springboot2-principle/auto/src/main/resources/templates/aaa"));
        return "文件上传成功";
    }

    @ResponseBody
    @RequestMapping("/uploads")
    public String uploads(@RequestPart("files") MultipartFile[] files) throws IOException {
        System.out.println(files.length);
        return "文件上传成功";
    }
}
