package com.tg.basicjava.gof.singleton;

/**
 * 单例模式：懒汉
 * 构造懒汉式单例的要点：1.懒加载 2.线程安全
 * @author root
 *
 */
public class Singleton1_1 {
	
	private Singleton1_1(){}
	
	private static Singleton1_1 s;
	
	public static Singleton1_1 getInstance(){
		if(s == null){
			s = new Singleton1_1();
		}
		return s;
	}
	

}
