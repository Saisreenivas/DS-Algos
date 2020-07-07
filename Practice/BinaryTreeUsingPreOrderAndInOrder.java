package Practice;

import java.util.*;

public class BinaryTreeUsingPreOrderAndInOrder {

    class Node{
        char data;
        Node left, right;
        Node(char data){
            this.data = data;
            this.left = this.right  = null;
        }
    }

    static int preInd = 0;

    public Node buildTree(char[] inorder, char[] preorder, int startInd, int endInd, Map<Character, Integer> inorderMap){
        if(startInd > endInd){
            return null;
        }

        Node root = new Node(preorder[preInd++]);
        if(startInd == endInd){
            return root;
        } 

        // int inInd = search(inorder, startInd, endInd, root.data);
        int inInd = inorderMap.get(root.data);

        root.left = buildTree(inorder, preorder, startInd, inInd-1, inorderMap);
        root.right = buildTree(inorder, preorder, inInd+1, endInd, inorderMap);

        return root;
    }

    public int search(char[] inorder, int startInd, int endInd, int item){
        int i;
        for(i=startInd;i<=endInd;i++){
            if(inorder[i] == item){
                return i;
            }
        }
        return i;
    }

    public void printInorder(Node root){
        if(root == null){
            return;
        }
        // System.out.println("a ");
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }
    
    public static void main(String[] args) {
        BinaryTreeUsingPreOrderAndInOrder tree = new BinaryTreeUsingPreOrderAndInOrder();
        char in[] = new char[] { 'D', 'B', 'E', 'A', 'F', 'C' }; 
        char pre[] = new char[] { 'A', 'B', 'D', 'E', 'C', 'F' }; 
        int len = in.length; 
        Map<Character, Integer> mp = new HashMap<>();
        for(int i=0;i< in.length;i++){
            mp.put(in[i], i);
        }
        Node root = tree.buildTree(in, pre, 0, len - 1, mp); 
  
        // building the tree by printing inorder traversal 
        System.out.println("Inorder traversal of constructed tree is : "); 
        tree.printInorder(root); 
    }
}