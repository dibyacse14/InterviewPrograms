package com.thread.programs.normalThread;

import java.util.concurrent.locks.ReentrantLock;

public class Greetings {
    public  void wish(String name) throws InterruptedException {
//        synchronized (this) {
            ReentrantLock l = new ReentrantLock();
            l.lock();
            for (int i = 0; i < 10; i++) {

                System.out.print("Good morning :");
                Thread.sleep(2000);
                System.out.println(name);

            }
            l.unlock();
//        }
    }
}
