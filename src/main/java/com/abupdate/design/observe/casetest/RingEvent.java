package com.abupdate.design.observe.casetest;

/**
 * 铃声事件类：用于封装事件源及一些与事件相关的参数
 * @Author: sheng ge
 * @Date: 2019/12/4 16:31
 */
public class RingEvent {

    private boolean sound;    //true表示上课铃声,false表示下课铃声

    public RingEvent(boolean sound) {
        this.sound = sound;
    }

    public boolean getSound() {
        return sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }
}
