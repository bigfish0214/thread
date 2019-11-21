package com.lv1.cc;

/**
 * @author lvhao
 * @date 2019-11-19
 * @description
 **/
public class MainString {
    public static void main(String[] args) {
        String a1 = "AA";
        String a2 = "AA";
        System.out.println(a1 == a2);
        Integer a = 3;
        Integer b = 3;
        System.out.println(a == b);
        System.out.println(a.equals(b));


        System.out.println("==========");

        String s1 = new String("CC") + new String("BB");
        System.out.println(s1 == s1.intern());

        String a3 = new String("D") + new String("D"); //创建对象AA
        System.out.println(a3 == a3.intern()); //false
    }
}
