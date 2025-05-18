import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Stack {
    Node head = null;
    int size = 0;

    void push(int x) {
        Node a = new Node(x);
        a.next = head;
        head = a;
        size++;
    }

    int pop() {
        if (head == null) {
            System.out.println("Stack Underflow!");
            return -1; // or throw exception
        }
        int a = head.data;
        head = head.next;
        size--;
        return a;
    }

    int size() {
        return size;
    }

    int peek() {
        if (head == null) {
            System.out.println("Stack is empty!");
            return -1; // or throw exception
        }
        return head.data;
    }

    void display() {
        displayReverse(head);
    }

    void displayReverse(Node node) {
        if (node == null) return; // Base case
        displayReverse(node.next);
        System.out.println(node.data);
    }
}

public class StackLinkList {
    public static void main(String[] args) {
        Stack st = new Stack();

        // Uncomment this block for manual testing
        // Scanner sc = new Scanner(System.in);
        // while (true) {
        //     System.out.println("1. PUSH");
        //     System.out.println("2. POP");
        //     System.out.println("3. PEEK");
        //     System.out.println("4. SIZE");
        //     System.out.print("Enter Your Choice: ");
        //     int val = sc.nextInt();

        //     switch (val) {
        //         case 1:
        //             System.out.print("Enter the Number to Push: ");
        //             int a = sc.nextInt();
        //             st.push(a);
        //             System.out.println("STACK VALUES:");
        //             System.out.println("-------------------------------");
        //             st.display();
        //             System.out.println("-------------------------------");
        //             break;

        //         case 2:
        //             System.out.println("POP VALUE IS: " + st.pop());
        //             System.out.println("STACK VALUES:");
        //             System.out.println("-------------------------------");
        //             st.display();
        //             System.out.println("-------------------------------");
        //             break;

        //         case 3:
        //             System.out.println("PEEK VALUE IS: " + st.peek());
        //             break;

        //         case 4:
        //             System.out.println("Stack Size: " + st.size());
        //             System.out.println("-------------------------------");
        //             st.display();
        //             System.out.println("-------------------------------");
        //             break;

        //         default:
        //             System.out.println("Invalid Choice.");
        //     }
        // }
        

        // Example Usage:
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(40);
        st.push(40);
        st.push(40);


        System.out.println("Stack in Reverse Order (Top to Bottom):");
        st.display();
        System.out.println("Peek: " + st.peek());
        System.out.println("Size: " + st.size());
    }
}
