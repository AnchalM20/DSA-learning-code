package com.array.Sorting;

public class BubbleSort {

    public static void bubbleSort(int arr[],int n){
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
    }
    public static void main(String[] args) {
        int arr[]={23,15,15,5,67};
        bubbleSort(arr, arr.length);
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
