import java.util.LinkedList;

class ListNode{
    int value;
    ListNode next;

    ListNode(int value){
        this.value = value;
        this.next = null;

    }
}
class Mergesortlist{
    public static ListNode merger(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        
        while (l1 != null & l2 != null) {
            if(l1.value <= l2.value){
                current.next = l1;
                l1 = l1.next;

            }else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
            
        }
        if(l1 != null){
            current.next = l1;
        }else if(l2 != null){
            current.next = l2;
        }
    
    return dummy.next;
    }
    public static LinkedList<Integer> toLinkedList(ListNode head) {
        LinkedList<Integer> list = new LinkedList<>();

        ListNode current = head;
        while (current != null) {
            list.add(current.value);
            current = current.next;
            
        }
        return list;

    }
    public static void printll(ListNode head){
        ListNode current = head;
        while (current != null) {
            System.out.println(current.value +" ");
            current = current.next;
            
        }
        System.out.println();
    }
}

public class prDSA29 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;


        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(6);
        node4.next = node5;
        node5.next = node6;

        ListNode merged = merger(node1,node4);

        printll(merged);


    }
}
