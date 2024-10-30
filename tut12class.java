import java.util.*;

public class tut12class {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        for(int i=0;i<size;i++){

            numbers[i]= sc.nextInt();

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for(i=0;i<size;i++){
                if(numbers[i] < min){
                    min = numbers[i];
                }
                if(numbers[i] > max){
                    max = numbers[i];
                }
            }

        
        System.out.println("Large" + max);
        System.out.println("Small" + min);
        }
sc.close();
    }
}
