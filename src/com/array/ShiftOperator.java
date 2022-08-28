package com.array;

public class ShiftOperator {
    private void decimalToBinary(int n){
        int arr[]=new int[10];
        int i=0;
        while (n!=0 && i< arr.length){
            arr[i++]= n%2;
            n=n/2;

        }
        for (int j=arr.length-1;j>=0;j--) {
            System.out.print(arr[j]);
        }
    }
    public static void main(String[] args) {
        int n=500;
        System.out.println(Integer.toBinaryString(10));
        ShiftOperator obj = new ShiftOperator();
        System.out.println("Binary of "+n);
        obj.decimalToBinary(n);
        System.out.println();
        System.out.println("Bitwise AND "+ (3 & 5)); //0011 & 0101 = 0001
        System.out.println("Bitwise OR "+ (3 | 5));
        System.out.println("Bitwise NOT "+ ~4);
        System.out.println("Right Shift -----------"); //divide number by 2 for each shift
        System.out.println(5>>1);
        System.out.println(5>>2);
        System.out.println(38>>2);
        System.out.println("Left shift -------------"); //double the number for each shift
        System.out.println(5<<2);
        System.out.println(12<<1);
        System.out.println(21<<2);

//        int n=7216;
//        int sum=0;
//        int dig=1;
//        while(n!=0){
//            dig=dig*(n%10);
//            sum=sum+(n%10);
//            n=n/10;
//        }
//        System.out.println("Difference product-sum: "+ (dig-sum));
    }
}
