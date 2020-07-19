package com.paytm.lc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class IntToRoman {

	public static void main(String[] args) {

		System.out.println(intToRoman(
				1994));
		
		List<Integer> list = new ArrayList<Integer>();
		
	}

	public static String intToRoman(int num) {

		TreeMap<Integer, String> tree = new TreeMap<>((x, y) -> Integer.compare(y, x));
		tree.put(1000, "M");
		tree.put(900, "CM");
		tree.put(500, "D");
		tree.put(400, "CD");
		tree.put(100, "C");
		tree.put(90, "XC");
		tree.put(50, "L");
		tree.put(40, "XL");
		tree.put(10, "X");
		tree.put(9, "IX");
		tree.put(5, "V");
		tree.put(4, "IV");
		tree.put(1, "I");

		StringBuilder sb = new StringBuilder();

		Set<Integer> keys = tree.keySet();
		Iterator<Integer> itr = keys.iterator();
		int val = itr.next();
		while (num != 0) {
			

			if (num % val != num) {
				sb.append(tree.get(val));
				num = num -val;
			} else {
				if(itr.hasNext()) {
				val = itr.next();
				}
			}
		}

		return sb.toString();
	}
}
