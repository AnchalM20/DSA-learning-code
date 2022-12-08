package com.array.Sorting;

public class QuickSort {

    void quickSort(int arr[],int low,int high){
        int pi = partition(arr,low,high);
        if (low<pi)
            partition(arr,low,pi-1);
        if (pi<high)
            partition(arr,pi,high);
    }
    int partition(int arr[],int low,int high){
        int pivot = arr[(low+high)/2];
        while(low<=high){
            while(arr[low]<pivot)
                low++;
            while (arr[high]>pivot)
                high--;
            //swap if left of pivot has number greater than pivot
            if(low<=high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }

    void printArray(int arr[])
    {
        for (int i:arr) {
            System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int arr[]={12,3,13,6,1,15,35};
        qs.quickSort(arr,0, arr.length-1);
        qs.printArray(arr);

    }
}
