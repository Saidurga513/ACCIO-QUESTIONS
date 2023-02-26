import java.util.*;
import java.io.*;

class Main {
    public static int firstUniqChar(String s) {
        // Write your code here
       HashMap<Character,Integer> map=new HashMap<>();
       for(Character ch:s.toCharArray())
       {
        if(!map.containsKey(ch))    
            map.put(ch, 1);
        else
        map.put(ch, map.get(ch)+1);
       }
       int i=0;
		for(Character ch:s.toCharArray())
        {
            if(map.get(ch)==1)return i;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(firstUniqChar(s));
    }
}