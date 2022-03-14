package Multithread;

public class Multithread {

	public static void main(String[] args) {
		int n =9;
		for(int i =0; i < n; i++) {
			Multithreading m = new Multithreading();
			m.start();
		}

	}

}
