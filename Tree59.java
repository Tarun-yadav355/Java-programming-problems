import java.util.*;

public class Tree59 {
    static class  Node {
        int data; 
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    
        
    }

    static class  Binarytree {
        static int idx=-1;
        public static Node buildtree(int nodes[]){

            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

        return newNode;
        }
    }
        public static void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);


        }

        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);

            System.out.println(root.data+" ");
            inorder(root.right);
        }

        public static void postorder(Node root){
            if(root == null){
                return;
            }

            postorder(root.left);
            postorder(root.right);

            System.out.println(root.data+" ");
        }

        public static void levelorder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
                
            }



        }

        public static int countofnodes(Node root){
            if(root == null){
                return 0;
            }
            int leftnodes = countofnodes(root.left);
            int rightnodes = countofnodes(root.right);

            return leftnodes + rightnodes +1;
        }

        public static int sumofnodes(Node root){
            if(root == null){
                return 0;

        }
        int leftsum = sumofnodes(root.left);
        int rightsum = sumofnodes(root.right);

        return leftsum + rightsum + root.data;
        
        }

        public static int height(Node root){
            if(root == null){
                return 0;
            }
            int leftheight = height(root.left);
            int rightheight = height(root.right);
            int maxheight = Math.max(leftheight, rightheight)+1;

            return maxheight;
        }

       static class Treeinfo {
        int ht;
        int dia;

        Treeinfo(int ht,int dia){
            this.ht = ht;
            this.dia = dia;
        }
       }

       public static Treeinfo diameter(Node root){
        if(root == null){
            return new Treeinfo(0, 0);
        }
        Treeinfo left =  diameter(root.left);
        Treeinfo right = diameter(root.right);

        int myheight = Math.max(left.ht, right.ht)+1;

        int diam1 = left.dia;
        int diam2 = right.dia;
        int diam3 = left.ht + right.ht +1;

        int maxdiam = Math.max(Math.max(diam1, diam1), diam3);

        Treeinfo myinfo = new Treeinfo(myheight, maxdiam);
        return myinfo;
       }

    
    public static void main(String[] args) {

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree = new Binarytree();
        Node root = tree.buildtree(nodes);
        levelorder(root);
        
        
    }
}
