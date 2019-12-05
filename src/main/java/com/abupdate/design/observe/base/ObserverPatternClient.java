package com.abupdate.design.observe.base;

/**
 * @Author: sheng ge
 * @Date: 2019/12/4 16:12
 */
public class ObserverPatternClient {
    public static void main(String[] args) {
        ConcreteObserver1 concreteObserver1 = new ConcreteObserver1();
        ConcreteObserver2 concreteObserver2 = new ConcreteObserver2();
        Subject concreteSubject = new ConcreteSubject();
        concreteSubject.add(concreteObserver1);
        concreteSubject.add(concreteObserver2);
        concreteSubject.notifyObserver();
    }

    /**
     * 观察者模式的主要角色如下。
     * 抽象主题（Subject）角色：也叫抽象目标类，它提供了一个用于保存观察者对象的聚集类和增加、删除观察者对象的方法，以及通知所有观察者的抽象方法。
     * 具体主题（ConcreteSubject）角色：也叫具体目标类，它实现抽象目标中的通知方法，当具体主题的内部状态发生改变时，通知所有注册过的观察者对象。
     * 抽象观察者（Observer）角色：它是一个抽象类或接口，它包含了一个更新自己的抽象方法，当接到具体主题的更改通知时被调用。
     * 具体观察者（Concrete Observer）角色：实现抽象观察者中定义的抽象方法，以便在得到目标的更改通知时更新自身的状态。
     */
}