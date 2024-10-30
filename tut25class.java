public class tut25class {
    public static void reverse(String n,int idx){
        if(idx==0){
            System.out.println(n.charAt(idx));
            return;
        }
        System.out.println(n.charAt(idx));
        reverse(n,idx-1);
    }
    public static void main(String[] args) {
        String name = "tarun";
        reverse(name, name.length()-1);

    }
}
