package com.onesofts.sample;

import java.util.HashMap;

public class UseEmp {
	public static void main(String[] args) {
		
		Emp e1=new Emp(101,"Nisha",50000,"Female");
		Emp e2=new Emp(104,"Prathap",80000,"Male");
		Emp e3=new Emp(101,"Nisha",50000,"Female");
		Emp e4=new Emp(105,"Kumar",70000,"Male");
		Emp e5=new Emp(1,"Nishanthi",60000,"Female");
		
		HashMap<Integer, Emp> emps= new HashMap<>();
		emps.put(e1.getId(), e1);emps.put(e2.getId(), e2);emps.put(e3.getId(), e3);
		emps.put(e4.getId(), e4);emps.put(e5.getId(), e5);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e1.equals(e3));
		//System.out.println(emps.get(e2));
		
	}

}
