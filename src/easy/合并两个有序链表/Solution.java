package easy.合并两个有序链表;

/**
 * 项目名称：LeetCode
 * 类 名 称：Solution
 * 类 描 述：合并两个有序链表
 * 创建时间：2022/1/15 23:25
 * 创 建 人：petteran
 */

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。
 * 新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class Solution {

    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //虚拟头解法
        ListNode dummy = new ListNode(-1), p = dummy;
        ListNode p1 = list1, p2 = list2;

        while (p1 != null && p2 != null) {
            //比较 p1 和 p2 的两个指针
            //将值较小的节点接到 P 指针
            if (p1.val > p2.val) {
                p.next = p2;
                p2 = p2.next;
            } else {
                p.next = p1;
                p1 = p1.next;
            }
            p = p.next;
        }
        if (p1 != null) {
            p.next = p1;
        }
        if (p2 != null) {
            p.next = p2;
        }
        return dummy.next;
    }
}
