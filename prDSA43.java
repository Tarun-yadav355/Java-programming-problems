import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class prDSA43 {
    public static void raat(Queue<Integer> uat, int m){


        Stack<Integer> rev = new Stack<>();

        while(!uat.isEmpty()){
            rev.push(uat.poll());
        }
        while (!rev.isEmpty()) {
            uat.offer(rev.pop());
            
        }
        System.out.println("reverse "+uat);
        
    }
    public static void main(String[] args) {
        Queue<Integer> bat = new LinkedList<>();

        bat.offer(21);
        bat.offer(8);
        bat.offer(19);
        bat.offer(88);
        bat.offer(14);
        bat.offer(45);

        int n = 3;

        raat(bat,n);


    }
}
