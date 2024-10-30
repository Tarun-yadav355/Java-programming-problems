import java.util.Stack;

public class prDSA47 {
    public static void main(String[] args) {

        String r = "((())(()";
        int n = r.length();


        Stack<Integer> stg = new Stack<>();

        for(int i=0;i<n;i++){
            if(r.charAt(i) == '(' && r.charAt(i+1) == ')'){
                stg.push(i);
            }
        

        

    }
    System.out.println("oriii" +stg);
    int p = stg.size()*2;
    System.out.println("length hogi "+p);

    }
    
}
