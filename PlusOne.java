package com.paytm;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		
		int arr[] = { 3, 0, 6, 4, 0 };
		System.out.println(Arrays.toString(plusOne(arr)));
	}
	 public static int[] plusOne(int[] A) {
	        
	        int response[] = new int[A.length];
	        int reminder = 1;
	        int len = A.length-1;
	        int i = 0;
	        
	        boolean isStartingWithZero = false;
	        int zeroCount = 0;
	        for(int ki = 0;ki<len;ki++) {
	            if(A[ki] == 0) {
	                zeroCount++;
	                
	            } else {
	                break;
	            }
	        }
	        for(i =len;i>=0;i--) {
	        
	            if(A[i] <9 ){
	                A[i] = A[i]+1;
	                isStartingWithZero = true;
	                break;
	            }    
	            
	            A[i] = 0;
	            
	        }
	        
	        
	        if(isStartingWithZero && zeroCount > 0) {
	            int R[] = new int[A.length-zeroCount];
	            System.arraycopy(A, zeroCount, R, 0, A.length-zeroCount );
	            return R;
	        } else if (isStartingWithZero && zeroCount == 0)  {
	        	return A;
	        }else  {
	            int result[] = new int[A.length+1];
	            result[0] = 1;
	            return result;
	    
	            
	        }
	    }
}
