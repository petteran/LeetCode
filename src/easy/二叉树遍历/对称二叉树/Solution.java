package easy.二叉树遍历.对称二叉树;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：对称二叉树
 * 创建时间：2022/1/19 22:52
 * 创 建 人：petteran
 */

/**
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 */
public class Solution {
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return false;
        return check(root.left, root.right);

    }

    boolean check(TreeNode left, TreeNode right) {
        if (left == null || right == null) return left == right;
        if (left.val != right.val) return false;
        return check(left.right, right.left) && check(left.left, right.right);
    }

}
