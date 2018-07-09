package com.tx.aop;

/**
 * Created by xxtang on 2018/6/28.
 */
public class Hello {
    public void sayHello(){
        System.out.println("hello");

    }

    public static void main(String[] args) {
        Hello hello=new Hello();
        hello.sayHello();
    }
}
