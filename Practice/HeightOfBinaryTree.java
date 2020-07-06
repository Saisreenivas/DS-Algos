package Practice;

/**
 * HeightOfBinaryTree
 */
public class HeightOfBinaryTree {
    public class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public int height(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        return Math.max(1+ height(root.left), 1+ height(root.right));
        // Queue<Node> q = new LinkedList<>();
        // q.add(root);
        // while(!q.isEmpty()){
        //     Node tmp = q.poll();
        //     if(tmp.left != null){
        //         q.add(tmp.left);
        //     }
        //     if(tmp.right != null){
        //         q.add(tmp.right);
        //     }

        // }
    }

    public static void main(String[] args) {
        HeightOfBinaryTree x = new HeightOfBinaryTree();
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
        System.out.println(x.height(base));
    }
    
}