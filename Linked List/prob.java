 class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

public class prob {
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(12);
        Node c=new Node(15);
        Node d=new Node(18);

        a.next=b;
        b.next=c;
        c.next=d;

        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);

        Node temp=a;

        while (temp !=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }




    }
}
