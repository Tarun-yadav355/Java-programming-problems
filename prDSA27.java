import java.util.LinkedList;

public class prDSA27 {
    public static void main(String[] args) {
        LinkedList<Integer> jet = new LinkedList<>();

        jet.add(1);
        jet.add(2);
        jet.add(3);
        jet.add(4);
        jet.add(5);

        int n= jet.size();
        if(n==0){
            System.out.println("Wrong");
        }

        for(int i=n-1;i>=0;i--){
            System.out.println(jet.get(i));
        }
    }
}
