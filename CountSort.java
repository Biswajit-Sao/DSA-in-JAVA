public class CountSort {
    static int findMax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static void BasicCountSort(int[] arr){
        int n=arr.length;
        int[] output=new int[n];
        int max=findMax(arr);
        int[] count=new int[max+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        //prefix sum
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr={2,5,2,5,6,100,27,2,8,6};
        BasicCountSort(arr);
        System.out.println();
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

