package Practice;

/**
 * SearchGivenKeyInBSTRecursive
 */

public class SearchGivenKeyInBSTRecursive {
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }    

    Node insert(Node root, int val){
        if(root == null){
            return new Node(val);
        }
        if(root.data > val){
            root.left =  insert(root.left, val);
        }
        if(root.data < val){
            root.right = insert(root.right, val);
        }   

        return root;
    }

    void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    void search(Node root, int key, Node parent){
        if(root == null){
            System.out.println("Key not found");
            return;
        }
        if(parent == null){
            if(root.data == key){
                System.out.println("Given Key "+ key + " is the root node of the BST");
                return;
            }
        }
        if(parent != null){
            if(parent.left.data == key){
                System.out.println("Given Key "+ key + " is the left child of node "+ parent.data );
                return;
            }else if(parent.right.data == key){
                System.out.println("Given Key "+ key + " is the right child of node "+ parent.data );
                return;
            }

        }

        if(root.data > key){
            search(root.left, key, root);
        }else if(root.data < key){
            search(root.right, key, root);
        }
    }

    public static void main(String[] args) {
        SearchGivenKeyInBSTRecursive x= new SearchGivenKeyInBSTRecursive();
        Node root = null;
        int[] keys = new int[]{ 15, 10, 20, 8, 12, 16, 25 };
        for(int key:keys){
            root = x.insert(root, key);
        }
        System.out.println("input inorder:" );
        x.inorder(root);

        System.out.println("\noutput:");
        x.search(root, 100, null);

    }
}