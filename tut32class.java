class LL{
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }

    }
   

    public void addfirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    public void addlast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
        currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void printlist(){
        if(head == null){
            System.out.println("List is empty");
            return;

        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " ->");
        currNode = currNode.next;
        }
        System.out.println("NULL");

    }
    public Node reverserecurive(Node head){
        if(head == null || head.next == null){
            return head; 
        }
        Node newhead = reverserecurive(head.next);
        head.next.next = head;
        head.next = null;

        return newhead;


    }

    public static void main(String args[]){

        LL list = new LL();
        list.addfirst("a");
        list.addfirst("is");
        list.printlist();

        list.addlast("list");
        list.printlist();

        list.head = list.reverserecurive(list.head);
        list.printlist();
        
    } 
}
