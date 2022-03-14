package Multithread;


import java.lang.Runnable;


//Java code for thread creation using runnable interface

public class MultithreadingDemo implements Runnable{
	public void run() {
		try {
			System.out.println("Thread" + Thread.currentThread().getId());
		}catch(Exception e) {
			System.out.println("Exception caught");
		}
	}

}
