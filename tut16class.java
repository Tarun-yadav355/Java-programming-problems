public class tut16class {
    public static void main(String args[]){

        int a = 4;
        int pos = 2;
        int bitmask = 1<<pos;

        if((bitmask & a) == 0){
            System.out.println("Equal to zero");
        }
        else{
            System.out.println("Not zero");
        }

    }
}
