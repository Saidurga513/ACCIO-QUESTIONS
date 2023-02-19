import java.util.*;

class Solution {
    public static String removeKdigits(String num, int k) {
        //Write your code here
        int len=num.length();
        //k is 0 then dont remove the digits
        if(k==0)
        return num;
        //k is eqal to num length
        if(k==len)
            return "0";
        int index=0;
         // create the empty stack
         Stack<Character> st = new Stack<>();
        // check evry digit in num string
        while(index<len)
        {
                       // check the number is greate or not the next number in nums string
            //check the k val and number is greater or not
            while(k>0 && !st.empty()&&st.peek()>num.charAt(index))
            {
                st.pop();
                k--;
            }
            //push the values in to stack i.e then increment the index
            st.push(num.charAt(index++)); 
        }
        String result="";
        while(k-- >0)
            st.pop();
            // add the number into string
        while(!st.empty())
        {
            result=st.pop()+result;
        }
        // delete the leading zeros
        while(result.length()>1&&result.charAt(0)=='0')
        result=result.substring(1);
        return result;
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int k = sc.nextInt();
        String result = Solution.removeKdigits(num, k);
        System.out.println(result);
    }
}