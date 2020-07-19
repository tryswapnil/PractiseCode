package com.paytm.dp;

public class StairCase {

	public static void main(String[] args) {
		
		int no = 4;
		int number = minimumSteps(no);
		System.out.println(number);
	}

	private static int minimumSteps(int no) {
		
		if(no < 2) {
			return no;
		}
		return minimumSteps(no-2) + minimumSteps(no-1);
	}
}
