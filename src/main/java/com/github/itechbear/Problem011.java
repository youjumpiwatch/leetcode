package com.github.itechbear;

/**
 * Created by HD on 9/7/2016.
 */
public class Problem011 {
  public class Solution {
    public int maxArea(int[] height) {
      if (height.length <= 1) {
        return 0;
      }

      int left = 0;
      int right = height.length - 1;
      int result = 0;

      while (left < right) {
        int area = Math.min(height[left], height[right]) * (right - left);
        result = Math.max(result, area);
        if (height[left] < height[right]) {
            ++left;
        } else if (height[left] > height[right]) {
            --right;
        } else {
            ++left;
            --right;
        }
      }

      return result;
    }
  }

  public static void main(String[] args) {
    Problem011 problem011 = new Problem011();
    Solution solution = problem011.new Solution();

    int[] test = new int[]{ 4,4,2,11,0,11,5,11,13,8 };
    solution.maxArea(test);
  }
}
