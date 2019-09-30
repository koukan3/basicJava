package com.tg.basicjava.gof.singleton;

public class Singleton1_2_1 {
	
	private Singleton1_2_1(){
		
		//防止利用反射创建多个实例
		/*if(s != null){
			throw new RuntimeException();
		}*/
		
	}
	
	private static Singleton1_2_1 s;
	
	/**
	 * 双重检查锁实现单例模式
	 * （不建议使用，有时会出现问题）
	 * 加锁其实只需要在第一次初始化的时候用到，之后的调用都没必要再进行加锁。加锁会有性能开销。
	 * @return
	 */
	public static Singleton1_2_1 getInstance(){
		if(s == null){
			Singleton1_2_1 _2nd;
			synchronized (Singleton1_2_1.class) {
				_2nd = s;
				if(_2nd == null){
					synchronized (Singleton1_2_1.class) {
						_2nd = new Singleton1_2_1();
						s = _2nd;
						return s;
					}
				}
				return _2nd;
			}
		}
		return s;
	}

}
