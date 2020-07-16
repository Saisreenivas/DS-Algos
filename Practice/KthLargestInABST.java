package Practice;

public class KthLargestInABST {
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    Node insert(Node root, int key){
        if(root == null)
            return (new KthLargestInABST()).new Node(key);
        
        if(key < root.data)
            root.left = insert(root.left, key);
        if(key > root.data)
            root.right = insert(root.right, key);
        return root;
    }

    int count;
    void printKthLargest(Node root, int k){
        count= 0;
        Node res = printLargest(root,k);
        if(res == null){
            System.out.println("K("+k+") is larger than the number of nodes("+count+") in BST");
        }else{
            System.out.println("K("+k+")th Largest Number in the BST is: "+ res.data);
        }
    }

    Node printLargest(Node root, int k){
        if(root == null)
            return null;
        
        Node right = printLargest(root.right, k);

        if(right != null)
            return right;
        
        count++;
        if(count ==k)
            return root;
        
        return printLargest(root.left, k);
    }
    

    public static void main(String[] args) {
        KthLargestInABST h = new KthLargestInABST();
        Node root = null; 
        int keys[] = { 20, 8, 22, 4, 12, 10, 14 }; 
       
        for (int x : keys) 
            root = h.insert(root, x); 
          
        int k = 9; 
        h.printKthLargest(root, k); 
    }
}