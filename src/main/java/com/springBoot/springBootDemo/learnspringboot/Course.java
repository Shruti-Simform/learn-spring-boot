package com.springBoot.springBootDemo.learnspringboot;

public class Course {
    private String id;
    private String courseName;
    private String author;

    public Course(String id, String courseName, String author) {
        this.id = id;
        this.courseName = courseName;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", courseName='" + courseName + '\'' +
                ", author='" + author;
    }
}
