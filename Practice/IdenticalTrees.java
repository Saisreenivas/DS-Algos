package Practice;

// class Node{
//     int data;
//     Node left, right;
//     Node(int data){
//         this.data = data;
//         this.left = this.right = null;
//     }
// }

public class IdenticalTrees {
    Node root1, root2;

    public boolean isIdenticalTreesCheck(Node root1, Node root2){
        // case 1: if both nodes are null
        if(root1 == null && root2  == null){
            return true;
        }

        // case 2: if not, compare the data and left nodes and right nodes
        if(root1 != null && root2 != null){
            return (root1.data == root2.data && 
                    isIdenticalTreesCheck(root1.left, root2.left) &&
                    isIdenticalTreesCheck(root1.right, root2.right));
        }

        
        // case 3: if one is null and the other is not
        return false;
    }

    public void isIdenticalTrees(Node root1, Node root2){
        boolean result = isIdenticalTreesCheck(root1, root2);
        if(result){
            System.out.println("Both the trees are identical");
        }else{
            System.out.println("Non Identical Trees");
        }
    }
    public static void main(String[] args) {
        IdenticalTrees x= new IdenticalTrees();
  
        x.root1 = new Node(1); 
        x.root1.left = new Node(2); 
        x.root1.right = new Node(3); 
        x.root1.left.left = new Node(4); 
        x.root1.left.right = new Node(5); 
   
        x.root2 = new Node(1); 
        x.root2.left = new Node(2); 
        x.root2.right = new Node(3); 
        x.root2.left.left = new Node(4); 
        x.root2.left.right = new Node(9); 

        x.isIdenticalTrees(x.root1, x.root2);
    }
}