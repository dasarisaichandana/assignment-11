package com.funct;

import java.util.ArrayList;
import java.util.Arrays;

public class StringMain  {

	public static void main(String[] args) {
		//ArrayList al=new ArrayList();
		String s[]= {"sai","susmitha","echandu","pinky"};
		String1 sr=(a)->{
		
		String []s1=a;
		Arrays.sort(s1,(str1,str2)->str1.length()-str2.length());
		System.out.println(Arrays.asList(s1));
		
		};
		sr.result(s);
	
String1 sr1=(a)->{
		
		String []s1=a;
		Arrays.sort(s1,(str1,str2)->str2.length()-str1.length());
		System.out.println(Arrays.asList(s1));
		
		};
		sr1.result(s);
String1 sr2=(a)->{
			
			String []s1=a;
			for(int i=0;i<s1.length;i++) {
				int c=s1[i].charAt(0);
				System.out.println(c);
			}
			
			};
			sr2.result(s);
			
String1 sr3=(a)->{
				String []s1=a;
				String s2[]=new String[s1.length];
				String s3[]=new String[s1.length];
				int j=0;
				for(int i=0;i<s1.length;i++) {
					//char d='e';
				char d=s1[i].charAt(0);
				 
				if(d=='e') {
					s2[j]=s1[i];
					System.out.println(s2[j]);
					
				}
				else if(d!=101){
					s3[j]=s1[i];
					System.out.println(s3[j]);
				}
						}
				
				
				};
				sr3.result(s);
			}
		}
	

