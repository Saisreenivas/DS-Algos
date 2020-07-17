package Practice;

public class BTtoDLL {
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
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

    static Node head;
    void toDLL(Node root){
        if(root == null)
            return;
        
        toDLL(root.right);
        root.right = head;

        if(head != null){
            head.left = root;
        }

        head = root;

        toDLL(root.left);
    }

    void dll(Node head){
        while(head!= null){
            System.out.print(head.data + " ");
            head = head.right;
        }
    }

    public static void main(String[] args) {
        BTtoDLL x = new BTtoDLL();
        Node root = x.new Node(10);
        root.left = x.new Node(13);
        root.left.left = x.new Node(14);
        root.left.right = x.new Node(11);
        root.right = x.new Node(8);
        root.right.right = x.new Node(7);

        System.out.println("inorder of BT: ");
        x.inorder(root);
        System.out.println("\nDouble Linked List output: ");
        x.toDLL(root);
        x.dll(head);

    }
}