package easy.二叉树遍历.后序;

/**
 * 项目名称：LeetCode
 * 类 名 称：TreeNode
 * 类 描 述：a binary tree node
 * 创建时间：2022/1/18 21:29
 * 创 建 人：petteran
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
