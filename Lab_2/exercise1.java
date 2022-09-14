// Arrange the elements in the ascending and descending order using bubble sort method

import java.util.*;

public class exercise1
{
	public static void main(String args[]) {
		int n; // Number of elements
		int temp; // Variable for swap
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		n = sc.nextInt();
		int arr[] = new int[n];
		int asc[] = new int[n];
		int des[] = new int[n];
		System.out.print("Enter the elements: ");
		for(int i=0; i<n; i++) 
		{
			arr[i] = sc.nextInt();
			asc[i] = des[i] = arr[i];
		}
		// Bubble sort 
		for(int i=0; i<n-1; i++) 
		{
			for(int j=0; j<n-i-1; j++)
			{
				// For ascending order
				if(asc[j] > asc[j+1]) 
				{
					temp = asc[j];
					asc[j] = asc[j+1];
					asc[j+1] = temp;
				}
				// For descending order
				if(des[j] < des[j+1]) 
				{
					temp = des[j];
					des[j] = des[j+1];
					des[j+1] = temp;
				}
			}
		}
		System.out.println("The array sorted in ascending order: ");
		for(int i=0; i<n; i++) 
		{
			System.out.print(asc[i] + "  ");
		}
		System.out.println("\nThe array sorted in descending order: ");
		for(int i=0; i<n; i++) 
		{
			System.out.print(des[i] + "  ");
		} 
		System.out.println();
	}
}
