package com.abupdate.design.observe.casetest;

/**
 * @Author: sheng ge
 * @Date: 2019/12/4 16:33
 */
public class TeachEventListener implements BellEvenListener {
    @Override
    public void headBell(RingEvent ringEvent) {
        if(ringEvent.getSound()){
            System.out.println("同学们，上课了...");
        }else{
            System.out.println("同学们，下课了...");
        }
    }
}
