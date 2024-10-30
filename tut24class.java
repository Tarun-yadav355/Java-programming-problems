import java.util.*;

public class tut24class {
    public static int factorial(int a){
        if(a==1 || a==0){
            return 1;
        }
        


        int n1 = factorial(a-1);
        int n2 = a*n1;
        return n2;

    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = factorial(n);
        System.out.println(ans);

        sc.close();


}
}

