package javaBasics;
import java.util.Scanner;
public class VowelsorNot {
	public static void main(String[] args) {
		String vowels= "a,e,i,o,u";
		Scanner sc=new Scanner(System.in);
			System.out.println("please enter a character");
		String s= sc.next();
		if(vowels.contains(s)) {
			System.out.println("the char is  vowel");
		}else {System.out.println("the char is consonant");
		}
		
		sc.close();
		

}

}
