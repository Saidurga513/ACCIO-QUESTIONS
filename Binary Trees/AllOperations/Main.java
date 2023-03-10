import java.util.Scanner;

public class Main {
    
    class Node{
        int key;
        Node left;
        Node right;
     public  Node(int data)
        {
            key=data;
            left=right=null;
        }
    }
  static  Node root;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //number of nodes
        int n=sc.nextInt();
        //node values
        for(int i=0;i<n;i++)
        {
            insertNode(sc.nextInt());
        }
        sc.close();
        inorder();
    }
    Main(){
    root=null;
    }
    public static  void insertNode(int key)
    {
      root= insertRecursive(root,key);
    }
    public static Node insertRecursive(Node root,int data)
    {
        if(root==null)
            {
                root=new Node(data);
                return root;
            }
            return root;
    }
  static  void inorder()
    {
        inorder_recursive(root);
    }
    public static void inorder_recursive(Node root)
    {
        inorder_recursive(root.left);
        System.out.println(root.key);
        inorder_recursive(root.right);
    }
}
