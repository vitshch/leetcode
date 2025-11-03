package com.vitalish.leetcode.season1.linkedlist;

/**
 * 705. Design HashSet
 * Topics: LinkedList
 *
 * @see https://leetcode.com/problems/design-hashset/description/
 */
public class DesignHashSet {

    public static class MyHashSet {

        private int capacity;
        private int size;
        private Node<Integer>[] items;

        public MyHashSet() {
            capacity = 10;
            size = 0;
            items = new Node[capacity];
        }

        public void add(int key) {
            int hash = calculateHash(key);
            if (items[hash] == null) {
                items[hash] = new Node<>(key);
                size++;
            } else {
                var node = items[hash];
                while (node.next != null) {
                    if (node.value.equals(key)) {
                        return;
                    }
                    node = node.next;
                }
                if (node.value.equals(key)) {
                    return;
                }
                node.next = new Node<>(key);
                size++;
            }
        }

        public void remove(int key) {
            int hash = calculateHash(key);
            var node = items[hash];
            if (node == null) {
                return;
            }

            if (node.value.equals(key)) {
                items[hash] = node.next;
                size--;
                return;
            }

            var prev = node;
            var current = node.next;
            while (current != null) {
                if (current.value.equals(key)) {
                    prev.next = current.next;
                    size--;
                    return;
                }
                prev = current;
                current = current.next;
            }
        }

        public boolean contains(int key) {
            int hash = calculateHash(key);
            var node = items[hash];
            if (node == null) {
                return false;
            }
            while (node != null) {
                if (node.value.equals(key)) {
                    return true;
                }
                node = node.next;
            }
            return false;
        }

        private int calculateHash(int key) {
            return key % capacity;
        }

        private static class Node<T> {
            T value;
            Node<T> next;

            public Node(T value) {
                this.value = value;
            }
        }

    }

}
