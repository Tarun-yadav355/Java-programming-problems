import java.util.LinkedList;

public class revDSA3 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();

        list1.add(3);
        list1.add(13);
        list1.add(15);
        list1.add(25);
        list1.add(9);
        list1.add(15);
        list1.add(22);

        System.out.println(list1);

        int n = list1.size();

        int m = list1.get((n/2));

        System.out.println(m);

        
            list1.removeLastOccurrence(15);

            System.out.println(list1);
      


    }
}
