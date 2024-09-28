package com.niv.modify_sorting;

import java.util.*;

public class StudentDao {
    public static List<Student> getStudent(){
        List<Student> students=new ArrayList<>();
        students.add(new Student(4,"ajay",94,21));
        students.add(new Student(2,"mohak",92,22));
        students.add(new Student(1,"raj",97,21));
        students.add(new Student(3,"nitin",90,20));

        return students;
    }
    public static List<Map.Entry<Integer, Student>> getStu() {
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(204, new Student(4, "ajay", 94, 21));
        studentMap.put(206, new Student(2, "mohak", 92, 22));
        studentMap.put(205, new Student(1, "raj", 97, 21));
        studentMap.put(202, new Student(3, "nitin", 90, 20));

        List<Map.Entry<Integer, Student>> students = new ArrayList<>(studentMap.entrySet());
        Collections.sort(students, Comparator.comparingInt(o -> o.getValue().getId()));
    //this will sort on the basis of id

        return students;
    }
    public static void main(String[] args) {
        System.out.println( getStu());
    }
}
