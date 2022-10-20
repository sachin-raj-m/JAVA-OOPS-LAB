/* 
	* Author : JEC21AD041 SACHIN RAJ M  
	* Date : 17/10/2022 Monday
	* Program No : #11
	* Aim: Java Program to input a number and display the factorial of it
	
*/


import java.util.Scanner;
public class MatrixMultiply
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
		int pro[][] = new int[r][c];
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
				b[i][j] = sc.nextInt();
			}
		}
		

		for(int i=0;i<r;i++)				//finding the product
		{
			for(int j=0;j<c;j++)
			{
				for(int k=0;k<c;k++)
				{
				pro[i][j]+= a[i][k]*b[k][j];        
				}
			}
		}
		System.out.println("Product of Two Matrices are:");
		for(int i=0;i<r;i++)									//Displaying the Matrix Product
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(pro[i][j]+"\t");
			}
			System.out.println();
		}
	}
		
}
