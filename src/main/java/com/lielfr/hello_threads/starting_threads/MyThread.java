package com.lielfr.hello_threads.starting_threads;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("Hello from MyThread!");
	}
	
}
