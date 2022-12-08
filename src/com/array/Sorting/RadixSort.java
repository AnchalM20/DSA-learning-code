package com.array.Sorting;

import java.util.Arrays;

public class RadixSort {

    public int getMax(int arr[],int n){  //to find max number i.e. number with max digit
        int max= arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }

    public void radixSort(int arr[],int n){
            int maxval = getMax(arr,n);
            for (int pos=1;maxval/pos>0;pos*=10){
                countSort(arr,n,pos);
            }
    }

    public void countSort(int arr[],int n,int pos){
        int count[] = new int[10];
        Arrays.fill(count, 0);
        int b[]=new int[n];
        for (int i=0;i<n;i++){
            ++count[(arr[i]/pos)%10];
        }
        for (int i=1;i<10;i++){
            count[i]=count[i]+count[i-1];
        }
        for (int i=n-1;i>=0;i--) {
            b[count[((arr[i] / pos) % 10)] - 1] = arr[i];
            count[(arr[i] / pos) % 10]--;
        }
        for (int i=0;i<n;i++)
            arr[i]=b[i];
    }
    void printArray(int arr[])
    {
        for (int i:arr) {
            System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {
        RadixSort rs = new RadixSort();
        int arr[] = {34,231,47,3};
        rs.radixSort(arr,arr.length);
        rs.printArray(arr);
    }
}
