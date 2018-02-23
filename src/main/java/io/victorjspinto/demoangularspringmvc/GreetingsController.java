package io.victorjspinto.demoangularspringmvc;

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
    public String seyHello() {
        return "Hello world!";
    }

}