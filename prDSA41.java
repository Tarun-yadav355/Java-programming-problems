import java.util.Stack;

public class prDSA41 {
    public static void main(String[] args) {
        String str = "231*+9-";
       int a = str.length();

       Stack<Integer> nava = new Stack<>();
        
        for(int i=0;i<a;i++){
            char c = str.charAt(i);
       

        
        if(Character.isDigit(c)){
            nava.push(c- '0');


        }else{
            int val1 = nava.pop();
                int val2 = nava.pop();
 
                switch (c) {
                case '+':
                    nava.push(val2 + val1);
                    break;
                case '-':
                    nava.push(val2 - val1);
                    break;
                case '/':
                    nava.push(val2 / val1);
                    break;
                case '*':
                    nava.push(val2 * val1);
                    break;
        }
    }

    }
    System.out.println(nava);
    
    }
}
