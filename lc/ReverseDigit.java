package com.paytm.lc;

import java.util.Iterator;
import java.util.TreeMap;

public class ReverseDigit {

	public static void main(String[] args) {
	
		TreeMap<Integer, String> tree = new TreeMap<Integer, String>((x, y) ->Integer.compare(x, y));
		
		Iterator<Integer> iterator = tree.keySet().iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			
		} 
		System.out.println(5%5);
//		System.out.println(reverse(
//		1000		1534236469));
	}
	
	public static int reverse(int x) {
		 
        int no = 0;
        
        while(x != 0) {
            int digit  = x%10;
            no = no*10+digit;
            System.out.println(no);
          /*   if ((newResult - digit) / 10 != no)
            { return 0; }
            no = newResult;*/
            x = x/10;
        }
        return no;
    }
}
