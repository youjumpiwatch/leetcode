package com.github.itechbear;

/**
 * Created by HD on 9/6/2016.
 */
public class Problem005 {
  public class Solution {
    public String longestPalindrome(String s) {
      int center = 0;
      int left = 0;
      int right = 0;
      int maxLength = 0;
      int maxLeft = 0;

      for (center = 0; center < s.length();) {
        left = center;
        right = center;

        while (right < s.length() - 1 && s.charAt(right) == s.charAt(right + 1)) {
          ++right;
        }
        center = right + 1;

        while (left > 0 && right < s.length() - 1 && s.charAt(left - 1) == s.charAt(right + 1)) {
          ++right;
          --left;
        }
        if (maxLength < right - left + 1) {
          maxLength = right - left + 1;
          maxLeft = left;
        }
      }

      return s.substring(maxLeft, maxLeft + maxLength);
    }
  }

  public static void main(String[] args) {
    String test = "caba";

    Problem005 problem005 = new Problem005();
    Solution solution = problem005.new Solution();
    solution.longestPalindrome(test);
  }
}
