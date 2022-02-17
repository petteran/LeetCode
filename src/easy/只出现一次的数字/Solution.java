package easy.只出现一次的数字;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：只出现一次的数字
 * 创建时间：2022/2/17 22:48
 * 创 建 人：petteran
 */

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。
 * 找出那个只出现了一次的元素。
 */
public class Solution {

    public int singleNumber(int[] nums) {
        int single = 0;
        for (int i = 0; i < nums.length; i++) {
            single ^= nums[i];
        }
        return single;
    }
}
