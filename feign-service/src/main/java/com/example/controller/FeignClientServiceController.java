package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignClientServiceController {

    @GetMapping("/test")
    public String test() {
        return "feign 调用完成";
    }
}
