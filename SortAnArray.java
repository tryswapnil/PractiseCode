package com.paytm;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		
//		int arr[] = {0, 2, 1, 2, 0};
		
	//	int arr[] = {1,0,1,2,1,1,0,0,1,2,1,2,1,2,1,0,0,1,1,2,2,0,0,2,2,2,1,1,1,2,0,0,0,2,0,1,1,1,1,0,0,0,2,2,1,2,2,2,0,2,1,1,2,2,0,2,2,1,1,0,0,2,0,2,2,1,0,1,2,0,0,0,0,2,0,2,2,0,2,1,0,0,2,2};
		
		int arr[] = {2,2,0,0,2,1,0,1,1,2,2,1,2,2,0};
		int low = 0; int mid = 0;
		int end = arr.length-1;
		
		while (mid  <= end) {
			
			if(arr[mid] == 0) {
				swap(arr, mid, low);
				low++;
				mid++;
			}
			else if (arr[mid] == 1) {
				mid++;
			}
			 
			else if (arr[mid] == 2) {
				swap(arr, mid, end);
				end--;
			}
			
		//	mid++;
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		/*int low = 0; int mid = 0;
		int end = arr.length-1;
		
		//System.out.println(Arrays.toString(arr));
		while (mid  < end) {
			
			if(arr[mid] == 0) {
				swap(arr, mid, low);
				low++;
			} 
			
			if (arr[mid] == 1) {
				mid++;
			}
			if (arr[mid] == 2) {
				swap(arr, mid, end);
				end--;
			}
		
			
		}
		*/
		//System.out.println(Arrays.toString(arr));
		
		
		sort012(arr, arr.length);
	}

	private static void swap(int[] arr, int mid, int low) {
		
		int tmp = arr[mid]; 
		arr[mid] =  arr[low];
		arr[low] = tmp;
	}
	
	
	static void sort012(int a[], int arr_size) 
    { 
        int lo = 0; 
        int hi = arr_size - 1; 
        int mid = 0, temp = 0; 
        while (mid <= hi) { 
            switch (a[mid]) { 
            case 0: { 
                temp = a[lo]; 
                a[lo] = a[mid]; 
                a[mid] = temp; 
                lo++; 
                mid++; 
                break; 
            } 
            case 1: 
                mid++; 
                break; 
            case 2: { 
                temp = a[mid]; 
                a[mid] = a[hi]; 
                a[hi] = temp; 
                hi--; 
                break; 
            } 
            }
            
        }
        
        System.out.println(Arrays.toString(a));
    } 
}
