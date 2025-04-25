public class CycleLinkList {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }
    public static Node CycleChuse(Node head){
        Node fast=head;
        Node slow=head;

        while (fast!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) break;
        }
        Node temp=head;

        while (temp!=slow) {
            slow=slow.next;
            temp=temp.next;
        }
        return slow;
    }

    public static Node Cycleset(Node head) {
        Node fast=head;
        Node slow=head;
        while (fast !=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        return slow;
        
    }

    public static void show(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
         Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);


        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=b;

        

        Node x=CycleChuse(a);
        System.out.println(x.data);


        Node Z=Cycleset(a);
        System.out.println(Z.data);
    }
}
