public class prDSA26 {
    static void prod(int n[],int m){
        int left[] = new int[m];
        int right[]= new int[m];
        int product[] = new int[m];

        int i,j;

        left[0] = 1;
        right[m-1] =1;

        for( i=0;i<m;i++){
            left[i] = n[i-1] * left[i-1];
        }
        for(j=m-2;j>=0;j--){
            right[j] = n[j+1] * right[j+1];
 
        }
        for(i=0;i<m;i++){
            product[i] = left[i] * right[i];
        }
        for(i=0;i<m;i++){
            System.out.println(product[i]+ " ");
        }
        return;

    }
    public static void main(String[] args) {
        int a[] = {10,3,5,6,2};
        int b = a.length;

        prod(a, b);
   
    }
}
