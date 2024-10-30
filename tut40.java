public class tut40 {
    public static void main(String[] args) {

        int ID[] = {1,2,3,4,5};
        String Name[] = {"Naman","Rahul","Ram","Varun","Parag"};
        double CGPA[] = {9.2,8.3,7.4,9.3,6.6};
        
        
        int n = 5;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(CGPA[i]<CGPA[j]){
                  double het[] = new double[i]; 
                  System.out.println(het);  
                }
            }
        }
    }
}
