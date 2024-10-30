import java.util.*;


public class tut23class {
    public static void addition(int i,int a,int sum){
        
        
        if(i==a){
            sum += i;
            System.out.println(sum);
            return;
        }else{
        
            sum += i;
            addition(i+1, a, sum);
        }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        addition(1,n,0);
        sc.close();

    }
}
