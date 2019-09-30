package com.tg.basicjava.gof.singleton;

public class Singleton1_2_1 {
	
	private Singleton1_2_1(){
		
		//��ֹ���÷��䴴�����ʵ��
		/*if(s != null){
			throw new RuntimeException();
		}*/
		
	}
	
	private static Singleton1_2_1 s;
	
	/**
	 * ˫�ؼ����ʵ�ֵ���ģʽ
	 * ��������ʹ�ã���ʱ��������⣩
	 * ������ʵֻ��Ҫ�ڵ�һ�γ�ʼ����ʱ���õ���֮��ĵ��ö�û��Ҫ�ٽ��м����������������ܿ�����
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
