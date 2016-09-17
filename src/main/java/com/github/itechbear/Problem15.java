package com.github.itechbear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by quixey on 9/17/16.
 */
public class Problem15 {
  public class Solution {
    public boolean twoSum(int[] sortedNums, int left, int right, int target) {

    }

    public List<List<Integer>> threeSum(int[] sortedNums, int left, int right) {
      List<List<Integer>> result = new ArrayList<>();

      while (left < right) {
        while (left < right && left < sortedNums.length - 1 && sortedNums[left] == sortedNums[left + 1]) {
          ++left;
        }
        while (right > left && right > 0 && sortedNums[right] == sortedNums[right - 1]) {
          --right;
        }

      }

      return result;
    }

    public List<List<Integer>> threeSum(int[] nums) {
      Arrays.sort(nums);

      return threeSum(nums, 0, nums.length - 1);
    }
  }

  public static void main(String[] args) {

  }
}
