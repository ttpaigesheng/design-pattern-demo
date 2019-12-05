package com.abupdate.design.observe.base;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 抽象目标(抽象基类)
 * @Author: sheng ge
 * @Date: 2019/12/3 20:07
 */
abstract public class Subject {

    protected List<Observer> observers=new ArrayList<Observer>();

    /**
     * 增加观察者方法
     * @param observer
     */
    public void add(Observer observer){
        observers.add(observer);
    }

    /**
     * 删除观察者方法
     * @param observer
     */
    public void remove(Observer observer){
        observers.remove(observer);
    }

    /**
     * 通知观察者方法
     */
    public abstract void notifyObserver();
}
