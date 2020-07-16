package Practice;

import java.util.*;

public class BSTIterator {
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    BSTIterator(){

    }
    Stack<Node> s = new Stack<>();
    BSTIterator(Node root){
        while(root != null){
            s.push(root);
            root = root.left;
        }
    }

    int next(){
        int res = s.peek().data;
        Node next = s.pop().right;
        while(next!= null){
            s.push(next);
            next= next.left;
        }

        return res;
    }

    boolean hasNext(){
        return !s.empty();
    }

    void iterate(Node root){
        BSTIterator it = new BSTIterator(root);
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
    
    public static void main(String[] args) {
        BSTIterator x = new BSTIterator();
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