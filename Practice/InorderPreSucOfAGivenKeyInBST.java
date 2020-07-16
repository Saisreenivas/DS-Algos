package Practice;

public class InorderPreSucOfAGivenKeyInBST {
    class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    static Node pre, suc;
    public Node insert(Node root, int key){
        if(root == null)
            return new Node(key);
        
        if(key < root.data){
            root.left = insert(root.left, key);
        }else {
            root.right = insert(root.right, key);
        }
        return root;
    }

    public static void main(String[] args) {
        InorderPreSucOfAGivenKeyInBST x = new InorderPreSucOfAGivenKeyInBST();
  
        /* Let us create following BST 
                   50 
                 /    \ 
                30     70 
               /  \   /  \  
             20   40 60   80 
        */
        Node root = null; 
        int[] keys = new int[]{50,30,20,40,70,60,80};
        for(int each:keys){
            root = x.insert(root, each);
        }

        int key = 11; // Key to be searched in BST 

        preSuc(root, key);
        System.out.println("Predecessor: " + ((pre== null)?-1:pre.data));
        System.out.println("Successor: " + ((suc== null)?-1:suc.data));

    }

    private static void preSuc(Node root, int key) {
        if(root == null)
            return;
        
        while(root != null){
            if(root.data == key){

                if(root.left != null){
                    pre = root.left;
                    while(pre.right != null){
                        pre = pre.right;
                    }
                }
                
                if(root.right != null){
                    suc = root.right;
                    while(suc != null){
                        suc = suc.left;
                    }
                }
                return;
            }else if(root.data != key){
                if(key < root.data){
                    suc = root;
                    root = root.left;
                }else{
                    pre = root;
                    root = root.right;
                }
            }
        }
    }
    
}