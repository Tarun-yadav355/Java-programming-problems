import java.util.ArrayList;
import java.util.Collections;

class tut30class {
    public static void main(String[] args) {
        ArrayList<Integer> billu = new ArrayList<Integer>();

        //Add new element:-
        billu.add(4);
        billu.add(2);
        billu.add(7);
        billu.add(1);

        System.out.println(billu);

        //Get element - Jis position ka element hume chahiye:-
        int element = billu.get(1);
        System.out.println(element);

        //Koi naya element add karna ho to:-
        billu.add(1,9);
        System.out.println(billu);

        //Element ko dusre element se replace karna ho to:-
        billu.set(2,11);
        System.out.println(billu);

        //To delete a element:-
        billu.remove(4);
        System.out.println(billu);

        //Size of arraylist:-
        int sz = billu.size();
        System.out.println(sz);

        //Sorting of list:-
        Collections.sort(billu);
        System.out.println(billu);
    }
    
}
