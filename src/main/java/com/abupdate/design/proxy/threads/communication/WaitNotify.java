package com.abupdate.design.proxy.threads.communication;

public class WaitNotify {
	public static void main(String args[]){
		final byte a[] = {0};//以该对象为共享资源
		new Thread(new NumberPrint((1),a),"1").start();
		new Thread(new NumberPrint((2),a),"2").start();
	}
}
