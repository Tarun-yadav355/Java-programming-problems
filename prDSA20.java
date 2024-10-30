public class prDSA20 {
    public static void main(String[] args) {
        int a[] = {1,2,8,10,10,19};
        int b = a.length;

        int n = 7;
        for(int i=0;i<b;i++){
            if(a[i]>n){
                System.out.println(a[i]);
                System.out.println(a[i-1]);
                return;
            }
        
        }
    }
}
