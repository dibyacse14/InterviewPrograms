package com.thread.programs.normalThread;

public class MyThread extends Thread {
    Greetings g;
    String name;
    MyThread(Greetings g,String name){
        this.g = g;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            g.wish(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
