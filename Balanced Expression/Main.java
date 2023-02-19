import java.io.*;
import java.util.*;

class Solution{
    boolean expBalanced(String s){
        // write code here
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
				{
					st.push(s.charAt(i));
				}
				else if(st.size()!=0&&st.peek()=='('&&s.charAt(i)==')')
				{
					st.pop();
				}
				else if(st.size()!=0&&st.peek()=='{'&&s.charAt(i)=='}')
				{
					st.pop();
				}
				else if(st.size()!=0&&st.peek()=='['&&s.charAt(i)==']')
				{
					st.pop();
				}
				else if(st.size()==0)
				{
				return false;					
				}
			}
		if(st.size()!=0)
			return false;
		return true;
    }
}

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Solution Obj = new Solution();
        System.out.println(Obj.expBalanced(str));
    }
}