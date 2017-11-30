package com.thread.start;

public class ThreadDemo extends Thread implements Runnable {
	

	public void run() {
		super.start();
		System.out.println("void run() executing...");
	}
	public void start() {
		super.run();
		System.out.println("void start() is executing...");
		
	}
}
