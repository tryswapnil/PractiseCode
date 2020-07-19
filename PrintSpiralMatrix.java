package com.paytm;

public class PrintSpiralMatrix {

	public static void main(String[] args) {
		
		
		System.out.println(0%10);
		int arr[][] = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
		};
		
		int T = 0, B = arr.length-1, L =0, R = arr.length-1;
		int dir = 0;
		while (T <= B && L <= R ) {
			
			if( dir == 0) {
				for (int i = L; i <= R; i++) {
					System.out.print(arr[T][i]);
				}
				T++;
			} 
			else if( dir == 1) {
				for (int i = T; i <= B; i++) {
					System.out.print(arr[i][R]);
				}
				R--;
				
			}
			else if( dir == 2) {
				for (int i = R; i >= L; i--) {
					System.out.print(arr[B][i]);
				}
				B--;
				
			}
			else if( dir == 3) {
				for (int i = T; i >= B; i--) {
					System.out.print(arr[i][L]);
				}
				L++;
				
			}
			
			dir = (dir+1)%4;
			System.out.println();
		}
		
		
		int a[] = new int[2];
		int b[] = new int[5];
		System.arraycopy(a, srcPos, dest, destPos, length);
		
		
	}
}
