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
    
    if(idx==pre.length)return null;
    if(pre[idx]<l||pre[idx]>r) return null;
    int val=pre[idx];
	idx++;
    TreeNode me=new TreeNode(val);
    TreeNode lst=construct(pre, l,val-1);
    TreeNode rst=construct(pre, val+1,r);
    me.left=lst;
    me.right=rst;
    return me;

}
    public static TreeNode CreateTree(int n,int[] preOrder) {
        // Write Your Code here
        idx=0;
		TreeNode root=construct(preOrder,Integer.MIN_VALUE,Integer.MAX_VALUE);
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
        int[] pre = new int[n];
        for (int i = 0; i < n; i++)
            pre[i] = scn.nextInt();

        TreeNode root = CreateTree(n,pre);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}