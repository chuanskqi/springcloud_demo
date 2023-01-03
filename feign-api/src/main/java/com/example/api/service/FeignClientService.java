package com.example.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "FeignClientService", url = "${feign.clent.service.url}")
public interface FeignClientService {

    @GetMapping("/feign/test")
    public String test();
}
