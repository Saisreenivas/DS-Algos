package Practice;

public class FlattenABinaryTreeIntoLinkedList {
    // Flatten a binary tree into Linkedlist without using extra space
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public void flatten(Node root){
        if(root == null || (root.left == null && root.right == null)){
            return;
        }

        while(root.left != null){
            flatten(root.left);

            Node tmp = root.right;
            root.right = root.left;
            root.left = null;

            while(root.right != null){
                root = root.right;
            }
            root.right = tmp;
        }

        flatten(root.right);
    }



    public void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        FlattenABinaryTreeIntoLinkedList x = new FlattenABinaryTreeIntoLinkedList();
        Node a = x.new Node(1);
        a.left = x.new Node(2);
        a.left.left = x.new Node(4);
        a.left.right = x.new Node(5);
        a.right = x.new Node(3);
        a.right.right = x.new Node(6);
        x.flatten(a);
        x.inorder(a);
        /*           1
                    / \      
                   2   3
                  / \   \
                 4   5   6
                 into
                1
                 \
                  2
                   \
                    4
                     \
                      5
                       \
                        3
                         \
                          6 
         */
    }
}