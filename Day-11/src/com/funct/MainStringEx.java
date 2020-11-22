package com.funct;

public class MainStringEx  {

	public static void main(String[] args) {
		FunctInterface len=new FunctInterface() {

			@Override
			public void things(String a, String b) {
				System.out.println("length="+a.length());
				System.out.println("length="+b.length());
				
				
			}
			
		};
		len.things("sasi","sasu");
		 len=( a, b)->{System.out.println("concate string="+a.concat(b));};
		len.things("sai","chandana");
		len=( a, b)->{System.out.println("equals"+a.equals(b));};
		len.things("sai","susu");

	}

	

}
