package com.tg.basicjava.gof.singleton;

/**
 * ����ģʽ������
 * ��������ʽ������Ҫ�㣺1.������ 2.�̰߳�ȫ
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
