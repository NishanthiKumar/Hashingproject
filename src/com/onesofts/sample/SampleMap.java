package com.onesofts.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SampleMap {
	public static void main(String[] args) {
		Map<Integer, String>a =new ConcurrentHashMap<>();
		a.put(1, "Nisha");
		a.put(2, "Prathap");
		a.put(3, "Karthi");
		a.put(4, "Kumar");
		a.put(5, "Selvi");
		
//		for(Integer x:a.keySet()) {
//			System.out.println(x);
//			a.put(6, "Mani");
//		}
		
		for(Integer x:a.keySet()) {
			a.remove(3);
		    //a.remove(x);
			System.out.println(a.get(x));
			
		}
		
		//System.out.println(a);
		
	}

}
