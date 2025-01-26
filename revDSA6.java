//Merge two linkedlist alternate:-

import java.util.LinkedList;

public class revDSA6 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(3);
        l1.add(5);
        l1.add(11);
        

        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(7);
        l2.add(9);
        l2.add(13);

        LinkedList<Integer> merge = mergeAlternate(l1,l2);

        System.out.println("Merged linkedlist is "+ merge);

        
    }

    public static LinkedList<Integer> mergeAlternate(LinkedList<Integer> l1,LinkedList<Integer> l2){

        LinkedList<Integer> merge = new LinkedList<>();

        int a = l1.size();
        int b = l2.size();

        int i=0,j=0;
        while (i<a || j<b) {
            if(i<a){
                merge.add(l1.get(i));
                i++;
            }
            if(j<b){
                merge.add(l2.get(j));
                j++;
            }
            
        }
        return merge;
    
        
    }
}
