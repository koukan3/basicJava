package com.tg.basicjava.gof.singleton;


/**
 * 枚举类天然就是线程安全的,可以防止反射和反序列化漏洞。
 * 但这种方式的单例模式不是懒加载。
 * @author root
 *
 */
public enum Singleton2_2 {
	
	INSTANCE;
	
	public void otherMethod(){}

}
