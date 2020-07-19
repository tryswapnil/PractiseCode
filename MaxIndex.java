package com.paytm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxIndex {

	
	public int maximumGap(final List<Integer> A) {
	    
        List<Helper> list = new ArrayList<>();
        for(int i = 0; i< A.size(); i++) {
            list.add(new Helper(A.get(i), i));
        }
        
        Collections.sort(list);
        
        int maxDiff = Integer.MIN_VALUE;
        int ki;
        int kj;
        int size = list.size()-1;
        int maxIndex = list.get(size).index;
        for(int i =size;i >=0; i--) {
            int diff = maxIndex - list.get(i).index ;
            
            if(maxDiff < diff) {
                maxDiff = diff;
                ki = i;
                kj = maxIndex;
            }
            
            if(maxIndex < list.get(i).index) {
                maxIndex = list.get(i).index;
            }   
        }
        
        return maxDiff;
    }
    
    static class Helper implements  Comparable<Helper> {
        int element;
        int index;
        
        Helper(int element, int index) {
            this.element = element;
            this.index=  index;
            
        }
        
        public int compareTo(Helper h) {
            return Integer.compare(this.element, h.element);
        }
    }
    
    public static void main(String[] args) {
		
    	MaxIndex m = new MaxIndex();
    	int gap = m.maximumGap(Arrays.asList( 1));
    	System.out.println(gap);
    }
}
