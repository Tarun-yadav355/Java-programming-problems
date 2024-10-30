import java.util.Arrays;
import java.util.Collections;

public class prDSA17 {
    public static boolean ispossible(Integer x[],int y[],int z,int q){
        Arrays.sort(x,Collections.reverseOrder());
        Arrays.sort(y);

        for(int i=0;i<q;i++){
            if(x[i] + y[i] < z)
            return false;
        }
        return true;

    }
    public static void main(String[] args) {
        Integer a[] = {2,1,3};
        int b[] = {9,8,7};
        int k = 10;
        int n = a.length;

        if(ispossible(a, b, k, n)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        
    }
}
