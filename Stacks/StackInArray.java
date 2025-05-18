import java.util.Scanner;

class Stack {
    int[] arr=new int[5];
    int idx=0;

    void push(int x){
        if(isFull()){
            System.out.println("Stack is Full");
            return;
        }
        arr[idx]=x;
        idx++;
    }
    int peek(){
        if(idx==0){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[idx-1];
    }
    int pop(){
         if(idx==0){
            System.out.println("Stack is Empty");
            return -1;
        }
        int top=arr[idx-1];
        arr[idx-1]=0;
        idx--;
        return top;
    }
    int size(){
        return idx;
    }
    boolean isEmpty(){
        if(size()==0){
            return true;
        }else{
            return false;
        }
    }
    boolean isFull(){
        if(idx==arr.length){
            return true;
        }else{
            return false;
        }
    }

    void display(){
        for(int i=0;i<=idx-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
   
    
}

public class StackInArray {
    public static void main(String[] args) {
        Stack st=new Stack();
        Scanner sc=new Scanner(System.in);
        // st.push(10);
        // st.push(11);
        // st.push(12);
        // st.push(13);
 
        // st.display();

        // st.pop();
        // st.display();
        // st.push(19);
        // st.display();

        // System.out.println(st.peek());
        // System.out.println(st.pop());
        // st.display();
        // st.push(10);
        // st.push(10);
        // st.push(10);

        // st.display();

        // System.out.println(st.isEmpty());
        // System.out.println(st.isFull());
        while (true) {
            System.out.println("1.PUSH");
            System.out.println("2.POP");
            System.out.println("3.PEEK");
            System.out.println("4.SIZE");


            System.out.print("Enter The Number:");
            int val=sc.nextInt();

            switch (val) {
                case 1:
                    if(st.isFull()){
                        System.out.println("STACK IS FULL");
                    }else{
                        System.out.print("Enter the Number You Are push:");
                        int a=sc.nextInt();
                        st.push(a);
                        System.out.println("STACK VALU IS");
                        System.out.println("-------------------------------");
                        st.display();
                        System.out.println("-------------------------------");
                    }
                    break;
                case 2:
                    if(st.isEmpty()){
                        System.out.println("STACK IS EMPTY");
                    }else{
                        System.out.println("POP VALU IS :"+st.pop());
                        System.out.println("STACK VALU IS:");
                        System.out.println("-------------------------------");
                        st.display();
                        System.out.println("-------------------------------");
                    }
                    break;
                case 3:
                    if(st.isEmpty()){
                        System.out.println("STACK IS EMPTY");

                    }else{
                        System.out.println("THE PEEK VALU IS:"+st.peek());
                    }
                    break;
                case 4:
                    System.out.println("The Size of the Stack is:"+st.size());
                    System.out.println("-------------------------------");
                        st.display();
                    System.out.println("-------------------------------");
                    break;
                default:
                    break;
            }
        }

        
    }
}
