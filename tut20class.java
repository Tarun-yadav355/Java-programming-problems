import java.util.*;

public class tut20class {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println("Yes power of 2");
        }else{
            System.out.println("Not the power of 2");
        }

        sc.close();

    }
}
