package com.array;

import java.util.*;

public class ArrayBasic {

    // -------------------- 1. SwapAlternate --------------------
   private int [] swapAlternate(int arr[])
    {
        int temp=0;
        for (int i=0;i<arr.length-1;i=i+2)
        {
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        return arr;
    }

// -------------------- 2. Unique Element in an Array ----------------------------
    public int uniqueElement(int arr[])
    {
      int temp=0;
       for (int i=0;i< arr.length;i++)
       {
           temp=arr[i]^temp;       //X-OR operation to find unique(non-repeated)
       }
       return temp;
    }


 // ----------------------- 3. Find Duplicate Element in an Array ----------------------------
   private ArrayList<Integer> findDuplicate(int[] arr)
   {
        Map<Integer, Integer> mp = new HashMap<>();
        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < arr.length; i++)
        {
            if (mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer,Integer> m: mp.entrySet()) {      //to traverse Map & to access keys and values
            if(m.getValue()>1)
                ans.add(m.getKey());
        }
        return ans;
    }

//--------------------- 4. count of Distinct Elements in an Array -------------------------
    private int findDistinct(int arr[])
    {
        Set<Integer> ans = new TreeSet<>();
        for (int i=0;i<arr.length;i++){
            ans.add(arr[i]);
        }
        return ans.size();
    }

 //--------------------- 5.Union of Two Array ----------------------------

private ArrayList<Integer> findUnion(int arr1[],int arr2[]){
//  Set<Integer> ans =new HashSet<>();
//    int i=0;
//    int j=0;
//    Arrays.sort(arr1);
//    printArray(arr1);
//    System.out.println();
//    Arrays.sort(arr2);
//    printArray(arr2);
//    System.out.println();
//    while (i<arr1.length && j< arr2.length) {
//        if (arr1[i] == arr2[j]) {
//            ans.add(arr1[i]);
//            i++;
//            j++;
//        }
//        if (i<arr1.length && j<arr2.length && arr1[i] < arr2[j]) {
//            ans.add(arr1[i]);
//            i++;
//        }
//        if (j<arr2.length && i<arr1.length && arr2[j] < arr1[i]) {
//            ans.add((arr2[j]));
//            j++;
//        }
//    }
//    while (i< arr1.length){
//        ans.add(arr1[i]);
//        i++;
//    }
//    while (j< arr2.length){
//        ans.add(arr2[j]);
//        j++;
//    }
//    return ans;

    ArrayList<Integer> ans = new ArrayList<>();
    Map<Integer,Integer> map = new TreeMap<>();
    for (int i=0;i<arr1.length;i++)
    {
        if(!map.containsKey(arr1[i]))
            map.put(arr1[i],1);
    }
    for (int j=0;j<arr2.length;j++)
    {
       if(!map.containsKey(arr2[j]))
           map.put(arr2[j],1);
    }
    for(Map.Entry<Integer,Integer> e: map.entrySet()){
        ans.add(e.getKey());
    }

   return ans;
}

//----------------------- 5.Intersection of Two Array ----------------------------

private ArrayList<Integer> findIntersection(int arr1[],int arr2[])
{
    ArrayList<Integer> ans = new ArrayList<>();
    int i=0;
    int j=0;
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    while (i<arr1.length && j< arr2.length) {
       if (arr1[i] == arr2[j]) {
           ans.add(arr1[i]);
           i++;
          j++;
       }
       if (i<arr1.length && j<arr2.length && arr1[i] < arr2[j]) {
            i++;
        }
        if (j<arr2.length && i<arr1.length && arr2[j] < arr1[i]) {
            j++;
        }
    }
    return ans;


    }


    public static void main(String[] args)
    {
//        int arr1[]={1,4,2,3,5,8};  //2 3 4 5
//        int arr2[]={6,7,4,2,5,6,7,8,1};  //2 4 5 6 6 7


       // ArrayBasic ab = new ArrayBasic();

//        System.out.println("1.Swapping alternate values: ");
//        ab.printArray(ab.swapAlternate(arr));
//        System.out.println("\n---------------------------------------------------");
//
//        System.out.println("2.Unique element in an Array");
//        System.out.println(ab.uniqueElement(arr));
//        System.out.println("\n---------------------------------------------------");
//
//        System.out.println("3.Find element in an Array");
//        System.out.println(ab.findDuplicate(arr));
//        System.out.println("\n---------------------------------------------------");
//
//        System.out.println("4.Count distinct element in an Array");
//        System.out.println(ab.findDistinct(arr));
//        System.out.println("\n---------------------------------------------------");

//        System.out.println("5.Find Intersection of Two Array");
//        System.out.println(ab.findIntersection(arr1,arr2));
 //       System.out.println("\n---------------------------------------------------");

//        System.out.println("5.Find Intersection of Two Array");
//        System.out.println(ab.findIntersection(arr1,arr2));
//        System.out.println("\n---------------------------------------------------");

    }

    private void printArray(int arr[])
    {
        for(int i=0;i< arr.length;i++)
            System.out.print(arr[i]+",");
    }

}

