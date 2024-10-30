import java.util.*;

public class tut19class {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 5;
        int pos = 3;
        int bitmask = 1<<pos;
        int ultaa = ~(bitmask);

        if(n==0){
            int answer = ultaa & a;
            System.out.println(answer);
        }
        else{
            int ans = bitmask | a;
            System.out.println(ans);


        }
        sc.close();



    }
}
