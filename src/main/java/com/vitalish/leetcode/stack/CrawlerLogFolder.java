package com.vitalish.leetcode.stack;

import java.util.ArrayDeque;

/**
 * 1598. Crawler Log Folder
 * Topics: Stack
 *
 * @see https://leetcode.com/problems/crawler-log-folder/description/
 */
public class CrawlerLogFolder {

    private static final String MOVE_TO_PARENT = "../";
    private static final String REMAIN = "./";

    public int minOperations(String[] logs) {
        var stack = new ArrayDeque<String>();

        for (String log : logs) {
            if (REMAIN.equals(log) || (MOVE_TO_PARENT.equals(log) && stack.isEmpty())) {
                continue;
            }
            if (MOVE_TO_PARENT.equals(log)) {
                stack.pop();
            } else {
                stack.push(log);
            }
        }

        return stack.size();
    }

}
