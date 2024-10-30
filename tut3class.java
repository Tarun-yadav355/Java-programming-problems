import java.util.Scanner;

public class tut3class {
public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    int age = sc.nextInt();

    if(age<=20){
        System.out.println("Not allowed");
    }
    else{
        System.out.println("Allowed");
    }

sc.close();

}    
}
