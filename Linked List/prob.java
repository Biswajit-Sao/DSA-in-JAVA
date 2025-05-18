public class prob {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static Node Duclicke(Node head){
        Node temp=head;
        Node h=new Node(0);
        Node temp1=h;
        while (temp!=null) {
            Node t=new Node(temp.data);
            temp1.next=t;
            temp1=temp1.next;
            temp=temp.next;
        }
        return h.next;
    }
    public static void Show(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(29);
        Node c = new Node(40);
        Node d = new Node(70);
        Node e = new Node(30);
        Node f = new Node(97);

        Node H=new Node(1000);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Show(a);
        System.out.println();
        Node x=Duclicke(a);
        Show(x);

        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);

        // Node temp = a;
        // System.out.println(temp);
        // while (temp != null) {
        //     System.out.println(temp.data);
        //     temp = temp.next;
        //     System.out.println(temp);
        // }

        // H.next=b.next;
        // b.next=H;
        
        // System.out.println(H.next);
        // System.out.println(b.next.next);
        // System.out.println(d.next.next.data);


        //      Node temp = a;
        // System.out.println(temp);
        // while (temp != null) {
        //     System.out.println(temp.data);
        //     temp = temp.next;
        //     System.out.println(temp);
        // }

        


    }
}