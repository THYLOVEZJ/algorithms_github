package com.leetcode;

public class rob {
    public int rob_Method(int[] nums) {
        if (nums.length == 0)
            return 0;
        int N = nums.length;
        //这里设置N+1个数非常新奇
        int[] dp = new int[N + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int j = 2; j <= nums.length; j++)
            dp[j] = Math.max(dp[j - 1], dp[j - 2] + nums[j - 1]);
        return dp[N];
    }
}
