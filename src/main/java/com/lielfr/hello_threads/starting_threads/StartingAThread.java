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
    	Thread thread1 = new Thread();
    	thread1.setDaemon(true);
    	thread1.start();
    	
    	// Start a thread - second way
    	MyThread thread2 = new MyThread();
    	thread2.setDaemon(true);
    	thread2.start();
    	
    	// Start a thread - third way
    	Thread thread3 = new Thread(new MyRunnable());
    	thread3.setDaemon(true);
    	thread3.start();
    	
    	// Wait until all threads are done.
//    	thread1.join();
//    	thread2.join();
//    	thread3.join();
    }
}
