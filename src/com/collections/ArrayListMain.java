package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList(); //ArrayList creation
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(2,200);  //to add number at particular index
        number.set(0,100);              //to set number
        System.out.println(number);
        List<Integer> name = new ArrayList();
        name.add(50);
        name.add(60);
        number.addAll(name); //to add all element of another list
        System.out.println(number);
        System.out.println(number.get(1));  //will return value of index 1



        /* ArrayList<Integer> number = new ArrayList();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        System.out.println(number);

        System.out.println(number.contains(30)); //to check whether list contains elements or not
        System.out.println(number.contains(300));

        number.remove(2); //will remove element at 2 index
        System.out.println(number);
        number.remove(Integer.valueOf(40)); //will remove 40 element
        System.out.println(number);

        number.clear();  //clear all element from list
        System.out.println(number);

        */

      /*  //to iterate list value
        ArrayList<Integer> number = new ArrayList();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        System.out.println(number);

        //Using for loop
        for (int i=0;i<number.size();i++){
            System.out.println("Number is "+number.get(i));
        }

        // Using For-each loop
        for(Integer element:number) {
            System.out.println("For-each "+element);
        }

        //Using iterator
        Iterator<Integer> it = number.iterator();
        while(it.hasNext())
        {
            System.out.println("Iterator " + it.next());
        }
        */
    }
}
