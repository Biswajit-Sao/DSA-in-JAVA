class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class LinkList{
    public static void Show(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    public static Node OddEvenSet(Node head){
        Node odd=new Node(0);
        Node even=new Node(0);
        Node tempo=odd;
        Node tempe=even;
        Node temp=head;
        while (temp!=null) {
            tempo.next=temp;
            temp=temp.next;
            tempo=tempo.next;

            tempe.next=temp;
            if(temp==null){
                break;
            }
            temp=temp.next;
            tempe=tempe.next;
        }
        odd=odd.next;
        even=even.next;
        tempo.next=even;
        return odd;
    }
}
public class OddEven {
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

        LinkList x=new LinkList();

        x.Show(a);
        Node z=x.OddEvenSet(a);
        System.out.println();
        x.Show(z);

    }
}
