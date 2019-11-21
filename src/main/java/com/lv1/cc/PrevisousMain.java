package com.lv1.cc;

/**
 * @author lvhao
 * @date 2019-11-15
 * @description
 **/
public class PrevisousMain {

    public static void main(String[] args) {
        Thread previousThread = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new PreviousThread(previousThread), String.valueOf(i));
            thread.start();
            previousThread = thread;
        }
    }
}
