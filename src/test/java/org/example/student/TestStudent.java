package org.example.student;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class TestStudent {

    @Test
    public void testStudentBuilder() {
        Student student = Student.builder()
                                .firstName("Vasyl")
                                .lastName("Kharuk")
                                .age(20)
                                .email("kharuk@gmail.com")
                                .course("Math")
                                .course("Programming")
                                .build();
        List<String> expectedCourses = List.of("Math", "Programming");
        Assert.assertEquals("Vasyl", student.getFirstName());
        Assert.assertEquals("Kharuk", student.getLastName());
        Assert.assertEquals(20, student.getAge());
        Assert.assertEquals("kharuk@gmail.com", student.getEmail());
        Assert.assertEquals(expectedCourses, student.getCourses());
    }

}
