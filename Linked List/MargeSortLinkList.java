public class MargeSortLinkList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void MargeSort(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;

        Node head = new Node(1000);
        Node temp = head;

        while (temp1 != null && temp2 != null) {
            if (temp1.data > temp2.data) {
                Node a = new Node(temp2.data);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            } else {
                Node a = new Node(temp1.data);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            }

        }
        if (temp1 == null) {
            temp.next = temp2;
        } else {
            temp.next = temp1;
        }

        Node t = head.next;
        while (t != null) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
    }

    public static Node Marge(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;

        Node h=new Node(0);
        Node temp=h;

        while (temp1!=null && temp2 !=null) {
            if(temp1.data<temp2.data){
                temp.next=temp1;
                temp=temp1;
                temp1=temp1.next;
            }else{
                temp.next=temp2;
                temp=temp2;
                temp2=temp2.next;
            }
        }
        if(temp1==null){
            temp.next=temp2;
        }else{
            temp.next=temp1;
        }
        return h.next;
    }

    public static void show(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(7);
        Node e = new Node(9);


        Node f = new Node(2);
        Node g = new Node(4);
        Node h = new Node(6);
        Node i = new Node(8);
        Node j = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;

        MargeSort(a, f);
        // show(z);
        System.out.println();
        Node z=Marge(a, f);
        show(z);

    }
}
