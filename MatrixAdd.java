/* 
	* Author : JEC21AD041 SACHIN RAJ M  
	* Date : 10/10/2022 Monday
	* Program No : #7
	* Aim: Java Program to input two matrices and display the sum of it
	
*/


import java.util.Scanner;
public class MatrixAdd
{
	public static void main(String args[])
	{
		int r,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and columns of Matix:");
		r = sc.nextInt();
		c = sc.nextInt();
		int a[][] = new int[r][c];
		int b[][] = new int[r][c];
		int sum[][] = new int[r][c];
		System.out.println("Enter the elements of First Matrix:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
        System.out.println("Enter the elements of Second Matrix:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Sum of Two Matrices are:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				sum[i][j] = a[i][j] + b[i][j];
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
