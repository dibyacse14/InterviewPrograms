package com.dibya;

import java.util.HashMap;
import java.util.Map;

class A {
void a() {
try{
int a = 10/0;
} catch (ArithmeticException e) {
}
}
}

class B extends A {
void b(){
try{
System.out.println("B");
} catch (Exception e) {
}
}

    public static void main(String[] args) {
        A a = new B();
//        System.out.println("a: "+a.a());

        Map<String, String> map = new HashMap<>();

        map.put("hi", "Test");
        map.put("Hi", "Test1");
        map.put("hI", "Name");
        System.out.println(map.size());
    }
}


