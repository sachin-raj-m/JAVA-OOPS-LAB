/* 
	* Author : JEC21AD041 SACHIN RAJ M  
	* Date : 17/10/2022 Monday
	* Program No : #10
	* Aim: Java Program to input a number and generate the fibonacci series upto that term.
	
*/


import java.util.Scanner;
public class Fibonacci 
{
	public static void main(String args[])
	{
		int n,first=0,second=1,third;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		n = sc.nextInt();
		System.out.println("The Fibonacci Series are:");
		System.out.print(first+","+second);
		for(int i=2;i<n;i++)
		{
			third = second+first;
			first = second;
			second = third;
			System.out.print(","+third);
		}
	}
}
