/* 
	* Author : JEC21AD041 SACHIN RAJ M  
	* Date : 17/10/2022 Monday
	* Program No : #9
	* Aim: Java Program to input a number and display the factorial of it using CommandLine
	
*/


public class FactorialCmd
{
	public static void main(String args[])
	{
		int num,fact=1;
		num = Integer.parseInt(args[0]);
		for(int i=1;i<=num;i++)
			fact*=i;
		System.out.println("Factorial of "+num+": "+fact);
	}
}
