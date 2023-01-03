package demo.controller;

import com.example.api.service.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignClientController {

    @Value("${spring.application.name}")
    private String serviceName;
    @Value("${server.port}")
    private String port;

    @Autowired
    FeignClientService feignClientService;

    @GetMapping("/feign/test")
    public String test() {
        return serviceName + ":"+ port + ">>" + feignClientService.test();
    }
}
