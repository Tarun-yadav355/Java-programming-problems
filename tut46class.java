import java.util.Arrays;

public class tut46class {
    public static void main(String[] args) {
        
        int team[]  = {3,2,5,1,3,4};

        int n = team.length;
        Arrays.sort();

        for(int i=0;i<n/2;i++){

            for(int j=n/2-1;j>=0;j--){
                System.out.println(i+" "+j);
            }

        }
    }
}
