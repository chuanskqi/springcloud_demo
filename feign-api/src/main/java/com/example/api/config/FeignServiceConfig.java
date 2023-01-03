package com.example.api.config;

import feign.Logger;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(value = "FeignServiceConfig")
@EnableFeignClients(basePackages = "com.example.api.service")
public class FeignServiceConfig {

    @Bean
    public String testFeignServiceConfig() {
        System.err.println("**************** com.example.api FeignConfig init ****************");
        return "com.example.api";
    }

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
