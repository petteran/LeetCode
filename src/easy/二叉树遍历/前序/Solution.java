package easy.二叉树遍历.前序;
import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：二叉树的前序遍历
 * 创建时间：2022/1/18 21:30
 * 创 建 人：petteran
 */

/**
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 */

public class Solution {
    public static void main(String[] args) {

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        proorder(root, res);
        return res;
    }

    public void proorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        proorder(root.left,res);
        proorder(root.right,res);
    }
}
