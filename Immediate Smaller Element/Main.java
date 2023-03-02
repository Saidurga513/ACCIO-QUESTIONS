import java.util.*;
import java.io.*;
class Solution {
    /**
     * @param arr
     * @param n
     */
    public void ImmediateSmaller(int[] arr, int n) {
        // Write your code here
        Stack<Integer> st= new Stack<>();
        int res[]=new int[n];
        st.push(arr[0]);
        for(int i=0;i<n;i++)
        { int m=i+1;
            if(st.peek()>arr[m]&&m<(n-1))
            {
                st.pop();
                res[i]=arr[m];
                st.push(arr[m]);
            }
            else if(m<=n-1)
            {
                m++;
            }
            else{
                res[i]=-1;
            }
        }
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
        //input.close();
    }
}