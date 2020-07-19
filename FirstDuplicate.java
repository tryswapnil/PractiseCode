package com.paytm;

import java.util.HashMap;
import java.util.Map;

public class FirstDuplicate {

	public static void main(String[] args) {
		
		int arr[] = {2,1,3,5,3,2};
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[Math.abs(arr[i])-1] < 0) {
				System.out.println("Duplicate "+Math.abs(arr[i]));
				break;
			} else {
				arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];  
			}
		}
		Map<String, String> map = new HashMap<String, String>();
		map.cle
	}
}
