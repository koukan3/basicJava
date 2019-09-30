package com.tg.basicjava.leetcode;

import org.junit.Test;

public class TwoSum {
	
	@Test
	public void testTS(){
		int[] arr = new int[]{2, 7, 11, 15};
		int[] res = twoSum(arr,9);
		for (int i : res) {
			System.out.println(i);
		}
	}
	
	public int[] twoSum(int[] nums, int target) {
        int idx1 = 0;
        int idx2 = 0;
        for(idx1 =0;idx1<nums.length;idx1++){
            int n1 = nums[idx1];
            int n2 = target-n1;
            for(idx2 =idx1+1;idx2<nums.length;idx2++){
                if(n2==nums[idx2]){
                	System.out.println(idx1+"==="+idx2);
                    return new int[]{idx1,idx2};
                }
            }
            
        }
            
        return null;
    }

}
