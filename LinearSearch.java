/* 
	* Author : JEC21AD041 SACHIN RAJ M  
	* Date : 03/11/2022 Thursday
	* Program No : #18
	* Aim: Java Program to implement Linear Search using Arrays
	
*/
import java.util.Scanner;
public class LinearSearch
{
	public static void main(String args[])
	{
		int size,item,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the elements of  Array:");
		for(int i=0;i<size;i++)
				a[i] = sc.nextInt();
		System.out.println("Enter the element to Search:");
		item = sc.nextInt();
		for(int i=0;i<size;i++)
		{
			if(a[i]==item){
			System.out.println("Item Found in Position "+(i+1)+".");
			flag++;
			break;
		  }
	    }
	    if(flag==0)
	    System.out.println("Search Unsuccessfull. Item not Found.");
	}
}
