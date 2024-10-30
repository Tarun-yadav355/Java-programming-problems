import java.io.IOException;
import java.util.*;

public class prDSA14 {
    public static void main(String[] args) 
    throws IOException
    {

        char h[][] = {{1,2,3,4},
        {5,6,7,8},
        {9,11,13,15}

        };
        Scanner sc = new Scanner(System.in);
        

        for(int i=0;i<h.length;i++){
            for(int j=0;j<h[i].length;j++){
                System.out.println(h[i][j] + " ");
            }
            
        }
        
sc.close();

    }
}
