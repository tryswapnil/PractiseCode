package com.paytm;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		
		//int arr[] = {1, 2, 3, 7, 5};
		//int arr[]= {1, 2, 3, 4, 5, 6, 7 ,8, 9, 10};
		//int arr[] = {135,101,170,125,79,159,163,65,106,146,82,28,162,92,196,143,28,37,192,5,103,154,93,183,22,117,119,96,48,127,172,139,70,113,68,100,36,95,104,12,123,134};
		
		int arr[] = {9, 45, 10, 190};
		int sum = 225;
		
		int tmpSum = 0;
		
		int csum=0,header=0,flag=0;
		
		
		for(int j=0;j<arr.length;j++)
	    {
	        csum+=arr[j];
	        while(csum>sum)
	        
	        { 
	            csum=csum-arr[header];
	            header++;
	        }   
	            if(csum==sum)
	            {
	                flag=1;
	                System.out.println((header+1)+" "+(j+1));
	                break;
	                
	            }
	    } 		
	//	System.out.println(tmpSum);
		
	}
}



