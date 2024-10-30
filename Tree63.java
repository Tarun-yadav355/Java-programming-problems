public class Tree63 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        private int idx = -1; // Change to non-static to avoid issues with multiple trees

        public Node buildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) { // Added length check to avoid ArrayIndexOutOfBounds
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static int height(Node root){

        if(root == null){
            return 0;

        }
        int left = height(root.left);
        int right = height(root.right);
        int maxheight = Math.max(left, right)+1;

        return maxheight;

    }

    public static void inverse(Node root){

        if(root == null){

            return;
        }
        inverse(root.left);
        inverse(root.right);

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

    

    }

    public static void main(String args[]) {
        int nodes[] = {4,2,7,1,3,6,9};
        BinaryTree tree = new BinaryTree();
       
        Node root = tree.buildTree(nodes);
        System.out.println(inverse(root));
       
    }
}
