public class prob {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(29);
        Node c = new Node(40);
        Node d = new Node(70);
        Node e = new Node(30);
        Node f = new Node(97);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);

        Node temp = a;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}