package com.paytm.dp;

public class LongestCommonSubString {

	public static void main(String[] args) {
		
		String str1 = "JAVAAID";
		String str2 = "JAVAID";
		
		int m = str1.length();
		int n = str2.length();
	
		int cache[][][] = new int[m+1][n+1][Math.max(m, n)+1];
	  	
		int len = LCS(str1, str2, m-1, n-1, 0, cache);
		System.out.println(len);

		int len2 = LCSRecu(str1, str2, m-1, n-1, 0);
		System.out.println(len2);

	}

	private static int LCSRecu(String str1, String str2, int m, int n, int len) {
		
		if(m < 0 || n <0 ) {
			return len;
		} 
		
		int lsCount = len;
		if(str1.charAt(m) == str2.charAt(n)) {
			lsCount = LCSRecu(str1, str2, m-1, n-1, len+1);
		}
		
		int X = LCSRecu(str1, str2, m-1, n, 0);
		int Y = LCSRecu(str1, str2, m, n-1, 0);
		
		return Math.max(lsCount, Math.max(X, Y));
	}

	
	private static int LCS(String str1, String str2, int m, int n, int len, int cache[][][]) {
		
		if(m < 0 || n <0 ) {
			return len;
		} 
		
		if(cache[m][n][len] != 0) {
			return cache[m][n][len];
		}
		int lsCount = len;
		if(str1.charAt(m) == str2.charAt(n)) {
			lsCount = LCS(str1, str2, m-1, n-1, len+1, cache);
		}
		
		int X = LCS(str1, str2, m-1, n, 0, cache);
		int Y = LCS(str1, str2, m, n-1, 0, cache);
		
		return cache[m][n][lsCount] = Math.max(lsCount, Math.max(X, Y));
	}
}
