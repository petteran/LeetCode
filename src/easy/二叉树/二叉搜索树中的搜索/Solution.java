package easy.二叉树.二叉搜索树中的搜索;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：二叉搜索树中的搜索
 * 创建时间：2022/1/21 21:39
 * 创 建 人：petteran
 */

/**
 *给定二叉搜索树（BST）的根节点和一个值。
 * 你需要在BST中找到节点值等于给定值的节点。
 * 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
 */

public class Solution {
    public static void main(String[] args) {

    }

    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null) {
            return null;
        }

        if (root.val > val) {
            return searchBST(root.left, val);
        }
        if (root.val < val) {
            return searchBST(root.right, val);
        }
        return root;
    }
}
