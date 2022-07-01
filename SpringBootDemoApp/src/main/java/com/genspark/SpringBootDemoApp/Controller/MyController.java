package com.genspark.SpringBootDemoApp.Controller;

import com.genspark.SpringBootDemoApp.Entity.Course;
import com.genspark.SpringBootDemoApp.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String home()
    {
        return "<HTML><H1>Welcome to Course Application</H1></HTML>";
    }

    @GetMapping("/courses")
    public List<Course> getCourses()
    {
        return this.courseService.getAllCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return this.courseService.getCourseById(Integer.parseInt(courseId));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public String deleteCourse(@PathVariable String courseId) {
        return this.courseService.deleteCourseById(Integer.parseInt(courseId));
    }

}
