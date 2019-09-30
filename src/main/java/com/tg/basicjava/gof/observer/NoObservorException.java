package com.tg.basicjava.gof.observer;

public class NoObservorException extends Exception {

	@Override
	public String getMessage() {
		return "需要先在目标对象中注册观察者！";
	}
	
	/*public NoObservorException(String msg){
		super(msg);
	}*/

}
