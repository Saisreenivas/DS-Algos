package Practice;
import java.util.*;

public class LevelOrderTraversal {
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    
    public void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> temp = new LinkedList<>();
        temp.add(root);
        while(!temp.isEmpty()){
            Node var = temp.poll();
            System.out.print(var.data + " ");

            if(var.left != null){
                temp.add(var.left);
            }
            if(var.right != null){
                temp.add(var.right);
            }
        }
    }

    public static void main(String[] args) {
        LevelOrderTraversal x = new LevelOrderTraversal();
        Node base = x.new Node(4);
        base.left = x.new Node(5);
        base.left.left = x.new Node(7);
        base.left.left.left = x.new Node(10);
        base.left.left.left.right = x.new Node(14);
        base.left.left.left.right.right = x.new Node(44);
        base.right = x.new Node(6);
        base.right.left = x.new Node(8);
        base.right.right = x.new Node(9);
        base.right.right.left = x.new Node(11);
        base.right.right.left.right = x.new Node(15);
        x.levelOrder(base);
    }
}