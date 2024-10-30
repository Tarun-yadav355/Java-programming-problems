class SS{
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
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null ) {
            currNode = currNode.next; 
                    }
        currNode.next = currNode;
    }

    public void printlist(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null ) {
            System.out.println(currNode.data + " ->");
            currNode = currNode.next; 
            
        }
        System.out.println("Null");



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
  public static void main(String[] args) {
        SS list = new SS();
        list.addfirst("Tarun");
        list.addfirst("Rao");
        list.printlist();

        list.addlast("Sahab");
        list.printlist();

        list.head = list.reverserecurive(list.head);
        list.printlist();
    }
 }