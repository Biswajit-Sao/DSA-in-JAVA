public class insertion_sort {

    static void InsertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }

        }
    }
    public static void main(String[] args) {
        int[] arr={102,28,38,27};
        InsertionSort(arr);
        for (int i : arr) {
            System.out.print(" "+i);
        }
    }
}
