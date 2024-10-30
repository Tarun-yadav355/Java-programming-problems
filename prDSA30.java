import java.util.LinkedList;

public class prDSA30 {
    public static void jatt(LinkedList<Integer> hat,Integer NodeValue){
        int index = hat.indexOf(NodeValue);

        if(index == -1 || index >= hat.size()-1){
            System.out.println("Wrong listt");
        }

        hat.set(index, hat.get(index + 1));

        hat.remove(index+1);

    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original"+list);
        

        Integer NodeValue = 3;

        jatt(list, NodeValue);
        System.out.println("After deletion"+list);
    }
}
