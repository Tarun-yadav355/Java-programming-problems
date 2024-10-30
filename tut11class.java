import java.util.*;

public class tut11class {

    public static void bada(int a, int b){
        if(a<b){
            System.out.println(b);
        }
        else{
            System.out.println(a);
        }
        return ;
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        bada(a, b);


        sc.close();
    }
}
