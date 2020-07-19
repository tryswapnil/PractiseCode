package com.paytm.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreakProblem {

	public static void main(String[] args) {
		
		
		System.out.println("Sonu".substring(0, 4));
		/*
		 * String dict[] = { "i", "like", "sam", "sung", "samsung", "mobile", "ice",
		 * "cream", "icecream", "man", "go", "mango"};
		 */
		/*String dict[]  = {
				"cats","dog","sand","and","cat"};*/
		
		String dict[] = {"leet", "code"};
		Set<String> dictionary = new HashSet<>();
		for (String str : dict) {
			dictionary.add(str);
		}
		String str = "ilikelikeimangoiii";
		
		str = "catsandog";
		str = "leetcode";
		List<String> list = new ArrayList<>();
		
		int end =  str.length()-1;
		boolean wordBreak = wordBreak(str, 0, end, dictionary, "", list);
	
		
		System.out.println(wordBreak);
	}

	private static boolean wordBreak(String str, int start, int end, Set<String> dictionary, String result,
			List<String> list) {
	
		if(str.length()<= 0) {
			//System.out.println(result);
			list.add(result);
			List<String> asList = new ArrayList<>();
			String[] split = result.split(" ");
			for (String string : split) {
				asList.add(string.trim());
			}
			//System.out.println(asList.subList(0, asList.size()-1));
			
			return asList.containsAll(dictionary);
		}
		for (int i = 1; i <= end+1; i++) {
			
			String substring = str.substring(0, i);
		
			if(dictionary.contains(substring)) {
				
				return wordBreak(str.substring(i, end+1), i, end-i, dictionary, result + substring +" ", list);
			}
		}
		return false;
	}
}
