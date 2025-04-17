package Neetcode.LinkedList;
import java.util.HashMap;

public class CopyLinkedListwithRandomPointer {
    public static void main(String[] args) {

    }
    public static Node copyRandomList(Node head) {
        HashMap<Node,Node> newHead = new HashMap<>();

        Node cur = head;
        while (cur != null) {
            Node copy = new Node(cur.val);
            newHead.put(cur,copy);
            cur = cur.next;
        }

        cur = head;
        while (cur != null) {
            Node copy = newHead.get(cur);
            copy.next = newHead.get(cur.next);
            copy.random = newHead.get(cur.random);
            cur = cur.next;
        }

        return newHead.get(head);
    }
}
