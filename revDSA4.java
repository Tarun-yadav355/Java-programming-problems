import java.util.LinkedList;
import java.util.*;

public class revDSA4 {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        l1.add(4);
        l1.add(5);
        l1.add(15);
        l1.add(18);
        l1.add(21);


        int n = l1.size();

        int p = n-m;

        System.out.println(l1.get(p));


        sc.close();




        
    }
    
}
