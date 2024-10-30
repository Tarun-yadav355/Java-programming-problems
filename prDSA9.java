public class prDSA9 {
    public static void main(String args[]){
        StringBuilder sc = new StringBuilder("naman" );
        System.out.println(sc);

        int a = sc.length();

        for(int i=0;i<a;i++){
            for(int j=a-1;j>0;j--){
                if(sc.charAt(i)==sc.charAt(j)){
                    System.out.println("True");
                }
                else{
                    System.out.println("False");
                }
            }
        }


    }
}
