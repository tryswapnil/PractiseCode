package com.paytm.hrnk;

public class JumpingClouds {

	public static void main(String[] args) {

		int arr[] = {0, 0, 1, 0, 0, 1, 0};
		System.out.println(jumpingOnClouds(arr));
	}

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c) {

		return jumpingOnClouds(c, 0, c.length - 1);
	}

	static int jumpingOnClouds(int[] c, int start, int end) {

		if (start == end) {
			return 0;
		}

		if(c[start+2] != 1 && start+2 <= end) {
		return 1 + jumpingOnClouds(c, start + 2, end);
		} 
		return 1 + jumpingOnClouds(c, start + 1, end);
	}

}
