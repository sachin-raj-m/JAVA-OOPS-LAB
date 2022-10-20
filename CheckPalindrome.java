* 
	* Author : JEC21AD041 SACHIN RAJ M  
	* Date : 10/10/2022 Monday
	* Program No : #3
	* Aim: Java Program to input a number and check whether it is palindrome or not.
	
*/


import java.util.Scanner;
public class CheckPalindrome
{
	public static void main(String args[])
	{
		int num,temp,r,s=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		num = sc.nextInt();
		temp = num;
		while(num!=0)
		{
		   r = num%10;
		   s = s*10+r;
		   num/=10;
		 }
		 
		 if(temp==s)
		 System.out.println("The number is Palindrome.");
		 else
		 System.out.println("The number is not Palindrome.");
	}
}
		
