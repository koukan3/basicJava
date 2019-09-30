package com.tg.basicjava.gof.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象：发送消息
 * @author root
 *
 */
public class Target {
	
	List<Observor> list;

	//注册一个观察者
	public void registerObservor(Observor o){
		if(list == null){
			list = new ArrayList<>();
		}
		list.add(o);
	}
	//移除观察者
	public void removeObservor(Observor o){
		if(list != null && list.contains(o)){
			list.remove(o);
		}
	}
	// 通知所有观察者
	public void notifyAllObservors() throws NoObservorException{
		if(list != null){
			for (Observor o : list) {
				o.updateState(this);
			}
		}else{
			throw new NoObservorException();
		}
	}
}
