package de.berlin.webtech.webtech.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HelloApiController {

    @GetMapping("/api/hello")
    public Map<String, String> sayHello() {
        return Map.of("message", "Hallo vom Backend!");
    }
}
