/* 
	* Author : JEC21AD041 SACHIN RAJ M  
	* Date : 03/11/2022 Thursday
	* Program No : #20
	* Aim: Java Program to implement Bubble Sort using Arrays
	
*/
import java.util.Scanner;
public class BubbleSort
{
	public static void main(String args[])
	{
		int n,item,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of  Array:");
		for(int i=0;i<n;i++)
				a[i] = sc.nextInt();
		
		for(int i=0;i<n;i++){				//sorting using Bubble Sort Algorithm
			for(int j=i+1;j<n;j++){
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted Array:");
		for(int i=0;i<n;i++)
		System.out.print(a[i]+"\t");
	}
}
