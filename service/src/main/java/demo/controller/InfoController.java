package demo.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @Value("${spring.application.name}")
    private String serviceName;
    @Value("${server.port}")
    private String port;

    @GetMapping(path = "/info")
    public Map info() {
        HashMap<String, String> map = new HashMap<>();
        map.put("serviceName", serviceName);
        map.put("port", port);
        return map;
    }
}
