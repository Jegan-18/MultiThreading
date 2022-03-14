package Multithread;
import java.lang.Thread;


//Java code for thread creation using thread class

public class Multithreading extends Thread {
	public void run() 
	{
	try{
		System.out.println("Thread" + Thread.currentThread().getId() + "is running");
	}
	catch(Exception e) {
		System.out.println("Exception is caught");
	}

}
}
