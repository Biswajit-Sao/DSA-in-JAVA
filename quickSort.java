public class quickSort {

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static int partition(int[] arr,int st,int end){
        int pivot=arr[st];
        int cnt=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=pivot){
                cnt++;
            }
        }
        int pivotIndex=st+cnt;
        swap(arr,st,pivotIndex);
        int i=st,j=end;
        while (i<pivotIndex&&j>pivotIndex) {
            while (arr[i]<=pivot) {
                i++;
            }
            while (arr[j]>pivot) {
                j--;
            }
            if(i<pivotIndex&&j>pivotIndex){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;

    }

    static void QuickSort(int[] arr,int st,int end){
        if(st>end){
            return;
        }
        int pi=partition(arr,st,end);
        QuickSort(arr, st, pi-1);
        QuickSort(arr, pi+1, end);
    }
    public static void main(String[] args) {
        int [] arr={18,28,372,278,33,43,23,534,23,22};
        int n=arr.length;
        QuickSort(arr,0,n-1);
        for(int i:arr){
            System.out.print(i+" -> ");
        }
    }
}
