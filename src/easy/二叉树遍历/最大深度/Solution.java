package easy.二叉树遍历.最大深度;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：二叉树的最大深度
 * 创建时间：2022/1/19 22:35
 * 创 建 人：petteran
 */

/**
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class Solution {
    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);

        return 1 + Math.max(leftMax, rightMax);
    }

}
