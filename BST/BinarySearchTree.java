import java.util.LinkedList;
public class BinarySearchTree{

//   Tree node
    private class Node{
        Node left;
        int data;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    Node root;
    public BinarySearchTree(){
        root = null;
    }

    // insertion
    public void insert(int data){
          root = insert(root,data);
    }

    private Node insert(Node root,int data){
        if(root == null){
            return new Node(data);
        }else if( data > root.data){
            root.right = insert(root.right,data);
        }else{
            root.left = insert(root.left,data);
        }
        return root;
    }

    // traversal
    public void preorder(){
         preorder(root);
         System.out.println();
    }

    private void preorder(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }}


//    inorder traversal
    private void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    public void inorder(){
        inorder(root);
        System.out.println();
    }

//   postorder traversal
//  left right root
    private void postorder(Node root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public void postorder(){
        postorder(root);
        System.out.println();
    }

// level  order traversal
public void levelorder(){
   LinkedList<Node> queue = new LinkedList<>();
   queue.add(root);

   while(!queue.isEmpty()){
    Node cur = queue.removeFirst();
    System.out.print(cur.data+" ");
    if(cur.left != null){
        queue.add(cur.left);
    }
    if(cur.right != null){
        queue.add(cur.right);
    }

   }
System.out.println();
}
    }
