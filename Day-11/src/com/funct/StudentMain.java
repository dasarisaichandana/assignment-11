package com.funct;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements:");
		int n=sc.nextInt();
		ArrayList<Student> al=new ArrayList<>();
		for(int i=0;i<n;i++) {
			System.out.println("enter student name:");
			String name=sc.next();
			System.out.println("enter student id:");
			int sid=sc.nextInt();
			System.out.println("enter student maths:");
			int mathsmarks=sc.nextInt();
			System.out.println("enter student science:");
			int sciencemarks=sc.nextInt();
			System.out.println("enter student social:");
			int socialmarks=sc.nextInt();
			
		Student s=new Student(name,sid,mathsmarks,sciencemarks,socialmarks);
		al.add(s);
		double total=(mathsmarks+sciencemarks+socialmarks);
		System.out.println(total);
		double per=(total/300)*100;
		System.out.println(per);
		if(per<=100&&per>=85) {
			System.out.println("A grade");
		}
		else if(per<85&&per>=65) {
			System.out.println("B grade");
		}
		else if(per<65&&per>=45) {
			System.out.println("c grade");
		}
		else if(per<45&&per>=0) {
			System.out.println(" fail");
		}
		
		}
		
		System.out.print(al);
		@SuppressWarnings("unchecked")
		ArrayList al1= (ArrayList) al.stream().filter(p->p.mathsmarks<45)
				.map(p->p)
				.collect(Collectors.toList());
		System.out.println(al1);
		ArrayList al2= (ArrayList) al.stream().filter(q->q.sciencemarks<45)
				.map(q->q)
				.collect(Collectors.toList());
		System.out.println(al2);
		ArrayList al3= (ArrayList) al.stream().filter(r->r.socialmarks<45)
				.map(r->r)
				.collect(Collectors.toList());
		System.out.println(al3);





	}

}
