package com.lielfr.hello_threads.syncing_threads;

public class Counter implements Runnable {
	
	private static int actualCounter = 0;
	private Object lock;
	
	public Counter(Object lock) {
		this.lock = lock;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (lock) {
			actualCounter = actualCounter + 1;
			System.out.println("Counter is now " + actualCounter);
		}
		
		
		
		
	}

}
