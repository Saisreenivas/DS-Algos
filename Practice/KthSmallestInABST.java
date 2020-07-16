package Practice;

public class KthSmallestInABST {
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
            return (new KthSmallestInABST()).new Node(key);
        
        if(key < root.data)
            root.left = insert(root.left, key);
        if(key > root.data)
            root.right = insert(root.right, key);
        return root;
    }

    int count =0;
    void printKthSmallest(Node root, int k){
        count =0;
        Node res = printKth(root, k);
        if(res == null){
            System.out.println("The total number of nodes("+count+") are less than the given K("+k+")");
        }else{
            System.out.println("K("+k+")th Smallest Number in the BST is: "  + res.data);
        }
    }

    Node printKth(Node root, int k){
        if(root == null)
            return null;
        
        Node left = printKth(root.left, k);

        if(left != null)
            return left;
        
        count++;
        if(count == k)
            return root;
        
        return printKth(root.right, k);
    }
    public static void main(String[] args) {
        KthSmallestInABST h = new KthSmallestInABST();
        Node root = null; 
        int keys[] = { 20, 8, 22, 4, 12, 10, 14 }; 
       
        for (int x : keys) 
            root = h.insert(root, x); 
          
        int k = 1; 
        h.printKthSmallest(root, k); 
    }
}