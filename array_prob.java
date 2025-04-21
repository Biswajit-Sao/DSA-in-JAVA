public class array_prob {

    static int findMax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static void Print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(" "+arr[i]);
        }
    }
    static int scandLarg(int[] arr){
        int a=findMax(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int b=findMax(arr);
        return b;

    }
    public static void main(String[] args) {
        int[] arr={11,32,33,12,433};
        int i=findMax(arr);
        System.out.println(i);
        Print(arr);
        int j=scandLarg(arr);
        System.out.println(j);
        
    }
}
