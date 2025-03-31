package Neetcode.LinkedList;

import java.util.HashSet;

import static Neetcode.LinkedList.ListNodeUtil.fromArray;


public class LinkedListCycleDetection {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 1};
        ListNode list1 = fromArray(values);
        System.out.println(hasCycle(list1));
    }

    private static boolean hasCycle(ListNode head) {
        HashSet<ListNode> seen = new HashSet<>();
        ListNode curr = head;

        while (curr != null) {
            if (seen.contains(curr)) {
                return true;
            }
            seen.add(curr);
            curr = curr.next;
        }

        return false;
    }



}


