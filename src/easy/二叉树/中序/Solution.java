package easy.二叉树.中序;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：二叉树的中序遍历
 * 创建时间：2022/1/18 21:41
 * 创 建 人：petteran
 */

/**
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 */
public class Solution {
    public static void main(String[] args) {

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }
    public void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }

}
