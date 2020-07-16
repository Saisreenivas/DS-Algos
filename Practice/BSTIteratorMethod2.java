package Practice;

import java.util.*;

public class BSTIteratorMethod2 {
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    BSTIteratorMethod2(){

    }
    // Stack<Node> s = new Stack<>();
    Queue<Integer> q= new LinkedList<>();
    BSTIteratorMethod2(Node root){
        if(root == null)
            return;
        inorder(root);
    }

    public void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        q.add(root.data);
        inorder(root.right);
    }

    /** @return the next smallest number */
    public int next() {
        return q.poll();
        
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !q.isEmpty();
    }

    void iterate(Node root){
        BSTIteratorMethod2 it = new BSTIteratorMethod2(root);
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
    
    public static void main(String[] args) {
        BSTIteratorMethod2 x = new BSTIteratorMethod2();
        Node root = x.new Node(5); 
        root.left = x.new Node(3); 
        root.right = x.new Node(7); 
        root.left.left = x.new Node(2); 
        root.left.right = x.new Node(4); 
        root.right.left = x.new Node(6); 
        root.right.right = x.new Node(8); 
    
        // Iterator to BST 
         
    

        // Function to test iterator 
        x.iterate(root); 
    }
}