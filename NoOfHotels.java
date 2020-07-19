package com.paytm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NoOfHotels {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrival = new ArrayList<>();
		ArrayList<Integer> depart = new ArrayList<>();
		
		arrival.add(1);
		arrival.add(2);
		arrival.add(3);
		arrival.add(4);

		
		depart.add(2);
		depart.add(3);
		depart.add(4);

		
		/*
		 * depart.add(10); depart.add(2); depart.add(6); depart.add(14);
		 */		
		
		System.out.println(hotel(arrival, depart, 2));
	}
	
	public static boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
	    
        Collections.sort(arrive);
        Collections.sort(depart);
        
        int tmp= 1;
        int i = 1;
        int j = 0;
        while(i < arrive.size()){
            if(arrive.get(i) >= depart.get(j) ) {
                i++;
                j++;
            } else { 
                tmp++;
                i++;
            } 
            
            if(tmp > K) {
                return false;
            }
        }
        System.out.println(tmp);
        return true;
	}
}
