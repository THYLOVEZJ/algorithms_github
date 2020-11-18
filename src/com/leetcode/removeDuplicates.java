package com.leetcode;

//这道题的解题思路是快慢指针
public class removeDuplicates {
    public int remove(int[] nums) {
        //首先判定数组是否为空
        if (nums.length == 0)
            return 0;
        //设立双指针初值
        int i = 0;
        //这里的循环条件是当快指针指向最后一个元素时循环停止
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
}
