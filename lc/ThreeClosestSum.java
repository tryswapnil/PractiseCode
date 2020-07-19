package com.paytm.lc;

import java.util.Arrays;

public class ThreeClosestSum {

	public static void main(String[] args) {
	
		int nums[] = {1,1,-1,-1,3};
				//{-1,2,1,-4}; // -4, -1, 1, 2
		System.out.println(threeSumClosest(nums, -1));
	}
	 public static int threeSumClosest(int[] num, int target) {
	        
	        Arrays.sort(num);
	    
	         int closestSum =  num[0] + num[1] + num[num.length - 1];;
	           
	        for(int i =0 ;i < num.length-2;i++) {
	            
	            int j = i+1;
	            int k = num.length-1;
	            while(j < k) {
	                int tmpSum = num[i] + num[j] + num[k];
	                
	                if( Math.abs(closestSum-target) > Math.abs(tmpSum-target)) {
	                	closestSum = tmpSum;
	                }
	                if(tmpSum < target) {
	                    j++;
	                } else {
	                   k--; 
	                }
	            }
	        }
	        return closestSum;
	    }
}

