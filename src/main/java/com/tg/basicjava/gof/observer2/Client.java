package com.tg.basicjava.gof.observer2;

public class Client {
	
	public static void main(String[] args) {
		//Ŀ�����
		TargetA ta = new TargetA();
		
		//�۲���
		ObserverA o1 = new ObserverA();
		ObserverA o2 = new ObserverA();
		ObserverA o3 = new ObserverA();
		
		//���۲�����ӵ�Ŀ�����������
		ta.addObserver(o1);
		ta.addObserver(o2);
		ta.addObserver(o3);
		
		ta.setState("��˯�ˣ���ʦ���ˣ�");
		System.out.println(o1.getObserverState());
		System.out.println(o2.getObserverState());
		System.out.println(o3.getObserverState());
		ta.setState("��˯�ˣ�У�����ˣ�");
		System.out.println(o1.getObserverState());
		System.out.println(o2.getObserverState());
		System.out.println(o3.getObserverState());
	}

}
