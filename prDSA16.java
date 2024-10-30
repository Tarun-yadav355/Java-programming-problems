public class prDSA16{

public static void ver(int matrix[][]){
    int rs =0;
    int re =matrix.length;
    int cs =0;
    int ce =matrix[0].length;

    while (rs<=re && cs<=ce) {
        for(int i=rs;i<ce;i++){
            if(matrix[rs][i]==5){
                System.out.println("True");
            }
        }rs++;
        for(int i=rs;i<ce;i++){
            if(matrix[rs][i]==5){
                System.out.println("True");
            }
        }rs++;
        for(int i=rs;i<ce;i++){
            if(matrix[rs][i]==5){
                System.out.println("True");
            }
        }

        
    }
    
}
    public static void main(String args[]){
        int mat[][] = {
            {1,2,3,4,5},
            {2,4,5,6,7},
            {3,5,7,9,11},
            {1,3,5,7,9},

        };
        ver(mat);
        
    }
}
