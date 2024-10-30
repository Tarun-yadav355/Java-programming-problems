// Simple oops

class Car {
    String name;
    int model;

    public void printdetail(){
        System.out.println(this.name);
        System.out.println(this.model);
    }
}

public class oops1 {
    public static void main(String args[]){

        Car Car1 = new Car();
        Car1.name = "audi";
        Car1.model = 2022;

        Car1.printdetail();

    }
}
