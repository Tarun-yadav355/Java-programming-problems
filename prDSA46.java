import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class prDSA46 {
    public static Stack<Integer> high(Stack<Integer> net){
        Queue<Integer> jet = new PriorityQueue<>();
        int n = net.size();

        for(int i=0;i<n;i++){
            jet.offer(net.pop());
        }
        System.out.println("pehlaa "+jet);

        int h = jet.poll();
        System.out.println("mini "+h);

        for(int i =0;i<n;i++){
            net.push(jet.poll());
        }
        return net;

    }
    public static void main(String[] args) {
        Stack<Integer> het = new Stack<>();

        het.push(15);
        het.push(11);
        het.push(51);
        het.push(13);
        het.push(45);
        het.push(99);
        het.push(111);

        

        System.out.println("Original"+het);

        System.out.println("First task:-");

        high(het);

        het.pop();
        het.pop();

        System.out.println("Second task:-");
        high(het);

     
    }
}
