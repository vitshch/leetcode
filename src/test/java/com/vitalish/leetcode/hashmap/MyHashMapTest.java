package com.vitalish.leetcode.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
class MyHashMapTest {

    private MyHashMap myHashMap;

    @BeforeEach
    void setUp() {
        myHashMap = new MyHashMap();
    }

    @Test
    void testHashMap() {
        myHashMap.put(1, 1); // The map is now [[1,1]]
        myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
        Assertions.assertEquals(1, myHashMap.get(1));    // return 1, The map is now [[1,1], [2,2]]
        Assertions.assertEquals(-1, myHashMap.get(3));    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
        myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
        Assertions.assertEquals(1, myHashMap.get(2));    // return 1, The map is now [[1,1], [2,1]]
        myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
        Assertions.assertEquals(-1, myHashMap.get(2));    // return -1 (i.e., not found), The map is now [[1,1]]
    }

//    @Test
//    void testPutAndDelete() {
//
//    }
}