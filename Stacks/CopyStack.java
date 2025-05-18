import java.util.*;
public class CopyStack {

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Scanner sc=new Scanner(System.in);

        // System.out.println("Enther the size:");
        // int x=sc.nextInt();
        // for(int i=0;i<=x;i++){
        //     System.out.println("Enter the Stack["+i+"] index value:");
        //     int z=sc.nextInt();
        //     st.push(z);
        // }
        // System.out.println(st);

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

        System.out.println();
        Stack gt=new Stack<>();

        while (st.size()>0) {
            gt.push(st.pop());
        }
        System.out.println(gt);
        Stack rt=new Stack<>();

        while (gt.size()>0) {
            rt.push(gt.pop());
        }
        System.out.println(rt);

    

    }
}