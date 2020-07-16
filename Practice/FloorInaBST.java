package Practice;

public class FloorInaBST {
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    int floor(Node root, int key){
        if(root == null)
            return Integer.MAX_VALUE;
        
        if(key == root.data)
            return root.data;
        
        if(key < root.data)
            return floor(root.left, key);
        
        int floora = floor(root.right, key);
        return (key >= floora ? floora: root.data);
    }

    public static void main(String[] args) {
        FloorInaBST x = new FloorInaBST();
        Node root = x.new Node(8);
        root.left = x.new Node(4);  
        root.right = x.new Node(12);  
        root.left.left = x.new Node(2);  
        root.left.right = x.new Node(6);  
        root.right.left = x.new Node(10);  
        root.right.right = x.new Node(14);  
        for (int i = 0; i < 16; i++) {  
            
            int floor = x.floor(root, i);
            floor = (floor == Integer.MAX_VALUE)? -1: floor;
            System.out.println(i + " " + floor);  
        }  
    }
}