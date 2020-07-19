package com.paytm.lc;

public class InverseTheMatrix {

	public static void main(String[] args) {
	
		int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j] +"\t");
			}
			System.out.println();
		}
		
		int n = 3;
		int m = 3;
		
		
		for (int i = 0, k = n-1; i < n/2 && k >=0; i++, k--) {
			for (int j = 0, l = m-1; j < n/2 && l >=0; i++, l--) {
				int tmp = arr[j][i];
				arr[j][i] = arr[k][l];
				arr[k][l] = tmp;
			}
		}
	
		System.out.println("After inversion");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j] +"\t");
			}
			System.out.println();
			
			String str  = "Ram";
			
		}
	}
}
