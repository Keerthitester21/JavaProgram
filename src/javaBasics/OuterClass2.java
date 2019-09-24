package javaBasics;

public class OuterClass2 
{
   MyInterface inObj = new MyInterface()
		   {
	          public void method()
	          {
	        	  System.out.println("MyInterface definition in Anonymous Class");
	          }
		   };

		 /*  public static void main(String[] args) 
		   
		   {
			OuterClass2 oObj =new  OuterClass2();
		oObj.inObj.method();
		}*/


}


 