import java.util.LinkedList;
import java.util.Collections;

public class prDSA37 {
    public static void main(String[] args) {
        LinkedList<Integer> net = new LinkedList<>();

        net.add(3);
        net.add(1);
        net.add(7);

        LinkedList<Integer> met = new LinkedList<>();

        met.add(1);
        met.add(5);
        met.add(4);

        LinkedList<Integer> ket = new LinkedList<>();

        ket.add(2);
        ket.add(6);

        LinkedList<Integer> comb1 = new LinkedList<>(net);

        comb1.addAll(met);
        System.out.println("new"+comb1);

        LinkedList<Integer> comb2 = new LinkedList<>(comb1);

        comb2.addAll(ket);
        System.out.println("navaa"+comb2);

        Collections.sort(comb2);

        System.out.println("Cheeta"+comb2);

        

    }
}
