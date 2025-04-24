class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
    
}
class MindVal {
    public static Node Midevalue(Node head){
        Node slow=head;
        Node fast=head;
        while (fast !=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node MidevaluFast(Node head){
        Node slow=head;
        Node fast=head;
        while (fast.next !=null && fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node DeleteListMid(Node head){
        Node slow=head;
        Node fast=head;
        while (fast.next.next !=null && fast.next.next.next !=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }

    public static void Show(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
}
public class MiddleElemint {
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

        

        MindVal A=new MindVal();
        Node x=A.Midevalue(a);
        System.out.println(x.data);
        System.out.println();
        A.Show(a);
        Node y=A.MidevaluFast(a);
        System.out.println();
        System.out.println(y.data);

        Node Z=A.DeleteListMid(a);
        System.out.println();
        A.Show(a);
    }
}
