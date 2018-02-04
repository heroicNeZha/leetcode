package LeetCode;

/**
 * Created by Administrator on 2017/11/8.
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 */
public class MergeTwoSortLists {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode nextNode = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                nextNode.next = l1;
                l1 = l1.next;
            } else {
                nextNode.next = l2;
                l2 = l2.next;
            }
            nextNode = nextNode.next;
        }
        nextNode.next = null == l1 ? l2 : l1;
        return dummy.next;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(5);
        l1.next = new ListNode(8);
        l1.next.next = new ListNode(17);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(19);

        ListNode l3 = mergeTwoLists(l1,l2);
        while(l3!=null){
            System.out.println(l3.val);
            l3 = l3.next;
        }
    }
}