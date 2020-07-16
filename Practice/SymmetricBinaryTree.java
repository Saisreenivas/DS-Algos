package Practice;

/**
 * SymmetricBinaryTree
 */
public class SymmetricBinaryTree {
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    void checkSymmetric(Node root){
        System.out.println("Given Binary Tree is " + checkSymmetric(root, root));
    }

    boolean checkSymmetric(Node nodea, Node nodeb){
        if(nodea == null && nodeb == null){
            return true;
        }
        if((nodea != null && nodeb == null )|| (nodea == null && nodeb != null)){
            return false;
        }

        if(nodea != null && 
            nodeb != null && 
            nodea.data == nodeb.data && 
            checkSymmetric(nodea.left, nodeb.right) && 
            checkSymmetric(nodea.right, nodeb.left)){
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        SymmetricBinaryTree x = new SymmetricBinaryTree();
        Node a = x.new Node(1);
        a.left = x.new Node(2);
        a.right = x.new Node(2);
        a.left.left = x.new Node(3);
        a.left.right = x.new Node(4);
        a.right.left = x.new Node(4);
        a.right.right = x.new Node(3);

        x.checkSymmetric(a);
    }
    
}