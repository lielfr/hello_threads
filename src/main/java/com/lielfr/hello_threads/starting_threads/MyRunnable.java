package com.lielfr.hello_threads.starting_threads;

import java.io.Serializable;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hello from MyRunnable!");
		
	}


}
