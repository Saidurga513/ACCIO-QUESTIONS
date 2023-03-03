import java.util.*;
import java.util.LinkedList;

class Solution {
    public Queue<Integer> rearrange(Queue<Integer> q) {
        // write code here
        int halfsize=q.size()/2;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<halfsize;i++)
        {
            st.push(q.peek());
            q.poll();
        }
		while(!st.empty())
        {
            q.add(st.peek());
            st.pop();
        }
        for(int i=0;i<halfsize;i++)
        {
            q.add(q.peek());
            q.poll();
        }
        for(int i=0;i<halfsize;i++)
        {
            st.push(q.peek());
            q.poll();
        }
        while(!st.empty())
        {
            q.add(st.peek());
            st.pop();
            q.add(q.peek());
            q.poll();
        }
        return q;
    }
   
    }

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(scn.nextInt());
        }
        scn.close();
        Solution Obj = new Solution();
        Queue<Integer> ans = Obj.rearrange(q);
        while (!ans.isEmpty()) {

            System.out.print(ans.peek() + " ");
            ans.remove();
        }
    }
}