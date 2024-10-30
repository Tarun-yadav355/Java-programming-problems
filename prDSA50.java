import java.util.Stack;

public class prDSA50 {
    public static void recc(Stack<Integer> het){
        int n = het.size();
        Stack<Integer> tet = new Stack<>();

        for(int i=0;i<n;i++){
            tet.push(het.pop());
        }
        System.out.println("dusra"+tet);
        
        
        

    }
    public static void main(String[] args) {
        Stack<Integer> ret = new Stack<>();

        ret.push(-5);
        ret.push(-8);
        ret.push(9);
        ret.push(4);
        ret.push(13);

        System.out.println("Original "+ret);

        recc(ret);


    }
}
