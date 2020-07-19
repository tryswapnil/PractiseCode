package com.paytm.lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeNumberSum {

	public static void main(String[] args) {

		int arrp[] = {-1, 0, 1, 2, -1, -4};
		System.out.println(threeSum(arrp));
	}

	public static List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				int sum = nums[i] + nums[j];
				int key = -(sum);

				if (map.containsKey(key)) {
					List<Integer> sublist = new ArrayList<>();
					
					sublist.add(nums[i]);
					sublist.add(nums[j]);
					sublist.add(key);
					list.add(sublist);
				}
			}
		}
		return list;
	}

}
