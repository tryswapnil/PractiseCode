package com.paytm.hrnk;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RotatedArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int d = 4;
		int[] rotLeft = rotLeft(arr, d);

		System.out.println(Arrays.toString(rotLeft));
	
	
	}
	
	

	static int[] rotLeft(int[] a, int d) {

		int start = 0, len = a.length - 1;
		int n = a.length - d;
		int firstLength = d - 1;
		int secondLength = d;

		while (start < firstLength) {
			int tmp = a[start];
			a[start] = a[firstLength];
			a[firstLength] = tmp;
			start++;
			firstLength--;
		}

		while (secondLength < len) {
			int tmp = a[secondLength];
			a[secondLength] = a[len];
			a[len] = tmp;
			secondLength++;
			len--;
		}

		start = 0;
		len = a.length - 1;
		while (start < len) {
			int tmp = a[start];
			a[start] = a[len];
			a[len] = tmp;
			start++;
			len--;

		}
		return a;

	}
}
