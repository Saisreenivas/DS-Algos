package Practice;
import java.util.*;

public class FindAPairWithAGivenSumInBST {
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left= this.right = null;
        }
    }

    Node insert(Node root, int key){
        if(root == null)
            return (new FindAPairWithAGivenSumInBST()).new Node(key);
        if(key < root.data)
            root.left = insert(root.left, key);
        if(key > root.data)
            root.right = insert(root.right, key);
        
        return root;
    }
    boolean found;
    void findPair(Node root, int key){
        HashSet<Integer> hash = new HashSet<>();
        found = false;
        findPair(root, key, hash);
        if(!found)
            System.out.println("No Pairs found.");
    }

    void findPair(Node root, int key, HashSet<Integer> hash){
        if(root == null)
            return;
        
        findPair(root.left, key, hash);

        if(hash.contains(key-root.data)){
            System.out.println("Found a pair: ("+ (key-root.data) + "," + root.data + ")");
            found = true;
        }else{
            hash.add(root.data);
        }

        findPair(root.right, key, hash);
    }

    public static void main(String[] args) {
        FindAPairWithAGivenSumInBST x = new FindAPairWithAGivenSumInBST();
        Node root = null;
        int[] keys = new int[]{1,2,3,4,5,6,7,8,9};
        for(int key:keys)
            root = x.insert(root, key);
        
        int find = 30;
        x.findPair(root, find);
    }
}