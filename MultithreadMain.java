package Multithread;

public class MultithreadMain {

	public static void main(String[] args) {
	    int n=7;
	    for(int i=0;i<n;i++) {
	    	Thread s = new Thread(new MultithreadingDemo());
	    	s.start();
	    	
	    }

	}

}
