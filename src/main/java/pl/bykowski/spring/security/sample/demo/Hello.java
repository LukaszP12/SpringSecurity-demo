package pl.bykowski.spring.security.sample.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello";
    }

    @GetMapping("/hello2")
    public String sayHello() {return "hello2"; }



}

