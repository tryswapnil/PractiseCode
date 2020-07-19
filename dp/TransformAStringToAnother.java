package com.paytm.dp;

public class TransformAStringToAnother {

	public static void main(String[] args) {
		
		String str1 = "javaaid";
		String str2 = "algorithm";
		
		int m = str1.length();
		int n = str2.length();
		int trans = transform(str1, str2, m-1, n-1);
		
		System.out.println(trans);
	
		int cache[][] = new int[m][n];
		trans = transformCache(str1, str2, m-1, n-1, cache);
		System.out.println(trans);
		
		System.out.println("Deletion "+(n - trans));
		System.out.println("Insertion "+(m - trans));
	}

	private static int transform(String str1, String str2, int m, int n) {
		
		if(m < 0 || n < 0) {
			return 0;
		}
		
		if(str1.charAt(m) == str2.charAt(n)) {
			return 1 + transform(str1, str2, m-1, n-1);
		}
		
		return Math.max(transform(str1, str2, m-1, n), transform(str1, str2, m, n-1));
	}
	
	private static int transformCache(String str1, String str2, int m, int n, int[][] cache) {
		
		if(m < 0 || n < 0) {
			return 0;
		}
		
		if(cache[m][n] != 0) {
			return cache[m][n];
		}
		if(str1.charAt(m) == str2.charAt(n)) {
			return 1 + transform(str1, str2, m-1, n-1);
		}
		
		return cache[m][n] = Math.max(transform(str1, str2, m-1, n), transform(str1, str2, m, n-1));
	}

	
}
