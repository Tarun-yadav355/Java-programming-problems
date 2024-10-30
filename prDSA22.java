public class prDSA22 {
    static void same(int x[],int y){

        int maxcount =0;
        int index =-1;

        for(int i=0;i<y;i++){
            int count=0;
            for(int j=0;j<y;j++){
                if(x[i]==x[j]){
                   count++;
                   
                }
            }
            if(count>maxcount){
                maxcount = count;
                index =i;

            }if(maxcount>y/2){
                System.out.println(x[index]);

                
        }else{
            System.out.println("NO MAJORITY ELEMENT");
        }
    }
    }
    public static void main(String[] args) {
        int a[]={3,4,2,4,2,4,4};
        int b=a.length;

        same(a,b);
       
    }
}
