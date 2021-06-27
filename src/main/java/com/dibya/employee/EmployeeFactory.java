package com.dibya.employee;

import java.util.Scanner;

abstract class Employee {
    abstract void setSalary(int salary);
    abstract int getSalary();
    abstract void setGrade(String grade);
    abstract String getGrade();
    void printLabel(){
        System.out.println("EMPLOYEES DATA:");
        System.out.println("GRADE: "+this.getGrade());
        System.out.println("SAL: "+this.getSalary());
    }

}

class Engineer extends Employee{

    private int salary;
    private String grade;
    @Override
    void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    int getSalary() {
        return this.salary;
    }

    @Override
    void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    String getGrade() {
        return this.grade;
    }
}

class Manager extends Employee{

    private int salary;
    private String grade;
    @Override
    void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    int getSalary() {
        return this.salary;
    }

    @Override
    void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    String getGrade() {
        return this.grade;
    }
}

public class EmployeeFactory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfEmployee = sc.nextInt();
        Employee emp ;
        String employeeDetails = sc.nextLine();
        while (noOfEmployee > 0){
             employeeDetails = sc.nextLine();
            String[] stringArr = employeeDetails.split(" ");
            if(stringArr[0].equals("ENGINEER")){
                emp = new Engineer();
                emp.setGrade(stringArr[1]);
                emp.setSalary(Integer.valueOf(stringArr[2]));
            } else {
                emp = new Manager();
                emp.setGrade(stringArr[1]);
                emp.setSalary(Integer.valueOf(stringArr[2]));
            }
            emp.printLabel();
        }
        
    }
}