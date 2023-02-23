import java.util.*;
import java.util.LinkedList;

class Solution {
    public Queue<Integer> reverseQueue(Queue<Integer> q) {
        // write code here
     
       Stack<Integer> st1=new Stack<>();
       // add the values into stack
        while(!q.isEmpty())
        {
                st1.add(q.peek());
                q.remove();
        }
        // stack values will be added in to queue
        while(!st1.empty())
        {
            q.add(st1.peek());
            st1.pop();
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
        Queue<Integer> ans = Obj.reverseQueue(q);
        while (!ans.isEmpty()) {
            System.out.print(ans.peek() + " ");
            ans.remove();
        }
    }
}