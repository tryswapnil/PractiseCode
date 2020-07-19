package com.paytm;

public class WithGivenSum {

	public static void main(String[] args) {
	
		int arr[] = {1, 2, 3, 7, 5};
		computeSum(arr, 12);
	}
	
	 static void computeSum(int arr[], int sum ) {
		   int i = 0 ; boolean flag = false; int start = 0;
		   int len = arr.length;
		   int tmp = 0;
		   while(i < len ) {
		        tmp=tmp+arr[i];
		        

		       while(tmp > sum) {
		           tmp=tmp-arr[start];
		           start=start+1; 
		       }

		       if(tmp == sum) {
		           flag=true;
		         System.out.println((start+1)+" "+(i+1));
		         break;
		       }
		      i++;
		   } 

		if(!flag) {
		         System.out.println(-1);

		}

		}

}
