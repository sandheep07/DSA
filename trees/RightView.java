package trees;
public class RightView {
    static class Node{
        int data;
        Node left,right;
        
        Node(int data){
            left=right=null;
            this.data=data;
        }
    }
    Node root;
    int max_level=0;
    RightView(){
        root= null;
    }
    void rightViewUtil(Node node,int level){
        if(node == null)
          return;

        if(max_level<level){
            System.out.println(node.data+" ");
            max_level=level;
        }

        rightViewUtil(node.right, level+1);
        rightViewUtil(node.left, level+1);
    }
    void rightView(){
        rightViewUtil(root,1);
    }
    public static void main(String[] args) {
        
        RightView tree =  new RightView();

        tree.root = new Node(10);
        tree.root.left = new Node(30);
        tree.root.right = new Node(20);

        tree.rightView();

    }
}
