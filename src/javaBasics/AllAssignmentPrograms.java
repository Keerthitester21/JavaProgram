package javaBasics;
import java.util.Scanner;
public class AllAssignmentPrograms {
public void Factorial()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter some number");
		int s= sc.nextInt();
		int i,fact=1;
		for(i=s; i>0;i--) {
			fact=fact*i;
			
		}
		System.out.println("the factorial of given no  is "+ fact);
		
	}

		public int Primeornot()
{

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
	
	return primeOrNot;
}

		public void Stringalternative()
		
		{	
			
		System.out.println("the Alternative string of sunshine is");
		String str1 = "s";
		String str2 = "u";
		String str3 = "n";
		String str4 = "s";
		String str5 = "h";
		String str6 = "i";
		String str7 = "n";
		String str8 = "e";
		str1=str1.concat(str2);
		System.out.print(str1.replace('s', 'S'));
		str1=str2.concat(str3);
		System.out.print(str3.replace('n', 'N'));
		str1=str3.concat(str4);
		System.out.print(str4.replace('s', 's'));
		str1=str4.concat(str5);
		System.out.print(str5.replace('h', 'H'));
		str1=str5.concat(str6);
		System.out.print(str6.replace('i', 'i'));
		str1=str6.concat(str7);
		System.out.print(str7.replace('n', 'N'));
		str1=str7.concat(str8);
		System.out.print(str8.replace('e', 'e'));
		
		System.out.println();
	}
		
		public void VowelorNot()
		{
			
		String vowels= "a,e,i,o,u";
		Scanner sc=new Scanner(System.in);
			System.out.println("please enter a character");
		String s= sc.next();
		if(vowels.contains(s)) {
			System.out.println("the char is  vowel");
		}else {
			System.out.println("the char is consonant");
		}
		
	
		

}
		
		
	public void ReverseString()	
		
		{
		
		System.out.println("the reverse of the given string is ");
				int i;	
				String str="Keerthi Sri Sadhurla";
				String rstr="";
				for(i=str.length()-1;i>=0;i--) {
					
					rstr= rstr + str.charAt(i);		
				}	
				System.out.println(rstr);
				
		}			
		
	
	public void DuplicateString()
{
		System.out.println("the removal of duplicate string output is");
		String str="Keerthi sri";
		System.out.println(str.replaceFirst("ee", "e"));
		//System.out.println(str.replaceFirst("ri", "r"));
						
	}

	
	public void TransposeMatrix()
	{
		System.out.println(" the Transpose of the given Matrix is ");
		int[][] matrixT = { { 4, 5, 6 }, { 7, 8, 10 } };

		int i;
	
		for(i=1;i>0;i--)
		{
			
			System.out.print(matrixT[0][0] + "\t");
			System.out.print(matrixT[1][0] + "\n");
		}
		int j;
		for(j=1;j>0;j--)
		{
			System.out.print(matrixT[0][1] + "\t");
			System.out.print(matrixT[1][1] + "\n");
		}
	int k;
	for(k=1;k>0;k--)
	{
		System.out.print(matrixT[0][2] + "\t");
		System.out.print(matrixT[1][2] + "\n");
	}
	}

		
		
public static void main(String[] args) {
	
	AllAssignmentPrograms asp = new AllAssignmentPrograms();
	asp.Factorial();
	asp.Primeornot();
	asp.Stringalternative();
	asp.VowelorNot();
    asp.ReverseString();
    asp.DuplicateString();
	asp.TransposeMatrix();
	}

}

