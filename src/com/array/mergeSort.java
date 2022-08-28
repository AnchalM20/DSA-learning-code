package com.array;

import java.util.Arrays;

public class mergeSort {
    private void ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int j=0;
        for(int i=m-1;i>m-1-n;i--)
        {
            arr1[i]=arr2[j];
            if(j<arr2.length)
                j++;
        }
        Arrays.sort(arr1);
        for (int i=0;i<m;i++)
            System.out.print(arr1[i]);
    }

    public static void main(String[] args) {
        int ar1[]= {1,2,3,0,0};
        int ar2[]= {4,5};
        mergeSort obj = new mergeSort();
        obj.ninjaAndSortedArrays(ar1,ar2,5,2);
    }
}
