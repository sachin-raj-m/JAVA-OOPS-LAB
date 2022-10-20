/* 
	* Author : JEC21AD041 SACHIN RAJ M  
	* Date : 17/10/2022 Monday
	* Program No : #8
	* Aim: Java Program to input a number and display the factorial of it
	
*/


import java.util.Scanner;
public class Factorial
{
	public static void main(String args[])
	{
	int n,fact=1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number: ");
	n = sc.nextInt();
	for(int i=1;i<=n;i++)
	  fact*= i;
	System.out.println("The Factorial of "+n+":"+fact);
	}	
}
