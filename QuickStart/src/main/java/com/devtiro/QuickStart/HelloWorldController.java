package com.devtiro.QuickStart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // we need to tell the spring that it's an endpoint controller, so
    @GetMapping(path = "/hello")
    public String helloworld(){
        return "Hello Ramos!";
    }
}
