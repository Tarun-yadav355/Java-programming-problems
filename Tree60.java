import java.util.ArrayList;

public class Tree60 {
    static class  Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    
        
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data > key){
            return search(root.left, key);
        }
        else if(root.data == key){
            return true;
        }
        else{
            return search(root.right, key);
        }
    }

    public static Node delete(Node root,int hut){
        if(root.data > hut){
            root.left = delete(root.left, hut);
        }
        else if(root.data < hut){
            root.right = delete(root.right, hut);
        }
        else{
            if(root.left == null && root.right == null){
                return null;

            }if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            Node IS = inordersuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;

    }


    public static void Range(Node root, int x,int y){
        if(root == null){
            return;
        }
        if(root.data >= x && root.data <= y){
            Range(root.left, x, y);
            System.out.print(root.data+" ");
            Range(root.right, x, y);
        }
        else if(root.data>=y){
            Range(root.left, x, y);
        }
        else{
            Range(root.right, x, y);
        }
    }
    public static Node inordersuccessor(Node root){

        while (root.left != null) {

            root = root.left;
        }
        return root;

    }

    public static void printpath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }

    public static void printroot2leaf(Node root,ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);

        if(root.left == null && root.right == null){
            printpath(path);
        }
        else{
            printroot2leaf(root.left, path);
            printroot2leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }

    public static void main(String args[]) {
        int nodes[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<nodes.length;i++){
            root = insert(root, nodes[i]);
        }

        inorder(root);
        System.out.println();

      printroot2leaf(root, new ArrayList<>());
    }
}
