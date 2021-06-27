package com.thread.programs.normalThread;

public class ThreadRunner {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(new Greetings(),"dibya");
        MyThread t2 = new MyThread(new Greetings(),"ranjan");
        t1.start();
        t2.start();
    }
}
