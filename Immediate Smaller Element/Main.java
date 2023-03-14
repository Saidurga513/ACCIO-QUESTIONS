import java.util.*;

class Solution {
    public void ImmediateSmaller(int[] arr, int n) {
        // Write your code here
       
        int res[]=new int[n];
       // st.push(arr[0]);
        for(int i=0;i<n;i++)
        {
            Stack<Integer> st=new Stack<>();
            st.push(arr[i]);
            int j=i+1;
            while(!st.isEmpty()&&j<n)
            {
                if(st.peek()>arr[j]&&j<n)

                {
                    res[i]=arr[j];
                    st.pop();
                }
               
                else{   
                    res[i]=-1;
                    st.clear();
                }
            }
            res[n-1]=-1;
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