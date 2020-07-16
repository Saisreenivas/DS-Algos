package Practice;

import java.util.LinkedList;
import java.util.Queue;

public class CheckIfBinaryTreeIsMirrorOfItself {
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    void checkMirror(Node root){
        if(root == null){
            System.out.println("Symmetric: true");
            return;
        }
        if(root.left == null && root.right == null){
            System.out.println("Symmetric: true");
            return;
        }
        if(root.left == null || root.right == null){
            System.out.println("Symmetric: false");
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root.left);
        q.add(root.right);
        while(!q.isEmpty()){
            Node a = q.poll();
            Node b = q.poll();
            if(a == null && b == null){
                continue;
            }
            if(a == null || b == null){
                System.out.println("Symmetric: false");
                return;
            }
            if( a.data != b.data){
                System.out.println("Symmetric: false");
                return;
            }
            q.add(a.left);
            q.add(b.right);
            q.add(a.right);
            q.add(b.left);
        }

        System.out.println("Symmetric: true");
        return;
    }


    public static void main(String[] args) {
        CheckIfBinaryTreeIsMirrorOfItself x = new CheckIfBinaryTreeIsMirrorOfItself();
        Node a = x.new Node(1);
        a.left = x.new Node(2);
        a.right = x.new Node(2);
        a.left.left = x.new Node(3);
        a.left.right = x.new Node(4);
        a.right.left = x.new Node(4);
        a.right.right = x.new Node(3);

        x.checkMirror(a);
    }
}