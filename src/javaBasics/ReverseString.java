package javaBasics;

public class ReverseString {
	public static void main(String[] args) {
		
	
	int i;	
	String str="Keerthi Sri";
	String rstr="";
	for(i=str.length()-1;i>=0;i--) {
		
		rstr= rstr + str.charAt(i);		
	}	
	System.out.println(rstr);
	
	}
}
