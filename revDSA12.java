import java.util.LinkedList;

public class revDSA12 {
    public static void main(String[] args) {
        
        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(2);
        l1.add(13);
        l1.add(9);
        l1.add(7);
        l1.add(9);

        int n = l1.size();

       int m = 9;

       for(int i =0;i<n-1;i++){
        if(l1.get(i)==m){
            l1.remove(i);
        }
       }

       System.out.println(l1);

    }
}
