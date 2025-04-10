package Neetcode.LinkedList;

import static Neetcode.LinkedList.ListNodeUtil.fromArray;
import static Neetcode.LinkedList.ListNodeUtil.printList;

public class MergeTwoSortedLinkedLists {
    public static void main(String[] args) {
        int[] values = {1, 2, 4};
        int[] values2 = {1, 2, 4};
        ListNode list1 = fromArray(values);
        ListNode list2 = fromArray(values2);
        printList(mergeTwoList(list1,list2));
    }


    public static ListNode mergeTwoList(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;

        while (list1 != null && list2 != null ) {
            if (list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
            }
            else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }
        if (list1 != null) {
            node.next = list1;
        } else {
            node.next = list2;
        }
        return dummy.next;
    }
}


