package com.vitalish.leetcode.season1.datastream;

import com.vitalish.leetcode.season1.datastream.OrderedStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class OrderedStreamTest {

    private final OrderedStream orderedStream = new OrderedStream(5);

    @Test
    void insertsElements() {
        var stream1 = orderedStream.insert(3, "ccccc");
        Assertions.assertTrue(stream1.isEmpty());

        var stream2 = orderedStream.insert(1, "aaaaa");
        Assertions.assertEquals(1, stream2.size());
        Assertions.assertTrue(stream2.contains("aaaaa"));

        var stream3 = orderedStream.insert(2, "bbbbb");
        Assertions.assertEquals(2, stream3.size());
        Assertions.assertEquals(List.of("bbbbb", "ccccc"), stream3);

        var stream4 = orderedStream.insert(5, "eeeee");
        Assertions.assertTrue(stream4.isEmpty());

        var stream5 = orderedStream.insert(4, "ddddd");
        Assertions.assertEquals(2, stream5.size());
        Assertions.assertEquals(List.of("ddddd", "eeeee"), stream5);
    }
}