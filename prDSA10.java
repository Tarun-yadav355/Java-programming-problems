public class prDSA10 {
    public static void main(String args[]){
        StringBuilder gaddi = new StringBuilder("aabccddba");

        int a = gaddi.length();
        System.out.println(a);

     for(int i=0;i<a-1;i++){
        for(int j=i+1;j<=a-1;j++){
            if(gaddi.charAt(i)==gaddi.charAt(j)){
                gaddi.delete(j,j+1);
            }
        }
        System.out.println(gaddi);
     }

    }
}
