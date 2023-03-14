import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class Main {
    static Node treeBuilder(String str){  
        if(str.length()==0 || str.charAt(0)=='-'){
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root);
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if(!currVal.equals("-1")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if(i >= ip.length)
                break;
            currVal = ip[i];
            if(!currVal.equals("-1")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root){
        if(root == null)
            return;
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }
    
  public static void main (String[] args) throws IOException{
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int t=Integer.parseInt(br.readLine());
          while(t > 0){
              String s = br.readLine();
            Node root = treeBuilder(s);
              Solution g = new Solution();
              if(g.isBST(root))
              System.out.println("true");
          else
              System.out.println("false");
                t--;
        }
    }
  
}

class Solution
{
	public static class Pair
    {
		Node node;
		int state;
		Pair(Node node,int state)
        {
			this.node = node;
			this.state = state;
		}
	}
	public static Node getNextInorder(Stack<Pair> st)
    {
		while(st.size()>0){
			Pair top = st.peek();
			if(top.state == 1){//pre
				top.state++;
				if(top.node.left != null) st.push(new Pair(top.node.left,1));
			}else if(top.state == 2){
				top.state++;
				if(top.node.right!=null) st.push(new Pair(top.node.right,1));
				return top.node;
			}else{
				st.pop();
			}
		}
		return null;
	}
	
    boolean isBST(Node node)
    {
       // Your Code Here
		Stack<Pair> st = new Stack<>();
		st.push(new Pair(node,1));
		
		
		Node curr  = getNextInorder(st);//
		Node prev = null;

		while(curr != null)
        {
			if(prev == null || curr.data >= prev.data)
            {
				prev = curr;
				curr = getNextInorder(st);
			}
			else
            {
				return false;
			}
		
    }
		return true;
}
}