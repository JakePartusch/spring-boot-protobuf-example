package com.jakepartusch.controller;

import com.jakepartusch.domain.Person;
import com.jakepartusch.generated.domain.PersonProto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "person")
public class PersonController {

    @RequestMapping("json")
    public Person getPerson() {
        return new Person("Jake", "Partusch");
    }

    @RequestMapping(value = "protoBuf", produces = "application/x-protobuf")
    public PersonProto getPersonProto() {
        return  PersonProto
                .newBuilder()
                .setFirstName("Jake")
                .setLastName("Partusch")
                .build();
    }
}
