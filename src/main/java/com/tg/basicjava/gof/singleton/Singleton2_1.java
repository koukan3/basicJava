package com.tg.basicjava.gof.singleton;

/**
 * 单例模式：饿汉
 * @author root
 *
 */
public class Singleton2_1 {
	
	private Singleton2_1(){}
	
	//类初始化时，就立即加载该对象，并且是天然线程安全的。
	private static Singleton2_1 s = new Singleton2_1();
	
	public static Singleton2_1 getInstance(){
		return s;
	}

}
