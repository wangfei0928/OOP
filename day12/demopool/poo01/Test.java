package com.lanou.day12.demopool.poo01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        //JDK提供了四种线程池用来使用，固定线程池  不合适有缺陷。
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new MyRunnable1());
        executorService.submit(new MyRunnable1());
        executorService.submit(new MyRunnable1());
        executorService.submit(new MyRunnable1());

        executorService.shutdownNow();
    }

}
