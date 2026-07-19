class Node{
    int data;
    Node left;
    Node right;
    Node(int u){
        this.data=u;
        this.left=null;
        this.right=null;
    }
}
public class Tree {
    static void inorder(Node root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    static int sum(Node root){
        if(root==null)
            return 0;
        return sum(root.left)+root.data+sum(root.right);
    }
    static int Evensum(Node root){
        if(root==null)
            return 0;
        return Evensum(root.left)+(((root.data %2)==0)?root.data:0)+Evensum(root.right);
    }
    static int Height(Node root){
        if(root==null)
            return -1;
        return Math.max(Height(root.left),Height(root.right))+1;
    }
    static int Leafnode(Node root){
        if(root==null)
            return 0;
        else if(root.left==null && root.right==null)
            return 1; //return root.data for sum
        return Leafnode(root.left)+Leafnode(root.right);
    }
    
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.left.left=new Node(2);
        root.left.right=new Node(7);
        root.left.right.left=new Node(6);
        root.left.right.right=new Node(8);
        System.out.print(Leafnode(root));
    }
}
