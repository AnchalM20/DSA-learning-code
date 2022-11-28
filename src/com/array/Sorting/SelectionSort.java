package com.array.Sorting;

public class SelectionSort {

   void selectionSort(int arr[],int n){
        int min;
        for(int i=0;i<n-1;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            if(min!=i){
                int temp = arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int arr[] = {23,45,14,27,24,34,3,10};
        ss.selectionSort(arr,arr.length);
        ss.printArray(arr);

        }
}
