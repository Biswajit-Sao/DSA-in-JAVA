public class ReversLinkList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node Recrisive(Node head) {
        if (head.next == null)
            return head;
        Node newHead = Recrisive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static Node Normal(Node head) {
        Node curr = head;
        Node prev = null;
        Node after = null;
        while (curr != null) {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    public static void show(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(18);
        Node b = new Node(20);
        Node c = new Node(93);
        Node d = new Node(38);
        Node e = new Node(29);
        Node f = new Node(02);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        show(a);
        System.out.println();
        Node x = Recrisive(a);
        show(x);
        System.out.println();
        Node z = Normal(x);
        show(z);

    }
}
