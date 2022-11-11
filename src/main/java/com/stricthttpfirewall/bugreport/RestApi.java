package com.stricthttpfirewall.bugreport;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

    @GetMapping("/headers")
    public String headers(@RequestHeader Map<String, String> allHeaders) {
        allHeaders.forEach((key, value) -> System.out.println("key=" + key + ", value=" + value));
        return "ok";
    }
}
