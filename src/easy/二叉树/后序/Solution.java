package easy.二叉树.后序;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：二叉树的后序遍历
 * 创建时间：2022/1/18 21:48
 * 创 建 人：petteran
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一棵二叉树的根节点 root ，返回其节点值的 后序遍历
 */
public class Solution {
    public static void main(String[] args) {

    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;
    }
    public void postorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        postorder(root.left,res);
        postorder(root.right,res);
        res.add(root.val);
    }
}
