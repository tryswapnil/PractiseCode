package com.paytm;

import java.util.Arrays;

public class WaveArray {

	public static void main(String[] args) {

		int arr[] = { 5, 1, 3, 2, 4};
		int arr2[] = wave(arr);
		System.out.println(Arrays.toString(arr2));
	}

	public static int[] wave(int[] A) {

		Arrays.sort(A);

		for (int i = 1; i < A.length; i = i+2) {

			int tmp = A[i-1];
			A[i-1] = A[i];
			A[i] = tmp;

		}

		return A;
	}
}
