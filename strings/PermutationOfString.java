package com.paytm.strings;

import java.util.ArrayList;

public class PermutationOfString {

	public static void main(String[] args) {

		String str = "ABC";

		ArrayList<String> list = new ArrayList<String>();
		permutation("", str, list);

		System.out.println(list );
	}

	private static void permutation(String prefix, String suffix, ArrayList<String> list) {

		if(suffix.length() == 0) {
			list.add(prefix);
		} else {
			
			for (int i = 0; i < suffix.length(); i++) {
				permutation(prefix+suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i+1, suffix.length()), list);
			}
		}
	}
}