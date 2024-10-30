import java.util.Stack;

public class prDSA51 {
    public static void ban(int het[]){

        int n = het.length;

        Stack<Integer> jet = new Stack<>();
        int mat[] = {};
        for(int i=n-1;i>=0;i--){
            int next = het[i];
            while (!jet.empty() && next > jet.peek()) {
                jet.pop();
                
            }
            if(jet.empty()){
                mat[i] = -1;
            }else{
                mat[i] = jet.peek();
                jet.push(next);
            }
            System.out.println("oriiii "+mat);

        }

       
    }
    
    
    public static void main(String[] args) {
        
        int arr[] = {1,3,2,4,13,21};

        ban(arr);

        

    }
    }
