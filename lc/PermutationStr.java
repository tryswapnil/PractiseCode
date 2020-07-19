package com.paytm.lc;

public class PermutationStr {

	public static void main(String[] args) {
		printPermut("abc", "");
		
	}
	
	public static void printPermut(String str, String ans) {
		
		if(str.length() == 0) {
			System.out.println(ans +" ");
			return;
		}
		
		for (int i = 0; i < str.length(); i++) {
			
			char c = str.charAt(i);
		
			String res = str.substring(0, i) + str.substring(i+1);
			printPermut(res, ans + ""+c);
		}
	}
}
