package Neetcode.LinkedList;

import static Neetcode.LinkedList.ListNodeUtil.fromArray;
import static Neetcode.LinkedList.ListNodeUtil.printList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        int[] values = {0,1,2,3};
        ListNode list1 = fromArray(values);
        printList(reverse(list1));

    }
    public static ListNode reverse(ListNode list) {
        ListNode prev = null;
        ListNode curr = list;

        while (curr != null) {
           ListNode temp = curr.next;
           curr.next = prev;
           prev = curr;
           curr = temp;

        }
        return prev;
    }
}
