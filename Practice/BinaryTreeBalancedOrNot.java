package Practice;

public class BinaryTreeBalancedOrNot {
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

    public void IsBalanced(Node root){
        Height h = new Height();
        System.out.println(IsBalanced(root, h));
    }

    public boolean IsBalanced(Node root, Height height){

        if(root == null){
            height.h =0;
            return true;
        }

        Height lh = new Height(), rh = new Height();
        boolean lb = IsBalanced(root.left, lh);
        boolean rb = IsBalanced(root.right, rh);

        height.h = Math.max(lh.h, rh.h) + 1;
        if(Math.abs(lh.h-rh.h) >= 2){
            return false;
        }else{
            return lb && rb;
        }
    }


    public static void main(String[] args) {
        BinaryTreeBalancedOrNot x = new BinaryTreeBalancedOrNot();

        //             4
        //         5		6
        //     7		8		9
        // 10				11	
        //     14				15
        //         44		21
        //             47
        //                 43
        // Node base = x.new Node(4);
        // base.left = x.new Node(5);
        // base.left.left = x.new Node(7);
        // base.left.left.left = x.new Node(10);
        // base.left.left.left.right = x.new Node(14);
        // base.left.left.left.right.right = x.new Node(44);
        // base.left.left.left.right.right.right = x.new Node(47);
        // base.left.left.left.right.right.right.right = x.new Node(43);
        // base.right = x.new Node(6);
        // base.right.left = x.new Node(8);
        // base.right.right = x.new Node(9);
        // base.right.right.left = x.new Node(11);
        // base.right.right.left.right = x.new Node(15);
        //            1 
        //          /   \ 
        //         2      3 
        //       /  \    / 
        //     4     5  6 
        //     / 
        //    7          
        Node base = x.new Node(1); 
        base.left = x.new Node(2); 
        base.right = x.new Node(3); 
        base.left.left = x.new Node(4); 
        base.left.right = x.new Node(5); 
        base.right.right = x.new Node(6); 
        base.left.left.left = x.new Node(7); 
        x.IsBalanced(base);
    }

}