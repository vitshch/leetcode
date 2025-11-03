package com.vitalish.leetcode.season1;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.stream.Stream;

public class DemoDns {

    public static void main(String[] args) {
        try {
            InetAddress[] byName = InetAddress.getAllByName("dbc-8de7bac0-beff.cloud.databricks.com");
            Stream.of(byName).forEach(System.out::println);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

}
