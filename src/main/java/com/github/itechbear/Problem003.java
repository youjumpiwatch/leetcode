package com.github.itechbear;

import java.util.Arrays;

/**
 * Created by HD on 9/6/2016.
 */
public class Problem003 {
  public class Solution {
    public int lengthOfLongestSubstring(String s) {
      int[] set = new int[256];
      int start = -1;
      int maxLen = 0;

      Arrays.fill(set, -1);
      for (int i = 0; i < s.length(); ++i) {
        int c = s.charAt(i);
        if (set[c] >= start) {
          start = set[c] + 1;
        }
        maxLen = Math.max(maxLen, i - start + 1);
        set[c] = i;
      }

      return maxLen;
    }
  }

  public static void main(String[] args) {

  }
}
