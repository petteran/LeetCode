package easy.多数元素;

import java.util.Arrays;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：多数元素
 * 创建时间：2022/2/26 22:49
 * 创 建 人：petteran
 */
public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
