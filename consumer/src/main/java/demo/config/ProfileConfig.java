package demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProfileConfig {

    @Value("${spring.profiles.active}")
    private String prifle;

    @Bean
    public String p() {
        System.err.println("************"+prifle+"***********");
        return "";
    }
}
