package javaBasics;

public class OuterClass 
{
	

public void oMethod()
 {
	 System.out.println("This is outer method ");
	 
 }

 public class InnerClass {

	public void iMethod() {
		 System.out.println("inner class method ");
			oMethod();
			System.out.println("member inner classes demo");
		
		 }
	}
   
 }

  

