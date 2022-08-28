package com.array;
import java.util.*;

public class PairSum {
    public static ArrayList<ArrayList<Integer>> pairSum(ArrayList<Integer> arr, int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            if (!map.containsKey(arr.get(i)))
                map.put(arr.get(i), 1);
            else
                map.put(arr.get(i), map.get(arr.get(i)) + 1);

            if (target - arr.get(i) == arr.get(i)) {   //if same value
                if (map.containsKey(arr.get(i)) && map.get(arr.get(i)) > 1) {
                    ans.add(new ArrayList<>(Arrays.asList(arr.get(i), arr.get(i))));
                    map.put(arr.get(i), map.get(arr.get(i)) - 2);
                }
            }
            else {
                if (map.containsKey(arr.get(i)) && map.containsKey(target - arr.get(i)) && map.get(target - arr.get(i)) > 0 && map.get(arr.get(i)) > 0)
                {
                    ans.add(new ArrayList<>(Arrays.asList(arr.get(i), target - arr.get(i))));
                    map.put(arr.get(i), map.get(arr.get(i)) - 1);
                    map.put(target - arr.get(i), map.get(target - arr.get(i)) - 1);
                }
            }
        }

        System.out.print("Map: " + map + "\n");
        if (ans.isEmpty())
            ans.add(new ArrayList<>(Arrays.asList(-1, -1)));

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<ArrayList<Integer>> ans = pairSum(arr,5);
//        Collections.sort(ans);
        for (ArrayList<Integer> e: ans)
        {
            if(e.get(0) > e.get(1))
                System.out.println(e.get(1) +" " + e.get(0));
            else
              System.out.println(e.get(0) +" " + e.get(1));

        }

    }
}
