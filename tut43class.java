public class tut43class {
    public static void main(String[] args) {
        int n = 13431;
        int k = n;

        int rev = 0;

        while (n!=0) {
        
            rev = rev*10 + n%10;
            
            n = n/10;
            
            
        
       
    }
    System.out.println("le " +rev);

    if(rev == k){
        System.out.println("Yes it is palindrome");
    }else{
        System.out.println("Not a palindrome");
    }
   
}
}
