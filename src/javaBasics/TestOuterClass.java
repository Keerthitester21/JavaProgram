package javaBasics;

public class TestOuterClass
{
	 public static void main(String[] args) {
		
		 
		 OuterClass oObj =new OuterClass(); 
		 
		        oObj.oMethod();
		       OuterClass.InnerClass iObj=oObj.new InnerClass();
		       iObj.iMethod();
		 
	}	   
	
		
	}


