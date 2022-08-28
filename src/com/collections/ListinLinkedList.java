package com.collections;
import java.util.LinkedList;
import java.util.List;

public class ListinLinkedList {
    public static void main(String[] args) {


        List<Integer> number = new LinkedList(); //ArrayList creation
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(2, 200);  //to add number at particular index
        number.set(0, 100);              //to set number
        System.out.println(number);
        List<Integer> name = new LinkedList<>();
        name.add(50);
        name.add(60);
        number.addAll(name); //to add all element of another list
        System.out.println(number);
        System.out.println(number.get(1));
    }
}
