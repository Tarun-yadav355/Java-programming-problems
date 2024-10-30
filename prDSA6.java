import java.util.*;
import java.util.ArrayList;

public class prDSA6 {
    public static void main(String args[]){
        ArrayList<Integer> Verna = new ArrayList<>();

        Verna.add(11);
        Verna.add(7);
        Verna.add(6);
        Verna.add(3);
        Verna.add(2);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = Verna.size();

        for(int i=0;i<=m;i++){
            System.out.println(Verna.get(i));

            if(Verna.get(i)==n){
                System.out.println(i);
            }
            else{
                System.out.println("False");
            }


        }
        sc.close();
    }

}
