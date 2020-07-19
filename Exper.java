package com.paytm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exper {

	public static void main(String[] args) {
		
		List<Integer> notes = Arrays.asList(2000, 500, 200, 100, 50, 10, 5, 1);

		Map<Integer, Integer> noOfNotes = new HashMap<Integer, Integer>();
		int amount = 868	;

		System.out.println(amount / 2000);

		for (int i = 0; i < notes.size(); i++) {
			int note = notes.get(i);
			int rem = amount / note;
			
			if(rem > 0) {
				amount = amount - note*rem;
				noOfNotes.put(note, rem);
			}
		}

		System.out.println(noOfNotes);
	}

}
