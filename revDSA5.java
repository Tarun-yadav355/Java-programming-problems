import java.util.Collections;
import java.util.LinkedList;

public class revDSA5 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(4);
        l1.add(3);
        l1.add(9);
        l1.add(3);
        l1.add(15);
        l1.add(3);
        l1.add(13);

        int n = l1.size();

        Collections.sort(l1);

        for(int i=0;i<=n-1;i++){
            for(int j=i+1;j<n-1;j++){
                if(l1.get(i)==l1.get(j)){
                    l1.remove(j);
                    
                    
                }
                
            }
            
        }
        System.out.println(l1);

        
    }
}
