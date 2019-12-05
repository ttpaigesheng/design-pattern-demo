package com.abupdate.design.observe.base;

/**
 * 具体观察者1
 * @Author: sheng ge
 * @Date: 2019/12/4 16:09
 */
public class ConcreteObserver1 implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}
