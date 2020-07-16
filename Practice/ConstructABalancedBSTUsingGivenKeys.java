package Practice;

import java.util.Arrays;

public class ConstructABalancedBSTUsingGivenKeys {
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data =data;
            this.left = this.right = null;
        }
    }

    void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    Node balancedBST(int[] keys, int start, int end){
        if(start> end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(keys[mid]);
        root.left = balancedBST(keys, start, mid-1);
        root.right = balancedBST(keys, mid+1, end);

        return root;
    }

    Node constructBST(int[] keys){
        Arrays.sort(keys);
        return balancedBST(keys, 0 , keys.length-1);
    }
    public static void main(String[] args) {
        ConstructABalancedBSTUsingGivenKeys x = new ConstructABalancedBSTUsingGivenKeys();
        int[] keys = new int[]{15,10,20,8,12,18,25};
        Node root = x.constructBST(keys);
        x.inorder(root);
    }
}