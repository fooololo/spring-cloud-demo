package com.huluohu.cloud.gateway.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Administrator on 2017/2/7.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerAppRunner {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerAppRunner.class,args);
    }
}
