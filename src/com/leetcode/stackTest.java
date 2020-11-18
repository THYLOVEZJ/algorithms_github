package com.leetcode;

import java.util.Stack;

/**
 * 该类主要测试java里的栈的一些api
 */
public class stackTest {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

        stack.push(3);
        stack.push(2);
        stack.pop();
        stack.pop();
    }
}
