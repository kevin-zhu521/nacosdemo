package com.iflytek.nacosdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * --spring.application.name=nacosdemo --spring.cloud.nacos.config.server-addr=127.0.0.1:8848 --spring.cloud.nacos.config.shared-dataids=application.properties,${spring.application.name}.properties --spring.cloud.nacos.config.refreshable-dataids=${spring.cloud.nacos.config.shared-dataids} --spring.main.allow-bean-definition-overriding=true
 * 启动参数配置
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${user.key}")
    private String title;

    @GetMapping("/test")
    public String hello() {
        return title;
    }
}
