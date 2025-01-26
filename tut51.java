public class tut51 {
    public static void main(String[] args) {
        int n = 6;

        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }

            for(int j=n;j>0;j--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
