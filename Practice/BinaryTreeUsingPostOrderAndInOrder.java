package Practice;

import java.util.*;

public class BinaryTreeUsingPostOrderAndInOrder {
    class Node{
        char data;
        Node left, right;
        Node(char data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    static int postInd = 0;
    
    public void printInOrder(Node root){
        if(root == null){
            return;
        }
        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }

    public Node buildTree(char[] postorder, char[] inorder){
        Map<Character, Integer> mp = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            mp.put(inorder[i], i);
        }
        postInd = inorder.length-1;
        return buildTree(postorder, inorder, mp, 0, inorder.length-1);
    }

    
    private Node buildTree(char[] postorder, char[] inorder, Map<Character, Integer> mp, int i, int j) {
        if(i>j){
            return null;
        }

        Node root = new Node(postorder[postInd--]);
        if(i==j){
            return root;
        }
        int inInd = mp.get(root.data);
        root.right = buildTree(postorder, inorder, mp,inInd+1, j);
        root.left = buildTree(postorder, inorder, mp,i, inInd-1);

        
        return root;
    }

    public static void main(String[] args) {
        BinaryTreeUsingPostOrderAndInOrder x= new BinaryTreeUsingPostOrderAndInOrder();
        char postOrder[] = new char[]{'D', 'E', 'B', 'F', 'C', 'A'};
        char inOrder[] = new char[]{'D', 'B', 'E', 'A', 'F', 'C' };
        Node root = x.buildTree(postOrder, inOrder);
        x.printInOrder(root);
        
    }
}