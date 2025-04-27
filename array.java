import java.util.Arrays;

/**
 * array
 */
public class array {

    // public static void main(String[] args) {
    //     // int[][] arr=new int[10][5];
    //     int[][] arr={{1,2,3},{21,32,34},{32,4,32}};
        

    //     for(int i=0;i<=arr.length;i++){
    //         for(int j=0;j<arr[i].length;j++){
    //             System.out.print("         "+arr[i][j]);
    //         }
    //         System.out.println();
    //     }

    // }

    // public static void main(String[] args) {
    //     int[] arr={11,43,22,54,2,22};
    //     int k=22,ans=-1;
    //     for(int i=0;i<arr.length;i++){
    //
    //         if(arr[i]==k){
    //             ans=i;
    //             break;
    //         }
    //     }
    //     System.out.println(ans);
    // }

    public static void main(String[] args) {
        int[] arr={11,43,22,54,2,22};
        int[] arr_2=Arrays.copyOf(arr, arr.length);
        for(int i=0;i<arr_2.length;i++){
            System.out.println(arr_2[i]);
        }
    }

}
