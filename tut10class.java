import java.util.*;

public class tut10class {
    public static float average(int x, int y, int z){

        int l=x;
        int m=y;
        int n=z;

float avg = (l+n+m)/3;
return avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println(average(x, y, z));
        




        sc.close();

    }
}
