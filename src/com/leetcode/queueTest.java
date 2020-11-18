package com.leetcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(3);
        queue.offer(2);
        queue.poll();//元素1出队 也就是3出队列
    }
}
