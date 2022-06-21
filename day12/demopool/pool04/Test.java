package com.lanou.day12.demopool.pool04;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {
        //带有定时的线程池
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        scheduledExecutorService.schedule(new MyRunnable4(),1,TimeUnit.SECONDS);  //1秒延迟
        scheduledExecutorService.schedule(new MyRunnable4(),5,TimeUnit.SECONDS);  //5秒延迟

        scheduledExecutorService.shutdown();
    }
}
