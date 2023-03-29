import java.util.*;
import java.io.*;

public class Main {
     public  static void isPangram(String s)
      {
           // Your code here
		  HashMap<Character,Integer> map=new HashMap<>();

		  char ch1='a';
        for(int i=1;i<=26;i++)
        {
            map.put(ch1, 1);
            ch1++;
        }
        s=s.toLowerCase();
        for(Character ch:s.toCharArray())
		{
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
        }  
        boolean flag=true;
        Set<Character> key=map.keySet();
        for(Character keys:key)
        {
            if(map.get(keys)==1)
            {
                flag=false;
            }
        }
        if(flag)
        System.out.println("pangram");
        else
     System.out.println(" Not pangram");


        
    }
    public static void main(String args[]) {
   Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        isPangram(s);
        input.close();
    }
}