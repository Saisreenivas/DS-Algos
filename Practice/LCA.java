package Practice;
class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}

public class LCA {
    Node root;
    static boolean v1 = false, v2 = false;

    public Node lcaOf(Node root, int a, int b){
        if(root == null){
            return null;
        }
        Node tmp = null;
        if(root.data == a){
            v1 = true;
            tmp = root;
        }
        if(root.data == b){
            v2 = true;
            tmp = root;
        }



        Node left = lcaOf(root.left, a, b);
        Node right = lcaOf(root.right, a, b);

        //if the root is equal to one of the inputs.
        if(tmp != null){
            return tmp;
        }

        //if the two numbers are in two seperate branches, then the root is the LCA.
        if(left != null && right != null){
            return root;
        }

        // if the two numbers are on the same branch, then the branch node is the LCA.
        return (left!= null)? left: right;
    }

    public Node isLca(Node root, int a, int b){
        v1 = false;
        v2 = false;

        Node node = lcaOf(root, a, b);
        if(v1 && v2){
            return node;
        }

        return null;
    }

    public void lca(Node root, int a, int b){
        Node output = isLca(root, a, b);
        if(output != null){
            System.out.println("LCA of " + a + " " + b + " is : " + output.data);
        }else{
            System.out.println("LCA does not exist for the Keys: " + a + " " + b);
        }
    }

    public static void main(String[] args) {
        LCA tree = new LCA(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7);
        
        tree.lca(tree.root, 2, 4);
        tree.lca(tree.root, 6, 7);
        tree.lca(tree.root, 4, 11);

    }
    
}