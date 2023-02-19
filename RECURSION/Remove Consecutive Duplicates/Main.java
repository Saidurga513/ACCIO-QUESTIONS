import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        String ans = Solution.removeConsecutiveDuplicates(str);
        System.out.println(ans);
    }
}

class Solution {

    static String removeConsecutiveDuplicates(String s) {
        //string length is empty or only one char
        if(s.length()<=1) return s;
        if(s.charAt(0)==s.charAt(1))
        {
            return removeConsecutiveDuplicates(s.substring(1));
        }
        else{
            return s.charAt(0)+removeConsecutiveDuplicates(s.substring(1));
        }
    }
}
