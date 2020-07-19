package com.paytm.dp;

public class Kanpsack {

	public static void main(String[] args) {
		
		int weight[] = {1, 4, 3};
		int vals[] = {150, 300, 200};
		
		int profit = maximizeProfit(weight, vals, 0, vals.length-1, 4);
		System.out.println(profit);
	}

	private static int maximizeProfit(int[] weight, int[] vals, int start, int end, int cap) {

		if (cap == 0) {
			return 0;
		}

		if(cap< 0) {
			return Integer.MIN_VALUE;
		}
		if (start > end) {
			return 0;
		}
		return Math.max(vals[start] + maximizeProfit(weight, vals, start + 1, end, cap - weight[start]),
				maximizeProfit(weight, vals, start + 1, end, cap));
	}
	
	private static int maxV(int i, int c) {
		
		if(i == 0 || c==0 ) {
			return 0;
		}
		
		if(w)
		return 0;
	}
}
