class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class InserctionTwoLinklist {

    public static void show(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node midVal(Node headA, Node headB) {
        Node tempA = headA;
        Node tempB = headB;

        int lengthA = 0, lengthB = 0;

        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }

        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }

        tempA = headA;
        tempB = headB;

        if (lengthA > lengthB) {
            int step = lengthA - lengthB;
            for (int i = 0; i < step; i++) {
                tempA = tempA.next;
            }
        } else {
            int step = lengthB - lengthA;
            for (int i = 0; i < step; i++) {
                tempB = tempB.next;
            }
        }

        while (tempA != null && tempB != null) {
            if (tempA == tempB) {
                return tempA; // Intersection found
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return null; // No intersection
    }

    public static void main(String[] args) {
        Node a = new Node(18);
        Node b = new Node(18);
        Node c = new Node(15);
        Node d = new Node(12);
        Node e = new Node(17);
        Node f = new Node(19);
        Node g = new Node(18);
        Node h = new Node(18);
        Node i = new Node(18);
        Node j = new Node(18);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        g.next = h;
        h.next = i;
        i.next = j;
        j.next = c; // Intersection starts at node 'c'

        show(a);
        show(g);

        Node intersection = midVal(a, g);

        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.data);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
