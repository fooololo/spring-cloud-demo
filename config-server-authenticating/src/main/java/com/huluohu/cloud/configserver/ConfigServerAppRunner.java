package com.huluohu.cloud.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Administrator on 2017/2/9.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerAppRunner {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerAppRunner.class, args);
    }
}
