import java.util.ArrayList;

public class prDSA5 {
    public static void main(String args[]){
        ArrayList<Integer> H = new ArrayList<>();
        
        H.add(5);
        H.add(18);
        H.add(8);
        H.add(1);
        H.add(1);

        int m = H.size();

        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(H.get(i)==H.get(j)){
                    System.out.println("True");
                }
                else{
                    System.out.println("False");
                }
            }
        }
        
        
    }
}
