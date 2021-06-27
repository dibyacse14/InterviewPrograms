package com.dibya;

import java.util.HashMap;
import java.util.Map;

class A {
int as() {
try{
return 12;
} catch (ArithmeticException e) {
}
finally {
    return 20;
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
        System.out.println(a.as());
        Map<String, String> map = new HashMap<>();

        map.put("hi", "Test");
        map.put("Hi", "Test1");
        map.put("hI", "Name");
        System.out.println(map.size());
    }
}


