import java.util.Stack;

public class prDSA48 {
    public static boolean chec(int pu[],int hu[],int m){

        Stack<Integer> ven = new Stack<>();
        int j=0;

        for(int i =0 ;i<m;i++){
            ven.push(pu[i]);
        }

        while (!ven.isEmpty() && ven.peek() == hu[j]) {
            ven.pop();
            j++;
            
        }
        if(ven.isEmpty()){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
       
        int inp[] = {4,5,6,7,8};
        int oup[] = {8,7,6,5,4};

        int n = inp.length;

        if(chec(inp, oup, n)){
            System.out.println("Yes");

        }else{
            System.out.println("Not possible");
        }

    
    }
}


