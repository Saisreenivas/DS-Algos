package Practice;

import java.util.*;

public class NextRightPointersOfATree {
    class Node{
        int data;
        Node left, right, nextRight;
        Node(int data){
            this.data = data;
            this.left= this.right = this.nextRight = null;
        }
    }

    void nextRightPointers(Node root){
        if(root == null){
            return;
        }

        if(root.nextRight != null){
            nextRightPointers(root.nextRight);
        }

        if(root.left != null){
            if(root.right != null){
                root.left.nextRight = root.right;
                root.right.nextRight = nextRight(root); 
            }else{
                root.left.nextRight = nextRight(root);
            }
            nextRightPointers(root.left);
        }else if(root.right != null){
            root.right.nextRight = nextRight(root);
            nextRightPointers(root.right);
        }else{
            nextRightPointers(nextRight(root));
        }
    }

    Node nextRight(Node root){
        Node tmp = root.nextRight;

        if(tmp != null){
            if(tmp.left != null){
                return tmp.left;
            }
            if(tmp.right != null){
                return tmp.right;
            }
            tmp = tmp.nextRight;
        }

        return null;
    }

    static void print(Node a){
        System.out.println("Following are populated nextRight pointers in "
                + " the tree(-1 is printed if there is no nextRight)"); 
        
        Queue<Node> q = new LinkedList<>();
        q.add(a);
        while(!q.isEmpty()){
            Node tmp = q.poll();
            if(tmp != null){
                int right = ((tmp.nextRight != null)?tmp.nextRight.data:-1);
                System.out.println("nextRight of " + tmp.data + " is: " + right); 
                if(tmp.left != null){
                    q.add(tmp.left);
                }
                if(tmp.right != null){
                    q.add(tmp.right);
                }

            }
            
        }

        return;
    }

    public static void main(String[] args) {
        NextRightPointersOfATree x = new NextRightPointersOfATree();
        Node a = x.new Node(10);
        a.left = x.new Node(8);
        a.right = x.new Node(2);
        a.left.left = x.new Node(3);
        a.right.right = x.new Node(90);
        
        x.nextRightPointers(a);

        print(a);

    }

}