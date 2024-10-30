import java.util.Stack;

public class prDSA44 {
    public static void middle(Stack<Integer> jet){
        int a = jet.size();

        int b = a/2;
        Stack<Integer> kit = new Stack<>();
        for(int i=0;i<=b;i++){
            kit.push(jet.pop());

        }
        System.out.println("Middle is "+kit.pop());
        int n = kit.size();
        for(int i=0;i<n;i++){

        jet.push(kit.pop());
        }
        System.out.println("new jet is "+jet);


    }

    public static void main(String[] args) {
        Stack<Integer> ret = new Stack<>();

        ret.push(13);
        ret.push(18);
        ret.push(21);
        ret.push(44);
        ret.push(27);
        ret.push(35);

        System.out.println(ret);

    
        middle(ret);



    }
}
