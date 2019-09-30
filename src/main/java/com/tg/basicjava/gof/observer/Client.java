package com.tg.basicjava.gof.observer;

public class Client {
	
	public static void main(String[] args) {
		TargetA t = new TargetA();
		
		//ע�������۲���
		ObservorImpl o1 = new ObservorImpl();
		ObservorImpl o2 = new ObservorImpl();
		ObservorImpl o3 = new ObservorImpl();
		t.registerObservor(o1);
		t.registerObservor(o2);
		t.registerObservor(o3);
		
		//�ı�Ŀ�����״̬�󣬹۲���״̬Ҳ��ͬ��
		try {
			t.setState("�����ˣ�����������!");
			System.out.println(o1.getOstate());
			System.out.println(o2.getOstate());
			System.out.println(o3.getOstate());
			
			t.setState("�����ˣ�У������!");
			System.out.println(o1.getOstate());
			System.out.println(o2.getOstate());
			System.out.println(o3.getOstate());
		} catch (NoObservorException e) {
			e.printStackTrace();
		}
	}

}
