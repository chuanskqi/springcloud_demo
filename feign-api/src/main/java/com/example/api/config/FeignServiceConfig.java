package com.example.api.config;

import feign.Logger;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration(value = "FeignServiceConfig")
@EnableFeignClients(basePackages = "com.example.api.service")
public class FeignServiceConfig {

    @Value("${feign.api.service.url}")
    private String url;

    @Bean
    public String testFeignServiceConfig() {
        System.err.println("**************** com.example.api FeignConfig init ****************");
        System.err.println("**************** "+ url +" ****************");
        return "com.example.api";
    }

    //@Bean
    //public RestTemplate feignServiceConfigRestTemplate() {
    //    OkHttpClient client = new OkHttpClient.Builder()
    //        .connectTimeout(5, TimeUnit.SECONDS)
    //        .readTimeout(30, TimeUnit.SECONDS)
    //        .writeTimeout(30, TimeUnit.SECONDS)
    //        .retryOnConnectionFailure(true)
    //        .build();
    //    RestTemplate restTemplate = new RestTemplate(new OkHttp3ClientHttpRequestFactory(client));
    //    return restTemplate;
    //}

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
