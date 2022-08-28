package com.collections;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap
{
    public static void main(String[] args)
    {
        // Map<String,Integer> numbers = new HashMap<>();
        Map<String,Integer> numbers = new TreeMap<>();  //sort map by keys
        numbers.put("anchal",10);
        numbers.put("ujala",20);
        numbers.put("baby",30);

        System.out.println(numbers);
        numbers.put("baby",40);     //value of "baby" key will be updated
        System.out.println(numbers);

        if(!numbers.containsKey("ujala")) //if "ujala" key is not pressent
            numbers.put("ujala",500);

        if(!numbers.containsValue(60))
            numbers.put("rohini",60);

        numbers.putIfAbsent("anchal",200);
        System.out.println(numbers);


        for (Map.Entry<String,Integer> e: numbers.entrySet()) {
            System.out.println(e.getKey());   //It will print all keys
            //System.out.println(e.getValue());  //to get all values
        }
    }

}
