package com.tg.basicjava.gof.observer2;

public class Client {
	
	public static void main(String[] args) {
		//目标对象
		TargetA ta = new TargetA();
		
		//观察者
		ObserverA o1 = new ObserverA();
		ObserverA o2 = new ObserverA();
		ObserverA o3 = new ObserverA();
		
		//将观察者添加到目标对象容器中
		ta.addObserver(o1);
		ta.addObserver(o2);
		ta.addObserver(o3);
		
		ta.setState("别睡了，老师来了！");
		System.out.println(o1.getObserverState());
		System.out.println(o2.getObserverState());
		System.out.println(o3.getObserverState());
		ta.setState("别睡了，校长来了！");
		System.out.println(o1.getObserverState());
		System.out.println(o2.getObserverState());
		System.out.println(o3.getObserverState());
	}

}
