package com.lielfr.hello_threads.syncing_threads;

public class SyncingThreads {
	private static final int NUM_THREADS = 10;
	private static Object lockObject = new Object();
	
	public static void main(String[] args) throws InterruptedException {
		Thread[] threads =new Thread[NUM_THREADS];
		
		for (int i = 0; i < NUM_THREADS; i++) {
			threads[i]= new Thread(new Counter(lockObject));
			threads[i].start();
		}
		
//		for (int i = 0; i < NUM_THREADS; i++) {
//			threads[i].join();
//		}
		
		System.out.println("DONE");
	}

}
