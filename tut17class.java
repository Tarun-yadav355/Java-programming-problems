public class tut17class {
    public static void main(String args[]){
        int a = 5;
        int pos = 3;
        int bitmask = 1<<pos;

        int answer = (bitmask | a);
        System.out.println(answer);
    }
}
