package com.tg.basicjava.gof.singleton;

/**
 * ����ģʽ������
 * @author root
 *
 */
public class Singleton2_1 {
	
	private Singleton2_1(){}
	
	//���ʼ��ʱ�����������ظö��󣬲�������Ȼ�̰߳�ȫ�ġ�
	private static Singleton2_1 s = new Singleton2_1();
	
	public static Singleton2_1 getInstance(){
		return s;
	}

}
