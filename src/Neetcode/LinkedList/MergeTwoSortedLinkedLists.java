package Neetcode.LinkedList;

public class MergeTwoSortedLinkedLists {
    public static void main(String[] args) {
        int[] values = {1, 2, 4};
        int[] values2 = {1, 2, 4};
        ListNode list1 = fromArray(values);
        ListNode list2 = fromArray(values2);
        printList(mergeTwoList(list1,list2));
    }

    public static ListNode fromArray(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
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


