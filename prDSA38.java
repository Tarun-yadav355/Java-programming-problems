import java.util.LinkedList;

public class prDSA38 {
    public static void main(String[] args) {
        LinkedList<Integer> nav = new LinkedList<>();
        LinkedList<Integer> gav = new LinkedList<>();

        nav.add(5);
        nav.add(6);
        nav.add(4);

        gav.add(1);
        gav.add(2);
        gav.add(2);

        int a = nav.size();
        int carry =0;

       LinkedList<Integer> result = new LinkedList<>();
        
        for(int i=0;i<a;i++){
            int sum = nav.get(i) + gav.get(i) + carry;
            carry = sum/10;
            result.add(sum%10);


        }
        if(carry != 0){
            result.add(carry);
        }
        System.out.println("Result"+result);
    }
}
