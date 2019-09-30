package com.tg.basicjava.gof.singleton;

import java.io.Serializable;

/**
 * ����ʽ����ģʽ����һ��ʵ�֣� ���þ�̬�ڲ��࣬
 * ���ڳ�ʼ��ʱ��������Ȼ�̰߳�ȫ�ģ�����ʹ�þ�̬�ڲ��ౣ֤���̰߳�ȫ��
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
	 * ���л������ṩ��һ�����ر�Ĺ��ӣ�hook��-���о���һ��˽�еı�ʵ�����ķ���readresolve(),
	 * �����л�����ʵ����ʱ�����á�
	 * �����������ȷ����Ŀ�����Ա�����л����᷵��������object�Ͼ��з���Ȩ��
	 * @return
	 */
	private Object readResolve(){
		return getInstance();
	}

}
