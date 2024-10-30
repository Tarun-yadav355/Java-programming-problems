public class tut22class {
    public static void arrray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {2,7,5,8,1};

        for(int i =0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;i<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }

            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    
        arrray(arr);
    }
}
