package com.example.recyclerview;

public class student {
    private String name;
    private int age;
    private long rollNo;

    public student(String name, int age, long rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getRollNo() {
        return rollNo;
    }
}
