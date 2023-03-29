import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        sc.close();
		String str=Integer.toString(n);
        int size=str.length();
        if(size>k||k==0)
        {
            System.out.println(str);
            return;
        }
        if(k>0)
        {
        check(str,k,size);
        }
        else if(k<0)
        {
            check(str,size+k,size);
        }
    }
    public static void check(String str,int k,int len)
    {
        
        while(k!=0)
       {
        StringBuilder sb=new StringBuilder();
        sb.append(str.charAt(len-1));
        sb.append(str.substring(0, len-1));
        str=sb.toString();
        k--;
       }

       System.out.println(str);
    }
}