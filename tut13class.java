import java.util.*;

public class tut13class {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int coln = sc.nextInt();
        
        int[][] matrix = new int[row][coln];

        for(int i=0;i<row;i++){

            for(int j=0;j<coln;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<coln;j++){
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();


    }
}
