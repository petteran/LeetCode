package easy.二叉树.验证二叉搜索树;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：验证二叉搜索树
 * 创建时间：2022/1/22 23:33
 * 创 建 人：petteran
 */


/**
 * 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
 *
 * 有效 二叉搜索树定义如下：
 *
 * 节点的左子树只包含 小于 当前节点的数。
 * 节点的右子树只包含 大于 当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 *
 */
public class Solution {
    public static void main(String[] args) {

    }
    public boolean isValidBST(TreeNode root) {

        return isValidBst(root,null,null);
    }

    boolean isValidBst(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.val <= min.val) return false;
        if (max != null && root.val >= max.val) return false;

        return isValidBst(root.left, min, root) && isValidBst(root.right, root, max);
    }
}
