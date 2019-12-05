package com.abupdate.design.observe.casetest;

public class StuEventListener implements BellEvenListener {

    @Override
    public void headBell(RingEvent ringEvent) {
        if(ringEvent.getSound()){
            System.out.println("同学们，上课了...");
        }else{
            System.out.println("同学们，下课了...");
        }
    }
}