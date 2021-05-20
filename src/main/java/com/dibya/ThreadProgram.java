package com.dibya;

public class ThreadProgram extends Thread{
    public void run(){
        for(int i =0; i<6;i++)
            System.out.println("Hi"+ i+Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadProgram t1= new ThreadProgram();
        ThreadProgram t2= new ThreadProgram();

        t1.start();
        t2.start();

        t1.join();
        t1.sleep(2000);
    }
}
