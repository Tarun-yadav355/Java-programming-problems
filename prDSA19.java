public class prDSA19 {
    public static void main(String[] args) {
        int a[] = {2,3,4,5,6,4};
        int b = a.length;
        int c = 4;

        for(int i=0;i<b;i++){
            if(a[i]==c){
                System.out.println(i);
            }
        }
    }
}
