import java.util.LinkedList;

public class prDSA39 {

    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> result = new LinkedList<>();
        int carry = 0;
        
        // Ensure both lists are of the same length
        while (l1.size() < l2.size()) {
            l1.addLast(0);
        }
        while (l2.size() < l1.size()) {
            l2.addLast(0);
        }
        
        for (int i = 0; i < l1.size(); i++) {
            int sum = l1.get(i) - l2.get(i) + carry;
            carry = sum / 10;
            result.add(sum % 10);
        }
        
        // If there's a carry left, add it as the most significant digit
        if (carry != 0) {
            result.add(carry);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        // Example usage:
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        
        // Representing numbers 123 and 456
        l1.add(1);
        l1.add(2);
        l1.add(5);
        
        l2.add(1);
        l2.add(1);
        l2.add(5);
        
        LinkedList<Integer> result = addTwoNumbers(l1, l2);
        
        System.out.println("Result: " + result);
    }
}

