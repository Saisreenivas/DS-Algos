package Practice;

public class LCAofBST {
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }    

    Node insert(int[] keys, int start, int end){
        if(start > end)
            return null;
        
        int mid = (start+end)/2;
        Node root = new Node(keys[mid]);
        root.left = insert(keys, start, mid-1);
        root.right = insert(keys, mid+1, end);

        return root;
    }

    void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    void lcaOf(Node root, int a, int b){
        while(root != null){
            if(root.data < a && root.data < b){
                root = root.left;
            }else if(root.data > a && root.data > b){
                root = root.right;
            }else{
                break;
            }
        }

        System.out.println("LCA: " + root.data);
    }
       
    public static void main(String[] args) {
        LCAofBST x= new LCAofBST();
        Node root = null;
        int[] keys = new int[]{ 15, 10, 20, 8, 12, 16, 25 };
        root = x.insert(keys, 0, keys.length-1);

        System.out.println("input inorder:" );
        x.inorder(root);

        int a= 8, b = 16;
        System.out.println("\nLCA of: " + a  + " & " + b + ":");
        x.lcaOf(root, a,b);
    }
}