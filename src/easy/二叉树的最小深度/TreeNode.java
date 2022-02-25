package easy.二叉树的最小深度;

/**
 * 项目名称：LeetCode
 * 类 名 称：TreeNode
 * 类 描 述：二叉树的最小深度
 * 创建时间：2022/2/25 22:47
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
