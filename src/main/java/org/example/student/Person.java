package org.example.student;

import lombok.Getter;
import lombok.experimental.SuperBuilder;


@Getter
@SuperBuilder
public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;

}
