package com.tg.basicjava.gof.observer;

public class TargetA extends Target{

	public String state;

	public String getState() {
		return state;
	}

	/**
	 * 当目标对象的状态改变时，就通知所有观察者
	 * @param state
	 * @throws NoObservorException
	 */
	public void setState(String state) throws NoObservorException {
		this.state = state;
		super.notifyAllObservors();
	}
	
}
