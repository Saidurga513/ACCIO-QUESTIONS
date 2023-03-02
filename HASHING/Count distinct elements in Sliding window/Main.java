import java.util.*;
import java.util.HashMap;
class Solution {
    public int[] countDistinct(int[] arr,int N, int k) {
        //Write code here
          int count[]=new int[N-k];
             for (int i = 0; i <= N - k; i++)
            count[i]=countWindowDistinct(
            Arrays.copyOfRange(arr, i, arr.length), k);
       
       
         return count;
        
    }
   static int countWindowDistinct(int arr[],int k){
     int c=0;
            for(int i=0;i<k;i++)
            {
                int j;
                for(j=i;j<i;j++)
                {
                    if(arr[i]==arr[j])
                        break;
                    if(j==i)
                        c++;
                }

            }
            return c;
        }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        int result[] = Obj.countDistinct(arr,n, k);
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
        System.out.println();
        sc.close();
    }
}