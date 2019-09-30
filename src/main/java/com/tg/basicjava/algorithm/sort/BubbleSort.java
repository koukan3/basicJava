package com.tg.basicjava.algorithm.sort;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.Test;

/**
 * to sort an array of Integer, asc
 * @author root
 *
 */
public class BubbleSort {
	
	@Test
	public void testArr(){
		Integer[]arr = new Integer[10];
		for(int i=0;i<10;i++){
			arr[i] = new Random().nextInt(1000);
		}
		System.out.println("before: "+Arrays.toString(arr));
		getSortedResult(arr);
		System.out.println("after: "+Arrays.toString(arr));
	}
	
	public void getSortedResult(Integer[] arr){
		boolean sorted = false;
		int n = arr.length;
		int total = 0;
		while(!sorted){
			int count = -1;
			for(int i=0;i<n-1;i++){
				total++;
				//start from num with index of 0,comparing the num and its next num
				if(arr[i]>arr[i+1]){
					int tmp = 0;
					tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}else{
					count ++;
				}
				if(count == n-2){
					sorted = true;
				}
			}
		}
		System.out.println("total: "+total);
	}
	

}
