public class prDSA13 {
    public static void main(String args[]){
        StringBuilder a1 = new StringBuilder("This is a text type");
        StringBuilder a2 = new StringBuilder("text");

        int n = a1.length();
        int m = a2.length();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a2.charAt(i)==a1.charAt(j)){
                    System.out.println(i);
                }
            }
        }
    }
}