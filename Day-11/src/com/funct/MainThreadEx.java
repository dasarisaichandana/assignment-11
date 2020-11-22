package com.funct;

public class MainThreadEx {

	public static void main(String[] args) {
		FunctThread fi=new FunctThread() {

			@Override
			public void run() {
				
				for(int i=0;i<=10;i++) {
					System.out.println(i);
				}
			}
			};
			fi.run();
			fi=()->{
				for(int i=10;i<=50;i++) {
					System.out.println(i);
				}
				};
				fi.run();
		fi=()->{
					for(int i=50;i<=75;i++) {
						System.out.println(i);}};
					fi.run();
					
		fi=()->{
			for(int i=75;i<=100;i++) {
			System.out.println(i);}};
						fi.run();
						
						

	}

}
