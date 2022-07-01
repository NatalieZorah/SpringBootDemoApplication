package com.genspark.SpringBootDemoApp.Entity;

import javax.persistence.*;

@Entity
@Table
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int CourseId;
    private String Title;
    private String Instructor;

    public Course(){}

    public Course(String title, String instructor) {
        Title = title;
        Instructor = instructor;
    }

    public int getCourseId() {
        return CourseId;
    }

    public void setCourseId(int courseId) {
        CourseId = courseId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getInstructor() {
        return Instructor;
    }

    public void setInstructor(String instructor) {
        Instructor = instructor;
    }
}
