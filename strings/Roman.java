package com.paytm.strings;

import java.util.LinkedHashMap;

public class Roman {

	LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

	public int romanToInt(String s) {
   
      map.put('I', 1);
      map.put('V', 5);
      map.put('X', 10);
      map.put('L', 50);
      map.put('C', 100);
      map.put('D', 500);
      map.put('M', 1000);
      
     
      
      
      int counter = 0;
      char lastChar = '';
          
      for(int i =0; i< s.length(); i++) {
          
           Char c = s.charAt(i);
           counter =  counter + map.get(c);
           int tmp = ensureLastChar(lastChar, c);
           counter = counter -tmp;
           lastChar = c;
          
          
      }
      
  }

	public int ensureLastChar(char lastChar, char current, int counter) {

		if (lastChar != ' ') {
			int val = map.get(lastChar);
			int val2 = map.get(current);

			if (val < val2) {
				return val * 2;
			}
		}
		return 0;
	}
}
