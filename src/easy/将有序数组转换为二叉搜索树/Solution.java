package easy.将有序数组转换为二叉搜索树;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：将有序数组转换为二叉搜索树
 * 创建时间：2022/2/24 23:33
 * 创 建 人：petteran
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    TreeNode build(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int  mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = build(nums, left, mid - 1);
        root.right = build(nums, mid + 1, right);
        return root;
    }
}
