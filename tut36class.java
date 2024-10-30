import java.util.*;

class que{
    public static void main(String[] args) {
        LinkedList<Integer> taar = new LinkedList<Integer>();

        for(int i=0;i<51;i++){
            taar.add(i);
            System.out.println(taar);
        
            for(int j=25;j<51;j++){
                taar.remove(j);
                System.out.println(taar);
            }

            
        }
    }
}
        

        
    

