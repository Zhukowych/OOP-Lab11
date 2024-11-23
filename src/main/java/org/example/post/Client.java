package org.example.post;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Builder
@ToString
public class Client {

    private static AtomicInteger counter = new AtomicInteger();

    private int id = counter.incrementAndGet();
    private String name;
    private int age;
    private String sex;
    private String email;

}
