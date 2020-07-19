package com.paytm.lc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZigZagConversion {

	public static void main(String[] args) {

		StringBuffer sb[]= new StringBuffer[3];
		ZigZagConversion zig = new ZigZagConversion();
		//String convert = zig.convert("PAYPALISHIRING", 3);
		//System.out.println(convert);
	
		System.out.println(zig.convert("AB", 1));
	}

	public String convert(String s, int numRows) {

		  if (s==null||s.length()==0||numRows<=1) return s;
		Map<Integer, List<String>> map = new HashMap<>();

		StringBuffer sb[]= new StringBuffer[numRows];
		
		for (int i = 0; i < sb.length; i++) {
			sb[i] = new StringBuffer();
		}
		char cc[] = s.toCharArray();

		int counter = 0;
		boolean up = false;
		for (Character c : cc) {

			sb[counter].append("" + c);

			if (!up && counter < numRows) {
				if (counter == numRows - 1) {
					up = true;
					counter--;
					continue;
				}
				counter++;
			} else {
				if (counter == 0) {
					up = false;
					counter++;
					continue;
				}
				counter--;
			}
		}
		
		StringBuffer sbb = new StringBuffer();
		for (int i = 0; i < sb.length; i++) {
			sbb.append(sb[i].toString());
		}
	
		return sbb.toString();
	}
}