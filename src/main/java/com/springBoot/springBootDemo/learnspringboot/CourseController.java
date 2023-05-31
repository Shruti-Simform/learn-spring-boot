package com.springBoot.springBootDemo.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    //courses
    //Courses: id,name,author
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course("1","Play with Java","C. Raman"),
                new Course("2","Learn Python","Jonas Nielsen"),
                new Course("3","Ruby on Rails","Jonas Nielsen"),
                new Course("4","C#","Jonas Nielsen")
        );
    }
}
