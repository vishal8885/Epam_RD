package com.sort;

public class MergeSort {

	public static void  sort(int a[], int start, int end) {
		if(start < end) {
			int mid = (start+end)/2;
			sort(a,start,mid);
			sort(a,mid+1,end);
			merge(a,start,mid,end);
		}
	}
	
	public static void merge(int a[],int start, int mid, int end) {
		//left
		int left[]= new int[mid-start+2];
		for(int i=start;i<mid+1;i++)
			left[i - start]=a[i];
		left[mid-start+1]= Integer.MAX_VALUE;
		//right
		int right[]= new int[end-mid+1];
		for(int i=mid+1;i<end+1;i++)
			right[i - mid -1]=a[i];
		right[end-mid]= Integer.MAX_VALUE;
		//merge
		int i=0,j=0;
		for(int k=start;k<end+1;k++) {
			if(left[i] < right[j])
				a[k] = left[i++];
			else
				a[k] = right[j++];
		}
	}
}
