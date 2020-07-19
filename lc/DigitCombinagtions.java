package com.paytm.lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DigitCombinagtions {

	public List<String> letterCombinations(String digits) {

		if(digits == null || digits.trim().length() == 0) {
            return new ArrayList<String>();
        }
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "");
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");

		int start = 0;
		int end = digits.length() - 1;
		List<String> list = new ArrayList<>();
		generateCombinations(digits, start, end, "", list, map);

		return list;
	}

	public void generateCombinations(String digit, int start, int end, String result, List<String> list,
			Map<Integer, String> map) {

		if (start == end+1) {
			list.add(result);
			return;
		}

		String str = map.get(Integer.parseInt(String.valueOf(digit.charAt(start))));

		for (int i = 0; i < str.length(); i++) {
			generateCombinations(digit, start + 1, end, result + str.charAt(i), list, map);
		}
	}

	public static void main(String[] args) {

		DigitCombinagtions d = new DigitCombinagtions();
		System.out.println(d.letterCombinations("234"));

		System.out.println(d.letterCombinations(""));
	}
}
