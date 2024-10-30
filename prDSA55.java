public class prDSA55 {
    public static void main(String[] args) {
        int petrol[] = {4,6,7,4};
        int distance[] = {6,5,3,5};

        int n = 4;

        for(int i=0;i<n;i++){
            if(petrol[i]>distance[i]){
                System.out.println("Point to start the journey is "+i);
                return;
            }
        }
    }
}
