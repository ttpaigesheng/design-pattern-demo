package com.abupdate.design.singleton;

/**
 * @program: design-pattern-demo
 * @className：Singleton1
 * @description: 饿汉斯
 * @author:sheng.ge
 * @create: 2020-06-03 16:06
 **/
public class Singleton1 {

    private Singleton1(){

    }
    private final  static Singleton1 INSTANCE = new Singleton1();

    public static Singleton1 getInstance(){
        return INSTANCE;
    }

}
