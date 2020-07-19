package com.paytm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxNonNegativeNumer {

	public static  int[] maxset(int[] A) {
		  
		
        long maxSumSoFar = Long.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;
        long tmpSum = 0;
        
        List<Pair> list = new ArrayList<Pair> ();
        for(int i = 0; i< A.length;i++) {
            if(A[i] < 0) {
                tmpSum = 0;
                startIndex = i+1;
                continue;
                
            } 
            tmpSum = tmpSum+ A[i];
            
            if(maxSumSoFar < tmpSum ) {
                endIndex = i;
                maxSumSoFar= tmpSum;
                list.clear();;
                list.add(new Pair(startIndex, endIndex));
            } else if(maxSumSoFar == tmpSum ) {
                endIndex = i;
                Pair p = list.get(0);
                if((p.end - p.start) > (endIndex - startIndex) ) {
                        list.set(0, new Pair(p.start, p.end));
                } else if ((p.end - p.start) ==  (endIndex - startIndex)){
                    list.set(0, new Pair(startIndex, endIndex));
                } else {
                    list.set(0, new Pair(startIndex, endIndex));
                    
                }
            }
        }
        
        Pair p = list.get(0);
        int s = p.start;
        int e = p.end;
        int arr[] = new int[e-s+1];
        for(int j= 0, i=s;i <=e;i++, j++) {
            arr[j] = A[i];
        }
    
        return arr;
        
    }
    
    static class Pair {
        int start;
        int end;
        
        Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public static void main(String[] args) {
    	
    	int A[] = { 1967513926, 1540383426, -1303455736, -521595368};
    	int[] maxset = maxset(A);
    	System.out.println(Arrays.toString(maxset));
    }
}


