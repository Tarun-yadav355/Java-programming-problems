public class tut18class {
    public static void main(String args[]){
        int a = 7;
        int pos = 2;
        int bitmask = 1<<pos;
        int ulta = ~(bitmask);
        int answer = (ulta & a);

        System.out.println(answer);
    }
}
