
public class basicCountSort {
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
        int max=findMax(arr);
        int[] count=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k++]=i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={2,5,2,5,6,100,27,2,8,6};
        BasicCountSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}