package com.leetcode;

/**
 * 该程序实现了一个链表
 * 首先我们需要了解链表是一个什么样的结构
 * 在c语言里链表主要有数据域和指向下一个节点的指针
 * 而在java里，链表主要是数据和指向下一个节点的引用
 */
public class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int x){
        data=x;
    }
}
