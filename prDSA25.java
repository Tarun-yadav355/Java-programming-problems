public class prDSA25 {
    public static void main(String[] args) {
        int a[]= {2,4,1,3,5};

        int c=a.length;
       

        for(int i=0;i<c;i++){
            for(int j=0;j<c;j++){
                if(i<j & a[i]>a[j]){
                    System.out.println("("+a[i]+","+a[j]+")");
                }
            }
           
        }
    }
}
