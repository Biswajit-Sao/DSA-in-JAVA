public class Linklistmain {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Linklist {
        Node head = null;
        Node tall = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = temp;
            } else {
                tall.next = temp;
            }
            tall = temp;
        }

        void show() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            Node temp=head;
            int count =0;
            while (temp!=null) {
                count++;
                temp=temp.next;
            }
            return count;
        }

        void insertAtHead(int val){
            Node temp=new Node(val);

            if(head==null){
                head=tall=temp;
            }else{
                temp.next=head;
                head=temp;
            }
        }
        void insertAtNth(int val,int idx){
            Node t=new Node(val);
            Node temp=head;
            if(idx==size()){
                insertAtEnd(val);
            }else if(idx==0){
                insertAtHead(val);
            }

            for(int i=1;i<idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        int getAt(int idx){
            Node temp=head;
            for(int i=0;i<idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void delete(int idx){
            Node temp=head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tall=temp;
        }
    }

    public static void main(String[] args) {
        Linklist Li = new Linklist();
        Li.insertAtEnd(10);
        Li.insertAtEnd(40);
        Li.insertAtEnd(70);
        Li.show();
        System.out.println("size is : "+Li.size());

        Li.insertAtHead(100);

        Li.show();
        Li.insertAtNth(999, 2);
        Li.show();
        System.out.println("size is : "+Li.size());

        System.out.println(Li.getAt(4));

        Li.delete(3);
        Li.show();

    }
}
