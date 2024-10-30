import java.util.Arrays;

public class prDSA24 {
    public static void main(String[] args) {
        int a[] = {3,2,7,10};
        int b=a.length;

        
        for(int i=0;i<b-2;i++){
            for(int j=i+1;j<b;j++){
                int g[] ={a[i]+a[j]};
                Arrays.sort(g);
                int l=g.length;
                int p=g[l];
                System.out.println(p);
            }
        }
        

    
            }
        }
    

