package com.abupdate.design.proxy.threads.communication;

/**
 * wait()
 * wait(long timeout)
 * wait(long timeout, int nanos)
 * notify()
 * notifyAll(
 * @Author: sheng ge
 * @Date: 2019/12/2 13:54
 */
public class ThreadCommunication {
    /**
     * wait()&&notify()方法
     * 这两个方法是在Object中定义的，用于协调线程同步，比join更加灵活
     */
        public static void main(String[] args) {
            //写两个线程 1.图片下载
            Object obj=new Object();
            Thread download=new Thread(){
                @Override
                public void run() {
                    System.out.println("开始下载图片");
                    for (int i = 0; i < 101; i+=10) {
                        System.out.println("down"+i+"%");
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("图片下载成功");
                    synchronized (obj) {
                        obj.notify();//唤起
                    }
                    System.out.println("开始下载附件");
                    for (int i = 0; i < 101; i+=10) {
                        System.out.println("附件下载"+i+"%");

                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("附件下载成功");
                }
            };
            //2.图片展示
            Thread show=new Thread(){
                @Override
                public void run(){
                    synchronized (obj) {
                        try {
                            System.out.println("阻塞前");
                            obj.wait();//阻塞当前
                            System.out.println("阻塞后");
                        } catch (InterruptedException e) {
                            System.out.println("唤醒会出异常："+e);
                            e.printStackTrace();
                        }
                        System.out.println("show:开始展示图片");
                        System.out.println("图片展示完毕");
                    }

                }
            };
            download.start();
            show.start();
        }
}
