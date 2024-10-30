import java.util.*;

class out{

    public static void main(String[] args) {
        LinkedList<String> goli = new LinkedList<String>();

        Scanner sc = new Scanner(System.in);


        goli.add("3");
        goli.add("5");
        goli.add("13");
        goli.add("15");
        System.out.println(goli);

        int n = sc.nextInt();

        int p = goli.size();

        System.out.println(goli.get(p-n));


        sc.close();




    }
}