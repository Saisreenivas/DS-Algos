package Practice;

public class SizeOfLargestBSTInBT {
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data= data;
            this.left = this.right = null;
        }
    }

    class Info{
        int currSize, minVal, maxVal, maxBSTSize;
        boolean isBST;
        Info(){

        }
        Info(int currSize, int minVal, int maxVal, int maxBSTSize, boolean isBST){
            this.currSize = currSize;
            this.minVal = minVal;
            this.maxVal = maxVal;
            this.maxBSTSize = maxBSTSize;
            this.isBST = isBST;
        }
    }

    void largestBSTwrap(Node root){
        // Info inf = new Info();
        // largestBSTBT(root, inf);
        System.out.println("Size of the largest BST is " + 
                    largestBSTBT(root).maxBSTSize);
    }

    Info largestBSTBT(Node root){
        if(root == null)
            return new Info(0,Integer.MIN_VALUE, Integer.MAX_VALUE, 0, true);
        if(root.left == null & root.right == null)
            return new Info(1, root.data, root.data, 1, true);

        Info l = largestBSTBT(root.left);
        Info r = largestBSTBT(root.right);

        Info res = new Info();
        res.currSize = l.currSize + r.currSize + 1;

        // If the whole tree under the current root is a BST
        if(l.isBST && r.isBST && root.data > l.maxVal && root.data < r.minVal ){
            res.minVal = Math.min(l.minVal, Math.min(r.minVal, root.data));
            res.maxVal = Math.max(r.maxVal, Math.max(l.maxVal, root.data));
            res.maxBSTSize = res.currSize;
            res.isBST = true;

            return res;
        }

        // else: any one of the left or right subtree might have the BST.
        res.isBST = false;
        res.maxBSTSize = Math.max(l.maxBSTSize,r.maxBSTSize);

        return res;   
    }

    public static void main(String[] args) {
    /* Let us construct the following Tree 
            60 
           /  \ 
          65  70 
         / 
        50 
    */
    SizeOfLargestBSTInBT x = new SizeOfLargestBSTInBT();
    Node root = x.new Node(60); 
    root.left = x.new Node(65); 
    root.left.right = x.new Node(68); 
    root.right = x.new Node(70); 
    root.left.left = x.new Node(50); 
    x.largestBSTwrap(root);
      
    }
}