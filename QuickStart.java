import java.util.*;

class QuickStart {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void topView(Node root){
        
        class QueueObj{
            int hd; //Horizontal Distance
            Node node;
            QueueObj(int hd, Node node){
                this.hd = hd;
                this.node= node;
            }
        }

        Queue<QueueObj> q = new LinkedList<>();
        Map<Integer, Node> treeMap = new TreeMap<>();
        if(root == null){
            return;
        }
        q.add(new QueueObj(0, root));
        while(!q.isEmpty()){
            QueueObj tmp = q.poll();
            if(!treeMap.containsKey(tmp.hd)){
                treeMap.put(tmp.hd, tmp.node);
            }
            if(tmp.node.left != null){
                q.add(new QueueObj(tmp.hd-1, tmp.node.left));
            }
            if(tmp.node.right != null){
                q.add(new QueueObj(tmp.hd+1, tmp.node.right));
            }
        }

        for(Map.Entry<Integer, Node> entry: treeMap.entrySet()){
            System.out.print(entry.getValue().data + " ");
        }
    }
    public static void main(String[] args) {
        QuickStart x = new QuickStart();
        Node base = x.new Node(4);
        base.left = x.new Node(5);
        base.left.left = x.new Node(7);
        base.right = x.new Node(6);
        base.right.left = x.new Node(8);
        base.right.right = x.new Node(9);
        topView(base);
        // System.out.println("Hello, World." + base);
        
    }
}