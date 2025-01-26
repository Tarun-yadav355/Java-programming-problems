import java.util.*;

public class revDSA1 {
    public static void main(String args[]){
        ArrayList<String> rev = new ArrayList<>();

        rev.add("red");
        rev.add("blue");
        rev.add("yellow");
        rev.add("black");
        rev.add("green");
        rev.add(0,"purple");

        rev.remove(3);

    

       Collections.reverse(rev);

       System.out.println(rev);




    }
}
