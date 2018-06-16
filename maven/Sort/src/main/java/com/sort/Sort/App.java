package com.sort.Sort;


public class App 
{
    public static void main( String[] args )
    {
        int a[] = {2,6,1,3,8,0,4};
        BubbleSort.sort(a);
        for(int i = 0; i < a.length; i++) {
        	System.out.print(a[i]+" ");
        }
    }
}
