package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<>();          // HashSet store elements in random order takes o(1)
        // Set<Integer> set = new LinkedHashSet<>();  // HashSet add number in linkedList order
        Set<Integer> set =new TreeSet<>();           //store elements in sorted order o(logn)
        set.add(10);
        set.add(5);
        set.add(7);
        set.add(20);
        set.add(20);
        set.add(15);
        System.out.println(set);
        set.remove(7);
        System.out.println(set);
        System.out.println( set.contains(50));
        System.out.println(set.isEmpty());
        System.out.println(set.size());

    }
}
