import java.util.LinkedList;

public class prDSA32 {
    public static void ghoom(LinkedList<Integer> set,int c,int n,int i,int j){

        if(i>n || j<n){
            return;
        }
        for(i=0;i<n;i++){
            for(j=c-1;j>=n;j--){
                System.out.println(set.get(i)+" "+set.get(j));
                ghoom(set, c, n,i+1,j-1);
                
            }
        }

    }
    public static void main(String[] args) {
        LinkedList<Integer> ket = new LinkedList<>();

        ket.add(13);
        ket.add(5);
        ket.add(35);
        ket.add(33);
        ket.add(2);
        ket.add(22);

        int d = ket.size();

        int m = d/2;
        int x =0;
        int y =d;

        ghoom(ket,d,m,x,y);

       
    }
}

