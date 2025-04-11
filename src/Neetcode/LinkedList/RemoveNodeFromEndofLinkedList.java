package Neetcode.LinkedList;

import java.util.ArrayList;

public class RemoveNodeFromEndofLinkedList {
    public static void main(String[] args) {

    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode>list = new ArrayList<>();
        ListNode cur = head;

        while (cur != null) {
            list.add(cur);
            cur = cur.next;
        }

        int removeIndex = list.size() - n;
        if (removeIndex == 0) {
            return head.next;
        }

        list.get(removeIndex-1).next = list.get(removeIndex).next;
        return head;
    }
}
