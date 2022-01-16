package easy.反转链表;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：TODO
 * 创建时间：2022/1/16 17:22
 * 创 建 人：petteran
 */

/**
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 */
public class Solution {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
