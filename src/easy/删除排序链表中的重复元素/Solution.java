package easy.删除排序链表中的重复元素;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：删除排序链表中的重复元素
 * 创建时间：2022/1/16 17:34
 * 创 建 人：petteran
 */

/**
 * 存在一个按升序排列的链表，给你这个链表的头节点 head ，
 * 请你删除所有重复的元素，使每个元素 只出现一次 。
 *
 * 返回同样按升序排列的结果链表。
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) { return head; }
        ListNode fast = head, slow = head;
        while (fast != null) {
            if (fast.val != slow.val) {
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;
        }
        slow.next = null;
        return head;

    }
}
