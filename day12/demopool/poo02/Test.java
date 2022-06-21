package com.lanou.day12.demopool.poo02;

import com.lanou.day12.demopool.poo01.MyRunnable1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String[] args) {
        //单个线程池
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new MyRunnable1());
        executorService.submit(new MyRunnable1());
        executorService.submit(new MyRunnable1());

        executorService.shutdownNow();
    }
}
