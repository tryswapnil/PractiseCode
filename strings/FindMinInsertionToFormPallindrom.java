package com.paytm.strings;

import java.util.HashMap;
import java.util.Map;

public class FindMinInsertionToFormPallindrom {

	public static void main(String[] args) {

		FindMinInsertionToFormPallindrom f = new FindMinInsertionToFormPallindrom();
		//String str = "tldjbqjdogipebqsohdypcxjqkrqltpgviqtqz";
		String str = "qwhpsvsvpbazoxnqkrcozgdrrolqvbzjxcvjvmzufoteurpcenqunostktlyqkhldrhqbxgwqxnkrcuobpzmeembnlrprzzmjrjtjvepobemotffohndixtwtwrtpq";
		int m = f.findMiniInsertion(str, 0, str.length() - 1);
		System.out.println(m);
	}

	public int minInsertions(String s) {

		int min = findMiniInsertion(s, 0, s.length() - 1);

		return min;
	}

	Map<String, Integer> map=  new HashMap<>();
	  
	public int findMiniInsertion(String s, int start, int end) {

		if (start >= end) {
			return 0;
		}

		if(map.containsKey(""+start+end)) {
			return map.get(""+start+end);
		}
		if (s.charAt(start) == s.charAt(end)) {
			return findMiniInsertion(s, start + 1, end - 1);
		} else {
			int res = 1 + Math.min(findMiniInsertion(s, start + 1, end), findMiniInsertion(s, start, end - 1));
			map.put(""+start+end, res);
			return res;
		}

	}

}
