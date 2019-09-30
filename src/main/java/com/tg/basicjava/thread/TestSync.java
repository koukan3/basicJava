package com.tg.basicjava.thread;

public class TestSync implements Runnable{

	static int i = 0;
	
	public synchronized  void increase(){
		i++;
	}
	
	@Override
	public  void run() {
		for(int i=0;i<1000000;i++){
			increase();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		TestSync sync = new TestSync();
		Thread th1 = new Thread(sync);
		Thread th2 = new Thread(sync);
		th1.start();
		th2.start();
		th1.join();
		th2.join();
		System.out.println(th1.getName());
		System.out.println(th2.getName());
		System.out.println("i="+i);
	}

}
