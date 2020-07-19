package com.paytm;

import java.util.Comparator;

public class AntiDiagonal {

	public static void main(String[] args) {
		
		
		int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		diagonal(arr);
		
	}
	
	public static int[][] diagonal(int[][] A) {
	    
        int m = A.length;
        
        for(int i =0; i < m; i++) {
            
            int k = i;
            int j = 0;
            while(k>=0) {
                System.out.println(A[k][j]);
                k = k-1;
                j = j+1;
            }
        }
        
        for(int i =1; i < m; i++) {
            
            int k = m-1;
            int j = i;
            while(j < m) {
                System.out.println(A[k][j]);
                k = k-1;
                j = j+1;
            }
        }
       
        return null;
    }
	
	
}


class Comp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return String
	}
	
}