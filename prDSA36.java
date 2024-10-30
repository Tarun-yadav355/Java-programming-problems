import java.util.LinkedList;

public class prDSA36 {
    public static void main(String[] args) {
        LinkedList<Integer> bat = new LinkedList<>();

        bat.add(3);
        bat.add(5);
        bat.add(13);
        bat.add(4);
        bat.add(52);
        bat.add(18);

        int n = bat.size();

        LinkedList<Integer> het = new LinkedList<>();
        LinkedList<Integer> det = new LinkedList<>();
        for(int i=0;i<n/2;i++){
           
            het.add(bat.get(i));
    }
    for(int j=n-1;j>n/2-1;j--){
        det.add(bat.get(j));
    }
    System.out.println("ye lee"+het);
    System.out.println("doosraa"+det);
    int l = het.size();

    LinkedList<Integer> rodd = new LinkedList<>();


    for(int k=0;k<l;k++){
        rodd.add(het.get(k));
        rodd.add(det.get(k));
    }
    System.out.println("nayaaaaaaaa"+rodd);
    }
}
