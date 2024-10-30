import java.util.ArrayList;

public class prDSA7 {
    public static void main(String args[]){
        ArrayList<Integer> verna = new ArrayList<>();

        verna.add(2);
        verna.add(4);
        verna.add(5);
        verna.add(9);
        verna.add(3);
        verna.add(7);

        int k = verna.size();
        int min = verna.get(0);
        int max = verna.get(0);

        

        for(int i=0;i<=k;i++){
            if(verna.get(i) < min){
                min = verna.get(i);
            }

        }
        for(int i=0;i<=k;i++){
            if(verna.get(i) > max){
                max = verna.get(i);
            }
        }
        int z = max-min;
            System.out.println(z);
    }
}
