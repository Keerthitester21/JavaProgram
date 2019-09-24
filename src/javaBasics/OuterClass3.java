package javaBasics;

public class OuterClass3 
{
   public void outerMethod()
   {
	  //System.out.println("This is an outer method definition in the outer class");
	final class LocalInnerClass {
		 void innermethod()
		 {
			 System.out.println("This is an inner Method definition inside the local Inner class");
		
		 }
	 }
	  System.out.println("This is an outer method statements outside the  outermethod ");
	 LocalInnerClass liObj= new LocalInnerClass();
	 
	 liObj.innermethod();
	 System.out.println("These are the Statements outside of the local Inner class method");
	 }
   
}
   

