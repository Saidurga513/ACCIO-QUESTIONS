import java.util.*;

public class Main {
    static void palindromeSubStrs(String s) 
    {
        //Write your code here
        Set<String> map = new TreeSet<>();
        String str="";
        for(int i=0; i<s.length();i++)
        {
            str="";
            for(int j=i; j<s.length();j++)
            {
                Character ch=s.charAt(j);
                str+=ch;
                boolean bool=isPalindrome(str);
                if(bool)
                {
                  map.add(str);
                }
            }
          }
          Iterator value = map.iterator();
          while(value.hasNext())
          System.out.println(value.next());
    }
    public static boolean isPalindrome(String str){
      int i=0,j=str.length()-1;
      while(i<=j){
          char a=str.charAt(i);
          char b=str.charAt(j);
          if(a!=b) 
          return false;
          i++;
          j--;
      }
      return true;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        palindromeSubStrs(s);
    }
}