package com.paytm.strings;

public class RotatedString {

	public static void main(String[] args) {
		
		String str = "amazon";
		
		String s= str.substring(2, str.length()) + str.substring(0, 2);
	
		System.out.println(s);
	
		
		String str1 = "amazon";
		String st= str1.substring(str1.length()-2, str1.length()) + str1.substring(0, str1.length()-2);
		
		System.out.println(st);
		
		char c = str.charAt(0);
		switch (c) {
		case 'A':
			
			break;

		default:
			break;
			
		System.out.println("Here it is ");
		}
	}
}
