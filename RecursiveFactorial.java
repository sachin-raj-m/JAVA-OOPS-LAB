/* 
	* Author : JEC21AD041 SACHIN RAJ M  
	* Date : 17/10/2022 Monday
	* Program No : #13
	* Aim: Java Program to input a number and display the factorial of it using Recursion
	
*/


import java.util.Scanner;
public class RecursiveFactorial
{
	public static void main(String args[])
	{
		int n,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		n = sc.nextInt();
		result = fact(n);
		System.out.println("The Factorial of "+n+" is: "+result);
	}
	
	public static int fact(int n1)
	{
		if(n1==1)
		return 1;
		else
		return n1*(fact(n1-1));
	}
}
