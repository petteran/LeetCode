package easy.二叉树.两数之和_输入_BST;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：两数之和_输入_BST
 * 创建时间：2022/1/23 02:04
 * 创 建 人：petteran
 */

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个二叉搜索树 root 和一个目标结果 k，
 * 如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
 */
public class Solution {
    public static void main(String[] args) {

    }

    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return find(root, k, set);

    }

    public boolean find(TreeNode root, int k, Set<Integer> set) {
        if (root == null) {
            return false;
        }
        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return find(root.left, k, set) || find(root.right, k, set);
    }
}
