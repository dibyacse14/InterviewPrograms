package com.dn.thread.executors;

import com.thread.programs.executors.ExecutorServiceRunner;
import com.thread.programs.wb.RequestTask;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.*;


public class ExecutorServiceRunnerTest {
    @Test
    public void whenUsingDefault_thenSingleThread(){
        ExecutorServiceRunner esr = new ExecutorServiceRunner();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        BlockingQueue<RequestTask> queue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,2,3,TimeUnit.MINUTES,new ArrayBlockingQueue<Runnable>(5));
        ThreadPoolExecutor executor1 = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
        CountDownLatch countDownLatch= new CountDownLatch(10);
        esr.startThreads(executor1,countDownLatch,10);
    }
}
