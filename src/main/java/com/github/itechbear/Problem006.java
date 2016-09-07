package com.github.itechbear;

/**
 * Created by HD on 9/7/2016.
 */
public class Problem006 {
  public class Solution {
    public String convert(String s, int numRows) {
      if (numRows < 2) {
        return s;
      }

      StringBuilder sb = new StringBuilder(s.length());
      int offset = 2*numRows-2;
      for (int row = 0; row < numRows; ++row) {
        int k = offset - row;
        for (int j = row; j < s.length(); j += offset) {
          sb.append(s.charAt(j));
          if (row != 0 && row != numRows - 1 && k < s.length()) {
            sb.append(s.charAt(k));
            k += offset;
          }
        }
      }

      return sb.toString();
    }
  }

  public static void main(String[] args) {

  }
}
