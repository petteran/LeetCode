package medium.最接近的三数之和;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：最接近的三数之和
 * 创建时间：2022/2/28 23:10
 * 创 建 人：petteran
 */

import java.util.Arrays;

/**
 * 给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个整数，使它们的和与 target 最接近。
 *
 * 返回这三个数的和。
 *
 * 假定每组输入只存在恰好一个解。
 *
 */
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3) {
        return 0;
    }
    // 别忘了要先排序数组
        Arrays.sort(nums);
    // 记录三数之和与目标值的偏差
    int delta = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
        // 固定 nums[i] 为三数之和中的第一个数，
        // 然后对 nums[i+1..] 搜索接近 target - nums[i] 的两数之和
        int sum = nums[i] + twoSumClosest(nums, i + 1, target - nums[i]);
        if (Math.abs(delta) > Math.abs(target - sum)) {
            delta = target - sum;
        }
    }
        return target - delta;

    }
    // 在 nums[start..] 搜索最接近 target 的两数之和
    int twoSumClosest(int[] nums, int start, int target) {
        int lo = start, hi = nums.length - 1;
        // 记录两数之和与目标值的偏差
        int delta = Integer.MAX_VALUE;
        while (lo < hi) {
            int sum = nums[lo] + nums[hi];
            if (Math.abs(delta) > Math.abs(target - sum)) {
                delta = target - sum;
            }
            if (sum < target) {
                lo++;
            } else {
                hi--;
            }
        }
        return target - delta;
    }
}
