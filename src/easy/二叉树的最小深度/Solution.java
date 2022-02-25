package easy.二叉树的最小深度;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：二叉树的最小深度
 * 创建时间：2022/2/25 22:47
 * 创 建 人：petteran
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        // root 本身就是一层，depth 初始化为 1
        int depth = 1;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                /* 判断是否到达叶子结点 */
                if (cur.left == null && cur.right == null)
                    return depth;
                /* 将下一层节点加入队列 */
                if (cur.left != null)
                    q.offer(cur.left);
                if (cur.right != null)
                    q.offer(cur.right);
            }
            /* 这里增加步数 */
            depth++;
            }
        return depth;
        }
    }

