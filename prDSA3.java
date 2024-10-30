import java.util.ArrayList;

public class prDSA3 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(10);
        marks.add(20);
        marks.add(30);
        marks.add(40);
        marks.add(50);

        int m = marks.size();

        int n = m/2;
        int l = marks.get(n);
        System.out.println(l);
    }
}
