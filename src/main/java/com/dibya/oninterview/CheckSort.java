package com.dibya.oninterview;

import java.util.ArrayList;
import java.util.List;

public class CheckSort {
    public static void main(String[] args) {
        List<Student> listOfStudent = new ArrayList<>();
        listOfStudent.add(new Student(1,"dibya",6757));
        listOfStudent.add(new Student(1,"dibya",6757));
        listOfStudent.add(new Student(3,"dibya",6757));
        listOfStudent.add(new Student(4,"dibya",6757));
        System.out.println(checkSorted(listOfStudent,listOfStudent.size()));
    }
    public static int checkSorted(List<Student> listOfStudent , int size){
        if(size ==1 || size ==0){
            return 1;
        }
        if(listOfStudent.get(listOfStudent.size()-1).getRollno() < listOfStudent.get(listOfStudent.size()-2).getRollno() ){
            return 0;
        }

        return  checkSorted(listOfStudent,size-1);
    }
}
