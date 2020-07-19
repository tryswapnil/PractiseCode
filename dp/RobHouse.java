package com.paytm.dp;

public class RobHouse {

	static int robb[] = {5, 1, 3, 11, 2};
	
	public static void main(String[] args) {
		
		
		int max = maxRob(robb, 0, robb.length-1);
		System.out.println(max);
		
		System.out.println(maxRobMemo(robb, 0, robb.length-1));
		
		System.out.println(maxRobThrwDP(robb));
		
		System.out.println(maxRobThrwEfficient(robb));
	}

	private static int maxRob(int[] robb, int start, int end) {
		
		if(start > end) {
			return 0;
		}
		return Math.max(robb[start]+maxRob(robb, start+2, end), maxRob(robb, start+1, end));
	}
	
	static int cache[] = new int[robb.length +1];
	private static int maxRobMemo(int[] robb, int start, int end) {
		
		if(start > end) {
			return 0;
		}
		
		if(cache[start] != 0) {
			return cache[start];
		}
		return cache[start] = Math.max(robb[start]+maxRob(robb, start+2, end), maxRob(robb, start+1, end));
	}
	
	private static int maxRobThrwDP(int[] robb) {
	
		int cache[] = new int[robb.length+1];
		cache[0]= robb[0];
		cache[1] = Math.max(robb[0], robb[1]);
		for (int i = 2; i < robb.length; i++) {
			cache[i] = Math.max(robb[i] + cache[i-2], cache[i-1]);
		}
		return cache[robb.length-1];
	}
	
	private static int maxRobThrwEfficient(int[] robb) {
		
		int first= robb[0];
		int secound = Math.max(robb[0], robb[1]);
		for (int i = 2; i < robb.length; i++) {
			int sum = Math.max(robb[i] + first, secound);
			first = secound;
			secound = sum;
		}
		return secound;
	}
}

