class Pen {
    String colour;
    String type;

    public void write(){
        System.out.println("Write anything");
    }
}

public class OOPS {

    public static void main(String args[]){
        Pen Pen1 = new Pen();
        Pen1.colour = "Blue";
        Pen1.type = "ball";
        
        Pen1.write();
    }

}
