package com.lv1.cc;

import java.util.concurrent.CountDownLatch;

/**
 * @author lvhao
 * @date 2019-11-14
 * @description
 **/
public class Foo {

    private CountDownLatch second = new CountDownLatch(1);

    private CountDownLatch third = new CountDownLatch(1);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
//        Thread thread = new Thread(printFirst);
//        thread.start();
        printFirst.run();
        second.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        second.await();
        printSecond.run();
        third.countDown();

    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        third.await();
        printThird.run();
    }


}
