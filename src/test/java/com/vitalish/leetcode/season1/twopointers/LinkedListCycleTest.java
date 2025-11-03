package com.vitalish.leetcode.season1.twopointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.vitalish.leetcode.season1.twopointers.LinkedListCycle.ListNode;

class LinkedListCycleTest {

    private final LinkedListCycle linkedListCycle = new LinkedListCycle();

    @Test
    void hasCycle() {
        ListNode head = createLinkedList();

        boolean hasCycle = linkedListCycle.hasCycle(head);

        Assertions.assertTrue(hasCycle);
    }

    private static ListNode createLinkedList() {
        ListNode head = new ListNode(1);
        int i = 1;
        var current = head;
        ListNode node = null;
        while (i < 4) {
            i++;
            var newNode = new ListNode(i + 1);
            if (i == 2) {
                node = newNode;
            }
            current.next = newNode;
            current = newNode;
        }
        current.next = node;
        return head;
    }
}