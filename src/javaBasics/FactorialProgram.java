package javaBasics;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter some number");
		int s= sc.nextInt();
		int i,fact=1;
		for(i=s; i>0;i--) {
			fact=fact*i;
			sc.close();
		}
		System.out.println("the factorial of given no  is "+ fact);
		
	}
}

