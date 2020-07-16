package Practice;

public class CheckIsBTaBSTorNot {
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    void isBST(Node root){
        boolean res = isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("Given BT is" +(res?"":" not")+ " a BST");
    }

    boolean isBST(Node root, int min, int max){
        if(root == null)
            return true;
        if(root.data < min ||root.data > max)
            return false;

        /* 
        isBST is check is done below for distinct values. 
        Hence, root.data-1 & root.data+1 is used. 
        */
        boolean left = isBST(root.left, min, root.data-1);
        boolean right = isBST(root.right, root.data+1, max);

        return left && right;
    }

    public static void main(String[] args) {
        CheckIsBTaBSTorNot x= new CheckIsBTaBSTorNot();
        Node root = x.new Node(4);
        root.left = x.new Node(2); 
        root.right =    x.new Node(5); 
        root.left.left =    x.new Node(1); 
        root.left.right =   x.new Node(3); 

        x.isBST(root);
    }
}