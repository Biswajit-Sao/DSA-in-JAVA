import java.util.*;
public class ConseeutiveSubsequences {
    public static int[] Result(int[] arr){
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.size()==0 || st.peek()!=arr[i]){
                st.push(arr[i]);
            }
            else if(st.peek()==arr[i]){
                if(arr[i]!=arr[i+1]||i==n-1){
                    st.pop();
                }
            }
        }
        int[] res=new int[st.size()];
        int m=res.length;
        for(int i=m-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,4,5,5,5,6,7,7,7,7,8};
        int[] res=Result(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
