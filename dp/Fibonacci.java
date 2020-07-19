package com.paytm.dp;

public class Fibonacci {

	public static void main(String[] args) {
		
		int no = 4;
		System.out.println(throwRecursion(4));
	
		
		int[] cache = new int[no+1];
		
		System.out.println(throwRecursionMemo(4, cache));
		
		System.out.println(throwDP(no));
	
		System.out.println(throwNormal(no));
	}

	private static int throwRecursion(int no) {
		
		if(no < 2) {
			return no;
		}
		return throwRecursion(no- 2) + throwRecursion(no -1); 
	}
	
	
	private static int throwRecursionMemo(int no, int[] cache) {
		
		if(no < 2) {
			return no;
		}
		
		if(cache[no] != 0) {
			return cache[no];
		}
		return cache[no] = throwRecursionMemo(no- 2, cache) + throwRecursionMemo(no -1, cache); 
	}
	
	private static int throwDP(int no) {
		
		int cache[] = new int[no+1];
		
		cache[0] =0;
		cache[1] =1;
		
		for (int i = 2; i <= no; i++) {
			cache[i] = cache[i-2] + cache[i-1];
 		}
		return cache[no];
	}
	
	
	private static int throwNormal(int no) {
		
		int first = 0;
		int second = 1;
		for (int i = 2; i <= no; i++) {
			int sum = first + second;
			first  = second;
			second = sum;
			
		}
		return second;
	}
	
	
}
