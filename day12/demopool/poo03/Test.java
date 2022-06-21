package com.lanou.day12.demopool.poo03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new MyRunnable3());
        executorService.submit(new MyRunnable3());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executorService.submit(new MyRunnable3());
        executorService.submit(new MyRunnable3());

        executorService.shutdownNow();
    }

}
