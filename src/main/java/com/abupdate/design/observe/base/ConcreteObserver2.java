package com.abupdate.design.observe.base;

//具体观察者1
public class ConcreteObserver2 implements Observer{
    @Override
    public void response(){
        System.out.println("具体观察者2作出反应！");
    }
}