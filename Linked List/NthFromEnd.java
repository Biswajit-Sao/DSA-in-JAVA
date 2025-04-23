class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

public class NthFromEnd {

    public static Node NthEnd(Node head, int idx){
        Node temp=head;
        int size=0;
        while (temp!=null) {
            size++;
            temp=temp.next;
        }
        int m=size-idx+1;

        temp=head;
        for(int i=0;i<m-1;i++){
            temp=temp.next;
        }
        return temp;
    }
    public static Node NthEnd1(Node head, int idx){
        Node slow=head;
        Node fast=head;

        for(int i=0;i<=idx;i++){
            fast=fast.next;
        }
        while (fast!=null) {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }


    public static Node deleteNthEnd(Node head,int n){
        Node frst=head;
        Node slow=head;
        for(int i=1;i<=n;i++){
            frst=frst.next;
        }
        if(frst==null){
            head=head.next;
            return head; 
        }
        while (frst.next!=null) {
            frst=frst.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }


    public static void show(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(13);
        Node c=new Node(16);
        Node d=new Node(12);
        Node e=new Node(17);
        Node f=new Node(13);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        show(a);
        System.out.println();
        // Node valu=NthEnd(a,2);

        // Node val=NthEnd1(a,2);

        b=deleteNthEnd(a, 3);
        show(a);
        // System.out.println(valu.data);
        // System.out.println(val.data);




    }    
}
