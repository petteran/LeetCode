package easy.移除链表元素;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：移除链表元素
 * 创建时间：2022/1/15 23:38
 * 创 建 人：petteran
 */

/**
 * 你一个链表的头节点 head 和一个整数 val ，
 * 请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 */
public class Solution {
    public static void main(String[] args) {

    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return dummy.next;
    }
}
