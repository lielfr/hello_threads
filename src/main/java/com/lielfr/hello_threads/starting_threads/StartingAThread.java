package com.lielfr.hello_threads.starting_threads;

/**
 * Hello world!
 *
 */
public class StartingAThread 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	// Start a thread - first way
    	MyThread thread1 = new MyThread();
    	thread1.setDaemon(true);
    	thread1.start();
    	
    	// Start a thread - second way
    	Thread thread2 = new Thread(new MyRunnable());
    	thread2.setDaemon(true);
    	thread2.start();
    	
    	// Wait until all threads are done.
    	thread1.join();
    	thread2.join();
    }
}
