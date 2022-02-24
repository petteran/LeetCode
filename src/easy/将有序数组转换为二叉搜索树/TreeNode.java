package easy.将有序数组转换为二叉搜索树;

/**
 * 项目名称：LeetCode
 * 类 名 称：TreeNode
 * 类 描 述：a binary tree node.
 * 创建时间：2022/2/24 23:32
 * 创 建 人：petteran
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}