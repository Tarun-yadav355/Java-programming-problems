//Circular linkedlist using java framework:-

import java.util.LinkedList;

public class revDSA7 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(3);
        l1.add(5);
        l1.add(7);
        l1.add(4);
        l1.add(6);

        

        System.out.println("Display circular linkedlist");

        displaylist(l1,8);


    }

    

    public static void displaylist(LinkedList<Integer> l1, int steps){

        if(l1.size()==0){
            System.out.println("List is empty");
            return;
        }

        int count =0;
        int current = l1.getFirst();

        while (count < steps) {
            System.out.println(current +" ");
           current = (current == l1.getLast())? l1.get(2) : l1.get(l1.indexOf(current)+1);
           count++;

            
        }
    System.out.println();
    }
}
