import java.util.*;

public class revDSA2 {
    public static void main(String[] args) {

        ArrayList<String> set1 = new ArrayList<>();

        set1.add("r");
        set1.add("s");
        set1.add("p");
        set1.add("q");
        set1.add("f");
        
        ArrayList<String> set2 = new ArrayList<>();

        set2.add("f");
        set2.add("q");
        set2.add("r");
        set2.add("s");
        set2.add("p");

        ArrayList<String> set3 = new ArrayList<>();

        for(String e:set1){
            set3.add(set2.contains(e) ? "Yes" : "No");
            System.out.println(set3);
        }
    }
}
