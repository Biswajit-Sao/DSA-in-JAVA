public class array_prob_3 {
    static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    static void swap(int[] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sortZeroesAndOne(int[] arr){
        int n=arr.length;
        int i=0,j=n-1;
        while (i<j) {
            if(arr[i]==1&&arr[j]==0){
                swap(arr,i,j);
                i++;
                j--;
            }
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
            
        }

    }
    public static void main(String[] args) {
        int[] arr={0,0,1,1,0,1,0};
        print(arr);
        sortZeroesAndOne(arr);
        print(arr);

    }
}
