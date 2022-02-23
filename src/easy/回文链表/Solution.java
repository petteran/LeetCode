package easy.回文链表;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：回文链表
 * 创建时间：2022/2/23 23:12
 * 创 建 人：petteran
 */

/**
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。
 * 如果是，返回 true ；否则，返回 false 。
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast, slow;
        slow = fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null)
            slow = slow.next;
        ListNode left = head;
        ListNode right = reverse(slow);
        while (right != null) {
            if (left.val != right.val)
                return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }
    ListNode reverse (ListNode head){
        ListNode pre = null, cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}

