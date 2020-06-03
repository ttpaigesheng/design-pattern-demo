package com.abupdate.design.singleton;

/**
 * @program: design-pattern-demo
 * @className：Singleton3
 * @description: 饿汉式-静态内部类
 * @author:sheng.ge
 * @create: 2020-06-03 16:14
 **/
public class Singleton3 {

    private Singleton3(){

    }

    private final static Singleton3 INSTANCE;

    static {
        INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return INSTANCE;
    }
}
