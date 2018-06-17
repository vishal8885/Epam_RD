package com.sort;


public class App 
{
    public static void main( String[] args )
    {
        int a[] = {2,6,1,3,8,0,4};
       QuickSort.sort(a,0,a.length-1);
        for(int i = 0; i < a.length; i++) {
        	System.out.print(a[i]+" ");
        }
    }
}
