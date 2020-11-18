package com.leetcode;

/**
 * 该类是对链表的测试类
 */
public class ListNodeTest {
    public static void main(String[] args) {
        //下面的语句是建立了三个节点，给链表的数据赋值
        ListNode node = new ListNode(3);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        //这两条语句主要是给建立的节点的引用对象赋值，使得node的下一个节点是node1，而node1的下一个节点是node2
        node1.next = node2;
        node.next = node1;
    }
}
