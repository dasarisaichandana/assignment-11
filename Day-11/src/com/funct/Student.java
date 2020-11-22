package com.funct;

public class Student {
	String name;
	int sid;
	int mathsmarks;
	int sciencemarks;
	int socialmarks;
	public Student(String name, int sid, int mathsmarks, int sciencemarks, int socialmarks) {
		
		this.name = name;
		this.sid = sid;
		this.mathsmarks = mathsmarks;
		this.sciencemarks = sciencemarks;
		this.socialmarks = socialmarks;
	}
	@Override
	public String toString() {
		
		return ("name="+name+"sid="+sid+"mathsmarks="+mathsmarks+"sciencemarks="+sciencemarks+"socialmarks="+socialmarks);
	}
	
	

}
