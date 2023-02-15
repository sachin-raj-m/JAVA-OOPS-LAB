/* 
	* Author : JEC21AD041 SACHIN RAJ M  
	* Date : 17/10/2022 Monday
	* Program No : #12
	* Aim: Java Program to input a number and display the factorial of it
	
*/

import java.util.Scanner;
public class MatrixTranspose
{
	public static void main(String args[])
	{
		int r,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and columns of Matix:");
		r = sc.nextInt();
		c = sc.nextInt();
		int a[][] = new int[r][c];
		int transposed[][] = new int[r][c];
		System.out.println("Enter the elements of Matrix:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Transpose of the Matrix:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				transposed[i][j] = a[j][i];      //storing the transposed matrix by interchanging the loop variables to matirx 'a'
				System.out.print(transposed[i][j]+"\t");
		}
		System.out.println();
		}
	}
}

