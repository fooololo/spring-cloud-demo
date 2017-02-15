package com.huluohu.cloud.gateway.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigClientAppRunner {
  public static void main(String[] args) {
    SpringApplication.run(ConfigClientAppRunner.class, args);
  }
}
