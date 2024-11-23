package org.example.student;

import lombok.Getter;
import lombok.Singular;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
public class Student extends Person{

    private String email;

    @Singular
    private List<String> courses;


}
