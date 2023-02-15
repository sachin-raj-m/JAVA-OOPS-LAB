* 
	* Author : JEC21AD041 SACHIN RAJ M  
	* Date : 10/10/2022 Monday
	* Program No : #6
	* Aim: Java Program to input a String and check whether it is palindrome or not.
	
*/


import java.util.Scanner;
public class StringPalindrome
{
	public static void main(String args[])
	{
		String str,revstr="";
		System.out.println("Enter a String:");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		int l = str.length();
		for(int i=l-1;i>=0;i--)
		 revstr+= str.charAt(i);
		 
		 if(revstr.equalsIgnoreCase(str))
		 System.out.println("The given string is Palindrome.");
		 else
		 System.out.println("The given string is not Palindrome.");
	 }
 }

