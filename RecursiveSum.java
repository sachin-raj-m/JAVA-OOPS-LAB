/* 
	* Author : JEC21AD041 SACHIN RAJ M  
	* Date : 17/10/2022 Monday
	* Program No : #14
	* Aim: Java Program to input a number and display the sum of its digits using Recursion
	
*/


import java.util.Scanner;
public class RecursiveSum
{
	public static void main(String args[])
	{
		int n,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		n = sc.nextInt();
		result = sumOfDigits(n);
		System.out.println("The Sum of digits of "+n+" is: "+result);
	}
	
	public static int sumOfDigits(int n1)
	{
		int sum=0;
		if(n1==0)
		return 0;
		else
		 sum = (n1%10)+sumOfDigits(n1/10);
		return sum;
	}
}
