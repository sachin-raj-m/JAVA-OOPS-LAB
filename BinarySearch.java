/* 
	* Author : JEC21AD041 SACHIN RAJ M  
	* Date : 03/11/2022 Thursday
	* Program No : #19
	* Aim: Java Program to implement Binary Search using Arrays
	
*/
import java.util.Scanner;
public class BinarySearch
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
		System.out.println("Enter the element to Search:");
		item = sc.nextInt();
		
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
		
		int l=0,u=n-1,mid;		
		while(l<=u){
			mid = (l+u)/2;
			if(a[mid]==item){
			System.out.println("Item Found in Position "+(mid+1)+".");
			break;
			}
			else if(a[mid]<item)
			l= mid+1;
			else
			u=mid+1;
		}
		if(l>u)
		System.out.println("Search Unsuccessfull. Item Not Found.");
	}
}

