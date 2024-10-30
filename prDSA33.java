import java.util.LinkedList;

public class prDSA33 {
    public static void main(String[] args) {
        LinkedList<Integer> ven = new LinkedList<>();

        ven.add(2);
        ven.add(32);
        ven.add(13);
        ven.add(44);
        ven.add(15);

        int n = ven.size();

        LinkedList<Integer> sen = new LinkedList<>();
         
        sen.add(12);
        sen.add(91);
        sen.add(13);
        sen.add(44);
        sen.add(15);

        int m = sen.size();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(ven.get(i)==sen.get(j)){
                    System.out.println("Common on " +i);
                    return;
                }
            }
        }
    }
}
