// Array practise:-

import java.util.*;

public class prDSA1 {
    public static void main(String args[]){

        ArrayList<Integer> Beli = new ArrayList<>();

        Beli.add(4);
        Beli.add(8);
        Beli.add(7);
        Beli.add(11);
        Beli.add(9);

        int n = Beli.size();

        for(int i = 0;i<n;i++){
            Beli.get(i);
            System.out.println(i+(i+1));
        }

        



    }
}
