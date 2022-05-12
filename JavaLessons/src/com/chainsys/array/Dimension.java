package com.chainsys.array;

public class Dimension {
	public static void creatingTwoDintArray()
	{
        int twod[][] = new int [4][5];
        int rowIndex, colIndex = 0;
        int data = 0;
        for(rowIndex=0;colIndex<4;colIndex++) 
        {
                for(colIndex = 0; colIndex<5;colIndex++)
                {
                        twod[rowIndex][colIndex] = data;
                        data++;
                        
                }
        }
        for(rowIndex = 0; rowIndex<4;rowIndex++)
        {
                for(colIndex= 0;colIndex<5;colIndex++)
                {
                        System.out.println(twod[rowIndex][colIndex]);
                }
                System.out.println();
        }
	}
	
	public static void calculateTotalandAverage()
	{
		int marks[][] = new int [][]
		{
			{82,38,45,77,55,0,0},
			{95,99,92,90,85,0,0},
			{85,100,91,92,93,0,0},
			{75,55,92,74,66,0,0},
			{85,75,58,62,75,0,0}};
		int rowIndex,colIndex,sum=0,avg=0;
		for(rowIndex = 0; rowIndex < 5; rowIndex++) {
			for(colIndex = 0; colIndex < 5; colIndex++) {
				sum += marks[rowIndex][colIndex];
			}
			marks[rowIndex][5] = sum;
			marks[rowIndex][6] = sum/5;
		}
		int subjectNo=1;
		for(subjectNo=1;subjectNo<=5;subjectNo++)
		{
			System.out.print("Sub" + (subjectNo) + "-");
		}
		System.out.println("Total - ");
		System.out.println("Avg");
		System.out.println("------------------------------------------------------------");
		//
		for(rowIndex = 0; rowIndex < 5; rowIndex++) {
			for(colIndex = 0; colIndex < 7; colIndex++) {
				System.out.print(marks[rowIndex][colIndex] + "-");
			}
			System.out.println();
		}
	}
	
	public static void fewOtherWaysOfCreatingTwoDintArray()
	{
		int []a[] = new int [4][4];
		int a1[][] = new int [4][4];
		//int a1[][] = new int [][4];  // Wrong
		int []a3[] = new int [4][];  // uneven 2D array
		int[][] a4 = new int [4][4];
		int [] [] a5 = new int [4][4];
		int []i[] = {{1,2},{3,4},{5,6}};
		//int j[] = new int[2] {1,2}; // wrong
		int k[][] = new int[][] {{1,2,3},{4,5,6}};
	}

	public static void unevenTwoArray() {
        int uneventword[][] = new int [4][];
         uneventword[0] = new int [1];
         uneventword[1] = new int [4];
         uneventword[2] = new int [3];
         uneventword[3] = new int [2];
         int rowIndex,colIndex,rowlength = 0,data = 100;
         for(rowIndex = 0;rowIndex <5;rowIndex++) {
                 rowlength = uneventword[rowIndex].length;
                 for(colIndex = 0;colIndex < rowlength;colIndex++) {
                         uneventword[rowIndex][colIndex] = data;
                         data++;
                 }
         }
         for(rowIndex = 0; rowIndex < 4;rowIndex++) {
             rowlength = uneventword[rowIndex].length;
             for(colIndex = 0;colIndex <rowlength;colIndex++) {
                     System.out.println(uneventword[rowIndex][colIndex]+ " ");
             }
             System.out.println();
     }
         
        
}
}