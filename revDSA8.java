import java.util.*;
import java.util.LinkedList;

public class revDSA8 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        l1.add(3);
        l1.add(5);
        l1.add(13);
        l1.add(15);
        l1.add(7);
        l1.add(11);
        l1.add(21);
        l1.add(23);

        int n = l1.size();
        

        for(int i=0;i<=n;i++){
            int x= m*i;
            l1.remove(x);
           
                
            System.out.println(l1);
            }
            sc.close();
            
        }
        
    }

