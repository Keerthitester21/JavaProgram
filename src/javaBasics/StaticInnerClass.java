package javaBasics;

public class StaticInnerClass 
{
	public static void main(String[] args) 
	{
		OuterClass4 oObj = new OuterClass4();
		//oObj.i;
	//	OuterClass4.j;
		OuterClass4.StaticInnerClass siObj =  new OuterClass4.StaticInnerClass();
		siObj.method();
	}

}
