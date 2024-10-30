import java.util.*;

public class tut14class {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String sent = name.substring(5);

        System.out.println(sent);

        System.out.println(name);
        System.out.println(name.length());
        



        sc.close();
        
    }
}
