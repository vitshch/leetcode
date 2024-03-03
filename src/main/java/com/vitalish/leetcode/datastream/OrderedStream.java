package com.vitalish.leetcode.datastream;

import java.util.ArrayList;
import java.util.List;

/**
 * 1656. Design an Ordered Stream
 * Easy
 * Topics
 * Companies
 * Hint
 * There is a stream of n (idKey, value) pairs arriving in an arbitrary order, where idKey is an integer
 * between 1 and n and value is a string. No two pairs have the same id.
 *
 * Design a stream that returns the values in increasing order of their IDs by returning a chunk
 * (list) of values after each insertion. The concatenation of all the chunks should result in a list of the sorted values.
 *
 * Implement the OrderedStream class:
 *
 * OrderedStream(int n) Constructs the stream to take n values.
 * String[] insert(int idKey, String value) Inserts the pair (idKey, value) into the stream, then returns
 * the largest possible chunk of currently inserted values that appear next in the order.
 *
 *  https://leetcode.com/problems/design-an-ordered-stream/
 **/

public class OrderedStream {

    private final String[] stream;
    private final int n;
    private int pointer = 0;

    public OrderedStream(int n) {
        this.n = n;
        this.stream = new String[n];
    }

    public List<String> insert(int idKey, String value) {
        List<String> result = new ArrayList<>();
        stream[idKey - 1] = value;

        while (pointer < n && stream[pointer] != null) {
            result.add(stream[pointer]);
            pointer++;
        }
        return result;
    }

}
