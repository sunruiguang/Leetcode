package com.srg.code;

import com.srg.pubclass.ListNode;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(0);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = mergeTwoLists(l1, null);

        while (l3 != null) {
            System.out.println(l3.val);
            l3 = l3.next;
        }
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        while (p != null) {
            while (q != null) {
                if (p.val > q.val) {
                    curr.next = new ListNode(q.val);
                    curr = curr.next;
                    q = q.next;
                } else {
                    curr.next = new ListNode(p.val);
                    curr = curr.next;
                    p = p.next;
                    break;
                }
            }
            if (q == null) break;
        }
        while (p != null) {
            curr.next = new ListNode(p.val);
            curr = curr.next;
            p = p.next;
        }
        while (q != null) {
            curr.next = new ListNode(q.val);
            curr = curr.next;
            q = q.next;
        }
        return dummyHead.next;
    }

}
