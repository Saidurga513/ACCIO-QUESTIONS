import java.util.*;

class Solution {
    public String ParenBit(String s) {
        // Write your code here
        //base case
        if(s.charAt(0)=='('&&(s.charAt(s.length()-1))==')')
        return s;
        //first char is open brace length is the char
        if(s.charAt(0)=='(')
            return ParenBit(s.substring(0,s.length()-1));
        if(s.charAt(s.length()-1)==')')
        return  ParenBit( s.substring(1));
            return ParenBit(s.substring(1,s.length()-1));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
	    Solution Obj = new Solution();
        System.out.println(Obj.ParenBit(s));
    }
}