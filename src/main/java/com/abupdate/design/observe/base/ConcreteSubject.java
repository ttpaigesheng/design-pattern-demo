package com.abupdate.design.observe.base;


/**
 * 具体的目标类
 * @Author: sheng ge
 * @Date: 2019/12/4 16:04
 */
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        System.out.println("具体目标对象发生改变...");
        System.out.println("--------------");
        //调用抽象观察者足够实现
        for(Object obs:observers){
            ((Observer)obs).response();
        }
    }
}
