import java.util.Scanner;

import java.util.*;

class Solution {
   static boolean areAnagram(String c1, String c2) {
     //void areAnagram(String c1, String c2) {

       //Write your code here
       HashMap<Character,Integer> map=new HashMap<>();
       for(Character ch:c1.toCharArray())
       {
        if(map.containsKey(ch))
        {
            map.put(ch, map.get(ch)+1);
        }
        else{
            map.put(ch,1);
        }
       }
       for(Character ch1:c2.toCharArray())
       {
        if(map.containsKey(ch1))
        {
            map.put(ch1, map.get(ch1)-1);
        }
        else{
            return false;
        }
       }
       Set <Character> keys=map.keySet();
       for(Character key:keys)
       {
        if(map.get(key)!=0)
        return false;
       }
       return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Solution Obj = new Solution();
        sc.close();
       // Obj.areAnagram(str1,str2);
        if (Obj.areAnagram(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
