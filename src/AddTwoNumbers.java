package LeetCode;
/**
 * Created by Administrator on 2017/8/5.
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */

public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(l1.val+l2.val);
        ListNode temp = head;

        while (l1.next!=null) {
            l1 = l1.next;
            if (l2.next != null) {
                l2 = l2.next;
                temp.next = new ListNode(l2.val + l1.val);
                temp = temp.next;
            } else {
                temp.next = l1;
                temp = temp.next;
            }
        }
        if(l2.next!=null)
            temp.next = l2.next;

        temp = head;
        while(temp.next != null) {
            if (temp.val > 9) {
                temp.next.val += temp.val / 10;
                temp.val = temp.val%10;
            }
            temp = temp.next;
        }

        if(temp.val>9) {
            temp.next = new ListNode(temp.val / 10);
            temp.val = temp.val % 10;
        }
        return head;
    }
}
