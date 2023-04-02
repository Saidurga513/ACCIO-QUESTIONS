import java.io.*;
import java.util.*;
public class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int k = input.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = input.nextInt();
        }
        Solution obj=new Solution();

        System.out.println(obj.solve(nums,k));
    
    }
}

class Solution{
    
    public int solve(int nums[],int k)
    {
        // your code here
       Arrays.sort(nums);
		int n=nums.length;
		int res=nums[n-k];
      return res;
        
    }
}