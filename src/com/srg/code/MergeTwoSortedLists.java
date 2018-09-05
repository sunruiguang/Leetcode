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

        ListNode l3 = mergeTwoLists(l1, l2);

        while (l3 != null) {
            System.out.println(l3.val);
            l3 = l3.next;
        }
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        while (p != null || q != null) {
            int n = p != null ? p.val : 0;
            int m = q != null ? q.val : 0;
            if (n > m) {
                n = n^m;
                m = n^m;
                n = n^m;
            }
            curr.next = new ListNode(n);
            curr.next.next = new ListNode(m);
            curr = curr.next.next;

            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        return dummyHead.next;
    }

}
