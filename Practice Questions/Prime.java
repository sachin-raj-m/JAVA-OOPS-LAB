* 
	* Author : JEC21AD041 SACHIN RAJ M  
	* Date : 10/10/2022 Monday
	* Program No : #4
	* Aim: Java Program to input a number and check whether it is prime or not.
	
*/


import java.util.Scanner;
public class Prime
{
	public static void main(String args[])
	{
		int num,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		num = sc.nextInt();
		for(int i=2;i<num/2;i++)
		{
		 if(num==2)
		 {
			 flag = 1;
			 break;
		 }
		 else if(num%i==0)
		 {
			flag = 0;
			break;
		 }
		else
		 flag = 1;
		}
		if(flag==1)
		System.out.println("The Number is Prime.");
		else
		System.out.println("The Number is not Prime.");
	}
		 
		 
}
		
