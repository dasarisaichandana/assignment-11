package com.funct;

import java.util.TreeSet;

public class FunctComparator {

	public static void main(String[] args) {
		TreeSet <Integer>ts=new TreeSet<>((Object o1,Object o2)->{
			Integer i=(Integer)o1;
			Integer j=(Integer)o1;
			if(i<j) {
				return 1;
			}
			else
			{
				return -1;
			}
			
		}
		);
		ts.add(65);
		ts.add(34);
		ts.add(22);
		ts.add(45);
		ts.add(4);
		System.out.println(ts);

	}

}
