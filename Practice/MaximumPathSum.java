package Practice;

public class MaximumPathSum {
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    class MaxResult{
        int max;
    }
    public int findMaxSum(Node root){
        if(root == null){
            return 0;
        }
        MaxResult x = new MaxResult();
        x.max = Integer.MIN_VALUE;
        findMaxSum(root, x);
        return x.max;
    }

    public int findMaxSum(Node root, MaxResult res){
        if(root ==null){
            return 0;
        }
        
        int l = findMaxSum(root.left, res);
        int r = findMaxSum(root.right, res);

        int max_single = Math.max(Math.max(l,r) + root.data, root.data);

        int max_top = Math.max(max_single, l+r+root.data);
        res.max = Math.max(res.max, max_top );

        return max_single;
    }

    public static void main(String[] args) {
        MaximumPathSum x = new MaximumPathSum();
        Node root = x.new Node(10); 
        root.left = x.new Node(2); 
        root.right = x.new Node(10); 
        root.left.left = x.new Node(20); 
        root.left.right = x.new Node(1); 
        root.right.right = x.new Node(-25); 
        root.right.right.left = x.new Node(3); 
        root.right.right.right = x.new Node(4); 
        // Node root = null;
        System.out.println("maximum path sum is : " + 
                            x.findMaxSum(root)); 
    }
}