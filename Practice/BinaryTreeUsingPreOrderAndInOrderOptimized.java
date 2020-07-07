package Practice;

import java.util.*;

public class BinaryTreeUsingPreOrderAndInOrderOptimized {
    class Node{
        char data;
        Node left, right;
        Node(char data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public Node buildTree(char[] preorder, char[] inorder){
        return buildTree(preorder, inorder, 0, inorder.length-1, inorderMap(inorder));
    }
    static int preInd = 0;
    private Node buildTree(char[] preorder, char[] inorder, int startInd, int endInd, Map<Character, Integer> inorderMap) {
        if(startInd > endInd){
            return null;
        }
        Node root = new Node(preorder[preInd++]);
        if(startInd == endInd){
            return root;
        }

        int inInd = inorderMap.get(root.data);
        root.left = buildTree(preorder, inorder, startInd, inInd-1, inorderMap);
        root.right = buildTree(preorder, inorder, inInd+1, endInd, inorderMap);

        return root;
    }

    public Map<Character, Integer> inorderMap(char[] inorder) {
        Map<Character, Integer> res = new HashMap<>();
        for(int i=0;i< inorder.length;i++){
            res.put(inorder[i], i);
        }

        return res;
    }

    public void printInOrder(Node root){
        if(root == null){
            return;
        }
        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }

    public void printPostOrder(Node root){
        if(root == null){
            return;
        }
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        BinaryTreeUsingPreOrderAndInOrderOptimized x = new BinaryTreeUsingPreOrderAndInOrderOptimized();
        char inorder[] = new char[]{ 'D', 'B', 'E', 'A', 'F', 'C' };
        char preorder[] = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};

        Node root = x.buildTree(preorder, inorder);
        x.printInOrder(root);
        System.out.println();
        x.printPostOrder(root);
    }
}