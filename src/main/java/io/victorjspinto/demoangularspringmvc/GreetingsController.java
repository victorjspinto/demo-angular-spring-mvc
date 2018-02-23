package io.victorjspinto.demoangularspringmvc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Map<String, Object> seyHello() {
        Map<String, Object> result = new HashMap<>();
        result.put("greeting", "Hello world!");
        return result;
    }

}