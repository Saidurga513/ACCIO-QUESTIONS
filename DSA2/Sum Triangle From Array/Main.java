import java.io.*;
import java.nio.channels.NonWritableChannelException;
import java.util.*;

class Solution {
    public String stringClean(String s) {
        //write code here
        StringBuilder sb=new StringBuilder();
        char i='-';
        for(Character ch:s.toCharArray())
        {
            if(i!=ch)
            {
                sb.append(ch);
                i=ch;
            }
        }
        return sb.toString();
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution obj = new Solution();
        System.out.println(obj.stringClean(s));
        sc.close();
    }
}
