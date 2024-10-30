import java.util.LinkedList;


public class prDSA34 {
public static void reverdoub(LinkedList<Integer> tet){
    int a = tet.size();

    for(int i=0;i<a-3;i++){
        if(tet.get(i)<tet.get(i+1)){
            tet.remove(i);
            
        }

    }
   

}

    public static void main(String[] args) {
        LinkedList<Integer> git = new LinkedList<>();

        git.add(3);
        git.add(64);
        git.add(13);
        git.add(7);
        git.add(19);
        git.add(12);
        git.add(81);

        System.out.println("original"+git);

reverdoub(git);

System.out.println("New One"+git);
    }
}
