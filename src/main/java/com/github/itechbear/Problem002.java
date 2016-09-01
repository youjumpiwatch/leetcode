package com.github.itechbear;

/**
 * Created by quixey on 9/1/16.
 */
public class Problem002 {
  /**
   * Definition for singly-linked list.
   * public class ListNode {
   * int val;
   * ListNode next;
   * ListNode(int x) { val = x; }
   * }
   */
  public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      int carryIn = 0;
      ListNode result = new ListNode(0);
      ListNode cursor = result;

      while (carryIn == 1 || null != l1 || null != l2) {
        int sum = carryIn + (null == l1 ? 0 : l1.val) + (null == l2 ? 0 : l2.val);
        cursor.val = sum % 10;
        carryIn = (sum >= 10 ? 1 : 0);
        if (null != l1) {
          l1 = l1.next;
        }
        if (null != l2) {
          l2 = l2.next;
        }
        if (carryIn == 1 || null != l1 || null != l2) {
          cursor.next = new ListNode(0);
        } else {
          cursor.next = null;
        }
        cursor = cursor.next;
      }

      return result;
    }
  }

  public static void main(String[] args) {

  }
}
