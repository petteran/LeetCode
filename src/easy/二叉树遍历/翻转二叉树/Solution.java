package easy.二叉树遍历.翻转二叉树;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：翻转二叉树
 * 创建时间：2022/1/20 21:29
 * 创 建 人：petteran
 */

/**
 * 翻转一棵二叉树。
 */
public class Solution {
    public static void main(String[] args) {

    }
    public TreeNode invertTree(TreeNode root) {
        //base case
        if (root == null) {
            return null;
        }
        //前序遍历位置
        //对于 root 节点,许村交换它的左右子节点
        TreeNode tmp= root.left;
        root.left=root.right;
        root.right = tmp;

        //递归调用
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
