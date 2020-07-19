package com.paytm;

public class JumpingNumber {

	public static void main(String[] args) {
		
		
		findAllJumpingNo(50);
	}


	private static boolean isjumpingNo(int no) {
		int prevno = -5;
		
		boolean flag = true;
		while (no > 0) {
			int tmpno = no%10;
			if(prevno >=0) {
				int reminder = prevno- tmpno;
				if ((Math.abs(reminder) - 1) != 0) {
					flag = false;
				}
			}
			prevno = tmpno;
			no = no/10;
			
		}
	
		return flag;
	}
	
	
	static void findAllJumpingNo(int no) {
		
		int n = 0;
		while (n < no) {
			
			if(n/10  == 0) {
				System.out.println(n);
			} else {
				if(isjumpingNo(n)) {
					System.out.println(n);
				}
			}
			n++;
		}
	}
		
	
}
