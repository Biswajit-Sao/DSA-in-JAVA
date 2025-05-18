public class index {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static void Show(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(11);
        Node c=new Node(12);
        Node d=new Node(13);
        Node e=new Node(14);

        a.next=b; //10->11
        b.next=c; //11->12
        c.next=e; //11->12->14
        e.next=d; //11->12->14->13

        // System.out.println(a.data);
        // System.out.println(a.next.data);


        Show(a);



    }
}
