package medium.盛最多水的容器;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：盛最多水的容器
 * 创建时间：2022/3/1 23:40
 * 创 建 人：petteran
 */

/**
 * 给定一个长度为 n 的整数数组height。有n条垂线，第 i 条线的两个端点是(i, 0)和(i, height[i])。
 *
 * 找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
 *
 * 返回容器可以储存的最大水量。
 *
 * 说明：你不能倾斜容器。
 */
public class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int res=0;
        while (left < right) {
            // [left, right] 之间的矩形面积
            int cur_area = Math.min(height[left], height[right]) * (right - left);
            res = Math.max(res, cur_area);
            // 双指针技巧，移动较低的一边
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}
