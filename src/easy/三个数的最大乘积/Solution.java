package easy.三个数的最大乘积;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：三个数的最大乘积
 * 创建时间：2022/2/21 21:50
 * 创 建 人：petteran
 */

import java.util.Arrays;

/**
 * 给你一个整型数组 nums ，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 */
public class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 3] * nums[n - 2] * nums[n - 1]);
    }
}
