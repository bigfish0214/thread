package com.lv1.cc;

/**
 * @author lvhao
 * @date 2019-11-15
 * @description
 **/
public class PreviousThread implements Runnable{

    private Thread previousThread;

    public PreviousThread(Thread previousThread) {
        this.previousThread = previousThread;
    }

    public void run() {
        try {
            previousThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(previousThread.getName() + " terminate");
        System.out.println(Thread.currentThread().getName() + " terminate");
    }
}
