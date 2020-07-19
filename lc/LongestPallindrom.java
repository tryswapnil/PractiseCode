package com.paytm.lc;

public class LongestPallindrom {

	public static void main(String[] args) {
		
		int maxLength = 0;
		int start = 0;
		int end = 0;
		String s = "";
		for (int i = 0; i < s.length(); i++) {
			MetaInfo len = identify(s, i, i);
			MetaInfo len2 = identify(s, i, i+1);
			
            if(maxLength < len.length) {
				maxLength = len.length;
				start = len.start;
				end  = len.end;
			}
            
            if(maxLength < len2.length) {
				maxLength = len2.length;
				start = len2.start;
				end  = len2.end;
			}
		}
		
		System.out.println(maxLength);
		System.out.println(start);
		System.out.println(end);
		System.out.println(s.substring(start, end+1));
	}

	private static MetaInfo identify(String str, int left, int right) {
		
		MetaInfo info = new MetaInfo();
		int length = 1;
		int start = 0;
		int end = str.length();
		while (left >= start && right < end) {
			if(str.charAt(left) == str.charAt(right)) {
				info.start = left;
				info.end = right;
				left = left-1;
				right =  right+1;
				length  = length+1;
			} else {
				break;
			} 
		}
		int sub = (info.end) - (info.start);
		info.length = sub+1;
		return info;
	}
	
	static class MetaInfo {
		int start;
		int end;
		int length;
		public MetaInfo(int start, int end, int length) {
			this.start = start;
			this.end = end;
			this.length = length;
		}
		public MetaInfo() {
			// TODO Auto-generated constructor stub
		}
	}
}
