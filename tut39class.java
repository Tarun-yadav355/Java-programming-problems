import java.util.*;

public class tut39class {

    public static void main(String[] args) {
        Stack<Integer> p = new Stack<>();

        p.push(5);
        p.push(11);
        p.push(7);
        p.push(22);

        while (!p.isEmpty()){
            System.out.println(p.peek());
            p.pop();
        }
        
    }


    
}
