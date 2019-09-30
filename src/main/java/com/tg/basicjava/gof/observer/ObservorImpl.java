package com.tg.basicjava.gof.observer;

public class ObservorImpl implements Observor{
	
	public String ostate;

	
	@Override
	public void updateState(Target t) {
		String targetState = ((TargetA)t).getState();
		setOstate(targetState);
	}

	public String getOstate() {
		return ostate;
	}

	public void setOstate(String ostate) {
		this.ostate = ostate;
	}
	
	
}
