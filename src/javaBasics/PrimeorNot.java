package javaBasics;


	import java.util.Scanner;

	public class PrimeorNot {
		public static void main(String[] args) {

			Scanner sc= new Scanner(System.in);
			System.out.println("enter a number");
			int primeOrNot = sc.nextInt();
			boolean flag = true;
			for(int pr = 2; pr < primeOrNot/2; pr++) {
				if(primeOrNot % pr == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println("given number is prime");
			}else {
				System.out.println("given number is not prime");
			}
			sc.close();
		}
		

	}



