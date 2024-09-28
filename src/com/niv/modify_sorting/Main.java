package com.niv.modify_sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static List<Student> sortStudent(){
        //we will take that unsorted student list here
       List<Student> students= StudentDao.getStudent();
        students.sort((o1, o2) -> o2.getId() - o1.getId());

        return students;
    }
    public static void main(String[] args) {
        System.out.println(sortStudent());
    }
}




