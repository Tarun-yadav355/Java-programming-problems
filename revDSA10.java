import java.util.Collections;
import java.util.LinkedList;

public class revDSA10 {
    public static void main(String[] args) {
        
        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(2);
        l1.add(0);
        l1.add(0);
        l1.add(1);
        l1.add(2);
        l1.add(1);

       
        Collections.sort(l1);
        System.out.println(l1);
    }
}
