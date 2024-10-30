import java.util.LinkedList;
import java.util.Queue;

public class prDSA53 {

    public static void main(String[] args) {
        int [][] ram={{0,1,2,},{0,1,2},{2,1,1}};

        int a = ram.length;
        int b = ram[0].length;

        Queue<Integer> box = new LinkedList<>();

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(ram[i][j] == 2){
                    int n = i;
                    int m = j;
                    System.out.println("ori "+n+ " " +m);
                
                if(ram[n-1][m]  || ram[n+1][m] || ram[n][m-1] || ram[n][m+1] == 1){

                }
                
            }
        }
        }

    }
}
