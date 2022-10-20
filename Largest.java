* 
	* Author : JEC21AD041 SACHIN RAJ M  
	* Date : 10/10/2022 Monday
	* Program No : #2
	* Aim: Java Program to input two numbers and display the greatest of it
	
*/


import java.util.Scanner;
public class Largest
{
	public static void main(String args[])
	{
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if(num1>num2)
		System.out.println(num1+"is the greatest.");
		else
		System.out.println(num2+" is the greatest.");
	}
}
