package com.dibya.oninterview;

import java.util.Objects;

public class Student {
    int rollno;
    String name;
    int mark;

    public Student(int rollno, String name, int mark) {
        this.rollno = rollno;
        this.name = name;
        this.mark = mark;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno &&
                mark == student.mark &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno, name, mark);
    }
}
