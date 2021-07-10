package com.thread.programs.wb;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ConcurrentServer {

  private static ThreadPoolExecutor executor;

  private static ParallelCache cache;


  private static volatile boolean stopped = false;

  public static void main(String[] args) {

//    serverSocket = null;
    WDIDAO dao = WDIDAO.getDAO();
    executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(Runtime.getRuntime()
                                                                        .availableProcessors());
    cache = new ParallelCache();
//    Logger.initializeLog();

    System.out.println("Initialization completed.");
  }
}