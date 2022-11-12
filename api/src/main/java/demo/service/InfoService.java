package demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SERVICE")
public interface InfoService {

    @GetMapping("/info")
    String info();
}
