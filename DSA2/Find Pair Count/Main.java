import java.io.*;
import java.util.*;

class Solution {
    public int countPairs(String s) {
        //write code here
        int count=0;
        for(int i=0;i<s.length()-2;i++)
        {
            if(s.charAt(i)==s.charAt(i+2))
            {
                count++;
            }
        }
		return count;
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution obj = new Solution();
        System.out.println(obj.countPairs(s));
        sc.close();
    }
}
