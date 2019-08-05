package javaBasics;

public class StringAlternative {
	public static void main(String[] args) {
		
		
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
		
	}

}
