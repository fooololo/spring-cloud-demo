package com.huluohu.cloud.gateway.discovery.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Administrator on 2017/2/9.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerAppRunner {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerAppRunner.class,args);
    }
}
