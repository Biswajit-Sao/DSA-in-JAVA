public class array_rec {

    static void printvalu(int[] arr,int i){
        if(i==arr.length){
            return;
        }
        // System.out.println(arr[i]);
        printvalu(arr, i+1);
        System.out.print(" "+arr[i]);

    }

    static int maxArray(int[] arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
     int i=maxArray(arr, idx+1);
     
     return (arr[idx]>i) ? arr[idx] :i;
    }

    static void arraySum(int[] arr,int idx ,int n){
        if(idx==arr.length){
            return;
        }
        int a=n+arr[idx];

        arraySum(arr, idx+1 ,n);

        System.out.println("the valu is sum:"+a);


    }

    static int sumArray(int[] arr, int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }

        int a=sumArray(arr, idx+1);
        return a+arr[idx];
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int i=0;
        printvalu(arr,i);
        System.out.println();
        int j=maxArray(arr,i);
        System.out.println("the valu is:"+j);

        arraySum(arr,0,0);

        System.out.println("the valu is :"+sumArray(arr,0));
    }
}
