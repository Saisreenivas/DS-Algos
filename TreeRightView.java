public class TreeRightView {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
    int maxLevel =-1, baseLevel =0;
    public void rightView(Node root, int vd){
        if(root ==null){
            return;
        }
        if(maxLevel < vd){
            System.out.print(root.data + " ");
            maxLevel++;
        }


        rightView(root.right, vd+1);
        rightView(root.left, vd+1);
    }

    public static void main(String[] args) {
        TreeRightView x = new TreeRightView();
        Node base = x.new Node(4);
        base.left = x.new Node(5);
        base.left.left = x.new Node(7);
        base.left.left.left = x.new Node(10);
        base.left.left.left.right = x.new Node(14);
        base.left.left.left.right.right = x.new Node(44);
        base.right = x.new Node(6);
        base.right.left = x.new Node(8);
        base.right.right = x.new Node(9);
        base.right.right.left = x.new Node(11);
        base.right.right.left.right = x.new Node(15);
        x.rightView(base, 0);    
    }
}