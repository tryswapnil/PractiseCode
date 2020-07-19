package com.paytm;

public class MaxDIfference {

	public static void main(String[] args) {
		
		//int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
		
		int arr[] = {1, 2, 3, 2, 1, 4};
		/* Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		    
		    for(int i =0;i< arr.length;i++) {
		        if(map.containsKey(arr[i])) {
		            map.put(arr[i], map.get(arr[i])+1);
		        } else {
		            map.put(arr[i], 1);
		        }
		    }
		    
		   Set<Entry<Integer, Integer>> set = map.entrySet();
		   for(Entry<Integer, Integer> ent :set) {
		       if(ent.getValue() == 1) {
		           System.out.print(ent.getKey() + " ");
		       }
		   }	
		   
		   System.out.println(map);
		*/
		
		int val = 0 ;
		
		
		for (int i = 0; i < arr.length; i++) {
			val = val ^ arr[i];
		}
		
		int set_bit_no = val & ~(val-1);  
		
		int x = 0, y= 0;
		 for(int i = 0; i < arr.length; i++)  
		    {  
		        if((arr[i] & set_bit_no) == 0)  
		         x = x ^ arr[i]; /*Xor of first set */
		        else
		        y = y ^ arr[i]; /*Xor of second set*/
		    }  
		System.out.println(x+"\t"+y);
	
		
	}
}
