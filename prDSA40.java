import java.util.Stack;

public class prDSA40 {
    public static void main(String[] args) {
         int arr[] = {2,4,6,13,7,11,71,22,44};

         int a = arr.length;
         Stack<Integer> stack1 = new Stack<>();
         Stack<Integer> stack2 = new Stack<>();

         for(int i=0;i<a/2;i++){
            stack1.push(arr[i]);

         }
         for(int j=a-1;j>=a/2;j--){
            stack2.push(arr[j]);
         }
         System.out.println("stack 1 "+stack1);
         System.out.println("stack 2 "+stack2);

         stack1.pop();
         System.out.println("stack 1 pop" +stack1);

         stack2.pop();
         System.out.println("stack 2" +stack2);
         


    }
}
