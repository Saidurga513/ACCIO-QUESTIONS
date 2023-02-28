import java.io.*;
import java.util.*;


class Solution{
    public String smallestNumber(String str){
        // write code here
		StringBuilder sb=new StringBuilder(),stack=new StringBuilder();
        // check the pattern
        for(int i=0;i<=str.length();i++)
        {
         stack.append((char)('1'+i));  
         if(i==str.length()||str.charAt(i)=='i')
         {
            sb.append(stack.reverse());
            stack=new StringBuilder();
        }
        }
        
        return sb.toString();
    }
}

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    Solution Obj = new Solution();
    System.out.print(Obj.smallestNumber(str));
  }
}