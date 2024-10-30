import java.util.ArrayList;

public class prDSA8 {
    public static void main(String args[]){
        ArrayList<Integer> verna = new ArrayList<>();

        verna.add(2);
        verna.add(4);
        verna.add(5);
        verna.add(9);
        verna.add(3);
        verna.add(7);

        int k = verna.size();

        int L = verna.get(0);
        //int S = verna.get(0);
        int SL = verna.get(-1);

        for(int i=0;i<k;i++){
            if(L < verna.get(i)){
                L = verna.get(i);
            }
        }
        System.out.println(L);

        for(int j=0;j<k;j++){
            if(SL < verna.get(j) && verna.get(j)!= L){
                SL = verna.get(j);
            }
        }
        
System.out.println(SL);
    }

}

