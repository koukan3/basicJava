package com.tg.basicjava.gof.singleton;


/**
 * �����ʵ�ֵ���ģʽ
 */
public class Singleton1_2_2 {
	////�������ʹ��volatile�ؼ��֣������򱻽�ֹ��
	private volatile static Singleton1_2_2 s;
	private Singleton1_2_2(){}
	
	/*public synchronized static Singleton1_2_2 getInstance(){
		//������ʵֻ��Ҫ�ڵ�һ�γ�ʼ����ʱ���õ���֮��ĵ��ö�û��Ҫ�ٽ��м����������������ܿ�����
	}*/
	
	public  static Singleton1_2_2 getInstance(){
		if(null == s){
			synchronized (Singleton1_2_2.class) {
				if(null == s){
					// ��Ȼ�������������ܳ������⣬��Ϊʵ�����Ĺ��̷�Ϊ 3����
					//1.�����ڴ�ռ�  2.��ʼ������ 3.������ָ��շ�����ڴ�ռ�
					//��Щ������Ϊ�����ܵ�ԭ�򣬿��ܻὫ��2���͵�3�����еߵ������򣬵��·���һ����ʼ��δ��ɵĶ���
					//�������ʹ��volatile�ؼ��֣������򱻽�ֹ��
					s = new Singleton1_2_2();
				}
			}
		}
		return s;
	}

}
