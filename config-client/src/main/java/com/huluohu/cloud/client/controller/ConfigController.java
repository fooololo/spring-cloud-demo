package com.huluohu.cloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/2/9.
 */
@RestController
public class ConfigController {
    @Value("${profile}")
    private String profile;


    @GetMapping("/profile")
    public String hello(){
        return this.profile;
    }
}
