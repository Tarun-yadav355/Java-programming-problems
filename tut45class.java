import java.util.Arrays;

public class tut45class {
    public static void main(String[] args) {
        int arr[] = {6,8,4,5,2,3};
        int n = arr.length;
        Arrays.sort(arr);

        int num = 0;
        int num2 = 0;


        for(int i=0;i<n;i++){
            if(i%2==0){

            

            num = num*10 + arr[i];
            }else{
                num2 = num2*10 + arr[i];


            }
            
        }
        System.out.println("num is "+num);
        System.out.println("num2 is "+num2);
        int p = num + num2;
        
        System.out.println("Oriii "+p);
        
    }
}
