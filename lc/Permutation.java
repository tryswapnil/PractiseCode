package com.paytm.lc;

public class Permutation {

	public static void main(String[] args) {
		
		String str = "abc";
		permute(str, 0, str.length());
	}

	private static void permute(String str, int left, int right) {
		
		for (int i = left; i < right; i++) {
			String swap = swap(str, left, i);
			System.out.println(swap);
			permute(str, left+1, right);
			swap(str, left, i);
		}
	}

	private static String swap(String str, int left, int i) {
	
		char[] charArray = str.toCharArray();
		char tmp = charArray[left];
		charArray[left] = charArray[i];
		charArray[i] = tmp;
		return new String(charArray);
	} 
}
