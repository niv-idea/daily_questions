package com.niv.modify_sorting;

import lombok.Data;

@Data
public class Student {
    private int id;
    private String name;
    private int marks;
    private int age;

    Student(int id, String name, int marks , int age){
        this.id=id;
        this.name=name;
        this.marks=marks;
        this.age=age;
    }

}
