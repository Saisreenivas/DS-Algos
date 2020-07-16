package Practice;

public class CeilInaBST {
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    int Ceil(Node root, int key){
        if(root == null)
            return -1;
        if(key == root.data){
            return root.data;
        }

        if(key > root.data){
            return Ceil(root.right, key);
        }

        // if(key <= root.data){
        int a = Ceil(root.left, key);
        return (key <= a ? a: root.data);
    }

    public static void main(String[] args) {
        CeilInaBST x = new CeilInaBST();
        Node root = x.new Node(8);
        root.left = x.new Node(4);  
        root.right = x.new Node(12);  
        root.left.left = x.new Node(2);  
        root.left.right = x.new Node(6);  
        root.right.left = x.new Node(10);  
        root.right.right = x.new Node(14);  
        for (int i = 0; i < 16; i++) {  
              
            System.out.println(i + " " +  
                        x.Ceil(root, i));  
        }  
    }
}