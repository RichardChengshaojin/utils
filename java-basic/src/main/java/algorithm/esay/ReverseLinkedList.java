package algorithm.esay;

import java.util.ArrayList;

/**
 * Reverse a singly linked list.
 * @author chengshaojin
 * @since 2016/9/23.
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        ReverseLinkedList r = new ReverseLinkedList();
        r.printList(l1);

        ListNode reverse = r.reverseList3(l1);
        r.printList(reverse);

        ArrayList[] ls = new ArrayList[12];
        Object[] os = ls;

//      talk is cheap, show me the code
    }

    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode next;
        while(head != null) {
            next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }
        return previous;
    }

    public ListNode reverseList1(ListNode head) {
        if (null == head) {
            return null;
        }
        ListNode previous = null;
        do {
            ListNode newNode = new ListNode(head.val);
            newNode.next = previous;
            previous = newNode;

        } while((head = head.next) != null);
        return previous;
    }

    public ListNode reverseList2(ListNode head) {
        // base case
        if (null == head || null == head.next)
            return head;
        ListNode rest = head.next; // rest of the linked list
        // reversed rest linked list
        ListNode reversedRest = reverseList(rest);
        rest.next = head; // connect head and rest
        head.next = null;
        return reversedRest;
    }

    public ListNode reverseList3(ListNode node) {
        ListNode cur = node;
        ListNode pre = null;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


    private void printList(ListNode root) {
        while (root != null) {
            System.out.print(root.val + ", ");
            root = root.next;
        }
        System.out.println();
    }
}
