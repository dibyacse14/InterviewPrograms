package com.thread.programs.executors;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorServiceRunner {
    public void startThreads(ThreadPoolExecutor executor, CountDownLatch countDownLatch,int noOfThread){
        for(int i = 0; i< noOfThread ; i++){
            executor.execute(() -> {
                try{
                    Thread.sleep(100L+ ThreadLocalRandom.current().nextLong(1,10));
                    countDownLatch.countDown();
                } catch (InterruptedException ie){
                    Thread.currentThread().interrupt();
                }
            });
        }
    }
    public static void main(String[] args) {
        
    }
}
