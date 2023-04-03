import java.util.Scanner;

class Solution{
    static int findLengthOfSmallestSubarray(int[] nums, int target) {
        //Write your code here
        int start = 0,  end = 0,  sum = 0,  minLength = Integer.MAX_VALUE;
         if (nums == null || nums.length == 0)
        return 0;
  
  while (end < nums.length) {
    sum += nums[end];
    end++;
    while (sum >= target) {
      minLength = Math.min(minLength, end - start);
      sum -= nums[start];
      start++;
    }
  }
  if(minLength == Integer.MAX_VALUE) 
  return 0 ;
  return minLength;

    }
}
public class Main{ 
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
		int K = keyboard.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = keyboard.nextInt();
        }
        keyboard.close();
        System.out.println(Solution.findLengthOfSmallestSubarray(a, K));
    }
}