package Practice;

/**
 * SearchGivenKeyInBSTIterative
 */

public class SearchGivenKeyInBSTIterative {
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    static Node insert(Node root, int val){
        if(root == null){
            return (new SearchGivenKeyInBSTIterative()).new Node(val);
        }
        if(root.data > val){
            root.left =  insert(root.left, val);
        }
        if(root.data < val){
            root.right = insert(root.right, val);
        }   

        return root;
    }

    static void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void search(Node root, int key){
        Node curr= root, parent= null;
        
        while(curr != null && curr.data != key){
            parent = curr;

            if(key < curr.data){
                curr = curr.left;
            }else{
                curr = curr.right;
            }
        }

        if(curr == null){
            System.out.println("Key not found");
            return;
        }

        if(parent == null && curr.data == key){
            System.out.println("The Key is the root node of the BST.");
        }
        else if(key < parent.data){
            System.out.println("The key " + key + " is the left child of " + parent.data);
        }else{
            System.out.println("The key " + key + " is the right child of " + parent.data);

        }

    }
    public static void main(String[] args) {
        Node root = null;
        int[] keys = new int[]{ 15, 10, 20, 8, 12, 16, 25 };
        for(int key:keys){
            root = insert(root, key);
        }
        System.out.println("input inorder:" );
        inorder(root);

        System.out.println("\noutput:");
        search(root, 100);

    }
}