package com.onesofts.sample;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SampleList {
	public static void main(String[] args) {
		
		List<String>a =new CopyOnWriteArrayList<>();
		a.add("Nisha");a.add("Kumar");a.add("Prathap");
		for(String x:a) {
			System.out.println(x);
			a.remove("Kumar");
		}
		
		System.out.println(a);
		
		
	}

}
