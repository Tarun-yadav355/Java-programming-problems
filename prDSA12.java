public class prDSA12 {
    public static void main(String[] args) {
        StringBuilder pal = new StringBuilder("babad");

        int a = pal.length();
        for(int i=0;i<a;i++){
            for(int j=a-1;j>0;j--){
                if(pal.charAt(i)==pal.charAt(j)){
                   System.out.println(pal.charAt(i));
                }
            }
        }
    }
    
}
