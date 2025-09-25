package com.miniudemy.model;

public class Course {
    private Long id;
    private String title;
    private String instructor;
    private double price;

    public Course(Long id, String title, String instructor, double price) {
        this.id = id;
        this.title = title;
        this.instructor = instructor;
        this.price = price;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getInstructor() { return instructor; }
    public double getPrice() { return price; }
}
