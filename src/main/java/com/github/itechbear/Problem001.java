package com.github.itechbear;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by quixey on 9/1/16.
 */
public class Problem001 {
  public class Solution {
    public int[] twoSum(int[] nums, int target) {
      int[] result = new int[2];

      Map<Integer, List<Integer>> hashmap = new HashMap<Integer, List<Integer>>();
      for (int i = 0; i < nums.length; ++i) {
        List<Integer> list = hashmap.get(nums[i]);
        if (null == list) {
          list = new ArrayList<>();
          hashmap.put(nums[i], list);
        }
        list.add(i);
      }

      for (Map.Entry<Integer, List<Integer>> entry : hashmap.entrySet()) {
        int first = entry.getKey();
        int second = target - first;
        if (hashmap.containsKey(second)) {
          result[0] = entry.getValue().get(0);
          if (first == second) {
            result[1] = entry.getValue().get(1);
          } else {
            result[1] = hashmap.get(second).get(0);
          }
          break;
        }
      }

      return result;
    }
  }

  public static void main(String[] args) {
    int[] input_array = new int[] { 1,2,3,4,5,6,7,8 };
  }
}
