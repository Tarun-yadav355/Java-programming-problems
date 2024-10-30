import java.util.Deque;
import java.util.LinkedList;



public class prDSA42 {
    
    public static void pus(int n,Deque<Integer> yet){
        yet.offer(n);
        System.out.println("pushing "+yet);

        
    }

    public static void pope(Deque<Integer> yet){
         yet.pollLast();
         System.out.println("poping "+yet);


    
}

public static void top(Deque<Integer> yet){
    System.out.println(yet.peekLast());
    

}

public static boolean empty(Deque<Integer> yet){
    if(yet.size()==0){
        return yet.isEmpty();

    }
    else{
        return yet.isEmpty();
    }

}
    public static void main(String[] args) {
        Deque<Integer> het = new LinkedList<>();

      
        het.offer(3);
        het.offer(5);
        het.offer(18);
        het.offer(11);
        het.offer(19);

        System.out.println("Original "+het);

        pus(36,het);
        pope(het);
        top(het);
        empty(het);

        

        
        

       
    }
}
