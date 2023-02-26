package com.technext.app.springbootfirstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping("/student")
@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent() {
        return new Student("Giancarlo", "Garcia Deleon");
    }
}
