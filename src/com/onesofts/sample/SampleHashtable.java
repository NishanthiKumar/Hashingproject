package com.onesofts.sample;

import java.util.Hashtable;

public class SampleHashtable {
	public static void main(String[] args) {
		
		Hashtable<String, String> a= new Hashtable<>(10);
		a.put("121", "Prakash");
		a.put("226", "Mani");
		a.put("331", "Nisha");
		
		for(String i:a.keySet()) {
			System.out.println(i.hashCode()+" "+ i+" "+a.get(i));
		}
	}

}
