public class prDSA18 {
    public static void main(String[] args) {
        int a[] = {1,5,10,20,30};
        int b[] = {5,13,15,20};
        int c[] = {5,20};

        int x=a.length;
        int y=b.length;
        int z=c.length;

        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                for(int k=0;k<z;k++){
                    if(a[i]==b[j] & b[j]==c[k]){
                        System.out.println(a[i]);
                    }
                }
            }
        }
    }
}
