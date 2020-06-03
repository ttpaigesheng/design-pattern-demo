package com.abupdate.design.singleton;

/**
 * @program: design-pattern-demo
 * @className：Singleton2
 * @description:懒汉式
 * @author:sheng.ge
 * @create: 2020-06-03 16:09
 **/
public class Singleton2 {

    private Singleton2(){

    }

    private static Singleton2 INSTANCE = null;

    public static synchronized Singleton2 getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }

}
