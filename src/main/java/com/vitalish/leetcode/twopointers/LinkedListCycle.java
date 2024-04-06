package com.vitalish.leetcode.twopointers;

/**
 * https://leetcode.com/problems/linked-list-cycle/
 */

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode current = head;
        ListNode nextNext = head;

        while (nextNext != null && nextNext.next != null) {
            current = current.next;
            nextNext = nextNext.next.next;

            if (current == nextNext) {
                return true;
            }
        }

        return false;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
