package com.tg.basicjava.gof.singleton;


/**
 * 检查锁实现单例模式
 */
public class Singleton1_2_2 {
	////【解决】使用volatile关键字，重排序被禁止。
	private volatile static Singleton1_2_2 s;
	private Singleton1_2_2(){}
	
	/*public synchronized static Singleton1_2_2 getInstance(){
		//加锁其实只需要在第一次初始化的时候用到，之后的调用都没必要再进行加锁。加锁会有性能开销。
	}*/
	
	public  static Singleton1_2_2 getInstance(){
		if(null == s){
			synchronized (Singleton1_2_2.class) {
				if(null == s){
					// 虽然加了锁，但可能出现问题，因为实例化的过程分为 3步：
					//1.分配内存空间  2.初始化对象 3.将对象指向刚分配的内存空间
					//有些编译器为了性能的原因，可能会将第2步和第3步进行颠倒重排序，导致访问一个初始化未完成的对象。
					//【解决】使用volatile关键字，重排序被禁止。
					s = new Singleton1_2_2();
				}
			}
		}
		return s;
	}

}
