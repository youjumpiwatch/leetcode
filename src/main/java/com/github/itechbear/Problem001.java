package com.github.itechbear;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by quixey on 9/1/16.
 */
public class Problem001 {
  public class Solution {
    public int[] twoSum(int[] nums, int target) {
      int[] result = new int[2];

      Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
      for (int i = 0; i < nums.length; ++i) {
        int diff = target - nums[i];
        Integer diffPos = hashmap.get(diff);
        if (null != diffPos) {
          result[0] = diffPos;
          result[1] = i;
          return result;
        } else {
          hashmap.put(nums[i], i);
        }
      }

      return result;
    }
  }

  public static void main(String[] args) {
    int[] input_array = new int[] { 1,2,3,4,5,6,7,8 };
  }
}
