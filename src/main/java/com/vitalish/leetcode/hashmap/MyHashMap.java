package com.vitalish.leetcode.hashmap;

/**
 * 706. Design HashMap
 * Easy
 * Topics
 * Companies
 * Design a HashMap without using any built-in hash table libraries.
 * <p>
 * Implement the MyHashMap class:
 * <p>
 * MyHashMap() initializes the object with an empty map.
 * void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.
 * int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
 * void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input
 * ["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
 * [[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
 * Output
 * [null, null, null, 1, -1, null, 1, null, -1]
 * <p>
 * Explanation
 * MyHashMap myHashMap = new MyHashMap();
 * myHashMap.put(1, 1); // The map is now [[1,1]]
 * myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
 * myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
 * myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
 * myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
 * myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
 * myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
 * myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= key, value <= 106
 * At most 104 calls will be made to put, get, and remove.
 * <p>
 * https://leetcode.com/problems/design-hashmap/description/
 */

public class MyHashMap {

    private Node[] map;
    private int capacity;
    private int size;

    public MyHashMap() {
        this.capacity = 8;
        this.map = new Node[capacity];
        this.size = 0;
    }

    public void put(int key, int value) {
        int hash = calculateHash(key);
        ensureCapacity();
        var newNode = new Node(key, value);

        var head = map[hash];
        if (head != null) {
            var current = head;
            var prev = current;
            while (current != null) {
                if (current.key == key) {
                    current.value = value;
                }
                prev = current;
                current = current.next;
            }
            prev.next = newNode;
        }
        size++;
    }

    public int get(int key) {
        int hash = calculateHash(key);

        var current = map[hash];
        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        return -1;
    }

    public void remove(int key) {
        int hash = calculateHash(key);

        Node node = map[hash];
        if (node == null) {
            return;
        }
        if (node.next == null) {
            map[hash] = null;
        } else {
            if (node.key == key) {
                map[hash] = node.next;
            } else {
                var prev = node;
                var current = node.next;
                while (current != null) {
                    if (current.key == key) {
                        prev.next = current.next;
                        return;
                    }
                    prev = current;
                    current = current.next;
                }
            }
        }
        size--;
    }

    private void ensureCapacity() {
        if ((float) size / capacity > 0.75) {
            var oldMap = map;
            capacity = capacity * 2;
            size = 0;
            map = new Node[capacity];
            for (Node node : oldMap) {
                while (node != null) {
                    put(node.key, node.value);
                    node = node.next;
                }
            }
        }
    }

    public int calculateHash(int key) {
        return Math.abs((key * key + 21) % map.length);
    }

    private static class Node {
        int key;
        int value;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
