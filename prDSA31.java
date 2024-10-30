import java.util.LinkedList;

public class prDSA31 {
  
    public static void main(String args[]){
      LinkedList<Integer> vest = new LinkedList<>();

      vest.add(12);
      vest.add(11);
      vest.add(12);
      vest.add(30);
      vest.add(11);
      vest.add(15);

      System.out.println("Pehle"+vest);

      int n = vest.size();
      int p=2;
      vest.remove(n-p);
      System.out.println("Baad"+vest);

  
    }
}
