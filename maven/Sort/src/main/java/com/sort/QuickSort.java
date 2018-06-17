package com.sort;

public class QuickSort {
	public static void sort(int a[], int low,  int high) {
		int i = low, j = high;
		int temp;
		int pivot = a[(low+high)/2];
		
		while(i<=j) {
			while(a[i]  < pivot)
				i++;
			while(a[j]  > pivot)
				j--;
			if(i <= j) {
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				
				i++;
				j--;
			}
		}
		
		if(low<j)
			sort(a,low,j);
		if(i<high)
			sort(a,i,high);
	}
}
