package com.abupdate.design.singleton;

/**
 * @program: design-pattern-demo
 * @className：Singleton4
 * @description:静态内部类
 * @author:sheng.ge
 * @create: 2020-06-03 16:18
 **/
public class Singleton4 {

    private Singleton4(){

    }
    private static class  SingletonInstance{
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    public static synchronized Singleton4 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
