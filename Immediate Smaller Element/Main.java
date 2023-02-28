import java.util.*;

class Solution {
    public void ImmediateSmaller(int[] arr, int n) {
        // Write your code here
               int res[]=new int[n];
          for(int i=0;i<n;i++)
        {
            if(i==n-1)
            {
                res[i]=-1;
                break;
            }
            int m=0;
            Stack<Integer> st=new Stack<>();
            st.push(arr[i]);
            for(int j=i+1;j<n-1;j++)
            {
                if(st.peek()>arr[j])
                {
                    res[i]=arr[j];
                    st.pop();
                   // m=j;
                    break;
                }
                else
                m=j;
              
            }
            if(st.peek()<arr[n-1])
                res[i]=-1;
        }
        for(int i=0;i<n;i++)
        System.out.print(res[i]+" ");
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        Solution Obj = new Solution();
        Obj.ImmediateSmaller(arr, n);
    }
}