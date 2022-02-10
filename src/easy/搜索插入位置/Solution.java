package easy.搜索插入位置;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：搜索插入位置
 * 创建时间：2022/2/10 22:42
 * 创 建 人：petteran
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
