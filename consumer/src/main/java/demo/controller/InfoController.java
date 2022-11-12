package demo.controller;

import demo.service.InfoService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class InfoController {
    @Value("spring.application.name")
    private String serviceName;
    @Value("server.port")
    private String port;

    @Autowired
    InfoService infoService;

    @RequestMapping(path = "/info", method = RequestMethod.GET)
    public Map info() {
        HashMap<String, String> map = new HashMap<>();
        map.put("serviceName", serviceName);
        map.put("port", port);
        return map;
    }

    @RequestMapping(path = "/consumer", method = RequestMethod.GET)
    public String consumer() {
        //ResponseEntity<String> forEntity = restTemplate.getForEntity("http://SERVICE/info", String.class);
        //return forEntity.getBody();
        String s = infoService.info();
        return s;
    }
}
