import java.util.*;

public class Main {

  static int goodStrings(String s, String[] A, int n) {
    // your code here
	  int count=0;
      HashMap<Character,Integer> org=new HashMap<>();
      for(Character ch:s.toCharArray())
      {
        if(!org.containsKey(ch))
            org.put(ch,1);
      }
      for(String str:A)
      {
       boolean check= checkString(str,org);
       if(check)
       {
        count++;
       }
      }
      return count;
  }
public static boolean checkString(String str,HashMap map)
{
    for(Character ch:str.toCharArray())
    {
        if(!map.containsKey(ch))
        return false;
    }
    return true;
}
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      int n = sc.nextInt();
      String[] A = new String[n];
      for (int i = 0; i < n; i++) {
        A[i] = sc.next();
      }

      System.out.println(goodStrings(s, A, n));
    }
  }
}