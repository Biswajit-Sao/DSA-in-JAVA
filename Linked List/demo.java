/**
 * demo
 */

 class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
 }
public class demo {

    static void display(Node val){
        while (val!=null) {
            System.out.print(val.data+"  ");
            val=val.next;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(13);
        Node c=new Node(78);
        Node d=new Node(658);
        Node e=new Node(34);
        Node f=new Node(9);
        
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);


        System.out.println("=========================");

        Node temp=a;
        for(int i=1;i<=6;i++){
            System.out.printf("%d  ",temp.data);
            temp=temp.next;
        }
        System.out.println();
                System.out.println("=========================");

        Node tampe=a;
        while (tampe !=null) {
            System.out.print(tampe.data+"  ");
            tampe=tampe.next;
        }

        System.out.println();
        
        display(a);
        System.out.println();
        while (a!=null) { 
            System.out.print(a.data+"  ");
            a=a.next;
        }



    }
}