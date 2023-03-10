import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

static int idx;
	static TreeNode construct(int pre[],int l,int r)
{
    
    if(idx==-1)return null;
    if(pre[idx]<l||pre[idx]>r) return null;
    int val=pre[idx];
	idx--;
    TreeNode me=new TreeNode(val);
   
    TreeNode rst=construct(pre, val+1,r);
	 TreeNode lst=construct(pre, l,val-1);
    
    me.right=rst;
	me.left=lst;
    return me;

}
    public static TreeNode CreateTree(int n,int[] postOrder) {
        //write code here
		 idx=n-1;
		TreeNode root=construct(postOrder,Integer.MIN_VALUE,Integer.MAX_VALUE);
        return root;
    }

    // input_section=================================================

    public static void display(TreeNode node) {
        if (node == null) return;
        StringBuilder sb = new StringBuilder();
        sb.append((node.left != null ? node.left.val : "."));
        sb.append("->" + node.val + "<-");
        sb.append((node.right != null ? node.right.val : "."));
        System.out.println(sb.toString());
        display(node.left);
        display(node.right);

    }

    public static void solve() {
        int n = scn.nextInt();
        int[] post = new int[n];
        for (int i = 0; i < n; i++)
            post[i] = scn.nextInt();

        TreeNode root = CreateTree(n,post);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}