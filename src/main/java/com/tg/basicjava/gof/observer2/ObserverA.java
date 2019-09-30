package com.tg.basicjava.gof.observer2;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer{
	
	private String observerState;

	public String getObserverState() {
		return observerState;
	}

	public void setObserverState(String observerState) {
		this.observerState = observerState;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("arg: "+arg);
		String s = ((TargetA)o).getState();
		setObserverState(s);
	}

}
