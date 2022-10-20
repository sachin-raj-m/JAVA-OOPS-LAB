* 
	* Author : JEC21AD041 SACHIN RAJ M  
	* Date : 10/10/2022 Monday
	* Program No : #5
	* Aim: Java Program to input two numbers and perform arithmetic operations in it.
	
*/



import java.util.Scanner;
public class Calculator
{
	public static void main(String args[])
	{
		int ch,result=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Number:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("-----Different Arithmethic Operations-----");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Enter Your Choice:");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
			{
				result = num1 + num2;
				break;
			}
			case 2:
			{
				result = num1-num2;
				break;
			}
			case 3:
			{
				result = num1*num2;
				break;
			}
			case 4:
			{
				result = num1/num2;
				break;
			}
			default: System.out.println("Invalid Choice!!! Enter Correct Choice");
		}
		System.out.println("The Result of the Arithmetic Operation = "+result);
	}
}

