package LeetCode;

/**
 * Created by Administrator on 2017/11/20.
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicatesfromSortedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l2 =  new ListNode(1);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        //l4.next = l5;

        ListNode l6 = deleteDuplicates(l1);
        while(l6!=null){
            System.out.println(l6.val);
            l6 = l6.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        //链接不同的节点
        ListNode currentNode = head;
        ListNode nextNode = head;
        if(head == null) return null;
        while(nextNode.next!=null){
            if(currentNode.val != nextNode.next.val){
                currentNode.next = nextNode.next;
                currentNode = nextNode.next;
            }
            nextNode = nextNode.next;
        }
        currentNode.next = null;
        return head;

        //去除相同的节点
/*      ListNode currentNode = head;
        if(head == null) return null;
        while(currentNode.next!=null) {
            if (currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
        */
    }
}
