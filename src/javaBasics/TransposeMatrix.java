package javaBasics;

public class TransposeMatrix {
	
	public static void main(String[] args) {
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

	}

