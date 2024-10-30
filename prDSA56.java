public class prDSA56 {
    int arr[];
    int top[];
    int next[];

    int n,s;

    int freespot;

    public void newsta(int N,int S){
        arr = new int[s];
        n = N;
        s = S;
        top = new int[n];
        next = new int[s];

        for(int i=0;i<n;i++){
            top[i] = -1;
        }

        for(int i=0;i<s;i++){
            next[i] = i+1;
        }
        freespot = 0;

    }

    public boolean push(int x,int m ){
        if(freespot == -1){
            return false;
        }

        int index = freespot;

        freespot = next[index];

        arr[index] = x;
        
        next[index] = top[m-1];

        top[m-1] = index;

        return true;
    }

    public static void main(String[] args) {
        
    }
}
