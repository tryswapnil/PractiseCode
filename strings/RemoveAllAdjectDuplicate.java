package com.paytm.strings;

public class RemoveAllAdjectDuplicate {

	public static void main(String[] args) {
		
		String str = "geeeksforgeekkkk";
		str = "acaaabbbacdddd";
		String removeAdjDuplicate = removeAdjDuplicate(str, 0, str.length()-1);
		System.out.println(removeAdjDuplicate);
	}

	private static String removeAdjDuplicate(String str, int start, int end) {

		/*index 
		 * if(start+1 > end) { return ""+str.charAt(start); } while (start+1 < end &&
		 * str.charAt(start) == str.charAt(start+1)) { start++; } return
		 * str.charAt(start) + removeAdjDuplicate(str, start+1, end);
		 */
		
		if(start > end) {
			return "";
		}
		
		while(str.charAt(start) == str.charAt(start+1)) {
			start++;
		}
		return str.charAt(start) + removeAdjDuplicate(str, start+1, end);
	}
}
