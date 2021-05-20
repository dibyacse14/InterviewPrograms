package com.dibya.linkedin;

public class NewC {
    public static void main(String[] args) {


        try{
            System.out.println("h=i");
            m1();
            System.out.println("h=i");
        }catch (Throwable e){
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }

    private static void m1() throws Exception {
        throw new Error();
//        throw new Throwable();
//        throw new Exception();
    }

}
interface I1 {
    default String getGreeting() {
        return "Good Morning!";
    }
}
interface I2 {
    default String getGreeting() {
        return "Good Night!";
    }
}
class C1 implements I1, I2 {

    public static void main(String[] args) {
    C1 c = new C1();
    c.getGreeting();
    }


    @Override
    public String getGreeting() {
        return null;
    }
}
