public class prDSA {
    public static void main(String[] args) {
        boolean printed = false;  // Flag for printing only once

        for (int i = 0; i < 10; i++) {
            if (!printed) {
                System.out.println("This message is printed only once.");
                printed = true;
            }
            // Other loop logic
        }
    }
}
