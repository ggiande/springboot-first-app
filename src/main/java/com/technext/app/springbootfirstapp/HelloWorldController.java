package com.technext.app.springbootfirstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld() {
        //http://localhost:8080/hello-world
        return "Hello World!";
    }
    //get
    //post
    //put
    //delete

}
