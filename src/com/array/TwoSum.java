package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://www.codingninjas.com/codestudio/problems/two-sum_839653?leftPanelTab=1
/*
* Hashing Solution
We can store the frequency of every element in the array in a hashmap.
We will loop over every index i, and check the frequency of (Target - ARR[i]) is the hashmap:
*
case 1: If (Target - ARR[i]) is equal to ARR[i], we will check if frequency of ARR[i] .
*   If it is greater than 1 then we will decrease the frequency of ARR[i] by 2 and add a pair (ARR[i] , ARR[i]) to our answer.
*
case 2: Else, if the frequency of ARR[i] and Target - ARR[i] is greater than equal to 1 then we add pair (ARR[i], Target - ARR[i]) to our answer and decrease the frequency of both by 1.

* If no valid pairs exist, we will return [[-1,-1]].
*
*
* Time complexity: O(n)
* Space Complexity: O(n)
*
* */
public class TwoSum {
    public static ArrayList<ArrayList<Integer>> twoSum(ArrayList<Integer> arr, int target, int n)
    {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < arr.size(); i++)
        {
            if(!map.containsKey(arr.get(i)))
                map.put(arr.get(i),1);
            else
                map.put(arr.get(i),map.get(arr.get(i))+1);

            if(target - arr.get(i) == arr.get(i)) {
                if(map.containsKey(arr.get(i)) && map.get(arr.get(i))>1)
                {
                    ans.add(new ArrayList<>(Arrays.asList(arr.get(i), arr.get(i))));
                    map.put(arr.get(i),map.get(arr.get(i)) - 2);
                }
            }
            else {
                if(map.containsKey(arr.get(i)) && map.containsKey(target-arr.get(i)) && map.get(target - arr.get(i))>0 && map.get(arr.get(i))>0)
                {
                    ans.add(new ArrayList<>(Arrays.asList(arr.get(i), target - arr.get(i))));
                    map.put(arr.get(i),map.get(arr.get(i))-1);
                    map.put(target-arr.get(i),map.get(target-arr.get(i))-1);
                }
            }
        }

        System.out.print("Map: " + map + "\n");
        if(ans.isEmpty())
            ans.add(new ArrayList<>(Arrays.asList(-1,-1)));

        return ans;
    }



    public static void main(String[] args)
    {
            ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,3,3,3,3,3,3,3,3,3));
            ArrayList<ArrayList<Integer>> ans = twoSum(arr,6,10);

            for (ArrayList<Integer> e: ans)
            {
                System.out.println("(" + e.get(0) +", " + e.get(1) +") ");
            }
    }

}
