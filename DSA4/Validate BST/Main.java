import java.util.*;

class Solution {

    public int seat(String s) {
        //Write your code here
        int count=0;
        int MOD = (int)1e7 + 3;
        Vector<Integer> pos=new Vector<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='x')
            {
                pos.add(i-count);
                count++;
            }
        }
            if(n==count||count==0)
            return 0;
            int mid=(count-1)/2;
            int midval=pos.get(mid);

            int res=0;
            for(int i=0;i<pos.size();i++)
            {
                res = (res % MOD +
           Math.abs(pos.get(i) -
                    midval) % MOD) % MOD;
            }
        
        
        return res%MOD;
    }
}


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine(); 
        sc.close();
        Solution Obj = new Solution();
        System.out.print(Obj.seat(str));
    }
}
