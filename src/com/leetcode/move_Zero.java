package com.leetcode;

public class move_Zero {


    /**
     * 这道题是移动0元素，且不能改变数组的顺序，所以考虑先把非0的移到前面
     * 然后再给后面填零
     */

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }

        for (int i : nums)
            System.out.print(i);
    }

    public void MoveZero2(int[] num2) {
        int notZeroNumber = 0;
        for (int i : num2) {
            if (i != 0)
                notZeroNumber += 1;
        }

        for (int j = 0; j < notZeroNumber; j++) {
            if (num2[j] == 0) {
                for (int k = j + 1; k < num2.length; k++) {
                    if (num2[k] != 0) {
                        num2[j] = num2[k];
                        num2[k] = 0;
                        break;
                    }
                }
            }
        }

        for (int i = notZeroNumber; i < num2.length; i++)
            num2[i] = 0;

        for (int j : num2)
            System.out.print(j);
    }


}
