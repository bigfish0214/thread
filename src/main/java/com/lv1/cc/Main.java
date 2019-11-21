package com.lv1.cc;

/**
 * @author lvhao
 * @date 2019-11-14
 * @description
 **/
public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();
        try {
            foo.first(new First());
            foo.second(new Second());
            foo.third(new Third());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
