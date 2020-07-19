package com.paytm.lc;

import java.util.ArrayList;
import java.util.List;

public class OpenCloseParanthesis {

	public static void main(String[] args) {
		
		int n = 3;
		List<String> list = new ArrayList<String>();
		generateParanthesis("", 0, 0, n, list);
		System.out.println(list);
	}

	private static void generateParanthesis(String str, int open, int close, int len, List<String> list) {
		
		if(str.length() == len*2) {
			list.add(str);
			return;
		}
		
		if(open < len) {
			generateParanthesis(str+"(", open+1, close, len, list);
		} 
		
		if(close < open) {
			generateParanthesis(str+")", open, close+1, len, list);
		}
	}
}
