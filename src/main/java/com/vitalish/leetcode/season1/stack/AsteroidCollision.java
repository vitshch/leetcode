package com.vitalish.leetcode.season1.stack;

import java.util.Stack;

/**
 * 735. Asteroid Collision
 *
 * @see https://leetcode.com/problems/asteroid-collision/
 */
public class AsteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean exploded = false;

            while (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {
                if (stack.peek() < -asteroid) {
                    stack.pop();
                    continue;
                } else if (stack.peek() == -asteroid) {
                    stack.pop();
                }
                exploded = true;
                break;
            }
            if (!exploded) {
                stack.push(asteroid);
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }

}
