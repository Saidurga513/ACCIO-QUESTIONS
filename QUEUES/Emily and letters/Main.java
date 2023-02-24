import java.util.*;
import java.util.LinkedList;

import javax.swing.plaf.basic.BasicRootPaneUI;
class Main {
    /**
     * @param s
     * @return
     */
    static int front=-1;
    static int rear=-1;
   static  Queue<Character> q1=new LinkedList<>();
    public static int firstUniqChar(String s) {
        // Write your code here
		int count=0;
        boolean flag=false;
        for(Character ch:s.toCharArray())
        {  
            if(front==-1 && rear==-1)
            {
                front=rear=0;
                q1.add(ch);
            }
            else if(rear<s.length())
            {
               Iterator iterator=q1.iterator();
                while(iterator.hasNext())
                {
                    if(ch==iterator.next())
                    {
                        return 
                    }
                        
                }
                if(flag=)
                
            }
            
        }
        
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        System.out.println(firstUniqChar(s));
    }
}