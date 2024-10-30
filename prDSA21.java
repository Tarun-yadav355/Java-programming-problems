public class prDSA21 {
    public static void main(String[] args) {
        int a[] = {5,20,3,2,50,80};
        int b =a.length;

        int n = 30;
        for(int i=0;i<b;i++){
            for(int j=0;j<b;j++){
                if(a[i]-a[j]==n){
                    System.out.println("("+a[i]+ ","+a[j]+")");
                    return;
                }
                    
                    
                
            
            }
        }
    }
}
