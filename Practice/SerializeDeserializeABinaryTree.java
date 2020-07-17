package Practice;

import java.io.*;
import java.util.*;

public class SerializeDeserializeABinaryTree {
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    String serialize(Node root){
        if(root == null)
            return "#";
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        ArrayList<String> arr = new ArrayList<>();
        while(!q.isEmpty()){
            Node tmp = q.poll();
            if(tmp == null){
                arr.add("#");
            }else{
                arr.add("" + tmp.data);
                q.add(tmp.left);
                q.add(tmp.right);
            }
        }
        return String.join(",", arr);
    }

    Node deserialize(String data){
        // System.out.println(data);
        String[] res = data.split(",");
        if(res[0].equals("#")){
            return null;
        }
        Node root = new Node(Integer.parseInt(res[0]));
        // Node curr = root;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i=1;
        while(!q.isEmpty()){
            Node tmp = q.poll();
            if(!res[i].equals("#")){
                tmp.left = (new Node(Integer.parseInt(res[i])));
                q.add(tmp.left);
            }
            i++;
            if(!res[i].equals("#")){
                tmp.right = new Node(Integer.parseInt(res[i]));
                q.add(tmp.right);
            }
            i++;
        }

        return root;
    }
    public static void main(String[] args) throws IOException{
        SerializeDeserializeABinaryTree x = new SerializeDeserializeABinaryTree();
        try {
            FileOutputStream fout = new FileOutputStream(".\\Storage\\binarytree.ser");
            
            Node root = x.new Node(10);
            root.left = x.new Node(8);
            root.right = x.new Node(11);
            root.right.right = x.new Node(14);
            x.inorder(root);
            System.out.println();
            String binaryTreeString = x.serialize(root);
            byte b[]= binaryTreeString.getBytes();
            fout.write(b);
            fout.close();            
        } catch (Exception e) {
            System.out.println(e);
        }

        try{
            File file = new File(".\\Storage\\binarytree.ser");
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            String st;
            while((st = br.readLine()) != null){
                // Node (st);
                sb.append(st);
            }
            Node root = x.deserialize(sb.toString());
            
            x.inorder(root);
            br.close();
        }catch(Exception e){
            System.out.print(e);
        }
    }

    void inorder(Node root){
        if(root ==null)
            return;
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }
}