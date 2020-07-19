package com.paytm.lc;

public class NoOfBalanacedRAndL {

	public static void main(String[] args) {
		
		String str = "RLLLLRRRLR";
		
		
		System.out.println(balancedStr(str, 0, str.length()-1));
	}

	private static int balancedStr(String str, int start, int end) {
		
		if(start > end) {
			return 0;
		} 
		
		if(str == null || str.trim().length() == 0  || str.trim().length() ==1) {
			return 0;
		}
		
		int index = start +2;
		while (index <= end+1) {
			String substring = str.substring(0, index);
			if(isBalancedStr(substring)) {
				return 1+ balancedStr(str.substring(index, end+1), 0, end-index);
			}
			index =  index+2;
		}
		return 0;
	}

	private static boolean isBalancedStr(String substring) {
		int countL = 0;
		int countR = 0;
		
		for (int i = 0; i < substring.length(); i++) {
			
			if(substring.charAt(i) == 'L') {
				countL++;
			} else if(substring.charAt(i) == 'R')  {
				countR++;
			}
		}
		return countL == countR;
	}
}
