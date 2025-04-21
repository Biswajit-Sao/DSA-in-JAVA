public class spiral_model {

    static void spiralPrint(int[][]matrix,int r,int c){
        int topRow=0,bottomRow=r-1,leftcol=0,righitCol=c-1;
        int totalElements=0;

        while (totalElements<r*c) {
            for(int i=leftcol;i<=righitCol&&totalElements<r*c;i++){
                System.out.print(matrix[topRow][i]+" ");
                totalElements++;
            }
            
            topRow++;
            for(int i=topRow;i<=bottomRow&&totalElements<r*c;i++){
                System.out.print(matrix[i][righitCol]+" ");
                totalElements++;
            }
            
            righitCol--;
            for(int j=righitCol;j>=leftcol&&totalElements<r*c;j--){
                System.out.print(matrix[bottomRow][j]+" ");
                totalElements++;
            }
           
            bottomRow--;
            for(int i=bottomRow;i>=topRow&&totalElements<r*c;i--){
                System.out.print(matrix[i][leftcol]+" ");
                totalElements++;
            }
           
            leftcol++;
            
        }
    }
    public static void main(String[] args) {

        int[][] arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        spiralPrint(arr, arr.length, arr[1].length);
        
    }
}
