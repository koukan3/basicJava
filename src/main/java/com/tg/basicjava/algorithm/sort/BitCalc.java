package com.tg.basicjava.algorithm.sort;

import org.junit.Test;

public class BitCalc {
	
	int n = 64;

	@Test
	public void test(){
		String s = "abcdef";
		calc(s.hashCode());
	}
	
	
	public void calc(int hash){
		System.out.println("slot1="+((n-1)&hash));
		System.out.println("slot2="+Math.abs((hash%n)));
	}
}
