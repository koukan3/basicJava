package com.tg.basicjava.gof.singleton;

import java.io.Serializable;

/**
 * 懒汉式单例模式的另一种实现： 利用静态内部类，
 * 类在初始化时加载是天然线程安全的，所以使用静态内部类保证了线程安全。
 * @author root
 *
 */
public class Singleton1_3 implements Serializable{
	
	private Singleton1_3(){}
	
	public static Singleton1_3 getInstance(){
		return Singleton3Instance.ins;
	}
	
	private static class Singleton3Instance{
		private static final Singleton1_3 ins = new Singleton1_3();
	}
	
	/**
	 * 序列化操作提供了一个很特别的钩子（hook）-类中具有一个私有的被实例化的方法readresolve(),
	 * 在序列化创建实例的时候被引用。
	 * 这个方法可以确保类的开发人员在序列化将会返回怎样的object上具有发言权。
	 * @return
	 */
	private Object readResolve(){
		return getInstance();
	}

}
