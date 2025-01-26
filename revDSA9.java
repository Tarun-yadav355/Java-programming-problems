import java.util.LinkedList;

public class revDSA9 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(3);
        l1.add(5);
        l1.add(7);
        l1.add(5);
        l1.add(14);
        l1.add(5);
        l1.add(15);

        int n=l1.size();
        int m=5;

       int count =0;

       for(int i=0;i<=n;i++){
        if(m==l1.get(i)){
            System.out.println(count);
           
            count++;
           
            
        }
       
       
        
       }
       
      
    }
}
