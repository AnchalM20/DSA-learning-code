package com.array.Sorting;

import java.util.Arrays;

public class MergeSort {
    void mergeSort(int arr[],int i,int j){
      if(i<j) {
          int mid = (i +j)/ 2;
          mergeSort(arr, i, mid);
          mergeSort(arr, mid + 1, j);
          merge(arr,i,mid,j);
      }
    }
    void merge(int arr[],int lower,int mid,int upper){
        int k=lower;
        int i=lower;
        int j=mid+1;
        //int L[] = new int[n1];
        int ans[]=new int[arr.length];
        while(i<=mid && j<=upper){
            if(arr[i]<=arr[j]){
                ans[k]=arr[i];
                i++;
            }
            else{
                ans[k]=arr[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=upper)
            {ans[k]=arr[j];
            k++;
            j++;}
        }
        if(j>upper) {
            while(i<=mid){
            ans[k]=arr[i];
            i++;
            k++;
            }
        }

        for (int m=lower;m<=upper;m++)
            arr[m]=ans[m];
    }
    public static void main(String[] args) {
        int arr[]={45,32,12,34,56,3,15,18,78};
        MergeSort ms = new MergeSort();
        ms.mergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
