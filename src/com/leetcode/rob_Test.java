package com.leetcode;

public class rob_Test {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 11, 11, 5, 6, 8};
        rob r = new rob();
        int a = r.rob_Method(arr);
        System.out.println(a);
    }
}
