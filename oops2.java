// Inheritance

class Vehicle{
    int model;
}

class Cars extends Vehicle{
    String brand;



public void printinfo(){
    System.out.println(this.brand);
    System.out.println(this.model);
}

}

public class oops2 {
    public static void main(String args[]){
    Cars Car1 = new Cars();

    Car1.brand = "Mahindra";
    Car1.model = 2020;

    Car1.printinfo();

}
}