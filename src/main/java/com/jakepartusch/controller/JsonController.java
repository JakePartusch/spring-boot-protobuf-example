package com.jakepartusch.controller;

import com.jakepartusch.domain.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
    @RequestMapping("/json")
    public Person getPerson() {
        return new Person("Jake", "Partusch");
    }
}
