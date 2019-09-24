package javaBasics;

public class OuterClass4
{
	int i;
	static int j=10;
	static class StaticInnerClass
	{
		public void method()
		{
			System.out.println(j);
			//System.out.println("the value of i is "+i);
		}
	}


	public static void main(String[] args) 
	{
		OuterClass4 oObj = new OuterClass4();
	//oObj.i;
	//	oObj.j;
		OuterClass4.StaticInnerClass siObj =  new OuterClass4.StaticInnerClass();
		siObj.method();
	}

}

