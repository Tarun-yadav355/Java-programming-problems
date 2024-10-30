public class prDSA23 {
    public static void main(String[] args) {
        int a[] ={5,1,3,4,7};
        int b = a.length;
        int n =12;

        for(int i=0;i<b;i++){
            for(int j=i+1;j<b;j++){
                for(int k=j+1;k<b;k++){
                if(a[i]+a[j]+a[k]<n){
                    System.out.println("("+a[i]+","+a[j]+","+a[k]+")");
                }
            }
        }
    }
}
}