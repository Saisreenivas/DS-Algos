package Practice;
import java.util.*;

public class LevelOrderTraversalSpiral {

    public class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public void spiralLevelOrder(Node root){
        if(root == null){
            return;
        }
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s2.push(root);
        while(!s1.isEmpty() || !s2.isEmpty()){
            while(!s1.isEmpty()){
                Node t1 = s1.pop();
                System.out.print(t1.data + " ");

                if(t1.right != null){
                    s2.push(t1.right);
                }
                if(t1.left != null){
                    s2.push(t1.left);
                }
            }
            while(!s2.isEmpty()){
                Node t2 = s2.pop();
                System.out.print(t2.data + " ");

                if(t2.left != null){
                    s1.push(t2.left);
                }
                if(t2.right != null){
                    s1.push(t2.right);
                }
            }
        }

    }

    public static void main(String[] args) {
        LevelOrderTraversalSpiral x = new LevelOrderTraversalSpiral();
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
        x.spiralLevelOrder(base);
    }
    
}