package javaBasics;

public class TransposeMatrix {
	public static void main(String[] args) {
		int[][] matrixT = { { 4, 5, 6 }, { 7, 8, 10 } };

		// retrieve the data in correct order
		//first row
		System.out.print(matrixT[0][0] + "\t");
		System.out.print(matrixT[0][1] + "\t");
		System.out.print(matrixT[0][2] + "\n");
		// second row
		System.out.print(matrixT[1][0] + "\t");
		System.out.print(matrixT[1][1] + "\t");
		System.out.print(matrixT[1][2] + "\n");
		System.out.println("###################");
		// retrieve the data in transpose/reverse
		//first row 
		System.out.print(matrixT[0][0] + "\t");
		System.out.print(matrixT[1][0] + "\n");
		//second row
		System.out.print(matrixT[0][1] + "\t");
		System.out.print(matrixT[1][1] + "\n");
		//third row
		System.out.print(matrixT[0][2] + "\t");
		System.out.print(matrixT[1][2] + "\n");
	
		
	}

}
