import java.util.Scanner;
public class input{
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter the number:");
    //     int a=sc.nextInt();
    //     a=a+a;
    //     System.out.println(a);
    // }

    // public static void main(String[] args) {
    //     // int i=1234537287;
    //     // int j=0;
    //     // while (0<i) {
    //     //     i=i/10;
    //     //     j++;
    //     // }
    //     // System.out.println(j);

    //     int i=12345;
    //     int j=0,ans=0;
    //     while (0<i) {
    //         j=j+(i%10);
    //         ans=ans*10+(i%10);
    //         i=i/10;
    //     }
    //     System.out.println(ans);
    //     System.out.println(j);
    // }


    // public static void main(String[] args) {
    //     int i,ans=0,j=100;
    //     for(i=0;i<j;i++){
    //         if(i%2==0){
    //             ans=ans-i;
    //         }
    //         else{
    //             ans=ans+i;
    //         };
    //     }
    //     System.out.println(ans);
    // }

    // public static void main(String[] args) {
    //     int i,j;
    //     for(i=0;i<=5;i++){
    //         for(j=0;j<5;j++){
    //             System.out.print(j);

    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     int []arr_1=new int[10];
    //     arr_1[0]=10;
    //     arr_1[1]=10;
    //     arr_1[2]=10;
    //     arr_1[3]=10;
    //     arr_1[4]=10;
    //     arr_1[5]=10;
    //     arr_1[1]=12;


    //     for(int i=0;i<arr_1.length;i++){
    //         System.out.println(arr_1[i]);
    //     }

    // }

    public static void main(String[] args) {
        int[][] arr=new int[5][10];

        // for(int i=0;i<arr.length;i++){
        //     arr[0][i]=i;
        // }
        // for(int i=0;i<arr.length;i++){
        //     arr[1][i]=i*2;
        // }
        // for(int i=0;i<arr.length;i++){
        //     arr[2][i]=i*3;
        // }
        // for(int i=0;i<arr.length;i++){
        //     arr[3][i]=i*4;
        // }
        // for(int i=0;i<arr.length;i++){
        //     arr[4][i]=i*5;
        // }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=3*j+33;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(" |  "+arr[0][i]);
        }
        System.out.println();
        System.out.println("---------------------------");
        for(int i=0;i<arr.length;i++){
            System.out.print(" |  "+arr[1][i]);
        }
        System.out.println();

        System.out.println("---------------------------");
        for(int i=0;i<arr.length;i++){
            System.out.print("|   "+arr[2][i]);
        }
        System.out.println();

        System.out.println("---------------------------");
        for(int i=0;i<arr.length;i++){
            System.out.print(" |  "+arr[3][i]);
        }
        System.out.println();

        System.out.println("---------------------------");
        for(int i=0;i<arr.length;i++){
            System.out.print("|   "+arr[4][i]);
        }


    }
    
}