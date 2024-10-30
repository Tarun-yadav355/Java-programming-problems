public class prDSA57 {
    public static void main(String[] args) {
        int arr[][] = {{0, 0, 1, 0}, {0, 0, 1, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}};

        int n = arr.length;
        boolean c=false;

        for(int i=0;i<n;i++){
            
        
            for(int j=0;j<n;j++){
                while (arr[i][j] == 1) {
                    if(arr[j][i] != 1 && !c){
                    
                        System.out.println("Celebrity is "+j);
                        c=true;
                        
                        
                       
                    
                    }if(arr[j][i] == 1 && !c){
                        System.out.println("no cel "+-1);
                        c=false;
                        
                    }
                    
                }
                
                   
                   
                    
                    
            }
               
                
                
            }
            
        }

    }

