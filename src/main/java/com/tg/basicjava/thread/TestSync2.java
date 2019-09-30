package com.tg.basicjava.thread;

public class TestSync2 implements Runnable{

	static int i = 0;
	
	public static  synchronized  void increase(){
		i++;
	}
	@Override
	public  void run() {
		for(int i=0;i<1000000;i++){
			increase();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		TestSync2 sync1 = new TestSync2();
		TestSync2 sync2 = new TestSync2();
		Thread th1 = new Thread(sync1);
		Thread th2 = new Thread(sync2);
		th1.start();
		th2.start();
		th1.join();
		th2.join();
		System.out.println(th1.getName());
		System.out.println(th2.getName());
		System.out.println("i="+i);
	}

}
