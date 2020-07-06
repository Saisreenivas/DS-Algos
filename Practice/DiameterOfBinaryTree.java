package Practice;

public class DiameterOfBinaryTree {
    public class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public class Height{
        int h;
    }
    public int diameter(Node root, Height height){

        Height lheight = new Height(), rheight= new Height();

        if(root == null){
            height.h = 0;
            return 0;
        }

        int ldiameter = diameter(root.left, lheight);
        int rdiameter = diameter(root.right, rheight);
        
        height.h = Math.max(lheight.h, rheight.h) + 1; 

        return Math.max(lheight.h+rheight.h+1, Math.max(ldiameter, rdiameter));
    }

    public void diameter(Node root){
        Height height = new Height();
        System.out.println("Diameter: " + diameter(root, height));
    }


    public static void main(String[] args) {
        DiameterOfBinaryTree x = new DiameterOfBinaryTree();
        Node base = x.new Node(4);
        base.left = x.new Node(5);
        base.left.left = x.new Node(7);
        base.left.left.left = x.new Node(10);
        base.left.left.left.right = x.new Node(14);
        base.left.left.left.right.right = x.new Node(44);
        base.left.left.left.right.right.right = x.new Node(47);
        base.left.left.left.right.right.right.right = x.new Node(43);
        base.right = x.new Node(6);
        base.right.left = x.new Node(8);
        base.right.right = x.new Node(9);
        base.right.right.left = x.new Node(11);
        base.right.right.left.right = x.new Node(15);
        x.diameter(base);
        // System.out.print(x.max-x.min);
    }
    
}