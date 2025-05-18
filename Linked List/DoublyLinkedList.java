class Node {
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
    }
}
class DoublyLink{
    public static void display(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void displayRev(Node tail){
        Node temp=tail;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void RendamDisplay(Node rendam){
        Node temp=rendam;
        while (temp.prev!=null) {
            temp=temp.prev;
        }
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(87);
        Node c=new Node(98);
        Node d=new Node(28);
        Node e=new Node(56);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        e.prev=d;
        d.prev=c;
        c.prev=b;
        b.prev=a;

        DoublyLink x=new DoublyLink();
        // x.display(a);
        // x.displayRev(e);
        x.RendamDisplay(c);

    }
}
