package com.miniudemy.controller;

import com.miniudemy.model.Course;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/courses")
@CrossOrigin(origins = "http://localhost:3000")
public class CourseController {
    private List<Course> courses = new ArrayList<>(Arrays.asList(
        new Course(1L, "Java Basics", "Aman Pal", 399.0),
        new Course(2L, "Spring Boot Masterclass", "John Doe", 599.0),
        new Course(3L, "React for Beginners", "Jane Smith", 299.0)
    ));

    @GetMapping
    public List<Course> getCourses() {
        return courses;
    }

    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        courses.add(course);
        return course;
    }
}
