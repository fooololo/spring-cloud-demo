package com.huluohu.cloud.gateway;

import com.netflix.zuul.FilterFileManager;
import com.netflix.zuul.FilterLoader;
import com.netflix.zuul.groovy.GroovyCompiler;
import com.netflix.zuul.groovy.GroovyFileFilter;
import com.netflix.zuul.monitoring.MonitoringHelper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Component;

import java.net.URL;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication implements CommandLineRunner{
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        MonitoringHelper.initMocks();
        FilterLoader.getInstance().setCompiler(new GroovyCompiler());
        try {
            FilterFileManager.setFilenameFilter(new GroovyFileFilter());

            String basePath = "E:/idea/spring-cloud-demo/gateway-zuul-filter-groovy/src/main/filters/";

            FilterFileManager.init(1, basePath + "pre", basePath + "post");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
