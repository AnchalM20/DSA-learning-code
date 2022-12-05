package com.array.Sorting;


import java.util.Arrays;

//Time complexity o(n^2)
public class InsertionSort {
    public static void insertionSort(int arr[],int n) {
        int sorted;
        for (int i = 1; i < n; i++) {
            int temp =arr[i];
            int j=i;
            while(j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j = j-1;
            }
            arr[j]=temp;
        }
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        int arr[]={23,14,12,17,34,25};
        insertionSort(arr,arr.length);
        //System.out.println(Arrays.toString());
    }
}
