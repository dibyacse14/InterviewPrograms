//package com.dibya.basicprograms;
//
//import java.math.BigDecimal;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//class Employee{
//   int id;
//   String name;
//   BigDecimal salary;
//   String designation;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public BigDecimal getSalary() {
//        return salary;
//    }
//
//    public void setSalary(BigDecimal salary) {
//        this.salary = salary;
//    }
//
//    public String getDesignation() {
//        return designation;
//    }
//
//    public void setDesignation(String designation) {
//        this.designation = designation;
//    }
//
//    public Employee(int id, String name, BigDecimal salary, String designation) {
//        this.id = id;
//        this.name = name;
//        this.salary = salary;
//        this.designation = designation;
//    }
//}
//public class TestEmp {
//
//    public static Map<String,BigDecimal> getAvareSalByDesignation(List<Employee> listOfEmployee){
//        return  listOfEmployee.stream().collect(Collectors.groupingBy(Employee::getDesignation,Collectors.)))
//    }
//
//}
