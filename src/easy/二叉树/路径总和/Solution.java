package easy.二叉树.路径总和;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：路径总和
 * 创建时间：2022/1/20 21:34
 * 创 建 人：petteran
 */

/**
 * 给你二叉树的根节点root 和一个表示目标和的整数targetSum 。
 * 判断该树中是否存在 根节点到叶子节点 的路径，
 * 这条路径上所有节点值相加等于目标和 targetSum 。
 * 如果存在，返回 true ；否则，返回 false 。
 *
 * 叶子节点 是指没有子节点的节点。
 *
 */
public class Solution {
    public static void main(String[] args) {

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == root.right && root.val == targetSum) {
            return true;
        }
        return hasPathSum(root.left, targetSum - root.val)
                || hasPathSum(root.right, targetSum - root.val);
    }
}
