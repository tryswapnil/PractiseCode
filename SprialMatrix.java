package com.paytm;

import java.util.Arrays;

public class SprialMatrix {

	public static void main(String[] args) {

		//int arr[][] = { { 1, 2, 3 }, { 8, 9, 4 }, { 7, 6, 5 } };

		int arr[][] =  new int[80][80];
		int counter = 1;
		int T = 0;
		int B = arr.length-1;
		int L = 0;
		int R = arr.length -1;

		int dir = 0;

		while (T <= B && L <= R) {

			if (dir == 0) {
				// Left to right
				for (int i = L; i <= R; i++) {
					arr[T][i] = counter++;
				}
				T++;
				
				System.out.println();

			}
			if (dir == 1) {
				// Top to bottom
				for (int i = T; i <= B; i++) {
					arr[i][R] = counter++;;
				}
				R--;
				System.out.println();
			}
			if (dir == 2) {
				// Right to left
				for (int i = R; i >= L; i--) {
					arr[B][i] = counter++;;
				
				}
				B--;
				System.out.println();
			}
			if (dir == 3) {

				for (int i = B; i >= T; i--) {
					arr[i][L] =counter++;;
				}
				L++;
				System.out.println();
			}

			dir = (dir + 1) % 4;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.println();
		}
	}
	
	
}
