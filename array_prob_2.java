public class array_prob_2 {
    static int[] route(int[] arr,int k){
        int n=arr.length;
        // k=k%n;
        int[] ans=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] ans=route(arr, 2);
        for(int i=0;i<ans.length;i++){
            System.out.print(" "+ans[i]);
        }

    }
}
