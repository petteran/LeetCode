package easy.删除有序数组中的重复项;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：删除有序数组中的重复项
 * 创建时间：2022/1/29 10:45
 * 创 建 人：petteran
 */

/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 */
public class Solution  {

    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int p = 0;
        int q = 1;
        while (q < nums.length) {
            if (nums[p] != nums[q]) {
                nums[p+1]=nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }
}
