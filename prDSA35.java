import java.util.LinkedList;

public class prDSA35 {
    public static void main(String[] args) {
       LinkedList<Integer> hat = new LinkedList<>();

        hat.add(11);
        hat.add(32);
        hat.add(5);
        hat.add(16);
        hat.add(17);
        hat.add(25);

        System.out.println("Original"+hat);

        int n=hat.size();
     LinkedList<Integer> even = new LinkedList<>();
     LinkedList<Integer> odd = new LinkedList<>();

        for(int i=0;i<n;i++){
            if(hat.get(i) %2==0){

               even.add(hat.get(i));
            }
            
        if(hat.get(i) %2 !=0){
            odd.add(hat.get(i));
        }
        
    }
    LinkedList<Integer> combi = new LinkedList<>(even);
    combi.addAll(odd);
    System.out.println("even"+even);
    System.out.println("odd"+odd);
    System.out.println("cobiiiiii"+combi);
    }
}

