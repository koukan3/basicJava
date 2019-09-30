package com.tg.basicjava.gof.observer;

public class TargetA extends Target{

	public String state;

	public String getState() {
		return state;
	}

	/**
	 * ��Ŀ������״̬�ı�ʱ����֪ͨ���й۲���
	 * @param state
	 * @throws NoObservorException
	 */
	public void setState(String state) throws NoObservorException {
		this.state = state;
		super.notifyAllObservors();
	}
	
}
