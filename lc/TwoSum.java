package com.paytm.lc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		
		int arr[] = {3,3};
		System.out.println(Arrays.toString(twoSum(arr, 6)));
	}
	
	public static int[] twoSum(int[] nums, int target) {
	     
        int response[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length; i++) {
            map.put(nums[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        return response;
     }
}
