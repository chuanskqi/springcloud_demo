package xyz.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(value = "xyz.service.FeignConfig")
@EnableFeignClients(basePackages = "xyz.service")
public class XyzFeignConfig {

    @Bean
    public String testXyzFeignConfig() {
        System.err.println("**************** FeignConfig init ****************");
        return "xyz.FeignConfig";
    }
}
